<div class="header">
    <div class="header-wyuIcon">
        <img src="${request.contextPath}/static/images/wyu-logo.png">
    </div>
    <div class="header-links">
        <nav class="nav">
            <a class="nav-link active" href="${request.contextPath}/main" style="color: green;border-bottom: 3px solid green">首页</a>
            <a class="nav-link" href="${request.contextPath}/kskm">在线考试</a>
            <a class="nav-link" href="${request.contextPath}/grade">成绩查询</a>
            <#--<a class="nav-link disabled" href="#">你好，尊敬的会员：${username}</a>-->
            <a class="nav-link" href="${request.contextPath}/logout" onclick="logout()">登出</a>
        </nav>
    </div>
</div>