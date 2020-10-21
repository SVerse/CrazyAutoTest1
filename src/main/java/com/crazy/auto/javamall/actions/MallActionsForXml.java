package com.crazy.auto.javamall.actions;

import java.io.IOException;

import com.crazy.auto.driver.DriverBase;
import com.crazy.auto.element.ElementOperate;
import com.testfan.ui.auto.xml.pageObject.HomePage;
import com.testfan.ui.auto.xml.pageObject.LoginPage;

/** 

* @author 作者 沙陌 

* @version 创建时间：2020年2月17日 下午9:29:33 

*/
public class MallActionsForXml {
	
	ElementOperate action;
	DriverBase driver;
	//构造方法
	public MallActionsForXml(DriverBase driver) {
		this.driver=driver;
		this.action=new ElementOperate(driver);
	}
	
	public void login(String username,String pwd) throws Exception {
		driver.get("http://localhost:8080/javamall/");
		HomePage homePage=new HomePage(driver);
		action.click(homePage.loginLink());
		LoginPage loginPage=new LoginPage(driver);
		//action.sendKeys(loginPage.username(), username);
		action.sendKeysUtilCorrect(loginPage.username(), username);
		action.sendKeys(loginPage.password(), pwd);
		action.sendKeys(loginPage.validcode(), "1234");
		action.click(loginPage.loginBtn());
		
	}
}
