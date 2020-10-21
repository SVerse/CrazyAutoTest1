package com.testfan.ui.auto.pageObject;
import java.io.IOException;
import java.io.InputStream;
import org.apache.log4j.Logger;
import com.crazy.auto.driver.DriverBase;
import com.crazy.auto.element.ElementBeans;
//会员首页_对象库类
public class MemberPage1223 extends BasePage {
//用于eclipse工程内运行查找对象库文件路径
private static Logger log = Logger.getLogger(MemberPage1223.class);private String path="src/main/resources/pageObjectFiles/yml/";
 public   MemberPage1223(DriverBase driver) {
//工程内读取对象库文件
	super(driver);
}
/***
* 修改个人资料链接
* @return
* @throws IOException
*/
public  ElementBeans 修改个人资料() throws IOException
 {
   if(locatorMap.containsKey("修改个人资料")||locatorMap.containsKey("ios_修改个人资料")){
   ElementBeans elementBeans=locatorMap.get("修改个人资料");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_修改个人资料");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【修改个人资料】元素信息"); return null;}
 }

/***
*  上传会员头像
* @return
* @throws IOException
*/
public  ElementBeans uploadHeader() throws IOException
 {
   if(locatorMap.containsKey("uploadHeader")||locatorMap.containsKey("ios_uploadHeader")){
   ElementBeans elementBeans=locatorMap.get("uploadHeader");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_uploadHeader");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【uploadHeader】元素信息"); return null;}
 }

/***
* 用户头像
* @return
* @throws IOException
*/
public  ElementBeans userico() throws IOException
 {
   if(locatorMap.containsKey("userico")||locatorMap.containsKey("ios_userico")){
   ElementBeans elementBeans=locatorMap.get("userico");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_userico");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【userico】元素信息"); return null;}
 }
}