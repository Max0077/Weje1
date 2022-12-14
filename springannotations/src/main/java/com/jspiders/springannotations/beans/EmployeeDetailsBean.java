package com.jspiders.springannotations.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class EmployeeDetailsBean {

	@Value("arun@gmail.com")
	private String email;

	@Value("9876543210")
	private long phone;

	@Value("40000")
	private double salary;

	@Value("Bangalore")
	private String address;

}
