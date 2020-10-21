package com.mtx.autotest05;

import org.testng.annotations.Test;

import com.crazy.auto.test.DouBanTestBase0611;
import com.crazy.auto.utils.RandomUtil;
import com.mtx.ui.auto.douban.actions.LoginActions;
import com.mtx.ui.auto.douban.actions.MydairyActions;
import com.mtx.ui.auto.douban.actions.PersonInfoActions;
import com.mtx.ui.auto.douban.pageObject.MydiaryPage;

/** 

* @author 作者 沙陌 

* @version 创建时间：2020年6月11日 下午9:29:01 

*/
public class DouBanTests extends DouBanTestBase0611{
	@Test
	public void test001_login() throws Exception {
		LoginActions loginActions=new LoginActions(driver);
		loginActions.login("18729399607", "abc123456");
		assertion.assertContainsText("沙陌1", 5);
	}
	@Test
	public void test002_uploadHeaderImg() throws Exception {
		PersonInfoActions personInfoActions=new PersonInfoActions(driver);
		boolean uploadHeaderImg = personInfoActions.uploadHeaderImg();
		assertion.assertTrue(uploadHeaderImg);
	}
	@Test
	public void test003_writeDiary() throws Exception {
		MydairyActions mydairyActions=new MydairyActions(driver);
		String title = RandomUtil.getRndStrZhByLen(4);
//		String text = RandomUtil.getRndStrZhByLen(4);
		String text = RandomUtil.getRndNumByLen(6);
		//这是一个日记标题挺长的  这是一个内容，内容也挺多的，这是一个内容，内容也挺多的，这是一个内容，内容也挺多的，这是一个内容，内容也挺多的，这是一个内容，内容也挺多的，这是一个内容，内容也挺多的，这是一个内容，内容也挺多的，
		String contextText = mydairyActions.writeDairy(title, text);
		assertion.assertText(contextText, title+"  "+text);
	}
}
