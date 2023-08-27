<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Index</title> 
</head>
<body>
<!--<a href="/signup">회원 가입</a>  -->
<a href="<%=request.getContextPath()%>/signup">회원 가입</a>
<a href="<%=request.getContextPath()%>/withdraw">회원 탈퇴</a>
<a href="<%=request.getContextPath()%>/list">게시글 조회</a>
</body>
</html>