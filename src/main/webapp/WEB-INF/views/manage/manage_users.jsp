<%@page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>用户管理</title>
    <jsp:include page="/baseJsp/base.jsp"/>
</head>
<body>
<div id="vue_box">
</div>
<script type="text/javascript">
    let vm = new Vue({
        el: '#vue_box',
        data: {},
        methods: {
            addTab(event) {
                let dom = $(event.target);
                let layId = dom.html();
                if ($('.layui-tab-title li[lay-id="' + layId + '"]').length <= 0) {
                    element.tabAdd('main', {
                        title: layId
                        ,
                        content: "<iframe frameborder='0' height='100%' width='100%' src='" + basePath + "get" + "' scrolling='auto'></iframe>"
                        ,
                        id: layId
                    });
                }
                element.tabChange('main', layId);
            }
        },
        created() {
        }
    });
</script>
</body>
</html>
