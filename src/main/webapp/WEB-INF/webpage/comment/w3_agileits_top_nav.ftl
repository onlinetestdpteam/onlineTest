<div class="w3_agileits_top_nav">
    <ul id="gn-menu" class="gn-menu-main">
        <!-- /nav_agile_w3l -->
        <li class="gn-trigger">
            <a class="gn-icon gn-icon-menu"><i class="fa fa-bars" aria-hidden="true"></i><span>首页</span></a>
            <nav class="gn-menu-wrapper">
                <div class="gn-scroller scrollbar1">
                    <ul class="gn-menu agile_menu_drop">
                        <li><a href="/Admin/index"> <i class="fa fa-tachometer"></i> 首页</a></li>
                        <li>
                            <a href="#"><i class="fa fa-cogs" aria-hidden="true"></i> 考试管理 </a>

                        </li>
                        <li>
                            <a href="paperManager"> <i class="fa fa-file-text-o" aria-hidden="true"></i>试卷管理 </a>

                        </li>
                        <li id="userManager"> <i class="fa fa-table" aria-hidden="true"></i> 用户管理</li>

                        <li id="topicManager">
                             <i class="fa fa-line-chart" aria-hidden="true"></i> 试题管理
                        </li>

                        <li>

                        </li>
                        <li>

                        </li>
                        <li>

                        </li>
                    </ul>
                </div>
            </nav>
        </li>
        <!-- //nav_agile_w3l -->
        <li class="second logo"><h1><a href="/Admin/"><i class="fa fa-graduation-cap" aria-hidden="true"></i>在线考试系统 </a></h1></li>

        <li class="second admin-pic col-xs-3">
            <ul class="top_dp_agile">
                <li class="dropdown profile_details_drop">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" aria-expanded="false">
                        <div class="profile_img col-xs-5" >
                            <span class="prfil-img"><img src="${request.contextPath}/static/images/admin.jpg" alt="" width="20px" height="50px"/> </span>
                        </div>
                    </a>

                </li>

            </ul>
        </li>


        <li class="second w3l_search col-xs-3">

            <form action="#" method="post">
                <input type="search" name="search" placeholder="搜索...." required="">
                <button class="btn btn-default" type="submit"><i class="fa fa-search" aria-hidden="true"></i></button>
            </form>

        </li>


    </ul>


</div>

<script>
    $(document).ready(function(){

        $("#userManager").click(function(){


           axios.get('${request.contextPath}/Admin/User/').then(function (response) {
              console.log(response);
                if(response.data.status){

                   <#--location.href="${request.contextPath}/Admin/";-->
                    console.log(response.data.data);
                    $("#inner_content").html(response.data.data);
                }else {
                    confirm("失败!");

                }
            }).catch(function (error) {
                   console.log(error);
                });

        });


        $("#topicManager").click(function(){


            axios.get('${request.contextPath}/Admin/TopicItem/').then(function (response) {
                console.log(response);
                if(response.data.status){

                    <#--location.href="${request.contextPath}/Admin/";-->
                    console.log(response.data.data);
                    $("#inner_content").html(response.data.data);
                }else {

                    console.log("失败!");
                    // layer.open({
                    //     type: 4,
                    //    content: [response.data.msg, '#login-form'] //数组第二项即吸附元素选择器或者DOM
                    // });
                }
            }).catch(function (error) {
                console.log(error);
            });

        });

        $("#paperManager").click(function(){


            axios.get('${request.contextPath}/Admin/User/').then(function (response) {
                console.log(response.data.status);
                if(response.data.status){

                    <#--location.href="${request.contextPath}/Admin/";-->
                    console.log(response.data.data);
                    $("#inner_content").html(response.data.data);
                }else {
                    confirm("失败!");
                    // layer.open({
                    //     type: 4,
                    //    content: [response.data.msg, '#login-form'] //数组第二项即吸附元素选择器或者DOM
                    // });
                }
            }).catch(function (error) {
                console.log(error);
            });

        });



    });
</script>