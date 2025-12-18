<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="title" value="main"/>
<%@include file="/view/common/header.jsp" %>
	<form action="/member/doLogin" >
		<table>
				<tr>
					<th>아이디</th>
					<td><input type="text" name="Id"/></td>
				</tr>			
				<tr>
					<th>비밀번호</th>
					<td><input type="text" name="Pw"/></td>
				</tr>			
		</table>
		<button>로그인</button>
	</form>
<%@include file="/view/common/footer.jsp" %>