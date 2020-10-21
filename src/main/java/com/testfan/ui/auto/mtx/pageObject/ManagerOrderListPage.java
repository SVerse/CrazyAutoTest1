package com.testfan.ui.auto.mtx.pageObject;
import java.io.IOException;
import org.apache.log4j.Logger;
import java.io.InputStream;
import com.crazy.auto.driver.DriverBase;
import com.crazy.auto.element.ElementBeans;
//订单列表_对象库类
public class ManagerOrderListPage extends BasePage {
private static Logger log = Logger.getLogger(ManagerOrderListPage.class);//用于eclipse工程内运行查找对象库文件路径
 public   ManagerOrderListPage(DriverBase driver) {
//工程内读取对象库文件
	super(driver);

}
/***
* 未发货的订单的发货
* @return
* @throws IOException
*/
public  ElementBeans noShip() throws IOException
 {
   if(locatorMap.containsKey("noShip")||locatorMap.containsKey("ios_noShip")){
   ElementBeans elementBeans=locatorMap.get("noShip");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_noShip");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【noShip】元素信息"); return null;}
 }

/***
* 第一个快递
* @return
* @throws IOException
*/
public  ElementBeans express() throws IOException
 {
   if(locatorMap.containsKey("express")||locatorMap.containsKey("ios_express")){
   ElementBeans elementBeans=locatorMap.get("express");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_express");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【express】元素信息"); return null;}
 }

/***
* 快递单号
* @return
* @throws IOException
*/
public  ElementBeans expressNum() throws IOException
 {
   if(locatorMap.containsKey("expressNum")||locatorMap.containsKey("ios_expressNum")){
   ElementBeans elementBeans=locatorMap.get("expressNum");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_expressNum");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【expressNum】元素信息"); return null;}
 }

/***
* 确认
* @return
* @throws IOException
*/
public  ElementBeans 确认() throws IOException
 {
   if(locatorMap.containsKey("确认")||locatorMap.containsKey("ios_确认")){
   ElementBeans elementBeans=locatorMap.get("确认");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_确认");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【确认】元素信息"); return null;}
 }

/***
* 未收货的订单的收货操作
* @return
* @throws IOException
*/
public  ElementBeans noRog() throws IOException
 {
   if(locatorMap.containsKey("noRog")||locatorMap.containsKey("ios_noRog")){
   ElementBeans elementBeans=locatorMap.get("noRog");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_noRog");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【noRog】元素信息"); return null;}
 }

/***
* 可以退货的订单的退货操作
* @return
* @throws IOException
*/
public  ElementBeans returned() throws IOException
 {
   if(locatorMap.containsKey("returned")||locatorMap.containsKey("ios_returned")){
   ElementBeans elementBeans=locatorMap.get("returned");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_returned");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【returned】元素信息"); return null;}
 }

/***
* 订单详情
* @return
* @throws IOException
*/
public  ElementBeans orderDetaile() throws IOException
 {
   if(locatorMap.containsKey("orderDetaile")||locatorMap.containsKey("ios_orderDetaile")){
   ElementBeans elementBeans=locatorMap.get("orderDetaile");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_orderDetaile");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【orderDetaile】元素信息"); return null;}
 }
}