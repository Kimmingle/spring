<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri = "http://java.sun.com/jsp/jstl/functions"%>
<c:set var="path2" value="${pageContext.request.contextPath }" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ajax 페이지</title>
</head>
<body>
	<h2>${serverTime }</h2>
	<h2>${author }</h2>
	<h2>${company }</h2>
	<hr>
	<a href="${path2 }/sample/list.do">샘플 목록</a>
	<ul>
		<li><a href="${path2 }/test/testList.do">테스트 목록</a></li>
		<li><a href="${path2 }/test/testList2.do">테스트 목록2</a></li>
	</ul>
	
	<ul>
		<li><a href="${path2 }/ajax/ajax1.do">api1 테스트</a></li>
		<li><a href="${path2 }/ajax/ajax2.do">api2 테스트</a></li>
		<li><a href="${path2 }/ajax/ajax5.do">api5 테스트</a></li>
		<li><a href="${path2 }/ajax/ajax6.do">api6 테스트</a></li>
		<li><a href="${path2 }/ajax/sub/ajax7">api7 테스트</a></li>
		<li><a href="${path2 }/ajax/sub/ajax8">api8 테스트</a></li>
		<li><a href="${path2 }/ajax/sub/ajax9">api9 테스트</a></li>
		<li><a href="${path2 }/ajax/sub/ajax10">api10 테스트</a></li>
	</ul>
</body>
</html>