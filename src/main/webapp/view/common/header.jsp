<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${title }</title>
</head>
<body>
<a href="/article/list">list</a>

<c:if test="${SessionScope.loginmemberId == null }">
	<a href="/member/login">login</a>
	<a href="/member/join">join</a>
</c:if>
<c:if test="${SessionScope.loginmemberId != null }">
	<a href="/member/logout">logout</a>
	<a href="/article/write">write</a>
</c:if>