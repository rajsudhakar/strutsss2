package com.training.model;

public class Student {
private String name;
private String password;
private int age;
private String gender;
private String course;
private long number;
private String email;
private double allowance;

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getCourse() {
	return course;
}
public void setCourse(String course) {
	this.course = course;
}
public long getNumber() {
	return number;
}
public void setNumber(long number) {
	this.number = number;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public double getAllowance() {
	return allowance;
}
public void setAllowance(double allowance) {
	this.allowance = allowance;
}
@Override
public String toString() {
	return "Student [name=" + name + ", password=" + password + ", age=" + age + ", gender=" + gender + ", course="
			+ course + ", number=" + number + ", email=" + email + ", allowance=" + allowance + "]";
}
}
