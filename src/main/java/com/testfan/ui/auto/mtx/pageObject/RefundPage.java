package com.testfan.ui.auto.mtx.pageObject;
import java.io.IOException;
import org.apache.log4j.Logger;
import java.io.InputStream;
import com.crazy.auto.driver.DriverBase;
import com.crazy.auto.element.ElementBeans;
//退款/售后页_对象库类
public class RefundPage extends BasePage {
private static Logger log = Logger.getLogger(RefundPage.class);//用于eclipse工程内运行查找对象库文件路径
 public   RefundPage(DriverBase driver) {
//工程内读取对象库文件
	super(driver);

}
/***
* 仅退款
* @return
* @throws IOException
*/
public  ElementBeans onlyRefund() throws IOException
 {
   if(locatorMap.containsKey("onlyRefund")||locatorMap.containsKey("ios_onlyRefund")){
   ElementBeans elementBeans=locatorMap.get("onlyRefund");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_onlyRefund");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【onlyRefund】元素信息"); return null;}
 }

/***
* 退款退货
* @return
* @throws IOException
*/
public  ElementBeans refundAndShip() throws IOException
 {
   if(locatorMap.containsKey("refundAndShip")||locatorMap.containsKey("ios_refundAndShip")){
   ElementBeans elementBeans=locatorMap.get("refundAndShip");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_refundAndShip");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【refundAndShip】元素信息"); return null;}
 }

/***
* 退款原因
* @return
* @throws IOException
*/
public  ElementBeans reason() throws IOException
 {
   if(locatorMap.containsKey("reason")||locatorMap.containsKey("ios_reason")){
   ElementBeans elementBeans=locatorMap.get("reason");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_reason");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【reason】元素信息"); return null;}
 }

/***
* 退款说明
* @return
* @throws IOException
*/
public  ElementBeans refundMsg() throws IOException
 {
   if(locatorMap.containsKey("refundMsg")||locatorMap.containsKey("ios_refundMsg")){
   ElementBeans elementBeans=locatorMap.get("refundMsg");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_refundMsg");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【refundMsg】元素信息"); return null;}
 }

/***
* 提交
* @return
* @throws IOException
*/
public  ElementBeans 提交() throws IOException
 {
   if(locatorMap.containsKey("提交")||locatorMap.containsKey("ios_提交")){
   ElementBeans elementBeans=locatorMap.get("提交");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_提交");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【提交】元素信息"); return null;}
 }
}