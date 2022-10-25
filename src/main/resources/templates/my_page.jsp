<%--
  Created by IntelliJ IDEA.
  User: jaechul
  Date: 2022/10/18
  Time: 7:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.*" %>
<c:set var="path" value="${pageContext.request.contextPath}"/>
<html>
<head>
    <link rel="stylesheet" href="${path}/resources/css/my_page.css">
    <title>Title</title>
    <script src="${path}/resources/js/my_page.js"></script>
</head>

<body>
<div id="select_form">
    <h1>멤버쉽 등급저장</h1>

    <%--롯데백화점 등급지정 --%>
    <div class="select_box1">
        <h2>롯데백화점</h2>
        <div class="right-select">
            <select name="lotte-rating" class="select">
                <option disabled selected>등급</option>
                <option value="apple"></option>
                <option value="orange"></option>
                <option value="grape"></option>
                <option value="melon"></option>
            </select>
        </div>
    </div>

    <%--롯데백화점 등급지정 --%>
    <div class="select_box2">
        <h2>제주공항면세점</h2>
        <div class="right-select">
            <select name="jeju-rating" class="select">
                <option disabled selected>등급</option>
                <option value="apple"></option>
                <option value="orange"></option>
                <option value="grape"></option>
                <option value="melon"></option>
            </select>
        </div>
    </div>

    <%--신세계면세점 등급지정 --%>
    <div class="select_box3">
        <h2>신세계면세점</h2>
        <div class="right-select">
            <select name="shinsegae-rating" class="select">
                <option disabled selected>등급</option>
                <option value="apple"></option>
                <option value="orange"></option>
                <option value="grape"></option>
                <option value="melon"></option>
            </select>
        </div>
    </div>

    <%--신라면세점 등급지정 --%>
    <div class="select_box4">
        <h2>신라면세점</h2>
        <div class="right-select">
            <select name="shilla-rating" class="select">
                <option disabled selected>등급</option>
                <option value="apple"></option>
                <option value="orange"></option>
                <option value="grape"></option>
                <option value="melon"></option>
            </select>
        </div>
    </div>

    <%--현대백화점면세점 등급지정 --%>
    <div class="select_box5">
        <h2>현대백화점면세점</h2>
        <div class="right-select">
            <select name="hyundai-rating" class="select">
                <option disabled selected>등급</option>
                <option value="apple"></option>
                <option value="orange"></option>
                <option value="grape"></option>
                <option value="melon"></option>
            </select>
        </div>
    </div>

    <%--동화면세점 등급지정 --%>
    <div class="select_box6">
        <h2>동화면세점</h2>
        <div class="right-select">
            <select name="donghwa-rating" class="select">
                <option disabled selected>등급</option>
                <option value="apple"></option>
                <option value="orange"></option>
                <option value="grape"></option>
                <option value="melon"></option>
            </select>
        </div>
    </div>

    <%--신라아이파크면세점 등급지정 --%>
    <div class="select_box7">
        <h2>신라아이파크면세점</h2>
        <div class="right-select">
            <select name="shillaipark-rating" class="select">
                <option disabled selected>등급</option>
                <option value="apple"></option>
                <option value="orange"></option>
                <option value="grape"></option>
                <option value="melon"></option>
            </select>
        </div>
    </div>

    <%--수정버튼 --%>
    <button class="modify_btn">수정</button>

</div>
</body>
</html>
