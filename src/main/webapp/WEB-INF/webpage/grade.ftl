<html>
<head>

    <#include "forecomment/head.ftl">

</head>
<body>
<#include "navbar.ftl">
    <div class="grade-img">
        <img src="${request.contextPath}/static/images/chaxun03.png">
    </div>
    <div class="grade-body">
        <img src="${request.contextPath}/static/images/chaxun01.png">
        <table>
            <col width="300">
            <col width="300">
            <col width="300">
            <col width="300">
            <tr style="font-weight: bold">
                <td>序列</td>
                <td>所属课程</td>
                <td>考卷发布日期</td>
                <td>考试分数</td>
            </tr>
            <#--<c:forEach items="${grades}" var="item">-->
                <#--<tr>-->
                    <#--<td>${item.id}</td>-->
                    <#--<td>${item.subject}</td>-->
                    <#--<td>${item.release_time}</td>-->
                    <#--<td>${item.score}</td>-->
                <#--</tr>-->
            <#--</c:forEach>-->
        </table>
    </div>
    <script src="${request.contextPath}/static/js/common.js"></script>
<#include "./forecomment/footer.ftl">
</body>
</html>
