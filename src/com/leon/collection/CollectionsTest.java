package com.leon.collection;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * 将要完成：
 * 1.通过Collections.sort()方法，对Integer泛型的List进行排序；
 * 2.对String泛型的List进行排序；
 * 3.对其他类型泛型的List进行排序，以Student为例。
 *
 */
public class CollectionsTest {

	/**
	 * 1.通过Collections.sort()方法，对Integer泛型的List进行排序；
	 * 创建一个Integer泛型的List，插入十个100以内的不重复随机数
	 * 调用Collections.sort()方法对其进行 排序
	 */
	public void testSort1(){
		List<Integer> integerList = new ArrayList<Integer>();
//		插入十个100以内的不重复随机数
		Random random = new Random();
		while(true){
			if(integerList.size()<=10){
				Integer k = random.nextInt(100);
				if(!integerList.contains(k)){
					//k = random.nextInt(100);
					integerList.add(k);
					System.out.println("成功添加整数：" + k);
				}
				/*			do{
				k = random.nextInt(100);
			}while(integerList.contains(k));*/
			}else{
				System.out.println("-----------排序前------------");
				System.out.println(integerList);
				Collections.sort(integerList);
				System.out.println("-----------排序后------------");
				System.out.println(integerList);
				break;
			}
		}
//		for (Integer integer : integerList) {
//		}
	}
	
	/**
	 * 2.对String泛型的List进行排序；
	 * 创建String泛型的List，添加三哥哥乱序的Sting元素，
	 * 调用sort方法，再次输入排序后的顺序
	 */
	public void testSort2(){
		List<String> stringList = new ArrayList<String>();
		stringList.add("Java");
		stringList.add("JavaScript");
		stringList.add("Python");
		System.out.println("-----------排序前------------");
		for (String string : stringList) {
			System.out.println("元素" + string);
		}
		Collections.sort(stringList);
		/**
		 * 排列顺序
		 * 数字：0-9
		 * 大写字母：A-Z
		 * 小写字母：a-z
		 */
		System.out.println("-----------排序后------------");
		for (String string : stringList) {
			System.out.println("元素" + string);
		}
	}
	/**
	 * 利用Collections.sort()方法对泛型为String的List进行排序版本2：
	 * 1.创建完List<String>之后，往其中添加十条随机字符串
	 * 2.每条字符串的长度为10以内的随机整数
	 * 3.每条字符串的每个字符都为随机生成的字符，字符可以重复
	 * 4.每条随机字符串不可重复
	 * @throws UnsupportedEncodingException 
	 */
	public void testStringSort() throws UnsupportedEncodingException{
		List<String> stringList = new ArrayList<String>();
		String str = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM1234567890";
/*		do{
			int random = new Random().nextInt(51);
			int i = 0;
			System.out.println("生成的随机数为"+random);
			String subStr = str.substring(random, random+10);
			System.out.println("截取的字符串为"+subStr);
			if(!stringList.contains(subStr)){
				stringList.add(subStr);
				System.out.println("第"+(i+1)+"次添加元素"+subStr);
			}
		}while(stringList.size()<10);
		System.out.println("字符串数组为"+stringList.toString());*/
		String[] by = str.split("");
		System.out.println("转换成的String数组为"+by.toString());
		do{
			int len = new Random().nextInt(10);
			String ss = "";
			for (int i = 0; i < len; i++) {
				int index = new Random().nextInt(62);
				ss = ss + by[index];
			}
			System.out.println("生成的字符串为"+ss);
			stringList.add(ss);
		}while(stringList.size()<10);
		System.out.println("生成字符串数组为"+stringList.toString());
		Collections.sort(stringList);
		System.out.println("字符串排序后结果"+stringList);
	}
	
	public static void main(String[] args) throws UnsupportedEncodingException {
		CollectionsTest ct = new CollectionsTest();
		//ct.testSort1();
		//ct.testSort2();
		ct.testStringSort();
	}

}
