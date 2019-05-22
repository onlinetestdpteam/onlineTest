<html>
<head>
    <title>考试页面</title>
    <#include "forecomment/head.ftl">
</head>
<body>
<#include "navbar.ftl">

<div class="main-content">
    <form id="exam" action="<%=basePath%>exam" method="post">
        <div class="main-content-title">长春代数试题(卷一)</div>

        <div class="exam-explain">
            <div style="font-weight: bolder;">试卷说明:</div>
            <div>1、本卷共分为三大题100小题,作答时间为120分钟,总分100分.</div>
            <div>2、试题年份:2018</div>
            <div>3、试卷来源:考试资料网在线考试中心.</div>
            <div>4、鼠标左键双击标题可在答题卡制作标记.</div>
        </div>

        <div class="test-question">
            <#--<c:forEach items="${paperContents}" var="item" varStatus="vs">-->
                <#--<div class="test-question-item">-->
                    <#--<a name="a${vs.index }" id="#a${vs.index}"></a>-->
                    <#--<div class="question">-->
                            <#--${vs.index+1}.${item.title}-->
                        <#--<a href="javascript:void(0)" onclick="onfirmAnswer(${vs.index})">【答题标志】</a>-->
                    <#--</div>-->
                    <#--<div class="answer">-->
                        <#--<input type="radio" name="title${vs.index + 1}-answer" value="A">-->
                        <#--A.${item.option1}-->
                    <#--</div>-->
                    <#--<div class="answer">-->
                        <#--<input type="radio" name="title${vs.index + 1}-answer" value="B">-->
                        <#--B.${item.option2}-->
                    <#--</div>-->
                    <#--<div class="answer">-->
                        <#--<input type="radio" name="title${vs.index + 1}-answer" value="C">-->
                        <#--C.${item.option3}-->
                    <#--</div>-->
                    <#--<div class="answer">-->
                        <#--<input type="radio" name="title${vs.index + 1}-answer" value="D">-->
                        <#--D.${item.option4}-->
                    <#--</div>-->
                <#--</div>-->
            <#--</c:forEach>-->
        </div>
    </form>
</div>
<div class="exam-time">
    <div class="text">考试剩余时间</div>
    <div class="value"><span id="exam_time_m"></span>分<span id="exam_time_s"></span>秒</div>
</div>

<div class="answer-sheet">
    <div class="title">答题卡</div>
    <div class="body">
        <table style="margin: 14px">
            <#--<c:forEach items="${paperContents }" var="item" varStatus="vs">-->
                <#--<c:if test="${vs.index % 6 == 0 }">-->
                    <#--<c:set var="flagIndex" value="${vs.index + 6}"></c:set>-->
                    <#--<tr>-->
                <#--</c:if>-->
                <#--<td>-->
                    <#--<a id="answer-sheet${vs.index}" class="answer-sheet-a" href="javascript:void(0);"-->
                       <#--onclick="getIndex(${vs.index})">${vs.index + 1}</a>-->
                <#--</td>-->
                <#--<c:if test="${(vs.index eq flagIndex)||vs.last}">-->
                    <#--</tr>-->
                <#--</c:if>-->
            <#--</c:forEach>-->

        </table>
    </div>
    <div class="submit">
        <button type="button" class="btn btn-success btn-sm" style="background-color: #5cb85c;line-height: 1;"
                onclick="onSubmit()">交卷
        </button>
    </div>
</div>
<#include "./forecomment/footer.ftl">
</body>
</html>
