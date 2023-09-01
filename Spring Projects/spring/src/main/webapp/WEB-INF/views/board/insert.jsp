<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html lang="ko">
<head>
 	<link href="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote-bs4.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote-bs4.min.js"></script>
<title>�Խñ� ���</title>
</head>
<body>
	<h1>�Խñ� ���</h1>
	<form action="<c:url value='/board/insert'/>" method="post" enctype="multipart/form-data">
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
			<textarea name="bo_contents" id="summernote"></textarea>
		</div>
		<div class="form-group">
			<label>÷������</label>
			<input type="file" class="form-control" name="files">
			<input type="file" class="form-control" name="files">
			<input type="file" class="form-control" name="files">
		</div>
		<button class="btn btn-outline-success col-12">����ϱ�</button>
	</form>
	<script>
      $('#summernote').summernote({
        placeholder: '������ �Է��ϼ���',
        tabsize: 2,
        height: 400
      });
    </script>
</body>
</html>