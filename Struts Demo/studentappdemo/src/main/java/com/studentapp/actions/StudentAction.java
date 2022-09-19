package com.studentapp.actions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;
import com.studentapp.model.Student;

public class StudentAction extends ActionSupport implements SessionAware{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private List<String> hobbies;
private Student student;
Map<String,Object> appSession; 
Logger logger=Logger.getLogger(StudentAction.class);
@Override
public void setSession(Map<String, Object> session) {
appSession=session;	
}

public Student getStudent() {
	return student;
}

public void setStudent(Student student) {
	this.student = student;
}

public StudentAction() {
	logger.info("initializing the check box");
	hobbies=Arrays.asList("Sports","Music","Dance");
}

public List<String> getHobbies() {
	return hobbies;
}

public void setHobbies(List<String> hobbies) {
	this.hobbies = hobbies;
}
@Override
public String execute() throws Exception {
	logger.info("execute.....");
	Map<String,Object> hashMap=new HashMap<>();
	hashMap.put("message","Conjajulations brothor");
	hashMap.put("fruits",Arrays.asList("Strawberry","Pappaya","Banana"));
	ValueStack stack=ActionContext.getContext().getValueStack();
	stack.push(hashMap);
	appSession.put("message","Have a great day");
	appSession.put("fruits",Arrays.asList("Apple","Banana","Watermalon"));
	return SUCCESS;
}

public String display() {
	logger.info("Data in the display");
	return NONE;
}


}
