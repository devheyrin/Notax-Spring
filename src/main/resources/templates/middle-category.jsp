<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page import="java.util.*" %>
<c:set var="path" value="${pageContext.request.contextPath}"/>
<html>
<head>
    <link rel="stylesheet" href="${path}/resources/css/middle-category.css">
    <!--체크박스 !-->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/pretty-checkbox@3.0/dist/pretty-checkbox.min.css">
    <!--가격 슬라이더 바!-->
    <link rel="stylesheet" href="//code.jquery.com/ui/1.13.2/themes/base/jquery-ui.css">
    <script src="https://code.jquery.com/jquery-3.6.0.js"></script>
    <script src="https://code.jquery.com/ui/1.13.2/jquery-ui.js"></script>
    <!--셀렉트 박스 !-->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootswatch/4.6.0/flatly/bootstrap.min.css">
    <link rel="stylesheet" href="${path}/resources/css/feastSelect.css">
    <!-- Bootstrap  -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-Piv4xVNRyMGpqkS2by6br4gNJ7DXjqk09RmUpJ8jgGtD7zP9yug3goQfGII0yAns"
            crossorigin="anonymous"></script>

    <!-- Required stuff -->
    <script src="https://cdn.rawgit.com/google/code-prettify/master/loader/run_prettify.js"></script>

    <link rel="stylesheet" href="${path}/resources/css/tranquil-heart.min.css">
    <!-- Stylesheet -->
    <link rel="stylesheet" href="${path}/resources/css/style.css">
    <script src="${path}/resources/js/feastSelect.js"></script>
    <%--    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>--%>
    <script src="https://cdn.jsdelivr.net/bxslider/4.2.12/jquery.bxslider.min.js"></script>
    <script src="${path}/resources/js/middle-category.js"></script>
    <title>중분류 페이지</title>
</head>
<body class="mainscreen">
<h1>중분류 페이지</h1>
<a href="/login">로그인페이지로 이동</a>
<a href="/mypage">마이페이지 - 관심상품으로 이동</a>
<a href="/main-category">대분류페이지로 이동</a>
<a href="/sub-category">소분류페이지로 이동</a>
<a href="/detail">상품 상세 페이지로 이동</a>

<br/>
<!-- 조건 창 !-->
<hr style="margin:0 auto;">
<div class="cateHeader-container">
    <!-- 카테고리 이름 !-->
    <div class="category-name">
        <div class="home-container nav-item">
            <a href="/" class="home">
                <img class="home-icon" src="${path}/resources/img/home-icon.png"/>홈
            </a>
        </div>
        <img class="arrow-right-icon" src="${path}/resources/img/noun-arrow-right.png"/>
        <div class="form-group nav-item">
            <select class="form-control example2 main-category" name="example-2">
                <option value="10031760">스킨케어</option>
                <option value="10031766">메이크업</option>
                <option value="10031772">향수/바디/헤어</option>
                <option value="10031778">가방/지갑</option>
                <option value="10031784">시계/주얼리</option>
                <option value="10031790">아이웨어/잡화</option>
                <option value="10031796">패션/슈즈</option>
                <option value="10031802">스포츠/레져</option>
                <option value="10031808">건강/가공식품</option>
                <option value="10031814">디지털/가전</option>
                <option value="10031820">리빙/헬스케어</option>
                <option value="10031832">키즈/베이비</option>
                <option value="10039167">주류예약</option>
                <option value="10035150">Adult (19)</option>
            </select>
        </div>
        <img class="arrow-right-icon" src="${path}/resources/img/noun-arrow-right.png"/>
        <div class="form-group nav-item">
            <select class="form-control example2 middle-category" name="example-2">
                <option value="10031760">남성시계</option>
                <option value="10031766">여성시계</option>
                <option value="10031772">캐릭터/아동시계</option>
                <option value="10031778">브로치/기타</option>
                <option value="10031784">주얼리</option>
            </select>
        </div>
    </div>
    <!-- 카테고리 이름!-->
    <script type="text/javascript">
        $('.main-category').FeastSelect({
            btnText: '시계/주얼리', // 선택한 분류 가져와서 지정
            btnClass: 'my-custtom-btn',
            hideOriginal: true
        });
        $('.middle-category').FeastSelect({
            btnText: '남성시계', // 선택한 분류 가져와서 지정
            btnClass: 'my-custtom-btn',
            hideOriginal: true
        });
    </script>
    <!--검색박스 !-->
    <div class="search">
        <form class="search-box" action="../../../../../../JavaWebProjects/SpringCloneTest/NoTax/src/main/webapp/WEB-INF/views" method="post">
            <input class="search-txt" type="text" placeholder="카테고리 내 상품검색">
            <button class="btn btn-outline-dark" type="button">찾기</button>
        </form>
    </div>
</div>
<br/>
<h1 style="text-align: center">남성시계</h1>
<br/>
<!-- 소분류!-->
<div>
    <ul class="middle-sub-category">
        <li class="sub-category"><a href="">메탈</a></li>
        <li class="sub-category"><a href="">가죽</a></li>
        <li class="sub-category"><a href="">세라믹/티타늄</a></li>
        <li class="sub-category"><a href="">패브릭/플라스틱</a></li>
    </ul>
</div>
<br/>
<!-- 조건 선택 !-->
<div class="choosebax">
    <table class="select-box">
        <!-- 면세점 !-->
        <tr class="select-line">
            <td class="select-topic">면세점</td>
            <td class="select-item">
                <div class="pretty p-svg p-plain">
                    <input type="checkbox"/>
                    <div class="state">
                        <img class="svg" src="https://lokesh-coder.github.io/pretty-checkbox/svg/open-iconic/task.svg">
                        <label>신라</label>
                    </div>
                </div>
            </td>
            <td class="select-item">
                <div class="pretty p-svg p-plain">
                    <input type="checkbox"/>
                    <div class="state">
                        <img class="svg" src="https://lokesh-coder.github.io/pretty-checkbox/svg/open-iconic/task.svg">
                        <label>롯데</label>
                    </div>
                </div>
            </td>
            <td class="select-item">
                <div class="pretty p-svg p-plain">
                    <input type="checkbox"/>
                    <div class="state">
                        <img class="svg" src="https://lokesh-coder.github.io/pretty-checkbox/svg/open-iconic/task.svg">
                        <label>어딘가</label>
                    </div>
                </div>
            </td>
        </tr>
        <!-- 소분류 !-->
        <tr class="select-line">
            <td class="select-topic">소분류</td>
            <td class="select-item">
                <div class="pretty p-svg p-plain">
                    <input type="checkbox"/>
                    <div class="state">
                        <img class="svg" src="https://lokesh-coder.github.io/pretty-checkbox/svg/open-iconic/task.svg">
                        <label>메탈</label>
                    </div>
                </div>
            </td>
            <td class="select-item">
                <div class="pretty p-svg p-plain">
                    <input type="checkbox"/>
                    <div class="state">
                        <img class="svg" src="https://lokesh-coder.github.io/pretty-checkbox/svg/open-iconic/task.svg">
                        <label>가죽</label>
                    </div>
                </div>
            </td>
            <td class="select-item">
                <div class="pretty p-svg p-plain">
                    <input type="checkbox"/>
                    <div class="state">
                        <img class="svg" src="https://lokesh-coder.github.io/pretty-checkbox/svg/open-iconic/task.svg">
                        <label>세라믹/티타늄</label>
                    </div>
                </div>
            </td>
            <td class="select-item">
                <div class="pretty p-svg p-plain">
                    <input type="checkbox"/>
                    <div class="state">
                        <img class="svg" src="https://lokesh-coder.github.io/pretty-checkbox/svg/open-iconic/task.svg">
                        <label>패브릭/플라스틱</label>
                    </div>
                </div>
            </td>
        </tr>
        <!-- 브랜드 !-->
        <tr class="select-line">
            <td class="select-topic">브랜드</td>
            <td class="select-item">
                <div class="pretty p-svg p-plain">
                    <input type="checkbox"/>
                    <div class="state">
                        <img class="svg" src="https://lokesh-coder.github.io/pretty-checkbox/svg/open-iconic/task.svg">
                        <label>브랜드1</label>
                    </div>
                </div>
            </td>
            <td class="select-item">
                <div class="pretty p-svg p-plain">
                    <input type="checkbox"/>
                    <div class="state">
                        <img class="svg" src="https://lokesh-coder.github.io/pretty-checkbox/svg/open-iconic/task.svg">
                        <label>브랜드2</label>
                    </div>
                </div>
            </td>
            <td class="select-item">
                <div class="pretty p-svg p-plain">
                    <input type="checkbox"/>
                    <div class="state">
                        <img class="svg" src="https://lokesh-coder.github.io/pretty-checkbox/svg/open-iconic/task.svg">
                        <label>브랜드3</label>
                    </div>
                </div>
            </td>
        </tr>
        <!-- 가격 !-->
        <tr class="select-line">
            <td class="select-topic">가격</td>
            <td style="margin-left : 14px;" >
                <input type="text" id="amount" readonly style="border:0; color:black; font-weight:bold;">
                <div id="slider-range"></div>
            </td>
        </tr>
        <!--가격 슬라이더 !-->
        <script>
            $(function () {
                $("#slider-range").slider({
                    range: true,
                    min: 0,
                    max: 500,
                    values: [75, 300],
                    slide: function (event, ui) {
                        $("#amount").val("$" + ui.values[0] + " - $" + ui.values[1]);
                    }
                });
                $("#amount").val("$" + $("#slider-range").slider("values", 0) +
                    " - $" + $("#slider-range").slider("values", 1));
            });
        </script>
        <!-- 품질여부 !-->
        <tr class="select-line">
            <td class="select-topic">품절여부</td>
            <td colspan="2" class="select-item">
                <div class="pretty p-svg p-plain">
                    <input type="checkbox"/>
                    <div class="state">
                        <img class="svg" src="https://lokesh-coder.github.io/pretty-checkbox/svg/open-iconic/task.svg">
                        <label>품절제외</label>
                    </div>
                </div>
            </td>
        </tr>
    </table>
    <br/>
</div>
<!--초기화 버튼 !-->
<div class="reset-container">
    <button class="btn btn-outline-dark" id="reset">초기화</button>
</div>
<hr>
<!-- 정렬 !-->
<div class="Sort-container">
    <span style="text-align: left">총개수 : 100</span>
    <div class="sort-value">
        <button class="btn btn-outline-dark">구매높은순</button>
        <button class="btn btn-outline-dark">조회수높은순</button>
        <button class="btn btn-outline-dark">가격낮은순</button>
    </div>
</div>
<!-- 제품목록 !-->
<div class="values-container">
    <ol>
        <li class="values">
            <a href="" class="">
                <span class="unit_no">1</span>
                <div class="unit_img">
                    <img class="values-img" src="${path}/resources/img/test1.jpeg">
                </div>
                <div class="unit_flag thmb_flag">
                    <span class="cod1">세일</span>
                    <span class="cod2">베스트</span>
                </div>
                <div class="unit_flag list_flag" style="display: none;">
                    <span class="cod1">세일</span>
                    <span class="cod2">베스트</span>
                    <span class="cod3">3시간전</span>
                </div>
                <div class="unit_info">
							<span class="brand">
									<i class="kor">미사키</i>
							</span>
                    <span class="name">EARRING CLASSIC 7mm</span>
                </div>

                <!-- 가격, 별점 -->
                <div class="unit_price">
                    <strong class="price02">$34</strong>
                    <span class="price03">48,518원</span>
                </div>
                <!-- // 가격, 별점 -->
            </a>
        </li>
        <li class="values">
            <a href="" class="">
                <span class="unit_no">2</span>
                <div class="unit_img">
                    <img class="values-img" src="${path}/resources/img/test2.jpeg">
                </div>
                <div class="unit_flag thmb_flag">
                    <span class="cod1">세일</span>
                    <span class="cod2">베스트</span>
                </div>
                <div class="unit_flag list_flag" style="display: none;">
                    <span class="cod1">세일</span>
                    <span class="cod2">베스트</span>
                    <span class="cod3">3시간전</span>
                </div>
                <div class="unit_info">
							<span class="brand">
									<i class="kor">미사키</i>
							</span>
                    <span class="name">EARRING CLASSIC 7mm</span>
                </div>

                <!-- 가격, 별점 -->
                <div class="unit_price">
                    <strong class="price02">$34</strong>
                    <span class="price03">48,518원</span>
                </div>
                <!-- // 가격, 별점 -->
            </a>
        </li>
        <li class="values">
            <a href="" class="">
                <span class="unit_no">3</span>
                <div class="unit_img">
                    <img class="values-img" src="${path}/resources/img/test3.jpeg">
                </div>
                <div class="unit_flag thmb_flag">
                    <span class="cod1">세일</span>
                    <span class="cod2">베스트</span>
                </div>
                <div class="unit_flag list_flag" style="display: none;">
                    <span class="cod1">세일</span>
                    <span class="cod2">베스트</span>
                    <span class="cod3">3시간전</span>
                </div>
                <div class="unit_info">
							<span class="brand">
									<i class="kor">미사키</i>
							</span>
                    <span class="name">EARRING CLASSIC 7mm</span>
                </div>

                <!-- 가격, 별점 -->
                <div class="unit_price">
                    <strong class="price02">$34</strong>
                    <span class="price03">48,518원</span>
                </div>
                <!-- // 가격, 별점 -->
            </a>
        </li>
        <li class="values">
            <a href="" class="">
                <span class="unit_no">4</span>
                <div class="unit_img">
                    <img class="values-img" src="${path}/resources/img/test1.jpeg">
                </div>
                <div class="unit_flag thmb_flag">
                    <span class="cod1">세일</span>
                    <span class="cod2">베스트</span>
                </div>
                <div class="unit_flag list_flag" style="display: none;">
                    <span class="cod1">세일</span>
                    <span class="cod2">베스트</span>
                    <span class="cod3">3시간전</span>
                </div>
                <div class="unit_info">
							<span class="brand">
									<i class="kor">미사키</i>
							</span>
                    <span class="name">EARRING CLASSIC 7mm</span>
                </div>

                <!-- 가격, 별점 -->
                <div class="unit_price">
                    <strong class="price02">$34</strong>
                    <span class="price03">48,518원</span>
                </div>
                <!-- // 가격, 별점 -->
            </a>
        </li>
    </ol>
</div>
</body>
</html>