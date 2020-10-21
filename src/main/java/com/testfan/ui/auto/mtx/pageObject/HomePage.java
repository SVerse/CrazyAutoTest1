package com.testfan.ui.auto.mtx.pageObject;
import java.io.IOException;
import org.apache.log4j.Logger;
import java.io.InputStream;
import com.crazy.auto.driver.DriverBase;
import com.crazy.auto.element.ElementBeans;
//mtx首页_对象库类
public class HomePage extends BasePage {
private static Logger log = Logger.getLogger(HomePage.class);//用于eclipse工程内运行查找对象库文件路径
 public   HomePage(DriverBase driver) {
//工程内读取对象库文件
	super(driver);

}
/***
* 登录链接
* @return
* @throws IOException
*/
public  ElementBeans loginLink() throws IOException
 {
   if(locatorMap.containsKey("loginLink")||locatorMap.containsKey("ios_loginLink")){
   ElementBeans elementBeans=locatorMap.get("loginLink");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_loginLink");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【loginLink】元素信息"); return null;}
 }

/***
* 商城首页
* @return
* @throws IOException
*/
public  ElementBeans homelink() throws IOException
 {
   if(locatorMap.containsKey("homelink")||locatorMap.containsKey("ios_homelink")){
   ElementBeans elementBeans=locatorMap.get("homelink");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_homelink");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【homelink】元素信息"); return null;}
 }

/***
* 商品
* @return
* @throws IOException
*/
public  ElementBeans goods() throws IOException
 {
   if(locatorMap.containsKey("goods")||locatorMap.containsKey("ios_goods")){
   ElementBeans elementBeans=locatorMap.get("goods");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_goods");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【goods】元素信息"); return null;}
 }

/***
* 个人中心
* @return
* @throws IOException
*/
public  ElementBeans personcenter() throws IOException
 {
   if(locatorMap.containsKey("personcenter")||locatorMap.containsKey("ios_personcenter")){
   ElementBeans elementBeans=locatorMap.get("personcenter");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_personcenter");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【personcenter】元素信息"); return null;}
 }
}