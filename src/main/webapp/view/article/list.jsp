<%@page import="org.springframework.ui.Model"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="title" value="List"/>
<%@include file="/view/common/header.jsp" %>
	<c:if test="${articles != null}">
		<table>
			<c:forEach items="${articles }" var="article">
				<tr>
					<th>번호</th>
					<td>${article.id }</td>
				</tr>			
				<tr>
					<th>제목</th>
					<td><a href="/article/detail?id=${article.id }">${article.title }</a></td>
				</tr>			
				<tr>
					<th>작성일</th>
					<td>${article.regDate }</td>
				</tr>			
				<tr>
					<th>수정일</th>
					<td>${article.updateDate}</td>
				</tr>			
			</c:forEach>
		</table>
	</c:if>
	<c:if test="${articles == null }">
		<div>등록된 게시물이 없습니다.</div>
	</c:if>
<%@include file="/view/common/footer.jsp" %>