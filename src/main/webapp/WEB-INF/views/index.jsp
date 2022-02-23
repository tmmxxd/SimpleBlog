<%@page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8"/>
    <title>首页</title>
    <jsp:include page="/baseJsp/base.jsp"/>
</head>
<body>
<div id="vue_box">
    <h1>你好啊</h1>
</div>
</body>
<script type="text/javascript">
    let vm = new Vue({
        el: '#vue_box',
        data: {},
        methods: {},
        created() {
        }
    });
</script>
</html>
