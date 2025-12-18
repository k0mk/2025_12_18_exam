<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="title" value="Detail"/>
<%@include file="/view/common/header.jsp" %>
		<table>
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
				<tr>
					<th>내용</th>
					<td>${article.content}</td>
				</tr>			
				<tr>
					<th>작성자</th>
					<td>${article.writerName}</td>
				</tr>			
		</table>
<%@include file="/view/common/footer.jsp" %>	