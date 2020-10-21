package com.testfan.ui.auto.mtx.pageObject;
import java.io.IOException;
import org.apache.log4j.Logger;
import java.io.InputStream;
import com.crazy.auto.driver.DriverBase;
import com.crazy.auto.element.ElementBeans;
//后台首页_对象库类
public class ManagerHomePage extends BasePage {
private static Logger log = Logger.getLogger(ManagerHomePage.class);//用于eclipse工程内运行查找对象库文件路径
 public   ManagerHomePage(DriverBase driver) {
//工程内读取对象库文件
	super(driver);

}
/***
* 订单管理菜单
* @return
* @throws IOException
*/
public  ElementBeans order() throws IOException
 {
   if(locatorMap.containsKey("order")||locatorMap.containsKey("ios_order")){
   ElementBeans elementBeans=locatorMap.get("order");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_order");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【order】元素信息"); return null;}
 }

/***
* 订单管理列表
* @return
* @throws IOException
*/
public  ElementBeans orderlist() throws IOException
 {
   if(locatorMap.containsKey("orderlist")||locatorMap.containsKey("ios_orderlist")){
   ElementBeans elementBeans=locatorMap.get("orderlist");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_orderlist");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【orderlist】元素信息"); return null;}
 }

/***
* 订单列表iframe
* @return
* @throws IOException
*/
public  ElementBeans orderframe() throws IOException
 {
   if(locatorMap.containsKey("orderframe")||locatorMap.containsKey("ios_orderframe")){
   ElementBeans elementBeans=locatorMap.get("orderframe");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_orderframe");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【orderframe】元素信息"); return null;}
 }
}