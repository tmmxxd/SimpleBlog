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
        methods: {
            /*转化为整数*/
            formatterInt(row, column, cellValue) {
                if (cellValue === undefined || !this.isRealNum(cellValue)) {
                    return '';
                }
                cellValue = parseFloat(cellValue);
                return cellValue.toFixed(0);
            },
            /*转化为百分比表示*/
            formatterRatePointTwo(row, column, cellValue) {
                if (cellValue === undefined || !this.isRealNum(cellValue)) {
                    return '';
                }
                cellValue = parseFloat(cellValue);
                return (cellValue * 100).toFixed(2) + '%';
            },
            /*判断是否是数字*/
            isRealNum(val) {
                // isNaN()函数 把空串 空格 以及NUll 按照0来处理 所以先去除，
                if (val === "" || val == null) {
                    return false;
                }
                //对于空数组和只有一个数值成员的数组或全是数字组成的字符串，isNaN返回false，例如：'123'、[]、[2]、['123'],isNaN返回false,
                //所以如果不需要val包含这些特殊情况，则这个判断改写为if(!isNaN(val) && typeof val === 'number' )
                return !isNaN(val);
            },
            /*传入时间字符串,转化为时间格式*/
            strToDate(strDate) {
                return eval('new Date(' + strDate.replace(/\d+(?=-[^-]+$)/,
                    function (a) {
                        return parseInt(a, 10) - 1;
                    }).match(/\d+/g) + ')');
            },
            /*当前时间*/
            dateFormat(timestamp, pattern) {
                let datetime = new Date(timestamp);
                let year = datetime.getFullYear();
                let month = datetime.getMonth() + 1 < 10 ? "0" + (datetime.getMonth() + 1) : datetime.getMonth() + 1;
                let date = datetime.getDate() < 10 ? "0" + datetime.getDate() : datetime.getDate();
                if (pattern === 'yyyy-MM') {
                    return year + "-" + month;
                } else if (pattern === 'yyyy-MM-dd') {
                    return year + "-" + month + "-" + date;
                } else {
                    return '';
                }
            },
            /*数组去重*/
            arrRemoveRepeat(arr, arrField) {
                if (arr.constructor !== Array || arr.length <= 0) {
                    return;
                }
                let hash = {};
                vm[arrField] = arr.reduce(function (item, next) {
                    hash[next.text] ? '' : hash[next.text] = item.push(next);
                    return item
                }, []);
            },
            copyFunToMe(obj) {
                obj.formatterInt = cm.formatterInt;
                obj.formatterRatePointTwo = cm.formatterRatePointTwo;
                obj.isRealNum = cm.isRealNum;
                obj.strToDate = cm.strToDate;
                obj.dateFormat = cm.dateFormat;
                obj.arrRemoveRepeat = cm.arrRemoveRepeat;
                obj.getTableHeight = cm.getTableHeight;
            },
            getTableHeight() {
                vm.tableHeight = window.innerHeight - 180;
            },
            /*通用查询方法 shelter 是否查询时候遮挡,tips是否弹出错误提示,param 参数,url请求路径,beforeFun查询前的函数,afterFun查询后的函数*/
        },
        created() {
        }
    });

    //监听页面大小变化事件
    window.onresize = function () {
        vm.getTableHeight();
    };

</script>
