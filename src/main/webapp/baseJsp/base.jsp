<%@page pageEncoding="UTF-8" %>
<%@page contentType="text/html;charset=utf-8" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";

%>
<%--===============引入css===================--%>
<%--element--%>
<link rel="stylesheet" href="https://unpkg.com/element-ui/lib/theme-chalk/index.css">
<%--layui--%>
<link rel="stylesheet" type="text/css" href="/css/layui.css">
<%--===============引入js==========--%>
<script type="text/javascript" src="/js/vue.js"></script>
<%--layui--%>
<script type="text/javascript" src="/js/layui.js"></script>
<%--element--%>
<script src="https://unpkg.com/element-ui/lib/index.js"></script>
<%--jquery--%>
<script src="/js/jquery-1.4.2.js"></script>
<%--下拉框多选整合layui--%>
<script type="text/javascript" src="/js/xm-select.js"></script>

<%--抽取公共方法--%>
<script type="text/javascript">
    /*当前页面网址*/
    var basePath = <%="'"+basePath+"'" %>;
    //layer 弹出层组件
    var layer;
    //layui 时间控件
    var layDate;
    //layui tab分页控件
    var element;
    /*对象cm*/
    let cm = new Vue({
        data: {},
        methods: {},
        created() {
        }
    });

</script>
