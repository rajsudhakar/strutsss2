<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib uri="/struts-tags" prefix="s" %>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<s:form action="register">
<s:textfield name="student.name" label="Name"></s:textfield>
<s:textfield name="student.password" label="password"></s:textfield>
<s:textfield name="student.age" label="age"></s:textfield>
<s:radio name="student.gender" list="{'male','female'}" ></s:radio>
<s:select name="student.course" list="{'Java','Spring','Hibernate','JSP'}" ></s:select>
<s:textfield name="student.number" label="number"></s:textfield>
<s:textfield name="student.allowance" label="Allowance"></s:textfield>
<s:textfield name="student.email" label="Email"></s:textfield>
<s:submit value="Register"></s:submit>
</s:form>
</body>
</html>