<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.*" %>
<c:set var="path" value="${pageContext.request.contextPath}"/>
<html>
<head>
    <title>$Title$</title>
    <link rel="stylesheet" href="${path}/resources/css/login.css">
    <script src="${path}/resources/js/login.js"></script>
</head>
<body>
<h1 class="tit_typeLogin">로그인</h1>

<div class="login-wrapper">

    <form name="loginform" method="post" action="" class="login-form" id="login-form">
        <input type="text" placeholder="아이디" id="loginId" class="loginId" value="아이디">
        <input type="password" placeholder="비밀번호" id="loginPass" class="loginPass" value="비밀번호">
        <input type="submit" value="로그인">
    </form>

    <div class="util_area">
        <a href="/join">회원가입 하기</a>
        <ul class="sub_search">
            <li class="idSearch">
                <a href="/idSearch">아이디찾기</a>
            </li>
            <li>
                <a href="/passSearch">비밀번호찾기</a>
            </li>
        </ul>
    </div>
</div>
<a href="/join">회원가입페이지로 이동</a>
<a href="/mypage">마이페이지 - 관심상품으로 이동</a>
</body>
</html>