<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.*" %>
<c:set var="path" value="${pageContext.request.contextPath}"/>
<html>
<head>
    <title>$Title$</title>
    <link rel="stylesheet" href="${path}/resources/css/join.css">
    <script src="${path}/resources/js/join.js"></script>
</head>
<body>

<h1 class="jointit">회원가입</h1>
<div class="join-wrapper">

    <form name="joinform" id="join_form" method="post" action="">
        <div class="id_box">
            <label>아이디</label>
            <input type="text"/>
            <span></span>
        </div>


        <div class="pass_box">
            <label>비밀번호</label>
            <input type="password"/>
            <span></span>
        </div>


        <div class="passSearch_box">
            <label>비밀번호 재확인</label>
            <input type="password"/>
            <span></span>
        </div>


        <div class="groupC">
            <label>이름</label>
            <input type="text"/>
            <div class="gender_select">
                <input type="radio" name="gender" id="man"/>
                <label for="man">남</label>
                <input type="radio" name="gender" id="woman"/>
                <label for="woman">여</label>
            </div>
        </div>

        <div class="bir_wrap">
            <label>생년월일</label>
            <input type="text">
        </div>

        <input type="submit" value="회원가입"/>

    </form>


</div>


<a href="/login">로그인페이지로 이동</a>
<a href="/mypage">마이페이지 - 관심상품으로 이동</a>

</body>
</html>