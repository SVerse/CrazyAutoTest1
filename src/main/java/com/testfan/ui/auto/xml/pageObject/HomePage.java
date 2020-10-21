package com.testfan.ui.auto.xml.pageObject;

import java.io.IOException;
import java.io.InputStream;
import com.crazy.auto.driver.DriverBase;
import com.crazy.auto.element.ElementBeans;

//javamall首页_对象库类
public class HomePage extends BasePage {
//用于eclipse工程内运行查找对象库文件路径
	public HomePage(DriverBase driver) {
//工程内读取对象库文件
		super(driver);

	}

	/***
	 * 登录链接
	 * 
	 * @return
	 * @throws IOException
	 */
	public ElementBeans loginLink() throws IOException {
		ElementBeans elementBeans = locatorMap.get("loginLink");
		return elementBeans;
	}
}