package com.hrms.testscripts;

import com.hrms.lib.General;

public class TC_HRMS_001 extends General {
 public static void main(String[] args) {
	//test case steps
	 General obj = new General();
	 obj.openApplication();
	 obj.login();
	 obj.logout();
	 obj.closeApplication();
}
}
