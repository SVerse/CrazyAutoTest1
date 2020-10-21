package com.crazy.auto.test;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.crazy.auto.TripAdvisor.actions.MTYLoginActions;
import com.crazy.auto.TripAdvisor.actions.MTYMyTravelActions;
import com.crazy.auto.TripAdvisor.actions.MTYPersonInfoActions;
import com.crazy.auto.driver.AppiumServers;
import com.crazy.auto.driver.CrazyMobileDriver;
import com.crazy.auto.driver.DriverBase;


/** 

* @author 作者 沙陌 

* @version 创建时间：2020年4月11日 下午1:12:24 

*/
public class MTYTestBase extends TestDriverBase {
	private static Logger log = Logger.getLogger(MTYTestBase.class);
	//public DriverBase driver;
	public Assertion assertion;
	public MTYLoginActions loginActions;
	public MTYPersonInfoActions personInfoActions;
	public MTYMyTravelActions mtyMyTravelActions;
	public AppiumServers server;
	
	@Parameters({"platform","udid","port","chromedriverpath"})
	@BeforeClass
	public void initDriver(String platform,String udid,String port, String chromedriverpath) {
		server=new AppiumServers();
		server.startServer(port);
		driver=new CrazyMobileDriver(platform, udid, port,chromedriverpath);
		driver.sleep(8);
		driver.implicitlyWaitDefault();
		loginActions=new MTYLoginActions(driver);
		personInfoActions=new MTYPersonInfoActions(driver);
		mtyMyTravelActions=new MTYMyTravelActions(driver);
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
