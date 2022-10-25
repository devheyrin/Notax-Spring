<%--
  Created by IntelliJ IDEA.
  User: mac
  Date: 2022/10/10
  Time: 9:21 오후
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.*" %>
<c:set var="path" value="${pageContext.request.contextPath}"/>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
    <link rel="stylesheet" href="${path}/resources/css/index.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
    <script src="${path}/resources/js/index.js"></script>

    <title>메인페이지</title>
</head>
<body>
<section id="main">
    <div id="titlebar">
      <div id="topbar">
        <p id="exchange">환율표시</p>
        <ul id="topul">
          <li><a href="/login">로그인</a></li>
          <li><a href="/login">회원가입</a></li>
          <li><a href="/my_page">마이페이지</a></li>
        </ul>
      </div>
      <div id="logobar">
        <div id="logo"></div>
        <div id="searchdiv">
          <input type="text" id="searchbox">
          <input type="button" id="searchbtn">
        </div>
        <div id="logobar">
            <div id="logo"></div>
            <div id="searchdiv">
                <input type="text" id="searchbox">
                <input type="button" id="searchbtn">
            </div>
            <div id="logobarAd"></div>
        </div>
        <nav id="navbar">
            <ul>
                <li class="navbtn"><a href="#ranking">랭킹</a></li>
                <li class="navbtn"><a href="#newproduct">신상품</a></li>
                <li class="navbtn"><a href="#topsale">최고할인</a></li>
                <li class="navbtn"><a href="#timesale">타임세일</a></li>
            </ul>
        </nav>
    </div>
    <div id="mainslide">
        <div id="mainadd">
        <div id="carouselExampleInterval" class="carousel slide" data-bs-ride="carousel">
            <div class="carousel-inner">
                <div class="carousel-item active" data-bs-interval="10000">
                    살려줘
                </div>
                <div class="carousel-item" data-bs-interval="2000">
                    죽을거같아
                </div>
                <div class="carousel-item">
                    제발
                </div>
            </div>
            <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleInterval" data-bs-slide="prev">
                <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                <span class="visually-hidden">Previous</span>
            </button>
            <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleInterval" data-bs-slide="next">
                <span class="carousel-control-next-icon" aria-hidden="true"></span>
                <span class="visually-hidden">Next</span>
            </button>
        </div>
        </div>
        <div id="inner">
            <div id="sidebar">
                <ul>
                    <li><a href="#">스킨케어</a></li>
                    <li><a href="#">향수/바디/헤어</a></li>
                    <li><a href="#">가방/지갑</a></li>
                    <li><a href="#">시계/주얼리</a></li>
                    <li><a href="#">아이웨어/잡화</a></li>
                    <li><a href="#">패션/슈즈</a></li>
                    <li><a href="#">스포츠/레져</a></li>
                    <li><a href="#">건강/가공식품</a></li>
                    <li><a href="#">디지털/가전</a></li>
                    <li><a href="#">리빙/헬스케어</a></li>
                    <li><a href="#">키즈/베이비</a></li>
                </ul>
            </div>
            <div id="sidebarinner">
                dksfjdsklfjsdf
            </div>

        </div>


    </div>

    <div id="fixbutton">
        <div><a href="#">TOP</a></div>
        <div>최근본상품</div>
    </div>


</section>
<section id="ranking">

    <h1>랭킹</h1>

    <div class="subpage">
        <div id="slide" class="carousel-products"></div>

        <script>
            // initialize
            $(document).ready(function() {
                $("#slide").slizz({
                    width: '300',
                    height: '400',
                    space: '10',
                    max: '1050',
                    title: true,
                    bullets: false,
                    lang: 'en',
                    products: [{
                        sku: '341782',
                        color: '086',
                        link: '#',
                        seo: 'Buy Me'
                    },
                        {
                            sku: '346578',
                            color: '653',
                            link: '#',
                            seo: 'Buy Me More'
                        },
                        {
                            sku: '350953',
                            color: '182',
                            link: '#',
                            seo: 'Buy Me'
                        },
                        {
                            sku: '353794',
                            color: '182',
                            link: '#',
                            seo: 'Buy Me More'
                        },
                        {
                            sku: '354002',
                            color: '703',
                            link: '#',
                            seo: 'Buy Me'
                        },
                        {
                            sku: '356124',
                            color: '703',
                            link: '#',
                            seo: 'Buy Me More'
                        },
                        {
                            sku: '356125',
                            color: '209',
                            link: '#',
                            seo: 'Buy Me'
                        },
                        {
                            sku: '356126',
                            color: '703',
                            link: '#',
                            seo: 'Buy Me More'
                        },
                        {
                            sku: '356986',
                            color: '779',
                            link: '#',
                            seo: 'Buy Me More'
                        },
                    ]
                    //	products:  products
                });
            });
        </script>
    </div>

</section>
<section id="newproduct">
    <div class="subpage">

        <h1>신상품</h1>

    </div>
</section>
<section id="topsale">
    <div class="subpage">

        <h1>최고할인</h1>

    </div>
</section>
<section id="timesale">
    <div></div>
</section>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
</body>


</html>
