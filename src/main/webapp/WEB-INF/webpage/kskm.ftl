<html>
<head>


    <#include "forecomment/head.ftl">

</head>
<body>
<#include "navbar.ftl">
    <img src="${request.contextPath}/static/images/fenlei01.png" style="display: block;width: fit-content;margin: 66px auto 0">

    <div class="content-grid">
        <img src="${request.contextPath}/static/images/fenlei02.png" style="margin-left: -29px">
        <table class="content-table">
            <#--<c:choose>-->
                <#--<c:when test="${not empty subjects }">-->
                    <#--<c:forEach items="${subjects }" var="subject" varStatus="vs">-->
                        <#--<c:if test="${vs.index % 4 == 0 }">-->
                            <#--<c:set var="flagIndex" value="${vs.index + 4}"></c:set>-->
                            <#--<tr>-->
                        <#--</c:if>-->
                        <#--<td>-->
                            <#--<a class="table-kskm" style="color: #a94442"-->
                               <#--href="${basePath}/paper?subjectid=${subject.id}">${subject.subject}</a>-->
                            <#--<div class="table-jiankao">监考老师—${subject.teacher}</div>-->
                        <#--</td>-->
                        <#--<c:if test="${(vs.index eq flagIndex)||vs.last}">-->
                            <#--</tr>-->
                        <#--</c:if>-->
                    <#--</c:forEach>-->
                <#--</c:when>-->
            <#--</c:choose>-->
        </table>
    </div>
    <#include "./forecomment/footer.ftl">
</body>
</html>
