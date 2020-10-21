package com.crazy.tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.crazy.auto.test.DouBanTestBase;

/** 

* @author 作者 沙陌 

* @version 创建时间：2020年4月12日 下午4:19:08 

*/
public class DouBanTests extends DouBanTestBase{
	
	@Parameters({"username"})
	@Test
	public void test001_login(String username) throws Exception {
		mallaction.login("shamotest1", "123456");
		loginActions.login(username);
		
		
		assertion.assertContainsText("沙陌11", 5);
	}
	public static void main(String[] args) {
	}
}
