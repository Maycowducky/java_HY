<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="icon" type="image/x-icon" href="photos/favicon.ico" />
<!-- Bootstrap icons-->
<link
   href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css"
   rel="stylesheet" />
<script type="text/javascript"
   src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!-- Core theme CSS (includes Bootstrap)-->
<link href="<c:url value='/resources/css/styles.css'/>" rel="stylesheet" />
<!-- jQuery library -->
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
   integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
   crossorigin="anonymous"></script>
<!-- Popper Js -->
<script
   src="https://cdn.jsdelivr.net/npm/popper.js@1.14.7/dist/umd/popper.min.js"
   integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
   crossorigin="anonymous"></script>
<!-- Latest compiled JavaScript -->
<script
   src="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js"
   integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
   crossorigin="anonymous"></script>
</head>
<body>
   <div class="container">
      <div class="input-form-backgroud row">
         <div class="input-form col-md-12 mx-auto">
            <h4 class="mb-3">회원가입</h4>
            <form method="post" action="joinPro" name="userInfo"
               onsubmit="return checkValue()">
               <div class="row">
                  <div class="col-md-6 mb-3">
                     <label for="user_id">아이디</label> <input type="text"
                        class="form-control" id="user_id" name="user_id"
                        maxlength="50" placeholder="아이디를 입력해주세요" required> <span
                        class="idchk"></span>
                  </div>
                  <div class="col-md-6 mb-3">
                     <label for="memberName">이름</label> <input type="text"
                        class="form-control" id="memberName" placeholder="이름을 입력해주세요"
                        value="" required> <span class="memberNamechk"></span>

                  </div>
               </div>
               <div class="row">
                  <div class="col-md-6 mb-3">
                     <label for="user_pw">비밀번호</label> <input type="text"
                        class="form-control" name="user_pw" placeholder="비밀번호를 입력해주세요"
                        value="" required> <span class="pwchk1"></span>
                  </div>

                  <div class="col-md-6 mb-3">
                     <label for="memberPwCheck">비밀번호 확인</label> <input type="text"
                        class="form-control" id="memberPwCheck"
                        placeholder="비밀번호를 다시 한번 입력해주세요" value="" required><span
                        class="pwchk"></span>
                  </div>

               </div>
               <div class="mb-3">
                  <label for="user_email">이메일</label> <input type="text"
                     class="form-control" name="user_email" placeholder="metadog@example.com"
                     required="required"> <span class="emailchk"></span>
               </div>

               <div class="mb-3">
                  <label for="phoneNumber">휴대폰 번호</label> <input type="text"
                     class="form-control" id="phoneNumber"> <span
                     class="phchk"></span>
               </div>

               <div class="mb-3">
                  <label for="address">우편번호 <span class="text-muted">&nbsp;(선택사항)</span>
                     <span class="text-muted">
                        <button type="button" class="btn" id="check_btn" onclick="#">찾기</button>
                  </span>
                  </label> <input type="text" class="form-control" id="address"
                     placeholder="찾기를 눌러 주소를 입력하세요">
               </div>

               <div class="mb-3">
                  <label for="address2">주소<span class="text-muted">&nbsp;(선택사항)</span></label>
                  <input type="text" class="form-control" id="address2"
                     placeholder="주소를 입력해주세요.">
               </div>
               <div class="mb-4"></div>

               <button class="btn btn-primary btn-lg btn-block" type="submit">가입
                  완료</button>
            </form>
            <br>
            <button class="btn btn-primary btn-lg btn-block"
               onclick="goPreForm();">뒤로가기</button>

         </div>
      </div>
      <footer class="my-3 text-center text-small">
         <p class="mb-1">&copy; 2023 YD</p>
      </footer>
   </div>
</body>
</html>