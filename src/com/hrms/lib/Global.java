package com.hrms.lib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

//Global class contains all the test data and objects required
//for executing the test cases.
public class Global {

	public WebDriver driver;
	public Actions ac;
	//Test DATA

	public String url = "http://127.0.0.1/orangehrm-2.6/login.php";
	public String userName = "admin";
	public String password = "admin";
	
	//Test Objects
	
	public String txt_loginname = "txtUserName";//locator for username input on login page
	public String txt_password = "txtPassword";//locator for password input on login page
	public String btn_login = "Submit"; //locator for Submit btn on login page
	public String link_logout = "Logout"; //locator for linktext object
	public String pim = "PIM";//locator for PIM menu present on first webpage after logging in
	public String addEmp = "Add Employee";//locator for locating by linktext for adding emp
	public String txt_firstName = "txtEmpFirstName";//locator for firstname text input field
	public String txt_lastName = "txtEmpLastName";//locator for last name text input field
	public String saveBtn = "btnEdit"; //locator for save button
	public String backBtn = "//input[@value = 'Back']"; //locator for back button
	public String iframe_rightMenu = "rightMenu"; //locator for switching to iframe
	public String checkBtn = "//input[@name = 'chkLocID[]'][@value = '0016']"; //locating the element using xpath with attributes.
	public String deletebtn = "//input[@value = 'Delete']"; //locating the element using xpath with attributes.
	
}
