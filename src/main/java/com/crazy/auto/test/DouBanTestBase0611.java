package com.crazy.auto.test;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.crazy.auto.driver.AppiumServers;
import com.crazy.auto.driver.CrazyMobileDriver;
import com.crazy.auto.driver.CrazyWebDriver;
import com.crazy.auto.element.ElementOperate;
import com.mtx.ui.auto.douban.pageObject.HomePage;
import com.mtx.ui.auto.douban.pageObject.PersonInoPage;

/** 

* @author 作者 沙陌 

* @version 创建时间：2020年6月11日 下午9:29:53 

*/
public class DouBanTestBase0611 extends TestDriverBase{
	private static Logger log = Logger.getLogger(MtxTestBase0510.class);
	//public DriverBase driver;
	public Assertion assertion;//咱们封装的断言
	public ElementOperate operate;
	public AppiumServers appiumServers;
	
	@Parameters({"port"})
	@BeforeTest
	public void startServer(String port) {
		appiumServers=new AppiumServers();
		appiumServers.startServer(port);
	}
	@Parameters({ "platform","udid","port","chromedriverpath"})
	@BeforeClass
	public void init(String platform, String udid, String port,String chromedriverpath) {
		driver=new CrazyMobileDriver(platform, udid, port,chromedriverpath);
		assertion=new Assertion(driver);
		operate=new ElementOperate(driver);
		driver.implicitlyWaitDefault();
		log.info("app启动成功");
	}
	
	@AfterMethod
	public void backHome() throws Exception {
		if(driver.platform.equalsIgnoreCase("android")) {
			driver.startActivity("com.douban.frodo", "com.douban.frodo.activity.SplashActivity");
		}else {
			HomePage homePage=new HomePage(driver);
			PersonInoPage personInoPage=new PersonInoPage(driver);
			while (!operate.isElementExist(homePage.mine_menu())) {
				operate.click(personInoPage.back());
			}
			//operate.activateApp("com.douban.frodo");只能在ios应用没有启动的时候才可以启动他
			//driver.findElement(homePage.)
		}
		
	}
	@AfterClass
	public void quit() {
		driver.quit();//测试执行完成以后关闭浏览器
	}
	@AfterTest
	public void stopServer() {
		appiumServers.stop();
	}
}
