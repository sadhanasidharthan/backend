package com.example.demo.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Book {
	@Id
	private int id;
	private String name;
	private int age;
	private String course;
	private String email;
	private String roletobecome;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void name(String name) {
		this.name = name;
	}
	public String getname() {
		return name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setCourse(String course) {
		this.course = course;
	}

	public String getCourse() {
		return course;
	}
	public void setRoletobecome(String roletobecome) {
		this.roletobecome = roletobecome;
	}
	public String getRoletobecome() {
		return roletobecome;
	}

}
