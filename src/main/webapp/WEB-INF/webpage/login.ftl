<html>
<head>
    <#include "forecomment/head.ftl">
</head>
<body>
<div>
    <div class="login-title">
        在线考试系统
    </div>
    <div class="login-body">
        <form action="login" method="post" id="login-form">
            <div class="input-group mb-3" style="padding: 50px 20px 0 20px">
                <div class="input-group-prepend">
                    <span class="input-group-text" id="basic-addon1"><i class="fas fa-user"></i></span>
                </div>
                <input type="text" class="form-control" placeholder="用户名" name="username">
            </div>
            <div class="input-group mb-3" style="padding: 10px 20px 0 20px">
                <div class="input-group-prepend">
                    <span class="input-group-text" id="basic-addon2"><i class="fas fa-key"></i></span>
                </div>
                <input type="password" class="form-control" placeholder="密码" name="password" id="password">
            </div>
            <div class="input-group mb-3">
                <button type="button" class="btn btn-sm btn-info loginBtn" id="loginBtn" onclick="login()">
                    <i class="fab fa-angellist"></i>
                    登录
                </button>
            </div>
            <div class="input-group mb-3" style="width: fit-content;margin: auto">

                    <#--<c:when test="${not empty errMsg}">-->
                        <#--<div style="color: red">登录失败：</div>-->
                    <#--</c:when>-->

            </div>
        </form>
    </div>
</div>
<div class="backgroup"></div>
<#include "./forecomment/footer.ftl">
</body>
</html>
