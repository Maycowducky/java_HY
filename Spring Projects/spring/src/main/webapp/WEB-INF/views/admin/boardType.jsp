<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=utf-8" 
	pageEncoding="utf-8" %>
<!doctype html>
<html lang="ko">
<head>
</head>
<body>
	<h1>게시판 타입 관리</h1>
	
	<div class="input-group mb-3 mt-3">
		<div class="input-group-prepend">
			<select class="form-control" name="type">
				<option value="0">작성권한</option>
				<option value="USER">회원이상</option>
				<option value="ADMIN">관리자</option>
			</select>
		</div>
		<input type="text" class="form-control">
		<button class="btn btn-outline-success btn-insert">등록</button>
	</div>
	<table class="table table-hover">
    <thead>
      <tr>
        <th>게시판 타입 번호</th>
        <th>게시판명</th>
        <th>권한</th>
        <th>기능</th>
      </tr>
    </thead>
    <tbody>
	      <tr>
	        <td>1</td>
	        <td>일반</td>
	        <td>
	        	<select class="form-control" name="type">
					<option value="USER">회원이상</option>
					<option value="ADMIN">관리자</option>
				</select>
	        </td>
	        <td>
				<button>수정</button>
				<button>삭제</button>
			</td>
	      </tr>
    </tbody>
  </table>
	
</body>
</html>
