<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri = "http://java.sun.com/jsp/jstl/functions"%>
<c:set var="path2" value="${pageContext.request.contextPath }" />

<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
</script>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학생등록</title>
</head>
<body>
	<div class=form>
		<input type= "number" name="stdNumber1" class="num" placeholder="번호 입력"/><br><br>
		<input type= "text" name="name1" id="name" placeholder="학생명 입력"/><br><br>
		<input type= "number" name="age1" id="age" placeholder="나이 입력"/><br><br>
		
	</div> 
	<div class=form>
		<input type= "number" name="stdNumber2" class="num" placeholder="번호 입력"/><br><br>
		<input type= "text" name="name2" id="name" placeholder="학생명 입력"/><br><br>
		<input type= "number" name="age2" id="age" placeholder="나이 입력"/><br><br>
		
	</div>
	<div class=form>
		<input type= "number" name="stdNumber3" class="num" placeholder="번호 입력"/><br><br>
		<input type= "text" name="name3" id="name" placeholder="학생명 입력"/><br><br>
		<input type= "number" name="age3" id="age" placeholder="나이 입력"/><br><br>
	</div>
	<button type="button" id="btn1"> 등록 </button>
	<!-- 하나의 화면에서 여러 데이터를 처리할 수 있음. 이렇게 데이터 주고받는게 중요  -->
	
	<script> //학생 객체들을 저장해서 stds로 보낼거임
		$(document).ready(function(){
			$("#btn1").click(function(){
				var student = { stdNumber: 0, name : "아무개", age : 0 };
				var stds = [student, student, student];
				$.each($(".form"), function(index, value){  // 반복문
					var num = $(this).find(".num").val();
					var name = $(this).find(".name").val();
					var age = $(this).find(".age").val();
					
					student = {stdNumber:num, name:name, age:age};
					stds[index] = student;
					});
				
				
				$.ajax({ 
					type:"post",
					url:"${path2}/api/api7.do",
					data: JSON.stringify(student),
					dataType:"json",
					contentType:'application/json; charset=utf-8',
					success:function(data){
						
				});
			});
		});
	</script>
	
	
</body>
</html>