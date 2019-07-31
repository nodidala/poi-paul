<html>
<head>
    <title>测试</title>
</head>
<body>
<div class="table-responsive">
    <table class="table">
        <thead class="Table cell">
        <td>ID</td>
        <td>用户名</td>
        <td>密码</td>
        </thead>
        <tbody>
        <#list user! as user>
            <tr class="success">
                    <td>${user.uid}</td>
                    <td>${user.username}</td>
                    <td>${user.password}</td>
                </#list>
            </tr>
        </tbody>
    </table>
    <a href="/export"><button type="button" class="btn btn-primary">导出</button></a>
    <form class="form-horizontal" id="form_table" action="/import" enctype="multipart/form-data" method="post">
        <br/>
        <br/>
        <button type="submit" class="btn btn-primary">导入</button>
        <input class="form-input" type="file" name="filename"></input>
    </form>
</div>
</body>
</html>