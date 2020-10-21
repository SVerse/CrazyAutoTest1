package com.crazy.auto.actions.douban;

import com.crazy.auto.driver.DriverBase;
import com.crazy.auto.element.ElementOperate;
import com.testfan.ui.auto.yml.douban.pageObject.HomePage;
import com.testfan.ui.auto.yml.douban.pageObject.LoginPage;


/** 

* @author 作者 沙陌 

* @version 创建时间：2020年3月17日 下午4:31:21 

*/
public class PagesManager {
	public ElementOperate action;
	public DriverBase mobiledriver;
	public HomePage homePage;
	public LoginPage loginPage;
	//构造方法
	public PagesManager(DriverBase driver) {
		this.mobiledriver=driver;
		this.action=new ElementOperate(driver);
		this.loginPage=new LoginPage(driver);
		this.homePage=new HomePage(driver);
	}
}
