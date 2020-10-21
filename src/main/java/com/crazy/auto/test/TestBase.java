package com.crazy.auto.test;
/** 

* @author 作者 沙陌 

* @version 创建时间：2020年2月20日 上午11:16:53 

*/

import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.crazy.auto.driver.CrazyWebDriver;
import com.crazy.auto.driver.DriverBase;
import com.crazy.auto.mtx.actions.LoginActions;
import com.crazy.auto.mtx.actions.OrderActions;

public class TestBase extends TestDriverBase{
	private static Logger log = Logger.getLogger(TestBase.class);
	//public DriverBase driver;
	public Assertion assertion;
	public LoginActions loginActions;
	public OrderActions orderActions;

	@Parameters({ "browserType" })
	@BeforeClass
	public void start(String browserType) {
		driver = new CrazyWebDriver(browserType);
		assertion=new Assertion(driver);
		loginActions=new LoginActions(driver);
		orderActions=new OrderActions(driver);
		driver.get("http://121.42.15.146:9090/mtx");
		log.info("========浏览器启动成功========");
	}

	@AfterClass
	public void tearDown() throws IOException {
		driver.quit();
		log.info("=========测试结束关闭浏览器======");
	}
}
