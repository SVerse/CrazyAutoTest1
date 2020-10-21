package com.mtx.ui.auto.douban.actions;

import java.io.IOException;

import com.crazy.auto.driver.DriverBase;

/** 

* @author 作者 沙陌 

* @version 创建时间：2020年6月11日 下午9:18:16 

*/
public class LoginActions extends PageBaseActions{

	public LoginActions(DriverBase driver) {
		super(driver);
		// TODO Auto-generated constructor stub

	}
	public void login(String username, String password) throws Exception {
		operate.click(loginPage.pwdlogin());
		operate.sendKeys(loginPage.username(), username);
		operate.sendKeys(loginPage.password(), password);
		operate.click(loginPage.loginBtn());
		operate.click(homePage.mine_menu());
	}

}
