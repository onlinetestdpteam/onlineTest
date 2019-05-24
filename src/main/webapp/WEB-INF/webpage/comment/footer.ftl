<#--<div class="pjax_loading">-->
    <#--<div class="loader">-->
        <#--<div class="text">Loading...</div>-->
        <#--<div class="horizontal">-->
            <#--<div class="circlesup">-->
                <#--<div class="circle"></div>-->
                <#--<div class="circle"></div>-->
                <#--<div class="circle"></div>-->
                <#--<div class="circle"></div>-->
                <#--<div class="circle"></div>-->
            <#--</div>-->
            <#--<div class="circlesdwn">-->
                <#--<div class="circle"></div>-->
                <#--<div class="circle"></div>-->
                <#--<div class="circle"></div>-->
                <#--<div class="circle"></div>-->
                <#--<div class="circle"></div>-->
            <#--</div>-->
        <#--</div>-->
        <#--<div class="vertical">-->
            <#--<div class="circlesup">-->
                <#--<div class="circle"></div>-->
                <#--<div class="circle"></div>-->
                <#--<div class="circle"></div>-->
                <#--<div class="circle"></div>-->
                <#--<div class="circle"></div>-->
            <#--</div>-->
            <#--<div class="circlesdwn">-->
                <#--<div class="circle"></div>-->
                <#--<div class="circle"></div>-->
                <#--<div class="circle"></div>-->
                <#--<div class="circle"></div>-->
                <#--<div class="circle"></div>-->
            <#--</div>-->
        <#--</div>-->
    <#--</div>-->
<#--</div>-->
<#--<div class="pjax_loading1"></div>-->
<div class="copyrights">
    <p>Copyright © 2019.在线考试系统 <a href="http://onlineTest.zhiyigo.cn/" target="_blank" title="在线考试系统">在线考试系统</a> - Collect from <a href="http://onlineTest.zhiyigo.cn/" title="在线考试系统" target="_blank">在线考试系统</a></p>
</div>

<!-- js -->
<script type="text/javascript" src="${request.contextPath}/static/js/jquery-2.1.4.min.js"></script>
<script src="${request.contextPath}/static/js/modernizr.custom.js"></script>

<script src="${request.contextPath}/static/js/classie.js"></script>
<script src="${request.contextPath}/static/js/gnmenu.js"></script>
<script>
    new gnMenu( document.getElementById( 'gn-menu' ) );
</script>
<!--<script type="text/javascript" src="https://maps.googleapis.com/maps/api/js"></script>--->
<script type="text/javascript">
    google.maps.event.addDomListener(window, 'load', init);
    function init() {
        var mapOptions = {
            zoom: 11,
            center: new google.maps.LatLng(40.6700, -73.9400),
            styles: [{"featureType":"all","elementType":"labels.text.fill","stylers":[{"saturation":36},{"color":"#000000"},{"lightness":40}]},{"featureType":"all","elementType":"labels.text.stroke","stylers":[{"visibility":"on"},{"color":"#000000"},{"lightness":16}]},{"featureType":"all","elementType":"labels.icon","stylers":[{"visibility":"off"}]},{"featureType":"administrative","elementType":"geometry.fill","stylers":[{"color":"#000000"},{"lightness":20}]},{"featureType":"administrative","elementType":"geometry.stroke","stylers":[{"color":"#000000"},{"lightness":17},{"weight":1.2}]},{"featureType":"landscape","elementType":"geometry","stylers":[{"color":"#000000"},{"lightness":20}]},{"featureType":"poi","elementType":"geometry","stylers":[{"color":"#000000"},{"lightness":21}]},{"featureType":"road.highway","elementType":"geometry.fill","stylers":[{"color":"#000000"},{"lightness":17}]},{"featureType":"road.highway","elementType":"geometry.stroke","stylers":[{"color":"#000000"},{"lightness":29},{"weight":0.2}]},{"featureType":"road.arterial","elementType":"geometry","stylers":[{"color":"#000000"},{"lightness":18}]},{"featureType":"road.local","elementType":"geometry","stylers":[{"color":"#000000"},{"lightness":16}]},{"featureType":"transit","elementType":"geometry","stylers":[{"color":"#000000"},{"lightness":19}]},{"featureType":"water","elementType":"geometry","stylers":[{"color":"#000000"},{"lightness":17}]}]
        };
        var mapElement = document.getElementById('map');
        var map = new google.maps.Map(mapElement, mapOptions);
        var marker = new google.maps.Marker({
            position: new google.maps.LatLng(40.6700, -73.9400),
            map: map,
        });
    }
</script>
<script src="${request.contextPath}/static/js/prettymaps.js"></script>
<script>

    $(function(){
        //default
        $('.map-canvas').prettyMaps({
            address: 'Melbourne, Australia',
            image: 'map-icon.png',
            hue: '#FF0000',
            saturation: -20
        });

        //red map example
        $('#default-map-btn').on('click', function(){
            $('.map-canvas').prettyMaps();
        });

        //green map example
        $('#green-map-btn').on('click', function(){
            $('.map-canvas').prettyMaps({
                address: 'Melbourne, Australia',
                image: 'map-icon.png',
                hue: '#00FF55',
                saturation: -30
            });
        });

        //blue map example
        $('#blue-map-btn').on('click', function(){
            $('.map-canvas').prettyMaps({
                address: 'Melbourne, Australia',
                image: 'map-icon.png',
                hue: '#0073FF',
                saturation: -30,
                zoom: 16,
                panControl: true,
                zoomControl: true,
                mapTypeControl: true,
                scaleControl: true,
                streetViewControl: true,
                overviewMapControl: true,
                scrollwheel: false,
            });
        });

        //grey map example
        $('#grey-map-btn').on('click', function(){
            $('.map-canvas').prettyMaps({
                address: 'Melbourne, Australia',
                image: 'map-icon.png',
                saturation: -100,
                lightness: 10
            });
        });
    });

</script>
<!-- //js -->
<script src="${request.contextPath}/static/js/screenfull.js"></script>
<script>
        $(function () {
        $('#supported').text('Supported/allowed: ' + !!screenfull.enabled);

        if (!screenfull.enabled) {
            return false;
        }



        $('#toggle').click(function () {
            screenfull.toggle($('#container')[0]);
        });
    });
</script>
<script src="${request.contextPath}/static/js/jquery.nicescroll.js"></script>
<script src="${request.contextPath}/static/js/scripts.js"></script>

<script type="text/javascript" src="${request.contextPath}/static/js/bootstrap-3.1.1.min.js"></script>


<#--<script type="text/javascript" src="/static/js/jquery-2.1.4.min.js"></script>-->

<!-- /amcharts -->
<script src="${request.contextPath}/static/js/amcharts.js"></script>
<script src="${request.contextPath}/static/js/serial.js"></script>
<script src="${request.contextPath}/static/js/export.js"></script>
<script src="${request.contextPath}/static/js/light.js"></script>
<script type="text/javascript" src="${request.contextPath}/static/js/jquery.basictable.min.js"></script>
<!-- Chart code -->
<script>
    var chart = AmCharts.makeChart("chartdiv", {
        "theme": "light",
        "type": "serial",
        "startDuration": 2,
        "dataProvider": [{
            "subject": "Java试题数",
            "visits": 4025,
            "color": "#FF0F00"
        }, {
            "subject": "C++试题数",
            "visits": 1882,
            "color": "#FF6600"
        }, {
            "subject": "C试题数",
            "visits": 1809,
            "color": "#FF9E01"
        }, {
            "subject": "PHP试题数",
            "visits": 1322,
            "color": "#FCD202"
        }, {
            "subject": "Python试题数",
            "visits": 1122,
            "color": "#F8FF01"
        }, {
            "subject": "Go试题数",
            "visits": 1114,
            "color": "#B0DE09"
        }, {
            "subject": "Scala试题数",
            "visits": 984,
            "color": "#04D215"
        }, {
            "subject": "数据库系统原理",
            "visits": 711,
            "color": "#0D8ECF"
        }, {
            "subject": "操作系统原理",
            "visits": 665,
            "color": "#0D52D1"
        }],
        "valueAxes": [{
            "position": "left",
            "axisAlpha":0,
            "gridAlpha":0
        }],
        "graphs": [{
            "balloonText": "[[category]]: <b>[[value]]</b>",
            "colorField": "color",
            "fillAlphas": 0.85,
            "lineAlpha": 0.1,
            "type": "column",
            "topRadius":1,
            "valueField": "visits"
        }],
        "depth3D": 40,
        "angle": 30,
        "chartCursor": {
            "categoryBalloonEnabled": false,
            "cursorAlpha": 0,
            "zoomable": false
        },
        "categoryField": "subject",
        "categoryAxis": {
            "gridPosition": "start",
            "axisAlpha":0,
            "gridAlpha":0

        },
        "export": {
            "enabled": true
        }

    }, 0);
</script>
<!-- Chart code -->
<script>
    var chart = AmCharts.makeChart("chartdiv1", {
        "type": "serial",
        "theme": "light",
        "legend": {
            "horizontalGap": 10,
            "maxColumns": 1,
            "position": "right",
            "useGraphSettings": true,
            "markerSize": 10
        },
        "dataProvider": [{
            "year": 2017,
            "europe": 2.5,
            "namerica": 2.5,
            "asia": 2.1,
            "lamerica": 0.3,
            "meast": 0.2,
            "africa": 0.1
        }, {
            "year": 2016,
            "europe": 2.6,
            "namerica": 2.7,
            "asia": 2.2,
            "lamerica": 0.3,
            "meast": 0.3,
            "africa": 0.1
        }, {
            "year": 2015,
            "europe": 2.8,
            "namerica": 2.9,
            "asia": 2.4,
            "lamerica": 0.3,
            "meast": 0.3,
            "africa": 0.1
        }],
        "valueAxes": [{
            "stackType": "regular",
            "axisAlpha": 0.5,
            "gridAlpha": 0
        }],
        "graphs": [{
            "balloonText": "<b>[[title]]</b><br><span style='font-size:14px'>[[category]]: <b>[[value]]</b></span>",
            "fillAlphas": 0.8,
            "labelText": "[[value]]",
            "lineAlpha": 0.3,
            "title": "Europe",
            "type": "column",
            "color": "#000000",
            "valueField": "europe"
        }, {
            "balloonText": "<b>[[title]]</b><br><span style='font-size:14px'>[[category]]: <b>[[value]]</b></span>",
            "fillAlphas": 0.8,
            "labelText": "[[value]]",
            "lineAlpha": 0.3,
            "title": "North America",
            "type": "column",
            "color": "#000000",
            "valueField": "namerica"
        }, {
            "balloonText": "<b>[[title]]</b><br><span style='font-size:14px'>[[category]]: <b>[[value]]</b></span>",
            "fillAlphas": 0.8,
            "labelText": "[[value]]",
            "lineAlpha": 0.3,
            "title": "Asia-Pacific",
            "type": "column",
            "color": "#000000",
            "valueField": "asia"
        }, {
            "balloonText": "<b>[[title]]</b><br><span style='font-size:14px'>[[category]]: <b>[[value]]</b></span>",
            "fillAlphas": 0.8,
            "labelText": "[[value]]",
            "lineAlpha": 0.3,
            "title": "Latin America",
            "type": "column",
            "color": "#000000",
            "valueField": "lamerica"
        }, {
            "balloonText": "<b>[[title]]</b><br><span style='font-size:14px'>[[category]]: <b>[[value]]</b></span>",
            "fillAlphas": 0.8,
            "labelText": "[[value]]",
            "lineAlpha": 0.3,
            "title": "Middle-East",
            "type": "column",
            "color": "#000000",
            "valueField": "meast"
        }, {
            "balloonText": "<b>[[title]]</b><br><span style='font-size:14px'>[[category]]: <b>[[value]]</b></span>",
            "fillAlphas": 0.8,
            "labelText": "[[value]]",
            "lineAlpha": 0.3,
            "title": "Africa",
            "type": "column",
            "color": "#000000",
            "valueField": "africa"
        }],
        "rotate": true,
        "categoryField": "year",
        "categoryAxis": {
            "gridPosition": "start",
            "axisAlpha": 0,
            "gridAlpha": 0,
            "position": "left"
        },
        "export": {
            "enabled": true
        }
    });
</script>

<!-- //amcharts -->
<script src="${request.contextPath}/static/js/chart1.js"></script>
<script src="${request.contextPath}/static/js/Chart.min.js"></script>
<script src="${request.contextPath}/static/js/modernizr.custom.js"></script>

<script src="${request.contextPath}/static/js/classie.js"></script>
<script src="${request.contextPath}/static/js/gnmenu.js"></script>
<#--<script>-->
    <#--new gnMenu( document.getElementById( 'gn-menu' ) );-->
<#--</script>-->
<!-- script-for-menu -->

<!-- /circle-->
<script type="text/javascript" src="${request.contextPath}/static/js/circles.js"></script>
<script>
    var colors = [
        ['#ffffff', '#fd9426'], ['#ffffff', '#fc3158'],['#ffffff', '#53d769'], ['#ffffff', '#147efb']
    ];
    for (var i = 1; i <= 7; i++) {
        var child = document.getElementById('circles-' + i),
            percentage = 30 + (i * 10);

        Circles.create({
            id:         child.id,
            percentage: percentage,
            radius:     80,
            width:      10,
            number:   	percentage / 1,
            text:       '%',
            colors:     colors[i - 1]
        });
    }

</script>
<!-- //circle -->
<!--skycons-icons-->
<script src="${request.contextPath}/static/js/skycons.js"></script>
<script>
    var icons = new Skycons({"color": "#fcb216"}),
        list  = [
            "partly-cloudy-day"
        ],
        i;

    for(i = list.length; i--; )
        icons.set(list[i], list[i]);
    icons.play();
</script>
<script>
    var icons = new Skycons({"color": "#fff"}),
        list  = [
            "clear-night","partly-cloudy-night", "cloudy", "clear-day", "sleet", "snow", "wind","fog"
        ],
        i;

    for(i = list.length; i--; )
        icons.set(list[i], list[i]);
    icons.play();
</script>
<!--//skycons-icons-->
<!-- //js -->
<script src="${request.contextPath}/static/js/screenfull.js"></script>
<script>
    $(function () {
        $('#supported').text('Supported/allowed: ' + !!screenfull.enabled);

        if (!screenfull.enabled) {
            return false;
        }



        $('#toggle').click(function () {
            screenfull.toggle($('#container')[0]);
        });
    });
</script>
<script src="${request.contextPath}/static/js/flipclock.js"></script>

<script type="text/javascript">
    var clock;
    var myDate = new Date();

    $(document).ready(function() {

        clock = $('.clock').FlipClock({
            clockFace: 'TwentyFourHourClockFace'
        });
        clock.setTime(3600*myDate.getHours()+60*myDate.getMinutes()+myDate.getSeconds());
    });
</script>
<script src="${request.contextPath}/static/js/bars.js"></script>
<script src="${request.contextPath}/static/js/jquery.nicescroll.js"></script>
<script src="${request.contextPath}/static/js/scripts.js"></script>



<#--<script src="https://raw.github.com/defunkt/jquery-pjax/master/jquery.pjax.js"></script>-->
<script type="text/javascript" src="${request.contextPath}/static/js/bootstrap-3.1.1.min.js"></script>

<script src="https://unpkg.com/axios/dist/axios.min.js"></script>
<#--<script type="text/javascript" language="javascript">-->

    <#--$(function() {-->

        <#--$(document).pjax('a[target!=_blank]', '#wthree_agile_admin_info', {fragment:'#wthree_agile_admin_info', timeout:6000}); //这是a标签的pjax。#content 表示执行pjax后会发生变化的id，改成你主题的内容主体id或class。timeout是pjax响应时间限制，如果在设定时间内未响应就执行页面转跳，可自由设置。-->

        <#--$(document).on('submit', 'form', function (event) {$.pjax.submit(event, '#wthree_agile_admin_info', {fragment:'#wthree_agile_admin_info', timeout:6000});}); //这是提交表单的pjax。form表示所有的提交表单都会执行pjax，比如搜索和提交评论，可自行修改改成你想要执行pjax的form id或class。#content 同上改成你主题的内容主体id或class。-->

        <#--$(document).on('pjax:send', function() {-->

            <#--$(".pjax_loading,.pjax_loading1").css("display", "block");//参考的loading动画代码-->

<#--//执行pjax开始，在这里添加要重载的代码，可自行添加loading动画代码。例如你已调用了NProgress，在这里添加 NProgress.start();-->

        <#--});-->

        <#--$(document).on('pjax:complete', function() {-->

            <#--$(".pjax_loading,.pjax_loading1").css("display", "none");//参考的loading动画代码-->

<#--//执行pjax结束，在这里添加要重载的代码，可自行添加loading动画结束或隐藏代码。例如NProgress的结束代码 NProgress.done();-->

        <#--});-->

    <#--});-->

<#--</script>-->
<script src="https://cdn.bootcss.com/layer/2.3/layer.js"></script>