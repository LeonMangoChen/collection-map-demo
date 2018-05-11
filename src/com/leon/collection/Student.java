package com.leon.collection;

import java.util.HashSet;
import java.util.Set;

/**
 * 学生类
 * @author LeonChen
 *
 */
public class Student {
	// 学生id
	private String id;
	// 学生name
	private String name;
		
	
	public Set courses;
	
	public Student(String id,String name){
		this.id = id;
		this.name = name;
		this.courses = new HashSet();
	}
	
	// 学生id的get方法
	public String getId(){
		return id;
	}
	// 学生id的set方法
	public void setId(String id){
		this.id = id;
	}
	
	// 学生name的get方法
	public String getName(){
		return name;
	}
	// 学生name的set方法
	public void setName(String name){
		this.name = name;
	}
}
