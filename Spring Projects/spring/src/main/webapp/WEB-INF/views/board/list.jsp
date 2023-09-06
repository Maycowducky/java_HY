<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=utf-8" 
	pageEncoding="utf-8" %>
<!doctype html>
<html lang="ko">
<head>
	<style type="text/css">
		.table tbody tr:nth-of-type(2n+1) td{
			background: #b8daff
		}
		.table tbody tr:nth-of-type(2n+2) td{
			background: #c3e6cb
		}
		.table tbody tr:nth-of-type(2n+3) td{
			background: #f5c6cb
		}
		.table tbody tr:nth-of-type(2n+4) td{
			background: #bee5eb
		}
		.table tbody tr:nth-of-type(2n+5) td{
			background: #ffeeba
		}
	</style>
</head>
<body>
	<h1>게시판</h1>
	<form action="" method="get">
	  	<div class="input-group mb-3">
	    	<div class="input-group-prepend">
		    	<select class="form-control" name="type">
			      	<option value="0" <c:if test="${pm.cri.type == '0' }">selected</c:if>>전체</option>
			      	<option value="bo_title" <c:if test="${pm.cri.type == 'bo_title' }">selected</c:if>>제목</option>
			      	<option value="bo_me_id" <c:if test="${pm.cri.type == 'bo_me_id' }">selected</c:if>>작성자</option>
			      	<option value="bo_contents" <c:if test="${pm.cri.type == 'bo_contents' }">selected</c:if>>내용</option>
		      	</select>
	   		</div>
		    <input type="text" class="form-control" name="search" value="${pm.cri.search}">
		    <button class="btn btn-outline-success">검색</button>
  		</div>
	</form>
	<table class="table table-hover">
    <thead>
      <tr>
        <th>번호</th>
        <th>제목</th>
        <th>작성자</th>
        <th>조회수</th>
        <th>추천/비추천</th>
      </tr>
    </thead>
    <tbody>
      <c:forEach items="${list }" var="board">
	      <tr>
	        <td>${board.bo_num}</td>
	        <td>
	        	<a href="<c:url value='/board/detail${pm.cri.currentUrl}&bo_num=${board.bo_num}'/>">${board.bo_title}(${board.bo_comment })</a>
	        </td>
	        <td>${board.bo_me_id }</td>
	        <td>${board.bo_views }</td>
	        <td>${board.bo_up }/${board.bo_down }</td>
	      </tr>
      </c:forEach>
    </tbody>
  </table>
  <ul class="pagination justify-content-center">
  	<c:if test="${pm.prev}">
	    <li class="page-item">
	    	<a class="page-link" href="<c:url value='/board/list${pm.cri.getUrl(pm.startPage-1)}'/>">이전</a>
	    </li>
    </c:if>
    
    <c:forEach begin="${pm.startPage}" end="${pm.endPage}" var="i">
	    <li class="page-item <c:if test='${pm.cri.page == i}'>active</c:if>">
	    	<a class="page-link" href="<c:url value='/board/list${pm.cri.getUrl(i)}'/>">${i}</a>
	    </li>
    </c:forEach>
    <c:if test="${pm.next}">
	    <li class="page-item">
	    	<a class="page-link" href="<c:url value='/board/list${pm.cri.getUrl(pm.endPage+1)}'/>">다음</a>
	    </li>
    </c:if>
  </ul>
  <a class="btn btn-outline-danger" href="<c:url value='/board/insert'/>">글쓰기</a>
</body>
</html>



