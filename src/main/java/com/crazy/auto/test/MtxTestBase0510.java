package com.crazy.auto.test;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.crazy.auto.driver.CrazyWebDriver;
import com.crazy.auto.element.ElementOperate;

/** 

* @author 作者 沙陌 

* @version 创建时间：2020年5月10日 下午9:37:09 

*/
public class MtxTestBase0510 extends TestDriverBase{
	private static Logger log = Logger.getLogger(MtxTestBase0510.class);
	//public DriverBase driver;
	public Assertion assertion;//咱们封装的断言
	public ElementOperate operate;
	@Parameters({ "browserType" })
	@BeforeClass
	public void init(String browserType) {
		webdriver=new CrazyWebDriver(browserType);
		assertion=new Assertion(webdriver);
		operate=new ElementOperate(webdriver);
		webdriver.get("http://121.42.15.146:9090/mtx");
		log.info("浏览器网址已打开");
	}
	@AfterMethod
	public void backHome() {
		webdriver.get("http://121.42.15.146:9090/mtx/");
	}
	@AfterClass
	public void quit() {
		webdriver.quit();//测试执行完成以后关闭浏览器
	}
}
