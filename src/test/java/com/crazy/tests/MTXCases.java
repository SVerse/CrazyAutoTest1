package com.crazy.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.crazy.auto.test.TestBase;
import com.testfan.ui.auto.mtx.pageObject.EvaluatePage;

/** 

* @author 作者 沙陌 

* @version 创建时间：2020年3月17日 下午5:56:08 

*/
public class MTXCases extends TestBase{
	
	@Test(description  = "前台正确登录")
	public void test001_login() throws Exception {
		loginActions.login("shamotest1", "123456");
		assertion.assertContainsText("登录成功", 5);
	}
	@Test(description = "前台下单")
	public void test002_order() throws Exception {
		orderActions.order();
		assertion.assertContainsText("支付成功", 5);
	}
	@Test(description = "后台发货")
	public void test003_sendGoods() throws Exception {
		driver.get("http://121.42.15.146:9090/mtx/admin");
		loginActions.loginWithManager("shamo", "123456");
		orderActions.sendGoods("hsdhhhfhjss");
		assertion.assertContainsText("发货成功", 5);
	}
	@Test(description = "前台收货")
	public void test004_acceptGoods() throws Exception {
		orderActions.acceptGoods();
		assertion.assertContainsText("收货成功", 5);
	}
	@Test(description = "评价")
	public void test005_comment() throws Exception {
		orderActions.comment();
		assertion.assertContainsText("评论成功", 5);
	}
	@Test(description = "申请退款")
	public void test006_refund() throws Exception {
		orderActions.refund();
		assertion.assertContainsText("申请成功", 5);
	}
	@AfterMethod
	public void backHome() {
		driver.get("http://121.42.15.146:9090/mtx/");
	}
	

}
