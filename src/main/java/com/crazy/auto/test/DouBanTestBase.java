package com.crazy.auto.test;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.crazy.auto.actions.douban.LoginActions;
import com.crazy.auto.driver.AppiumServers;
import com.crazy.auto.driver.CrazyMobileDriver;
import com.crazy.auto.driver.CrazyWebDriver;
import com.crazy.auto.driver.DriverBase;
import com.crazy.auto.javamall.actions.MallActionsForXml;


/** 

* @author 作者 沙陌 

* @version 创建时间：2020年4月11日 下午1:12:24 

*/
public class DouBanTestBase extends TestDriverBase {
	private static Logger log = Logger.getLogger(DouBanTestBase.class);
	//public DriverBase driver;
	public Assertion assertion;
	public LoginActions loginActions;
	public AppiumServers server;
	public MallActionsForXml mallaction;
	
	@Parameters({"platform","udid","port","browserType","chromedriverpath"})
	@BeforeClass
	public void initDriver(String platform,String udid,String port,String browserType, String chromedriverpath) {
		server=new AppiumServers();
		server.startServer(port);
		driver=new CrazyMobileDriver(platform, udid, port,chromedriverpath);
		webdriver=new CrazyWebDriver(browserType);
		driver.sleep(8);
		driver.implicitlyWaitDefault();
		loginActions=new LoginActions(driver);
		mallaction=new MallActionsForXml(webdriver);
		assertion=new Assertion(driver);
	}
	@AfterClass(alwaysRun = true)
	public void quit() {
		try {
			driver.quit();
		} catch (Exception e) {
			// TODO: handle exception
		}
		server.stop();
	}
}
