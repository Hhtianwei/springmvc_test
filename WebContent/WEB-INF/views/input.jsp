<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="s"  uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	student<hr>
	<c:url var="url" value="/hello/home3"/>
	<s:form commandName="stu" action="${url }" method="post">
		id:<s:input path="id"/><br>
		<font color="red"><s:errors path="id" /></font><br>
		name:<s:input path="name"/><br>
		<font color="red"><s:errors path="name" /></font><br>
		<s:button value="submit">submit</s:button>
	</s:form>
	<hr>
	<br>
	message:${message }
	<br>
	
	
	《》
	
	=====<spring:message code="abc.hello"/>=====
	
	
	<!-- 这个不能用 -->
	<%-- <spring:theme code="abc.hello"/> --%>
	
	<%-- 这个可以--%>
	<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
	<fmt:message key="abc.hello"/> 
	
</body>
</html>