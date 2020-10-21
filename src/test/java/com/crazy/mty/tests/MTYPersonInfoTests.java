package com.crazy.mty.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.crazy.auto.test.MTYTestBase;

/** 

* @author 作者 沙陌 

* @version 创建时间：2020年4月19日 上午10:29:44 

*/
public class MTYPersonInfoTests extends MTYTestBase {
	@Test(description = "正确登录")
	public void test001_login() throws Exception {
		loginActions.login("18729399607", "Abc654123");
		boolean flag = personInfoActions.uploadHeader();
		assertion.assertTrue(flag);
	}
	@AfterMethod
	public void resetApp() {
		//driver.resetApp();
	}
}
