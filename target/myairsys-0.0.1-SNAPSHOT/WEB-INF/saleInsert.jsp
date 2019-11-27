<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>售票员信息添加</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css">
</head>
<body>
 <div style="width: 25%;height:100%;margin-top:4%;margin-left: 6%;">
        <img src="/airsys/assets/img/logo.jpg" style="width:30%;margin-left: 25%;">
        <form action="/airsys/saleinsert2" method="post">
            <div class="form-group" >
                <label for="exampleInputEmail1" font="color:#876ED7;">工号</label>
                <input name="jobId" class="form-control" id="exampleInputEmail1"  >
            </div>
             <div class="form-group" >
                <label for="exampleInputEmail1" font="color:#876ED7;">名字</label>
                <input name="sName" class="form-control" id="exampleInputEmail1">
            </div>
             <div class="form-group" >
                <label for="exampleInputEmail1" font="color:#876ED7;">账号</label>
                <input name="sNumber" class="form-control" id="exampleInputEmail1" >
            </div>
             <div class="form-group" >
                <label for="exampleInputEmail1" font="color:#876ED7;">密码</label>
                <input name="sPassword" class="form-control" id="exampleInputEmail1" >
            </div>
             <div class="form-group" >
                <label for="exampleInputEmail1" font="color:#876ED7;">归属营业点</label>
                <input name="branchId" class="form-control" id="exampleInputEmail1" >
            </div>
        <button type="submit" class="btn btn-default" style="margin-left: 40%;margin-top:3%;">添加</button>
        </form>
    </div>
</body>
</html>