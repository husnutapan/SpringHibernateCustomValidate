package com.husnu.model;

import java.util.Date;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

public class UserForm {
	
	private int id;
	@Size(min = 2, max = 15)
	private String name;
	@NotEmpty
	@Email
	private String email;

	@NotNull
	@Min(18)
	@Max(90)
	private Integer age;
	private AddressDetail addressDetail;
	private Gender gender;

	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@NotNull
	@Past
	private Date birthOfYear;

	private String phone;

	public enum Gender {
		MALE, FEMALE, OTHER
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public AddressDetail getAddressDetail() {
		return addressDetail;
	}

	public void setAddressDetail(AddressDetail addressDetail) {
		this.addressDetail = addressDetail;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public Date getBirthOfYear() {
		return birthOfYear;
	}

	public void setBirthOfYear(Date birthOfYear) {
		this.birthOfYear = birthOfYear;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
