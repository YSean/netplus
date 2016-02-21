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
</head>
<body>
	<ol class="breadcrumb">
	  <li><a href="/console/welcome.do">Home</a></li>
	  <li><a href="init.do">素材管理</a></li>
	  <li class="active">...</li>
	</ol>
	<div class="panel">
		<div class="panel-heading">
			<h4>素材管理</h4>
		</div>
		<div class="panel-body">
			<ul class="nav nav-tabs" id="myTabs">
			  <li role="presentation" class="active"><a href="#newsTab">图文消息</a></li>
			  <li role="presentation"><a href="#imageTab">图片</a></li>
			  <li role="presentation"><a href="#voiceTab">语音</a></li>
			  <li role="presentation"><a href="#videoTab">视频</a></li>
			</ul>
			<div class="tab-content">
				<div class="tab-pane active" id="newsTab">
					<jsp:include page="news.jsp"></jsp:include>
				</div>
				<div class="tab-pane" id="imageTab">
					<jsp:include page="image.jsp"></jsp:include>
				</div>
				<div class="tab-pane" id="voiceTab">
					<jsp:include page="voice.jsp"></jsp:include>
				</div>
				<div class="tab-pane" id="videoTab">
					<jsp:include page="video.jsp"></jsp:include>
				</div>
			</div>
		</div>
	</div>
	
<script>
	$(function() {
		$('#myTabs a:first').tab('show');//初始化显示哪个tab 

		$('#myTabs a').click(function(e) {
			e.preventDefault();//阻止a链接的跳转行为 
			$(this).tab('show');//显示当前选中的链接及关联的content 
		})
	})
</script>
</body>
</html>