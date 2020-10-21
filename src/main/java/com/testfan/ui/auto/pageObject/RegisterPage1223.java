package com.testfan.ui.auto.pageObject;
import java.io.IOException;
import java.io.InputStream;
import org.apache.log4j.Logger;
import com.crazy.auto.driver.DriverBase;
import com.crazy.auto.element.ElementBeans;
//javamall注册_对象库类
public class RegisterPage1223 extends BasePage {
//用于eclipse工程内运行查找对象库文件路径
private static Logger log = Logger.getLogger(RegisterPage1223.class);private String path="src/main/resources/pageObjectFiles/yml/";
 public   RegisterPage1223(DriverBase driver) {
//工程内读取对象库文件
	super(driver);
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
* 注册邮箱
* @return
* @throws IOException
*/
public  ElementBeans reg_email() throws IOException
 {
   if(locatorMap.containsKey("reg_email")||locatorMap.containsKey("ios_reg_email")){
   ElementBeans elementBeans=locatorMap.get("reg_email");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_reg_email");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【reg_email】元素信息"); return null;}
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
* 确认密码
* @return
* @throws IOException
*/
public  ElementBeans reg_passwd_r() throws IOException
 {
   if(locatorMap.containsKey("reg_passwd_r")||locatorMap.containsKey("ios_reg_passwd_r")){
   ElementBeans elementBeans=locatorMap.get("reg_passwd_r");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_reg_passwd_r");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【reg_passwd_r】元素信息"); return null;}
 }

/***
* 验证码
* @return
* @throws IOException
*/
public  ElementBeans iptlogin() throws IOException
 {
   if(locatorMap.containsKey("iptlogin")||locatorMap.containsKey("ios_iptlogin")){
   ElementBeans elementBeans=locatorMap.get("iptlogin");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_iptlogin");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【iptlogin】元素信息"); return null;}
 }

/***
* 注册按钮
* @return
* @throws IOException
*/
public  ElementBeans registerBtn() throws IOException
 {
   if(locatorMap.containsKey("registerBtn")||locatorMap.containsKey("ios_registerBtn")){
   ElementBeans elementBeans=locatorMap.get("registerBtn");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_registerBtn");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【registerBtn】元素信息"); return null;}
 }
}