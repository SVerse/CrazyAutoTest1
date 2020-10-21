package com.mtx.autotest05;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crazy.auto.excel.ExcelDataUtil;
import com.crazy.auto.test.MtxTestBase0510;
import com.mtx.ui.auto.actions.LoginActions;
import com.mtx.ui.auto.actions.OrderActions;

/** 

* @author 作者 沙陌 

* @version 创建时间：2020年5月21日 下午9:46:43 

*/
public class MtxLoginTest extends MtxTestBase0510{
	
	@DataProvider
	public Object[][] getLoginData() throws Exception {
		String datafile="src/main/resources/data/mtx_data.xlsx";
		ExcelDataUtil excel=new ExcelDataUtil(datafile);
		Object[][] testData = excel.getTestData("登录数据");
		excel.close();
		return testData;
	}
	
	@DataProvider
	public Object[][] getCommentData() throws Exception {
		String datafile="src/main/resources/data/mtx_data.xlsx";
		ExcelDataUtil excel=new ExcelDataUtil(datafile);
		Object[][] testData = excel.getTestData("评论");
		excel.close();
		return testData;
	}
	
	//@Test(dataProvider = "getLoginData")
	public void test001_login(String dataName,String username,String pwd,String assertValue) throws Exception {
		LoginActions loginActions=new LoginActions(webdriver);
		loginActions.login(username, pwd);
		assertion.assertContainsText(assertValue, 10);
	}
	
//	@Test
//	public void test002_login() throws Exception {
//		LoginActions loginActions=new LoginActions(webdriver);
//		loginActions.login("shamotest1", "123456");
//		assertion.assertContainsText("登录成功", 5);
//	}
	@Test(dataProvider = "getCommentData")
	public void test003_comment(String dataName,String ratingFlag,String rating,String contentFlag,String content,String assertValue) throws Exception {
		LoginActions loginActions=new LoginActions(webdriver);
		loginActions.login("shamotest1", "123456");
		assertion.assertContainsText("登录成功", 5);
		webdriver.sleep(3);
		OrderActions orderActions=new OrderActions(webdriver);
		orderActions.comment(ratingFlag, Integer.parseInt(rating), contentFlag, content);
		assertion.assertContainsText(assertValue, 5);
	}
	
	@AfterMethod
	public void deleteCookie() {
		
		webdriver.deleteCookies();
		webdriver.close();
		webdriver.switchToWindow(0);
	}
}
