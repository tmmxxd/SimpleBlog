<%@page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>用户管理</title>
    <jsp:include page="/baseJsp/base.jsp"/>
    <style>
        .layui-form-item {
            margin-bottom: 5px;
        }
    </style>
</head>
<body>
<div id="vue_box">
    <form id="queryFrom" class="layui-form"> <!-- 提示：如果你不想用form，你可以换成div等任何一个普通元素 -->
        <div class="layui-form-item">
            <label class="layui-form-label">用户名：</label>
            <div class="layui-input-inline">
                <input type="text" class="layui-input" name="userNickname">
            </div>
            <label class="layui-form-label">用户昵称：</label>
            <div class="layui-input-inline">
                <input type="text" class="layui-input" name="userName">
            </div>
            <label class="layui-form-label">用户邮箱：</label>
            <div class="layui-input-inline">
                <input type="text" class="layui-input" name="userEmail">
            </div>
            <label class="layui-form-label">用户年龄：</label>
            <div class="layui-input-inline">
                <input type="text" class="layui-input" name="userAge">
            </div>
            <label class="layui-form-label">用户手机：</label>
            <div class="layui-input-inline">
                <input type="text" class="layui-input" name="userTelephoneNumber">
            </div>
            <button type="button" class="layui-btn layui-btn-normal"
                    style="background: #169BD5;"
                    @click="query()">查询
            </button>
        </div>
        <div class="layui-form-item">
            <button type="button" class="layui-btn layui-btn-normal"
                    style="background: #169BD5;"
                    @click="insertUser()">新增
            </button>
        </div>
    </form>
    <template>
        <el-table style="width: 100%"
                  :data="users.pageData"
                  :height="tableHeight"
        >
            <el-table-column
                    prop="userId"
                    label="用户ID"
                    width="120"
            >
            </el-table-column>
            <el-table-column
                    prop="userName"
                    label="用户名"
                    width="120"
            >
            </el-table-column>
            <el-table-column
                    prop="userNickname"
                    label="用户昵称"
                    width="120"
            >
            </el-table-column>
            <el-table-column
                    prop="userIp"
                    label="用户IP"
                    width="120"
            >
            </el-table-column>
            <el-table-column
                    prop="userPassword"
                    label="用户密码"
                    width="120"
            >
            </el-table-column>
            <el-table-column
                    prop="userEmail"
                    label="用户邮箱"
                    width="120"
            >
            </el-table-column>
            <el-table-column
                    prop="userProfilePhoto"
                    label="用户头像"
                    width="120"
            >
            </el-table-column>
            <el-table-column
                    prop="userRegistrationTime"
                    label="注册时间"
                    width="120"
            >
            </el-table-column>
            <el-table-column
                    prop="userBirthday"
                    label="用户生日"
                    width="120"
            >
            </el-table-column>
            <el-table-column
                    prop="userAge"
                    label="用户年龄"
                    width="120"
            >
            </el-table-column>
            <el-table-column
                    prop="userTelephoneNumber"
                    label="用户手机号"
                    width="120"
            >
            </el-table-column>
        </el-table>
    </template>
</div>
<script type="text/javascript">
    let vm = new Vue({
        el: '#vue_box',
        data: {
            tableHeight: 300,
            users: {
                pageData: [],
                page: 1,
                pageSize: 10,
                total: 0
            },
            insertIframeIndex: null
        },
        methods: {
            query(page, pageSize) {
                if (!vm.isRealNum(page)) {
                    page = vm.users.page;
                }
                if (!vm.isRealNum(pageSize)) {
                    pageSize = vm.users.pageSize;
                }
                let param = vm.getParam();
                param.page = page;
                param.pageSize = pageSize;
                $.ajax({
                    type: "GET",
                    url: basePath + 'users/find',
                    data: param,
                    success: function (res) {
                        if (res && res.constructor === Object && res.records) {
                            // console.log(res);
                            vm.users.pageData = res.records;
                            vm.users.total = res.total;
                            vm.users.page = res.current;
                            vm.users.pageSize = res.size;
                        } else {
                        }
                    },
                    error: function () {
                        layer.alert('服务器异常', {icon: 2});
                    }
                });
            },
            getParam() {
                let param = {};
                let froms = $("#queryFrom").serializeArray();
                for (let i = 0; i < froms.length; i++) {
                    if (froms[i] && froms[i].name) {
                        let nam = froms[i].name;
                        let val = froms[i].value;
                        if (val !== null && val !== undefined && val !== '') {
                            param[nam] = val;
                        }
                    }
                }
                return param;
            },
            insertUser() {
                let url = basePath + "users/insert";
                vm.insertIframeIndex = layer.open({
                    id: "userInsertId",
                    title: ['新增用户', 'font-size:20px;text-align:center;font-weight:bold;'],
                    area: ['1000px', '700px'],
                    btnAlign: 'c',
                    shade: 0,
                    type: 2,
                    maxmin: true,
                    content: url,
                    btn: ['关闭']
                    , yes: function (index, layero) {
                        layer.confirm('关闭本条记录将会丢失,确定要关闭么?', {icon: 3, title: '提示'}, function (insideIndex) {
                            layer.close(insideIndex);
                            layer.close(index);
                        });
                    }
                    , cancel: function (index, layero) {
                        //右上角关闭回调
                        layer.confirm('关闭本条记录将会丢失,确定要关闭么?', {icon: 3, title: '提示'}, function (insideIndex) {
                            layer.close(insideIndex);
                            layer.close(index);
                        });
                        return false;
                    }
                });
            }
        },
        created() {
            cm.copyFunToMe(this);
        }
    });
</script>
</body>
</html>
