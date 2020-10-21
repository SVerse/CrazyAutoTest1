package com.testfan.ui.auto.yml.TripAdvisor.pageObject;
import java.io.IOException;
import java.io.InputStream;
import org.apache.log4j.Logger;
import com.crazy.auto.driver.DriverBase;
import com.crazy.auto.element.ElementBeans;
//登录页面_对象库类
public class MTYLoginPage extends BasePage {
//用于eclipse工程内运行查找对象库文件路径
private static Logger log = Logger.getLogger(MTYLoginPage.class);private String path="src/main/resources/pageObjectFiles/yml/";
 public   MTYLoginPage(DriverBase driver) {
//工程内读取对象库文件
	super(driver);
}
/***
* 账号密码登录
* @return
* @throws IOException
*/
public  ElementBeans pwdlogin() throws IOException
 {
   if(locatorMap.containsKey("pwdlogin")||locatorMap.containsKey("ios_pwdlogin")){
   ElementBeans elementBeans=locatorMap.get("pwdlogin");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_pwdlogin");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【pwdlogin】元素信息"); return null;}
 }

/***
* 用户名
* @return
* @throws IOException
*/
public  ElementBeans username() throws IOException
 {
   if(locatorMap.containsKey("username")||locatorMap.containsKey("ios_username")){
   ElementBeans elementBeans=locatorMap.get("username");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_username");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【username】元素信息"); return null;}
 }

/***
* 密码
* @return
* @throws IOException
*/
public  ElementBeans password() throws IOException
 {
   if(locatorMap.containsKey("password")||locatorMap.containsKey("ios_password")){
   ElementBeans elementBeans=locatorMap.get("password");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_password");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【password】元素信息"); return null;}
 }

/***
* 登录按钮
* @return
* @throws IOException
*/
public  ElementBeans loginbtn() throws IOException
 {
   if(locatorMap.containsKey("loginbtn")||locatorMap.containsKey("ios_loginbtn")){
   ElementBeans elementBeans=locatorMap.get("loginbtn");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_loginbtn");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【loginbtn】元素信息"); return null;}
 }
}