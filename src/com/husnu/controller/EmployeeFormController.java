package com.husnu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.husnu.model.Employee;

@Controller
public class EmployeeFormController {

	@Autowired
	@Qualifier("empValidation")
	//Application context has validation bean
	private Validator validator;

	@InitBinder
	private void initBinder(WebDataBinder value) {
		value.setValidator(validator);
	}

	@RequestMapping(value = "/employee/save", method = RequestMethod.GET)
	public String saveEmployeePage(Model model) {
		model.addAttribute("employee", new Employee());
		return "empSave";
	}

	@RequestMapping(value = "/employee/save.htm", method = RequestMethod.POST)
	public String saveEmployeeAction(@ModelAttribute("employee") @Validated Employee employee,
			BindingResult bindingResult, Model model) {
		if (bindingResult.hasErrors()) {
			return "empSave";
		}
		model.addAttribute("emp", employee);
		return "empSaveSuccess";
	}

}
