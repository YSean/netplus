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
	<style>
		.panel{
			padding:40px;
		}
	</style>
</head>
<!-- END HEAD -->
<!-- BEGIN BODY -->
<body>
	<form action="svrList.do" method="post" class="form-horizontal">
		<ol class="breadcrumb">
		  <li><a href="/console/welcome.do">Home</a></li>
		  <li><a href="svrList.do">公众号管理</a></li>
		  <li class="active">操作结果</li>
		</ol>
		<div class="panel">
			<div class="panel-heading"></div>
			<div class="panel-body">
				<div class="form-group">
					<label class="col-sm-2 control-label">操作名称</label>
					<div class="col-sm-10">
						<p class="form-control-static">
							<c:out value="${OperName }"/>
						</p>
					</div>
				</div>
				<div class="form-group">
					<label class="col-sm-2 control-label">操作时间</label>
					<div class="col-sm-10">
						<p class="form-control-static">
							<c:out value="${OperTime }"/>
						</p>
					</div>
				</div>
				<div class="form-group">
					<label class="col-sm-2 control-label">操作结果</label>
					<div class="col-sm-10">
						<p class="form-control-static">
							<c:out value="${OperResult }"/>
						</p>
					</div>
				</div>
				<c:if test="${not empty Message }">
				<div class="form-group">
					<label class="col-sm-2 control-label">失败</label>
					<div class="col-sm-10">
						<p class="form-control-static">
							<c:out value="${OperMessage }"/>
						</p>
					</div>
				</div>
				</c:if>
				<button type="submit" class="btn btn-default">返回</button>
			</div>
		</div>
	</form>
</body>
<!-- END BODY -->
</html>