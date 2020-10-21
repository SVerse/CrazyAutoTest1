package com.crazy.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.crazy.auto.javamall.actions.MallActionsForXml;
import com.crazy.auto.test.TestBase;

/** 

* @author 作者 沙陌 

* @version 创建时间：2020年3月8日 下午2:41:38 

*/
public class MallTests0308 extends TestBase{

	@Test
	public void test001_login() throws Exception {
		MallActionsForXml mall=new MallActionsForXml(driver);
		mall.login("shamotest1", "123456");
		assertion.assertContainsText("会员中心首页", 5);
	}
	@Test
	public void test002_login() throws Exception {
		MallActionsForXml mall=new MallActionsForXml(driver);
		mall.login("shamotest1", "12345");
		assertion.assertAlertText("账号密码错误", 5);
	}
	@Test
	public void test003_login() throws Exception {
		MallActionsForXml mall=new MallActionsForXml(driver);
		mall.login("shamotest57", "123456");
		assertion.assertAlertText("账号密码错误", 5);
	}
	@AfterMethod
	public void deleteCookie() {
		driver.deleteCookies();
	}
}
