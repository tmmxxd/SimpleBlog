<%@page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>后台管理</title>
    <jsp:include page="/baseJsp/indexBase.jsp"/>
    <style>
        #iframeContent .layui-show {
            height: 100%;
        }
    </style>
</head>
<body>
<div id="vue_box">
    <div class="layui-layout layui-layout-admin">
        <div class="layui-header">
            <div class="layui-logo layui-hide-xs layui-bg-black">Simple Blog</div>
            <ul class="layui-nav layui-layout-right">
                <li class="layui-nav-item layui-hide layui-show-md-inline-block">
                    <a href="javascript:void(0);">
                        <%--头像--%>
                        <img src="https://img1.baidu.com/it/u=2716398045,2043787292&fm=253"
                             class="layui-nav-img">
                        <%--昵称--%>
                        小花
                    </a>
                    <%--下拉菜单选项--%>
                    <dl class="layui-nav-child">
                        <dd><a href="javascript:void(0);">详情</a></dd>
                        <dd><a href="javascript:void(0);">设置</a></dd>
                        <dd><a href="javascript:void(0);">登出</a></dd>
                    </dl>
                </li>
            </ul>
        </div>

        <div class="layui-side layui-bg-black">
            <div class="layui-side-scroll">
                <!-- 左侧导航区域（可配合layui已有的垂直导航） -->
                <ul class="layui-nav layui-nav-tree" lay-filter="test">
                    <li class="layui-nav-item"><a href="javascript:void(0);"
                                                  @click="addTab($event,'users/admin')">用户管理</a>
                    </li>
                    <li class="layui-nav-item"><a href="javascript:void(0);"
                                                  @click="addTab($event,'articles/admin')">博文管理</a>
                    </li>
                    <li class="layui-nav-item"><a href="javascript:void(0);"
                                                  @click="addTab($event,'labels/admin')">标签管理</a>
                    </li>
                    <li class="layui-nav-item"><a href="javascript:void(0);"
                                                  @click="addTab($event,'sorts/admin')">分类管理</a>
                    </li>
                    <li class="layui-nav-item"><a href="javascript:void(0);"
                                                  @click="addTab($event,'comments/admin')">评论管理</a>
                    </li>
                </ul>
            </div>
        </div>

        <div class="layui-body">
            <!-- 内容主体区域 -->
            <div class="layui-tab" lay-allowClose="true" lay-filter="main"
                 style="height: 100%;margin: 0;overflow: hidden;">
                <ul class="layui-tab-title">
                </ul>
                <div class="layui-tab-content" id="iframeContent" style="height: calc(100% - 51px);overflow-y: hidden;">
                </div>
            </div>
        </div>

    </div>
</div>
<script type="text/javascript">
    let vm = new Vue({
        el: '#vue_box',
        data: {},
        methods: {
            addTab(event, address) {
                let dom = $(event.target);
                let layId = dom.html();
                if ($('.layui-tab-title li[lay-id="' + layId + '"]').length <= 0) {
                    element.tabAdd('main', {
                        title: layId
                        ,
                        content: "<iframe frameborder='0' height='100%' width='100%' src='" + basePath + address + "' scrolling='auto'></iframe>"
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
