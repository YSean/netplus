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
		function delIt(svrSeq,svrName){
			if(confirm("是否删除公众号"+svrName)){
				$("#form1").attr("action","svrDelResult.do");
				$("#svrSeq").val(svrSeq);
				$("#form1").submit();
			}
		}
		function modIt(svrSeq){
			$("#form1").attr("action","svrMod.do");
			$("#svrSeq").val(svrSeq);
			$("#form1").submit();
		}
		function changeState(svrSeq,state){
			$("#form1").attr("action","svrChangeState.do");
			$("#svrSeq").val(svrSeq);
			$("#svrState").val(state=='0'?'1':'0');
			$("#form1").submit();
		}
		function doIt(){
			$("#form1").attr("action","svrAdd.do");
			$("#form1").submit();
		}
	</script>
</head>
<!-- END HEAD -->
<!-- BEGIN BODY -->
<body>
	
	<form id="form1" action="svrAdd.do" method="post">
		<input type="hidden" name="svrState" id="svrState" value=""/>
		<input type="hidden" name="svrSeq" id="svrSeq" value=""/>
		<ol class="breadcrumb">
		  <li><a href="/console/welcome.do">Home</a></li>
		  <li><a href="svrList.do">公众号管理</a></li>
		  <li class="active">...</li>
		</ol>
		<div class="panel">
			<div class="panel-heading">
				<button class="btn btn-default" type="button" onclick="doIt()">添加公众号</button>
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
					<tr valign="center">
						<td><c:out value="${item.svrName}"/></td>
						<td><c:out value="${item.svrType}"/></td>
						<td><fmt:formatDate value="${item.ctime }" pattern="yyyy-MM-dd HH:mm:ss"/></td>
						<td>访问量：未开发</td>
						<td><c:out value="${item.state }"/></td>
						<td>
							<a href="javascript:void(0);" onclick="mgmtIt('${item.svrSeq}')">管理公众号</a>
							<br/>
							<a href="javascript:void(0);" onclick="modIt('${item.svrSeq}')">编辑</a>
							<a href="javascript:void(0);" onclick="delIt('${item.svrSeq}','${item.svrName }')">删除</a>
							<a href="javascript:void(0);" onclick="changeState('${item.svrSeq}','${item.state }')">
								<c:if test="${item.state eq '0' }">停用</c:if>
								<c:if test="${item.state eq '1' }">启用</c:if>
							</a>
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
