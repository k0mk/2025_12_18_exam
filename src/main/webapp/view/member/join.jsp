<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.7.1/jquery.min.js" integrity="sha512-v2CJ7UaYy4JwqLDIrZUI/4hqeoQieOmAZNXBeQyjo21dadnwR+8ZaIJVT8EE2iyI61OV8e6M8PP2/4hpQINQ/g==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>
<c:set var="title" value="join"/>
<%@include file="/view/common/header.jsp" %>
<script>
	function checkinput(form) {
		const name = form.name.vlaue.trim;
		const Id = $(input[Id]).trim;
		const Pw = $(input[Pw]).trim;
		const chePw = $(input[chePw]).trim;
			alert("name");
			return false;
	}
</script>
	<form onsubmit="return checkinput(this);" action="/member/doJoin">
		<table>
			<tr>
				<th>이름</th>
				<td><input type="text" name="name"/></td>
			</tr>
			<tr>
				<th>아이디</th>
				<td><input type="text" name="Id"/></td>
			</tr>
			<tr>
				<th>비밀번호</th>
				<td><input type="text" name="Pw"/></td>
			</tr>
			<tr>
				<th>비밀번호 확인</th>
				<td><input type="text" name="chePw"/></td>
			</tr>
		</table>
		<button>가입</button>
	</form>
<%@include file="/view/common/footer.jsp" %>