<%@page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8"/>
    <title>小博客</title>
    <jsp:include page="/baseJsp/base.jsp"/>
</head>
<body>
<div id="vue_box">
    <h1>这是首页</h1>
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
