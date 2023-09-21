<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:choose>
		<c:when test="${(chk == true) }">
			<script type="text/javascript">
				alert("회원가입이 완료되었습니다.");
				location.href="/main";
			</script>
		</c:when>
		<c:otherwise>
			<script type="text/javascript">
				alert("회원가입에 실패했습니다.");
				location.href="/main";
			</script>
		</c:otherwise>
	</c:choose>
	<script type="text/javascript">
	//아이디 유효성검사
	$(document).ready(function() {
		var RegexId = /^[a-z0-9_-]{3,16}$/;
		$('#user_id').blur(function() {
			if(!RegexId.test($.trim($("#user_id").val()))){
				$('.idchk').html(" 영어 또는 숫자 3~16자리").css('color','red');
				$('#user_id').val("");
			}else{
				var user_id = $('#user_id').val();
				 $.ajax(
			   		 {
			 				url:'user_id/idCheck',
									type : "get",
									data : {
										"#user_id" : user_id
									},
									dataType : 'text',
									success : function(data) {
										if (data == "redundancy") {
											$('.idchk').html("중복된 아이디입니다").css(
													'color', 'red');
											$('#user_id').val("");
										} else if (data == "noredundancy") {
											$('.idchk').html("사용가능한 아이디입니다")
													.css('color', 'green');
											;
										} else {
											$('.idchk').html("아이디를 입력해주세요")
													.css('color', 'red');
										}
									}
								});
							}
							;
						});
			})
	//이름 유효성 검사
	$(document).ready(function(){
		$('#memberName').blur(function(){
			var pattern_num = /[0-9]/;
			var pattern_eng = /[a-zA-Z]/;
			var pattern_spc = /[~!@#$%^&*()_+|<>?:{}]/;
			var pattern_kor = /[ㄱ-ㅎ|ㅏ-ㅣ|가-힣]/;
			if(pattern_kor.test($('#memberName').val())
				&& !(pattern_eng.test($('#memberName').val()))
				&& !(pattern_spc.test($('#memberName').val()))
				&& !(pattern_num.test($('#memberName').val()))){
				$('.memberNamechk').html("완료").css('color', 'green');
			} else if ($('#memberName').val()==""){
				$('.memberNamechk').html("이름을 입력해주세요").css('color', 'red');
			} else {
				$('.memberNamechk').html("한글로 입력해주세요").css('color', 'red');
				$('#memberName').val("");
			}
				
		});
	})
	// 비밀번호 유효성 검사
	$(document).ready(function(){
		$('#memberPw').blur(function(){
			var memberPw = $('#memberPw').val();
			var num = memberPw.search(/[0-9/g]);
			var eng = memberPw.search(/[a-z]/ig);
			var spe = memberPw.search(/[`~!@@#$%^&*|\\\'\";:\/?]/gi;
			if(!$(#memberPw).val()){
				$('.pwchk1').html("비밀번호를 입력해주세요").css('color', 'red');
			} else if ($('#memberPw').val().length < 8 ++ $('#memberPw').val().length > 16) {
				$('.pwchk1').html("비밀번호는 8 ~ 16자리 사이로 입력해주세요").css('color', 'red');
				$('#memberPw').val("");
			} else {
				if (num < 0 || eng < 0 || spe < 0){
					$('.pwchk1').html("비밀번호는 문자, 숫자, 특수문자의 조합으로 입력해주세요").css('color','red');
					$('#memberPw').val("");
				} else {
					$('.pwchk1').html("사용가능한 비밀번호 입니다").css('color', 'green');
				}
			}
			;
		});
		
	})
	// 비밀번호 중복확인
	$(document).ready(function(){
		$('#memberPwCheck').blur(function(){
			if(!$('#memberPwCheck').val()){
				$('.pwchk').html("비밀번호를 한번 더 입력해주세요").css('color', 'red');
			} else if ($('#memberPwCheck').val() != $('#memberPw').val()) {
				$('.pwchk').html("비밀번호가 일치하지 않습니다").css('color', 'red');
				$('#memberPwCheck').val("");
			} else {
				$('.pwchk').html("비밀번호가 일치합니다").css('color', 'green');
			}
		});
	})
	</script>
</body>
</html>