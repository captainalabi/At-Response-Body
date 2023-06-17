package com.alabi.app.entity;

public class User {

	private String name;
	private Integer age;
	private String location;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", location=" + location + "]";
	}
	 
	
}
