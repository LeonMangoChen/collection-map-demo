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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Course))
			return false;
		Course other = (Course) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
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
