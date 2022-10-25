<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.*" %>
<c:set var="path" value="${pageContext.request.contextPath}"/>
<html>
<head>
    <link rel="stylesheet" href="${path}/resources/css/mypage.css">
    <title>마이페이지</title>
    <script src="${path}/resources/js/mypage.js"></script>
</head>
<body>
<h1>마이페이지</h1>
<a href="/login">로그인페이지로 이동</a>
<a href="/mypage">마이페이지 - 관심상품으로 이동</a>
<a href="/detail">상품 상세 페이지로 이동</a>
    <div class="cart_nav">
        <ul>
            <li><a href="/">홈</a></li>
            <li>mypage</li>
        </ul>
    </div>
    <div class="mypage-left-bar">
        <ul>
            <li><a href="#">회원정보수정</a></li>
            <li><a href="#">멤버쉽변경</a></li>
            <li><a href="#" class="home">관심상품조회</a></li>
        </ul>
    </div>

    <div class="cart_size">
        <table class="subject_table">
            <tbody>
                <tr>
                    <th>
                        <div>
                            <input type="checkbox" name="check" checked="checked"/>
                        </div>
                    </th>
                    <th class="th_product">상품정보</th>
                    <th class="th_price">가격</th>
                </tr>
            </tbody>
        </table>
        <table class="cart_table">
            <tbody>
                <tr>
                    <td class="cart_check">
                        <div>
                            <input type="checkbox" name="check" checked="checked">
                        </div>
                    </td>
                    <td class="cart_T">
                        <div class="product-Item">
                            <div class="cart_img">
                                <img src="" alt="">
                                <div class="product_btn">
                                <button>
                                    상품정보
                                </button>
                                </div>
                            </div>

                            <div class="cart_info">
                                <div class="card_brand">
                                    <strong>브랜드명</strong>
                                </div>
                                <div class="cart_product">
                                    <p>상품명</p>
                                </div>
                            </div>
                        </div>
                    </td>
                    <td class="priceArea">
                        <div class="cart_Price">
                            <span>$ 100</span>
                        </div>
                    </td>
                </tr>
            </tbody>
        </table>
    </div>

</body>
</html>
