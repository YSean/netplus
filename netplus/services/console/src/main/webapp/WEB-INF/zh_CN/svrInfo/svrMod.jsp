<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix='fmt' uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<!--[if IE 8]> <html lang="en" class="ie8"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9"> <![endif]-->
<!--[if !IE]><!-->
<html lang="zh_CN">
<!--<![endif]-->
<!-- BEGIN HEAD -->
<head>
	<meta charset="UTF-8" />
	<jsp:include page="/WEB-INF/zh_CN/layouts/common.jsp"></jsp:include>
	<script type="text/javascript">
		function init(){
			$("#svrType").val("<c:out value='${svrInfo.svrType}'/>")
		}
	</script>
</head>
<!-- END HEAD -->
<!-- BEGIN BODY -->
<body onload="init()">
	<form action="svrModResult.do" method="post">
		<ol class="breadcrumb">
		  <li><a href="/console/welcome.do">Home</a></li>
		  <li><a href="svrList.do">公众号管理</a></li>
		  <li class="active">添加公众号</li>
		</ol>
		<div class="panel">
			<div class="panel-heading"></div>
			<div class="panel-body">
				<div class="form-group">
					<label>公众号原始ID</label>
					<input type="text" class="form-control" name="svrId" 
						id="svrId" placeholder="请输入gh_开头的原始ID值" value="${svrInfo.svrId }" disabled>
				</div>
				<div class="form-group">
					<label>公众号名称</label>
					<input type="text" class="form-control" name="svrName" 
						id="svrName" placeholder="请输入公众号的别名" maxlength="32" value="${svrInfo.svrName }">
				</div>
				<div class="form-group">
					<label>公众号AppID</label>
					<input type="text" class="form-control" name="appId" value="${svrInfo.appId }"
						id="appId" placeholder="请输入开发者的APPID">
				</div>
				<div class="form-group">
					<label>公众号AppSecret</label>
					<input type="text" class="form-control" name="appSecret" value="${svrInfo.appSecret }"
						id="appSecret" placeholder="请输入开发者的APPSecret">
				</div>
				<div class="form-group">
					<label>Token</label>
					<input type="text" class="form-control" name="token" value="${svrInfo.token }"
						id="token" placeholder="请输入开发者的token">
				</div>
				<div class="form-group">
					<label>Encoding_AESKey</label>
					<input type="text" class="form-control" name="encodingAeskey" value="${svrInfo.encodingAeskey }"
						id="encodingAeskey" placeholder="请输入开发者随机生成的Encoding_AESKey">
				</div>
				<div class="form-group">
					<label>公众号类型</label>
					<select multiple class="form-control" name="svrType" id="svrType">
						<option value="C">测试号</option>
						<option value="D">订阅号</option>
						<option value="E">认证订阅号</option>
						<option value="F">服务号</option>
						<option value="G">认证服务号</option>
					</select>
				</div>
				<button type="submit" class="btn btn-default">Submit</button>
			</div>
		</div>
	</form>
</body>
<!-- END BODY -->
</html>