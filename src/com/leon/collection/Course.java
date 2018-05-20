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
	
	@Override
	public boolean equals(Object obj){
		if(this == obj){
			return true;
		}
		if(obj == null)
			return false;
		if(!(obj instanceof Course))
			return false;
		Course course = (Course) obj;
		if(this.name == null){
			if(course.name == null){
				return true;
			}else{
				return false;
			}
		}else{
			if(this.name.equals(course.name)){
				return true;
			}else{
				return false;
			}
		}
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
	public Course(){}
}
