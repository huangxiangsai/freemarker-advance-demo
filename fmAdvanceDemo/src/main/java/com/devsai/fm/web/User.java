package com.devsai.fm.web;

public class User {
	
	private Long id;
	
	private String name;
	
	private String age;
	
	private String ctiy;

	public User(String name,String age,String city) {
		this.name = name;
		this.age = age;
		this.ctiy = city;
				
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getCtiy() {
		return ctiy;
	}

	public void setCtiy(String ctiy) {
		this.ctiy = ctiy;
	}
	
	

}
