<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="title" value="write"/>
<%@include file="/view/common/header.jsp" %>
	<form action="/article/dowrite">
		<table>
				<tr>
					<th>제목</th>
					<td><input type="text" name="title"/></td>
				</tr>			
				<tr>
					<th>내용</th>
					<td><input type="text" name="content"/></td>
				</tr>			
		</table>
		<button>작성</button>
	</form>
<%@include file="/view/common/footer.jsp" %>