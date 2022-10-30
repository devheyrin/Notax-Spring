$(function (){
    const getIdCheck = RegExp(/^[a-zA-Z0-9]{4,14}$/);
    let chk1 = false;

    $('#user_id').keyup(function() {
        if($(this).val() === '' ) {//지금 발생하는 이곳이 빈 문자열이니?
            $(this).css('background-color', 'pink');
            $('#idChk').html('<b style="font-size: 14px; color: red">[아이디는 필수값입니다.]</b>');//텍스트를 집어넣을거야
            chk1 = false;
        }
        else if(!getIdCheck.test($(this).val())) {//정규표현식이 틀렸다면
            $(this).css('background-color', 'pink');
            $('#idChk').html('<b style="font-size: 14px; color: red">[영문자, 숫자조합 4-14로쓰세요]</b>');
            chk1 = false;
        }else {
            const id = $(this).val();
            $.ajax({
                type: 'post', // 서버에 전송하는 http방식
                url: '/join-duplicate', // 서버 요청 url
                headers: {
                    'Content-Type': 'application/json'
                },
                dataType: 'text', //서버로 부터 응답받을 데이터의 형태
                data: id, // 서버로 전송할 데이터 // 위에서 지정한 const id
                success: function (result) { // 매개변수에 통신성공시 데이터가 저장된다.
                    //서버와 통신성공시 실행할 내용 작성.
                    console.log('통신 성공!' + result);
                    if (result === 'available') {
                        $('#user_id').css('background-color', 'aqua');
                        $('#idChk').html('<b style="font-size: 14px; color: green">[아이디 사용이 가능]</b>');
                        chk1 = true;
                    } else {
                        $('#user_id').css('background-color', 'pink');
                        $('#idChk').html('<b style="font-size: 14px; color: red">[아이디 중복]</b>');
                        chk1 = false;
                    }
                },
                error: function (status, error) { //통신에 실패했을때
                    console.log('통신실패');
                    console.log(status, error)
                }
            }); // end ajax(아이디 중복 확인)
        }
    });
});