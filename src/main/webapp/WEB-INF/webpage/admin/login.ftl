<!DOCTYPE html>
<html lang="en">
<#include "../comment/head.ftl">
<body>
<div class="wthree_agile_admin_info" id="wthree_agile_admin_info">

    <#include "../comment/top_nav.ftl">
    <!-- /inner_content-->
    <div class="inner_content">
        <!-- /inner_content_w3_agile_info-->
        <div class="inner_content_w3_agile_info">

            <div class="registration admin_agile">

                <div class="signin-form profile admin">
                    <h2>后台登录</h2>
                    <div class="login-form" id="login-form">
                        <form  method="post" id="loginform">
                            <input type="text" name="uname" value="用户名...." required="">

                            <input type="password" name="pwd" value="密码...." required="">

                            <div class="tp">
                                <input type="button" value="登录" id="submitBtn" class="btn btn-primary btn-lg">
                            </div>

                        </form>
                    </div>

                </div>

            </div>
            <!-- //inner_content_w3_agile_info-->
        </div>
        <!-- //inner_content-->
    </div>

<script>

    $(document).ready(function(){

        $("#submitBtn").click(function(){

            // var data = new FormData();
            var data = {'uname':'admin', 'pwd':'123456'};
            // data.append('uname','admin');
            // data.append('pwd','123456');
            <#--axios.post('${request.contextPath}/Admin/User/login/', data).then(function (response) {-->

            axios.get('${request.contextPath}/Admin/User/').then(function (response) {
            console.log(response.data.status);
                    if(response.data.status){
                        // alert("成功!");
                        location.href="${request.contextPath}/Admin/";
                    }else {
                        // confirm("失败!");
                        layer.open({
                            type: 4,
                            content: [response.data.msg, '#login-form'] //数组第二项即吸附元素选择器或者DOM
                        });
                    }
                })
                .catch(function (error) {
                    console.log(error);
                });

        });


    });



</script>
<#include "../comment/footer.ftl" />
<#--导入footer-->
</div>
</body>
</html>