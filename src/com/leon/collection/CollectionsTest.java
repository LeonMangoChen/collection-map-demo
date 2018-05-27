package com.leon.collection;

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
		Integer k;
		for(int i = 0;i < 10;i++){
//			if(integerList.contains(k)){
//				k = random.nextInt(100);
//			}
			do{
				k = random.nextInt(100);
			}while(integerList.contains(k));
			integerList.add(k);
			System.out.println("成功添加整数：" + k);
		}
		System.out.println("-----------排序前------------");
//		for (Integer integer : integerList) {
			System.out.println(integerList);
//		}
		Collections.sort(integerList);
		System.out.println("-----------排序后------------");
		System.out.println(integerList);
	}
	
	public static void main(String[] args) {
		CollectionsTest ct = new CollectionsTest();
		ct.testSort1();

	}

}
