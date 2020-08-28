package com.lti.model;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Customer {

	@Id
	@GeneratedValue
	private int customerId;

	@Column
	private String customerFirstName;

	@Column
	private String customerLastName;

	@Column
	private String customerEmail;

	@Column
	private String customerPassword;

	@Column
	private String customerMobileNumber;

	@Column
	private String customerCity;

	@Column
	private String customerEmploymentType;

	@Column
	private String customerdateOfBirth;

	@JsonIgnore
	@OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
	private List<Application> application;

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerFirstName() {
		return customerFirstName;
	}

	public void setCustomerFirstName(String customerFirstName) {
		this.customerFirstName = customerFirstName;
	}

	public String getCustomerLastName() {
		return customerLastName;
	}

	public void setCustomerLastName(String customerLastName) {
		this.customerLastName = customerLastName;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getCustomerPassword() {
		return customerPassword;
	}

	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}

	public String getCustomerMobileNumber() {
		return customerMobileNumber;
	}

	public void setCustomerMobileNumber(String customerMobileNumber) {
		this.customerMobileNumber = customerMobileNumber;
	}

	public String getCustomerCity() {
		return customerCity;
	}

	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}

	public String getCustomerEmploymentType() {
		return customerEmploymentType;
	}

	public void setCustomerEmploymentType(String customerEmploymentType) {
		this.customerEmploymentType = customerEmploymentType;
	}

	public String getCustomerdateOfBirth() {
		return customerdateOfBirth;
	}

	public void setCustomerdateOfBirth(String customerdateOfBirth) {
		this.customerdateOfBirth = customerdateOfBirth;
	}

	public List<Application> getApplication() {
		return application;
	}

	public void setApplication(List<Application> application) {
		this.application = application;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerFirstName=" + customerFirstName + ", customerLastName="
				+ customerLastName + ", customerEmail=" + customerEmail + ", customerPassword=" + customerPassword
				+ ", customerMobileNumber=" + customerMobileNumber + ", customerCity=" + customerCity
				+ ", customerEmploymentType=" + customerEmploymentType + ", customerdateOfBirth=" + customerdateOfBirth
				+ "]";
	}
}
