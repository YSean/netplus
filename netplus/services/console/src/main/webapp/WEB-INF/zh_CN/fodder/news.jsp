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
		#newsForm{
			margin-top:20px;
		}
	</style>
	<script type="text/javascript">
		function searchNews(){
			$.ajax({
				url:"/jquery/test1.txt",
				async:false
			});
		}
	</script>
</head>
<body>
	<form id="newsForm" method="post">
	<div class="container-fluid">
	<div class="row">
		<div class="col-md-4">
			<div class="input-group">
				<input type="text" class="form-control" placeholder="标题/作者/摘要"
					name="newsName" id="newsName"/>
				<span class="input-group-addon" id="basic-addon1">
					<i class="icon icon-search" onclick="searchNews();"></i>
				</span>
			</div>
		</div>
		<div class="col-md-8"></div>
	</div>
	<div class="row" style="margin-top:10px;">
		<div class="col-md-3 col-sm-4">
			图文消息(共${TotalCount }条)  
		</div>
		<div class="col-md-6 col-sm-4">
		</div>
		<div class="col-md-3 col-sm-4">
			<input type="button" class="btn btn-default" value="+新建图文消息"/>
		</div>
	</div>
	</div>
	</form>
</body>
</html>