<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<title>�Խñ� ���</title>
</head>
<body>
	<h1>�Խñ� ���</h1>
	<form action="<c:url value='/board/insert'/>" method="post">
		<div class="form-group">
			<label>����</label>
			<input type="text" class="form-control" name="bo_title">
		</div>
		<div class="form-group">
			<label>�ۼ���</label>
			<input type="text" class="form-control" name="bo_me_id" value="${user.me_id }" readonly>
		</div>
		<div class="form-group">
			<label>����</label>
			<textarea name="bo_contents"></textarea>
		</div>
	</form>
</body>
</html>