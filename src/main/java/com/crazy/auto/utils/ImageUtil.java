package com.crazy.auto.utils;import javax.imageio.*;import java.awt.image.*;import java.awt.*;//Colorimport java.io.*;public class ImageUtil{    public static void main(String[] args)throws Exception{        //System.out.println(ImageUtil.compareImg("res/images/1y.png", "res/images/2y.png", 100f));        System.out.println(ImageUtil.compareImg("images/mty/current.png", "images/mty/3.png",100f));;    }    public static int[] getData(String name)throws Exception{        BufferedImage img = ImageIO.read(new File(name));        BufferedImage slt = new BufferedImage(100,100,BufferedImage.TYPE_INT_RGB);        slt.getGraphics().drawImage(img,0,0,100,100,null);                int[] data = new int[256];        for(int x = 0;x<slt.getWidth();x++){            for(int y = 0;y<slt.getHeight();y++){                int rgb = slt.getRGB(x,y);                Color myColor = new Color(rgb);                int r = myColor.getRed();                int g = myColor.getGreen();                int b = myColor.getBlue();                data[(r+g+b)/3]++;            }        }        return data;    }    public static float compare(int[] s,int[] t){        float result = 0F;        for(int i = 0;i<256;i++){            int abs = Math.abs(s[i]-t[i]);            int max = Math.max(s[i],t[i]);                        result += (1-((float)abs/(max==0?1:max)));                    }        System.out.println((result/256)*100);        return (result/256)*100;    }    public static boolean compareImg(String srcName,String desName,float f) throws Exception{    	if(compare(getData(srcName), getData(desName))>=f){    		return true;    	}else{    		return false;    	}    	    }}