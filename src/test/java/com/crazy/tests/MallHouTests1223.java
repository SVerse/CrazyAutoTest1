package com.crazy.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.crazy.auto.javamall.actions.MallActionsForXml;
import com.crazy.auto.test.TestBase;


/** 

* @author 作者 沙陌 

* @version 创建时间：2020年2月22日 下午8:33:53 

*/
public class MallHouTests1223 extends	TestBase {
	@Test(description = "登录")
	public void test001_login() throws Exception {
		MallActionsForXml mall=new MallActionsForXml(driver);
		mall.login("shamotest1", "123456");
		//Assert.fail();
		assertion.assertContainsText("登录成功", 3);
		//WebAssertionBase.VerityTextPresent("收款成功");
	}
//	@Test(description = "发货")
//	public void test002_ship() throws Exception {
//		MallActionsForXml mall=new MallActionsForXml();
//		mall.ship();
//		WebAssertionBase.VerityTextPresent("发货成功");
//	}
//	@Test(description = "确认收货")
//	public void test003_org() throws Exception {
//		MallActionsForXml mall=new MallActionsForXml();
//		mall.org();
//		WebAssertionBase.VerityTextPresent("确认收货成功");
//	}
//	@Test(description = "退货")
//	public void test004_returned() throws Exception {
//		MallActionsForXml mall=new MallActionsForXml();
//		mall.returned();
//		WebAssertionBase.VerityTextPresent("操作成功");
//	}
//	@Test(description = "退货入库")
//	public void test005_ruku() throws Exception {
//		MallActionsForXml mall=new MallActionsForXml();
//		mall.ruku();
//		WebAssertionBase.VerityTextPresent("操作成功");
//	}
//	@Test(description = "入库结算")
//	public void test006_jieSuan() throws Exception {
//		MallActionsForXml mall=new MallActionsForXml();
//		mall.jieSuan();
//		WebAssertionBase.VerityTextPresent("操作成功");
//	}
}
