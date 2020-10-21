package com.crazy.mty.tests;

import java.net.PasswordAuthentication;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crazy.auto.excel.ExcelDataUtil;
import com.crazy.auto.test.MTYTestBase;

/** 

* @author 作者 沙陌 

* @version 创建时间：2020年4月19日 上午10:29:44 

*/
public class MTYTests extends MTYTestBase {
	@Test(description = "正确登录")
	public void test001_login() throws Exception {
		loginActions.login("18729399607", "Abc654123");
		boolean elementExistTimeOut = loginActions.action.isElementExistTimeOut(loginActions.mtyMinePage.avatar());
		assertion.assertTrue(elementExistTimeOut);	
	}
//	@Test(description = "登录密码错误")
//	public void test002_login() throws Exception {
//		loginActions.login("18729399607", "Abc65412311");
//		assertion.assertContainsText("输入的账号或密码有误", 5);
//	}
//	@Test(description = "用户名错误")
//	public void test003_login() throws Exception {
//		loginActions.login("18729399608", "Abc654123");
//		assertion.assertContainsText("输入的账号或密码有误", 5);
//	}
//	@Test(description = "密码为空")
//	public void test004_login() throws Exception {
//		loginActions.login("18729399608", "");
//		assertion.assertContainsText("请输入不少于6位的密码", 5);
//	}
//	@Test(description = "用户名为空")
//	public void test005_login() throws Exception {
//		loginActions.login("", "12344556");
//		assertion.assertContainsText("请输入正确的邮箱地址或手机号", 5);
//	}
//	@Test(description = "用户名和密码都为空")
//	public void test006_login() throws Exception {
//		loginActions.login("", "");
//		assertion.assertContainsText("请输入正确的邮箱地址或手机号", 5);
//		assertion.assertContainsText("请输入不少于6位的密码", 5);
//	}
	@DataProvider
	public Object[][] getLoginData() throws Exception{
		String file="src/main/resources/data/mty.xlsx";
		ExcelDataUtil excel = new ExcelDataUtil(file);
		Object[][] ob = excel.getTestData("登录数据");
		return ob;
	}
	@Test(dataProvider = "getLoginData")
	public void test007_login(String casename,String username, String password,String assertValue) throws Exception {
		loginActions.login(username,password);
		String[] assertValues=assertValue.split(",");
		for (String string : assertValues) {
			assertion.assertContainsText(string, 5);
		}
		
	}
	@AfterMethod
	public void resetApp() {
		driver.resetApp();
	}
}
