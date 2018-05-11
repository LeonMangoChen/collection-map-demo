package com.leon.collection;
/**
 * 课程类
 * @author LeonChen
 *
 */
public class Course {
	// 课程id
	private String id;
	// 课程名称
	private String name;
	
	public Course(String id,String name){
		this.id = id;
		this.name = name;
	}
	
	//课程id的get方法
	public String getId(){
		return id;
	}
	//课程id的set方法
	public void setId(String id){
		this.id = id;
	}
	
	// 课程name的get方法
	public String getName(){
		return name;
	}
	// 课程name的set方法
	public void setName(String name){
		this.name = name;
	}
}
