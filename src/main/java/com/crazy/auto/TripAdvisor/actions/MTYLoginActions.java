package com.crazy.auto.TripAdvisor.actions;

import java.io.IOException;

import com.crazy.auto.driver.DriverBase;

/** 

* @author 作者 沙陌 

* @version 创建时间：2020年4月19日 上午10:25:25 

*/
public class MTYLoginActions extends PagesManager{

	public MTYLoginActions(DriverBase driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void login(String username,String password) throws Exception {
		action.click(mtyHomePage.mine_menu());
		action.click(mtyMinePage.loginlink());
		action.click(mtyLoginPage.pwdlogin());
		action.sendKeys(mtyLoginPage.username(), username);
		action.sendKeys(mtyLoginPage.password(), password);
		action.click(mtyLoginPage.loginbtn());	
	}

}
