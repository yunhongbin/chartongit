<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link rel="stylesheet" type="text/css" href="resources/css/bootstrap.min.css">
	<script type="text/javascript" src="resources/script/jquery-1.11.1.min.js"></script>
	<script type="text/javascript" src="resources/script/bootstrap.min.js"></script>
	<script type="text/javascript" src="resources/script/jquery.validate.min.js"></script>
	<title>Home Page</title>
	<style type="text/css">
		#logindev{
		  position: absolute;
		  top: 50%;
		  -webkit-transform: translateY(-50%);
		  -moz-transform:  translateY(-50%);
		  -ms-transform:  translateY(-50%);
		  -o-transform:  translateY(-50%);
		  transform:  translateY(-50%);
		}
	</style>
	<script type="text/javascript">
    	
		$().ready(function() {
		  $("#loginform").validate({
		    rules: {
		      inputUsername: "required",
		      inputPassword: "required",
		      inputUsername: {
		        required: true,
		        minlength: 3
		      },
		      inputPassword: {
		        required: true,
		        minlength: 5
		      },
		    },
		    messages: {
		      inputUsername: {
		        required: "请输入用户名",
		        minlength: "用户名必需由3个字母组成"
		      },
		      inputPassword: {
		        required: "请输入密码",
		        minlength: "密码长度不能小于 5 个字母"
		      }
		    }
		  })
		 });
		function login(){
			$.ajax({
				url: "testgetUserName1",
				type: "POST",
				data: $("#loginform").serialize(),
				success:function(data){
					console.log(data)
					var resultcode = data.resrultcode;
					console.log("响应吗："+resultcode)
					if(resultcode == "0000"){
					}else{
						$().alert()
					}
				}
			});
		}
	</script>
</head>
<body style="zoom: 1; background-color: rgb(204, 232, 207);">
	<div class="container">
		 <div class="col-lg-4 col-lg-offset-4 col-sm-6 col-sm-offset-3 col-xs-8 col-xs-offset-2" id="logindev">
			<form role="form" class="form-horizontal" id="loginform" action="javascript:login();" method="post">
				<h2 class="form-signin-heading">欢迎登陆</h2>
				<input type="text" class="form-control" placeholder="用户名" name="inputUsername" id="username" autofocus=""/>
				<input type="password" class="form-control" placeholder="密码" name="inputPassword" id="password"/>
				<button class="btn btn-sm btn-primary btn-block" type="submit">登录</button>
			</form>
			<div id="tip" class="alert alert-danger hidden" role="alert">
				<button type="button" class="close" data-dismiss="alert" >×</button>
				<strong>警告!</strong> 用户名或密码错误.
			</div>
		</div>
	</div>
		
	

</body>
</html>

