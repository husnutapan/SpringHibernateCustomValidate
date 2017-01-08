package com.husnu.controller;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.husnu.model.UserForm;

@Controller
public class UserFormController {
	private static final Logger logger = LoggerFactory.getLogger(UserFormController.class);

	private Map<String, UserForm> userList = null;

	public UserFormController() {
		userList = new HashMap<String, UserForm>();
	}

	@RequestMapping(value = "/user/save", method = RequestMethod.GET)
	public String saveCustomerPage(Model model) {

		String requestUser = "Husnu TAPAN";

		logger.info("info logging by {}", requestUser);
		model.addAttribute("userForm", new UserForm());
		return "userSave";
	}

	@RequestMapping(value = "/user/save.htm", method = RequestMethod.POST)
	public String saveUserForm(@Valid UserForm userForm, BindingResult bindingResult, Model model) {
		if (bindingResult.hasErrors()) {
			return "userSave";
		}
		model.addAttribute("userForm", userForm);
		userList.put(userForm.getName(), userForm);
		return "successPassHibernateValidate";
	}
}
