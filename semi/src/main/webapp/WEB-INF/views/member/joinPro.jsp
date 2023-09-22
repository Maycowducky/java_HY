<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>가입완료</h1>
<c:choose>
	<c:when test="${(chk == true)}">
		<script type="text/javascript">
			alert("회원가입이 완료되었습니다.")
			location.href="/semi";
		</script>
	</c:when>
	<c:otherwise>
		<script type="text/javascript">
			alert("회원가입이 실패했습니다.")
			location.href="/semi";
		</script>
	</c:otherwise>
</c:choose>
</body>
</html>