
<script>
    var basePath = '${request.contextPath}';
    // var socketPath = '<%=socketPath%>';


    countTime(1 * 60 * 30);

    //30分钟的倒计时
    function countTime(leftTime) {
        //单位：秒
        // var leftTime = 1 * 60 * 30;
        if (leftTime >= 0) {
            m = parseInt(leftTime / 60) ; //保留整数部分
            s = leftTime % 60 ;         //取余灵敏部分
            document.getElementById("exam_time_m").innerText = m;
            document.getElementById("exam_time_s").innerText = s;
        }else {
            onSubmit();
        }
        leftTime--;
        setTimeout(countTime, 1000 * 1,leftTime);
    }


    //疑问：window.location.hash 与window.location.href的区别
    function getIndex(flag) {
        window.location.href = "#a" + flag;
    }

    function onSubmit() {
        document.getElementById("exam").submit()
    }

    function onfirmAnswer(index) {
        var id = "answer-sheet" + index;
        var answerSheet = document.getElementById(id);
        if (answerSheet.classList.contains("answer-sheet-a-comfirm")) {
            answerSheet.classList.remove("answer-sheet-a-comfirm")
        } else {
            answerSheet.classList.add("answer-sheet-a-comfirm")
        }
    }


    /**
     * web socket 的东西，还没有搞懂！暂时省略
     */
    //判断当前浏览器是否支持WebSocket
    /*if ('WebSocket' in window) {
        websocket = new WebSocket("ws://" + socketPath + "mysocket");
    }
    else {
        alert('Not support websocket')
    }

    websocket.onerror = function (ev) {
        console.log("websocket connect error!")
    }

    websocket.onopen = function (ev) {
        send("start")
        console.log("send('start')")
    }

    websocket.onmessage = function (ev) {
        console.log("web server message: " + ev.data)
    }

    function send(message) {
        websocket.send(message)
    }*/


</script>
<script src="${request.contextPath}/static/js/common.js"></script>
<script src="https://unpkg.com/axios/dist/axios.min.js"></script>
<script src="https://cdn.bootcss.com/layer/2.3/layer.js"></script>
<script>

    function exam() {
        //跳转到考试科目
        var kskmPath = "${request.contextPath}" + "/kskm";
        window.location.href = kskmPath;
    }
</script>
<script>
    var password = document.getElementById("password");
    password.addEventListener("keyup", function (ev) {
        ev.preventDefault();
        // Number 13 is the "Enter" key on the keyboard
        if (ev.keyCode === 13) {
            login()
        }
    });

    function login() {
        document.getElementById("login-form").submit();
    }
</script>

<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
        integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"
        integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
        crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"
        integrity="sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T"
        crossorigin="anonymous"></script>
