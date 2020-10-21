package com.testfan.ui.auto.mtx.pageObject;
import java.io.IOException;
import org.apache.log4j.Logger;
import java.io.InputStream;
import com.crazy.auto.driver.DriverBase;
import com.crazy.auto.element.ElementBeans;
//安全设置页_对象库类
public class SecuritySettingPage extends BasePage {
private static Logger log = Logger.getLogger(SecuritySettingPage.class);//用于eclipse工程内运行查找对象库文件路径
 public   SecuritySettingPage(DriverBase driver) {
//工程内读取对象库文件
	super(driver);

}
/***
* 登录密码的修改
* @return
* @throws IOException
*/
public  ElementBeans modify() throws IOException
 {
   if(locatorMap.containsKey("modify")||locatorMap.containsKey("ios_modify")){
   ElementBeans elementBeans=locatorMap.get("modify");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_modify");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【modify】元素信息"); return null;}
 }

/***
* 手机号码绑定操作
* @return
* @throws IOException
*/
public  ElementBeans mobilebinding() throws IOException
 {
   if(locatorMap.containsKey("mobilebinding")||locatorMap.containsKey("ios_mobilebinding")){
   ElementBeans elementBeans=locatorMap.get("mobilebinding");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_mobilebinding");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【mobilebinding】元素信息"); return null;}
 }

/***
* 电子邮箱绑定操作
* @return
* @throws IOException
*/
public  ElementBeans emailbinding() throws IOException
 {
   if(locatorMap.containsKey("emailbinding")||locatorMap.containsKey("ios_emailbinding")){
   ElementBeans elementBeans=locatorMap.get("emailbinding");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_emailbinding");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【emailbinding】元素信息"); return null;}
 }

/***
* 原密码
* @return
* @throws IOException
*/
public  ElementBeans my_pwd() throws IOException
 {
   if(locatorMap.containsKey("my_pwd")||locatorMap.containsKey("ios_my_pwd")){
   ElementBeans elementBeans=locatorMap.get("my_pwd");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_my_pwd");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【my_pwd】元素信息"); return null;}
 }

/***
* 新密码
* @return
* @throws IOException
*/
public  ElementBeans new_pwd() throws IOException
 {
   if(locatorMap.containsKey("new_pwd")||locatorMap.containsKey("ios_new_pwd")){
   ElementBeans elementBeans=locatorMap.get("new_pwd");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_new_pwd");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【new_pwd】元素信息"); return null;}
 }

/***
* 确认密码
* @return
* @throws IOException
*/
public  ElementBeans confirm_new_pwd() throws IOException
 {
   if(locatorMap.containsKey("confirm_new_pwd")||locatorMap.containsKey("ios_confirm_new_pwd")){
   ElementBeans elementBeans=locatorMap.get("confirm_new_pwd");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_confirm_new_pwd");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【confirm_new_pwd】元素信息"); return null;}
 }
}