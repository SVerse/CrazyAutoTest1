package com.crazy.auto.keyword;
/** 

* @author 作者 沙陌 

* @version 创建时间：2020年5月19日 下午9:10:26 

*/

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crazy.auto.excel.ExcelDataUtil;
import com.crazy.auto.test.MtxTestBase0510;

public class KeyWordTests0519 extends MtxTestBase0510{
	private static Logger log = Logger.getLogger(KeyWordTests0519.class);
	KeyWordsAction keyWordsAction;
	Method[] methods;
	@DataProvider
	public Object[][] getCaseNames() throws Exception{
		String file="src/main/resources/keywords/mtxshop.xlsx";
		//String file = ExcelDataUtil.class.getClassLoader().getResource("keywords/javamall_cases2.xlsx").getFile();
		ExcelDataUtil excel = new ExcelDataUtil(file);
		Object[][] caseNames = excel.getKeywordData("测试用例集合");
		excel.close();
		return caseNames;
	}
	
	@Test(dataProvider = "getCaseNames")
	public void test(String casenum,String casename,String flag) throws Exception {
		keyWordsAction=new KeyWordsAction(webdriver);
		methods=keyWordsAction.getClass().getMethods();//会返回KeyWordsAction实例的所有方法对象

		System.out.println(casenum);
		System.out.println(casename);
		System.out.println(flag);
		System.out.println("=======================");
		String file="src/main/resources/keywords/mtxshop.xlsx";
		//String file = ExcelDataUtil.class.getClassLoader().getResource("keywords/javamall_cases2.xlsx").getFile();
		ExcelDataUtil excel = new ExcelDataUtil(file);
		Object[][] testData = excel.getTestData(casename);
		KeyWordsAction.testResult=true;
		for (int i = 0; i < testData.length; i++) {
			String keyword=testData[i][1].toString();
			String locator=testData[i][2].toString();
			String value=testData[i][3].toString();
			System.out.println(keyword+" "+locator+" "+value);
			excuteKeyword(keyword, locator, value);//这表示执行当前步骤
			if (KeyWordsAction.testResult) {
				//当前步骤执行成功
				excel.setCellData(i+1, excel.getLastColIndex(casename), casename, true);
			}else {
				//当前步骤执行失败
				excel.setCellData(i+1, excel.getLastColIndex(casename), casename, false);
				excel.setCellData(Integer.parseInt(casenum), excel.getLastColIndex(casename), "测试用例集合", false);
				excel.close();
				Assert.fail(casename + "失败",KeyWordsAction.exception);
				break;
			}
//			if (keyword.equals("click")) {
//				System.out.println("点击操作"+locator);
//				keyWordsAction.click(locator, value);
//			}else if (keyword.equals("sendKeys")) {
//				System.out.println("向"+locator+"输入"+value);
//				keyWordsAction.sendkeys(locator, value);
//			}

		}
		
		if (KeyWordsAction.testResult) {
			excel.setCellData(Integer.parseInt(casenum), excel.getLastColIndex(casename), "测试用例集合", true);
		}
		excel.close();
	}
	public void excuteKeyword(String keyword,String locator,String value) {
		for (int j = 0; j < methods.length; j++) {
			String name = methods[j].getName();
			System.out.println(name);
			if (name.equals(keyword)) {
				System.out.println("就调用该方法");
				try {
					methods[j].invoke(keyWordsAction, locator,value);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					KeyWordsAction.testResult=false;
				} //java反射的用法
			}
		}
	}

}
