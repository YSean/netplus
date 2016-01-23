<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
	<style>
		.panel{
			padding:40px;
		}
	</style>
</head>
<!-- END HEAD -->
<!-- BEGIN BODY -->
<body>
	
	<form action="svrAdd.do" method="post">
		<ol class="breadcrumb">
		  <li><a href="/console/welcome.do">Home</a></li>
		  <li><a href="svrList.do">公众号管理</a></li>
		  <li class="active">...</li>
		</ol>
		<div class="panel">
			<div class="panel-heading">
				<button class="btn btn-default" type="submit">添加公众号</button>
			</div>
			<div class="panel-body">
				<table class="table">
					<tr>
						<td>公众号名称</td>
						<td>公众号类型</td>
						<td>创建时间/到期时间</td>
						<td>访问量统计</td>
						<td>状态</td>
						<td>操作</td>
					</tr>
				<c:forEach var="item" items="${SvrList }" varStatus="index">
					<tr>
						<td><c:out value="${item.name}"/></td>
						<td><c:out value="${item.svrType}"/></td>
						<td><c:out value="${item.ctime }"/></td>
						<td>访问量：未开发</td>
						<td><c:out value="${item.state }"/></td>
						<td>
							<a href="">编辑</a>
							<a href="">管理</a>
							<a href="">关闭</a>
						</td>
					</tr>
				</c:forEach>
				</table>
			</div>
		</div>
	</form>
	
</body>
<!-- END BODY -->
</html>
