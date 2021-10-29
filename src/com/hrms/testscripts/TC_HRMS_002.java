package com.hrms.testscripts;

import com.hrms.lib.General;

public class TC_HRMS_002 extends General{
	
public static void main(String[] args) throws InterruptedException {
	General obj  = new General();
	obj.openApplication();
	obj.login();
	obj.addEmp();
	obj.delEmp();
	obj.logout();	
}
	
}
