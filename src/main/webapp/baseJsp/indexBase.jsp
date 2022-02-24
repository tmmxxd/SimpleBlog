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
<link rel="stylesheet" href="/frame/layui/css/layui.css">
<%--===============引入js==========--%>
<script type="text/javascript" src="/frame/vue.js"></script>
<%--layui--%>
<script src="/frame/layui/layui.js"></script>

<%--element--%>
<script src="https://unpkg.com/element-ui/lib/index.js"></script>
<%--下拉框多选整合layui--%>
<script type="text/javascript" src="/frame/xm-select.js"></script>

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
    var util;
    <%--定义jquery--%>
    var $ = layui.$;
    layui.use(['element', 'layer', 'util', 'laydate'], function () {
        element = layui.element;
        layer = layui.layer;
        util = layui.util;
        layDate = layui.laydate;
    });
    /*对象cm*/
    let cm = new Vue({
        data: {},
        methods: {},
        created() {
        }
    });

</script>
