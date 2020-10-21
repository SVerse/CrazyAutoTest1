package com.mtx.ui.auto.actions;

import java.io.IOException;

import com.crazy.auto.driver.DriverBase;
import com.crazy.auto.element.ElementOperate;
import com.mtx.ui.auto.pageObject.MtxHomePage;
import com.mtx.ui.auto.pageObject.MtxLoginPage;

/** 

* @author 作者 沙陌 

* @version 创建时间：2020年5月10日 下午9:27:58 

*/
public class LoginActions extends PageBaseActions{
//	ElementOperate operate;//元素操作对象
//	DriverBase driver;//driver对象
//	public LoginActions(DriverBase driver) {
//		this.driver=driver;
//		this.operate=new ElementOperate(driver);
//	}
	
	
	public LoginActions(DriverBase driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void login(String username,String pwd) throws Exception {
		//MtxHomePage homePage=new MtxHomePage(driver);
		operate.click(mtxHomePage.loginlink());
		//MtxLoginPage loginPage=new MtxLoginPage(driver);
		operate.sendKeys(mtxLoginPage.username(), username);
		operate.sendKeys(mtxLoginPage.password(), pwd);
		
		operate.click(mtxLoginPage.loginBtn());
	}
	
	public void loginWithHou(String username,String pwd) throws Exception {
		operate.sendKeys(mtxHouLoginPage.username(), username);
		operate.sendKeys(mtxHouLoginPage.password(), pwd);
		operate.click(mtxHouLoginPage.loginBtn());
	}

}
