package com.crazy.auto.utils;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;


/**
 * @author 沙陌 qq2879897713
 *
 */
public class Port {

	private static Logger log = Logger.getLogger(Port.class);

	/**
	 * 验证端口是否被占用
	 * 
	 * @param portNum
	 * @return boolean
	 */
	public static boolean isPortUsed(int portnum) {
		try {
			String result = CommandLineExec.executor(Command.getPortCheck() + String.valueOf(portnum));
			if (result.length() > 0) {
				if (result.contains("LISTENING")) {
					return true;
				}
			}
			return false;
		} catch (Exception e) {
			// TODO: handle exception
			log.debug("port " + portnum + "->" + e.getMessage());
			return false;
		}
	}

	/**
	 * 基于当前连接的设备数量生成可用端口
	 * 
	 * @param portStart,Starting
	 *            ports
	 * @param deviceCounts,Total
	 *            number of devices
	 * @return List<Integer>
	 */
	public static List<Integer> generatPortList(int portStart, int deviceCounts) {
		List<Integer> portList = new ArrayList<Integer>();
		int i = 0;
		while (portList.size() != deviceCounts) {
			if (portStart >= 0 && portStart <= 60000 + i) {
				if (!isPortUsed(portStart)) {
					portList.add(portStart);
				}
				portStart++;
				i++;
				if(i>5534){
					break;
				}
			} else {
				log.error("port +" + portStart + " not Between 0 and 65535");
				throw new RuntimeException("port +" + portStart + " not Between 0 and 65535");
			}
		}
		return portList;
	}
	
	public static int randomPort(){
		int port=RandomUtil.randomInt(5000, 8000);
		while(isPortUsed(port)){
			port=RandomUtil.randomInt(5000, 8000);
		}
		return port;
	}

}
