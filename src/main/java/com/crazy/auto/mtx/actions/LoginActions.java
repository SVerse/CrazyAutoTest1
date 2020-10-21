package com.crazy.auto.mtx.actions;

import java.io.IOException;

import com.crazy.auto.driver.DriverBase;

/** 

* @author 作者 沙陌 

* @version 创建时间：2020年3月17日 下午4:43:46 

*/
public class LoginActions extends PagesManager{

	public LoginActions(DriverBase driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void login(String username,String pwd) throws Exception {
		action.click(homePage.loginLink());
		action.sendKeys(loginPage.username(), username);
		action.sendKeys(loginPage.password(), pwd);
		action.click(loginPage.loginBtn());
	}
	
	public void loginWithManager(String username,String pwd) throws Exception {
		action.sendKeys(managerLoginPage.username(), username);
		action.sendKeys(managerLoginPage.password(), pwd);
		action.click(managerLoginPage.loginBtn());
	}

}
