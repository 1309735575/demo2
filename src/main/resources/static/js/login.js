$("#username").blur(
    function checkid() {
        var username = $("#username").val().split('');
        if ((username == "") || (username == null) || (username.length < 3) || (username.length > 8)) {
            $("#warn1").show();
            $("#username").focus();
        } else {
            $("#warn1").hide();
        }
    });
$("#password").blur(
    function checkpwd() {
        var password = $("#password").val();
        // console.log("111");
        if ((password == "") || (password == null)) {
            $("#warn2").show();
            $("#password").focus();
        } else {
            $("#warn2").hide();
        }
    });


function login() {
    var userId = document.getElementById("username").value;
    var userPwd = document.getElementById("password").value;
    var userEvt = {
        userId:userId,
        userPwd:userPwd,
        pageNo:1,
        needTotal:false,
        pageSize:1,
    }

    $.ajax({
        url: "/index/login",        //login是登录接口
        type: 'POST',
        dataType: 'text',
        contentType: 'application/json',
        data: JSON.stringify(userEvt),
        success: function (result) {
            if (result == "success") {
                alert("登录成功");
                window.location.href='/index/tomain';
            } else{
                alert("账号或密码不正确");
            }
        },
        error: function (XMLHttpRequest, textStatus, errorThrown) {
            console.log('XMLHttpRequest:');
            console.log(XMLHttpRequest);
            alert('网络异常！尝试刷新网页解决问题')
        }
    });



}