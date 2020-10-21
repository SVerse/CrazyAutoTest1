package com.testfan.ui.auto.xml.pageObject;

import java.io.IOException;
import java.io.InputStream;
import com.crazy.auto.driver.DriverBase;
import com.crazy.auto.element.ElementBeans;

//javamall登录页面_对象库类
public class LoginPage extends BasePage {
//用于eclipse工程内运行查找对象库文件路径
	public LoginPage(DriverBase driver) {
//工程内读取对象库文件
		super(driver);

	}

	/***
	 * 用户名
	 * 
	 * @return
	 * @throws IOException
	 */
	public ElementBeans username() throws IOException {
		ElementBeans elementBeans = locatorMap.get("username");
		return elementBeans;
	}

	/***
	 * 密码
	 * 
	 * @return
	 * @throws IOException
	 */
	public ElementBeans password() throws IOException {
		ElementBeans elementBeans = locatorMap.get("password");
		return elementBeans;
	}

	/***
	 * 验证码
	 * 
	 * @return
	 * @throws IOException
	 */
	public ElementBeans validcode() throws IOException {
		ElementBeans elementBeans = locatorMap.get("validcode");
		return elementBeans;
	}

	/***
	 * 登录按钮
	 * 
	 * @return
	 * @throws IOException
	 */
	public ElementBeans loginBtn() throws IOException {
		ElementBeans elementBeans = locatorMap.get("loginBtn");
		return elementBeans;
	}
}