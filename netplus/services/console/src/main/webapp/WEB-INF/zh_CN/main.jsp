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
<title>微信管理平台</title>
<meta content="width=device-width, initial-scale=1.0" name="viewport" />
<meta content="" name="description" />
<meta content="" name="author" />
<!--[if IE]>
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <![endif]-->
<!-- GLOBAL STYLES -->
<link rel="stylesheet" href="/console/plugins/bootstrap-3.3.5-dist/css/bootstrap.min.css" />
<link rel="stylesheet" href="/console/assets/css/main.css" />
<link rel="stylesheet" href="/console/assets/css/MoneAdmin.css" />
<link rel="stylesheet" href="/console/plugins/Font-Awesome/css/font-awesome.css" />
<!--END GLOBAL STYLES -->

<!-- PAGE LEVEL STYLES -->
<link href="/console/assets/css/layout2.css" rel="stylesheet" />
<!-- END PAGE LEVEL  STYLES -->
<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
    <![endif]-->
<style>
.icon-table, .icon-tasks, .icon-angle-right {
	padding-right: 10px;
}
</style>
<script>
	function toMenu(level1, level2) {
		if (level2 == null) {
			$("#targetFrame").attr("src",level1+".do");
		}else{
			$("#targetFrame").attr("src",level1+"/"+level2+".do");
		}
	}
</script>
</head>

<!-- END HEAD -->

<!-- BEGIN BODY -->
<body class="padTop53 ">
	<!-- MAIN WRAPPER -->
	<div id="wrap">
		<!-- HEADER SECTION -->
		<div id="top">
			<nav class="navbar navbar-inverse navbar-fixed-top " style="padding-top: 10px;">
				<a data-original-title="Show/Hide Menu" data-placement="bottom" data-tooltip="tooltip"
					class="accordion-toggle btn btn-primary btn-sm visible-xs" data-toggle="collapse" href="#menu" id="menu-toggle">
					<i class="icon-align-justify"></i>
				</a>
				<!-- LOGO SECTION -->
				<header class="navbar-header">
					<a href="index.html" class="navbar-brand"> <!-- Logo_view --> <img src="assets/img/logo.png" alt="" />
					</a>
				</header>
				<!-- END LOGO SECTION -->
				<ul class="nav navbar-top-links navbar-right">

					<!-- MESSAGES SECTION -->
					<li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#"> <span
							class="label label-success">2</span> <i class="icon-envelope-alt"></i>&nbsp; <i class="icon-chevron-down"></i>
					</a>

						<ul class="dropdown-menu dropdown-messages">
							<li><a href="#">
									<div>
										<strong>John Smith</strong> <span class="pull-right text-muted"> <em>Today</em>
										</span>
									</div>
									<div>
										Lorem ipsum dolor sit amet, consectetur adipiscing. <br /> <span class="label label-primary">Important</span>

									</div>
							</a></li>
							<li class="divider"></li>
							<li><a href="#">
									<div>
										<strong>Raphel Jonson</strong> <span class="pull-right text-muted"> <em>Yesterday</em>
										</span>
									</div>
									<div>
										Lorem ipsum dolor sit amet, consectetur adipiscing. <br /> <span class="label label-success"> Moderate
										</span>
									</div>
							</a></li>
							<li class="divider"></li>
							<li><a href="#">
									<div>
										<strong>Chi Ley Suk</strong> <span class="pull-right text-muted"> <em>26 Jan 2014</em>
										</span>
									</div>
									<div>
										Lorem ipsum dolor sit amet, consectetur adipiscing. <br /> <span class="label label-danger"> Low </span>
									</div>
							</a></li>
							<li class="divider"></li>
							<li><a class="text-center" href="#"> <strong>Read All Messages</strong> <i class="icon-angle-right"></i>
							</a></li>
						</ul></li>
					<!--END MESSAGES SECTION -->

					<!--TASK SECTION -->
					<li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#"> <span
							class="label label-danger">5</span> <i class="icon-tasks"></i>&nbsp; <i class="icon-chevron-down"></i>
					</a>

						<ul class="dropdown-menu dropdown-tasks">
							<li><a href="#">
									<div>
										<p>
											<strong> Profile </strong> <span class="pull-right text-muted">40% Complete</span>
										</p>
										<div class="progress progress-striped active">
											<div class="progress-bar progress-bar-success" role="progressbar" aria-valuenow="40" aria-valuemin="0"
												aria-valuemax="100" style="width: 40%">
												<span class="sr-only">40% Complete (success)</span>
											</div>
										</div>
									</div>
							</a></li>
							<li class="divider"></li>
							<li><a href="#">
									<div>
										<p>
											<strong> Pending Tasks </strong> <span class="pull-right text-muted">20% Complete</span>
										</p>
										<div class="progress progress-striped active">
											<div class="progress-bar progress-bar-info" role="progressbar" aria-valuenow="20" aria-valuemin="0"
												aria-valuemax="100" style="width: 20%">
												<span class="sr-only">20% Complete</span>
											</div>
										</div>
									</div>
							</a></li>
							<li class="divider"></li>
							<li><a href="#">
									<div>
										<p>
											<strong> Work Completed </strong> <span class="pull-right text-muted">60% Complete</span>
										</p>
										<div class="progress progress-striped active">
											<div class="progress-bar progress-bar-warning" role="progressbar" aria-valuenow="60" aria-valuemin="0"
												aria-valuemax="100" style="width: 60%">
												<span class="sr-only">60% Complete (warning)</span>
											</div>
										</div>
									</div>
							</a></li>
							<li class="divider"></li>
							<li><a href="#">
									<div>
										<p>
											<strong> Summary </strong> <span class="pull-right text-muted">80% Complete</span>
										</p>
										<div class="progress progress-striped active">
											<div class="progress-bar progress-bar-danger" role="progressbar" aria-valuenow="80" aria-valuemin="0"
												aria-valuemax="100" style="width: 80%">
												<span class="sr-only">80% Complete (danger)</span>
											</div>
										</div>
									</div>
							</a></li>
							<li class="divider"></li>
							<li><a class="text-center" href="#"> <strong>See All Tasks</strong> <i class="icon-angle-right"></i>
							</a></li>
						</ul></li>
					<!--END TASK SECTION -->

					<!--ALERTS SECTION -->
					<li class="chat-panel dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#"> <span
							class="label label-info">8</span> <i class="icon-comments"></i>&nbsp; <i class="icon-chevron-down"></i>
					</a>

						<ul class="dropdown-menu dropdown-alerts">

							<li><a href="#">
									<div>
										<i class="icon-comment"></i> New Comment <span class="pull-right text-muted small"> 4 minutes ago</span>
									</div>
							</a></li>
							<li class="divider"></li>
							<li><a href="#">
									<div>
										<i class="icon-twitter info"></i> 3 New Follower <span class="pull-right text-muted small"> 9 minutes
											ago</span>
									</div>
							</a></li>
							<li class="divider"></li>
							<li><a href="#">
									<div>
										<i class="icon-envelope"></i> Message Sent <span class="pull-right text-muted small"> 20 minutes ago</span>
									</div>
							</a></li>
							<li class="divider"></li>
							<li><a href="#">
									<div>
										<i class="icon-tasks"></i> New Task <span class="pull-right text-muted small"> 1 Hour ago</span>
									</div>
							</a></li>
							<li class="divider"></li>
							<li><a href="#">
									<div>
										<i class="icon-upload"></i> Server Rebooted <span class="pull-right text-muted small"> 2 Hour ago</span>
									</div>
							</a></li>
							<li class="divider"></li>
							<li><a class="text-center" href="#"> <strong>See All Alerts</strong> <i class="icon-angle-right"></i>
							</a></li>
						</ul></li>
					<!-- END ALERTS SECTION -->

					<!--ADMIN SETTINGS SECTIONS -->

					<li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#"> <i class="icon-user "></i>&nbsp;
							<i class="icon-chevron-down "></i>
					</a>

						<ul class="dropdown-menu dropdown-user">
							<li><a href="#"><i class="icon-user"></i> User Profile </a></li>
							<li><a href="#"><i class="icon-gear"></i> Settings </a></li>
							<li class="divider"></li>
							<li><a href="login.html"><i class="icon-signout"></i> Logout </a></li>
						</ul></li>
					<!--END ADMIN SETTINGS -->
				</ul>

			</nav>

		</div>
		<!-- END HEADER SECTION -->



		<!-- MENU SECTION -->
		<div id="left">
			<div class="media user-media well-small">
				<a class="user-link" href="#"> <img class="media-object img-thumbnail user-img" alt="User Picture"
						src="assets/img/user.gif" />
				</a> <br />
				<div class="media-body">
					<h5 class="media-heading">Joe Romlin</h5>
					<ul class="list-unstyled user-info">

						<li><a class="btn btn-success btn-xs btn-circle" style="width: 10px; height: 12px;"></a> Online</li>

					</ul>
				</div>
				<br />
			</div>
			<!-- Menu_View -->
			<ul id="menu" class="collapse">
				<li class="panel ">
					<a href="#" data-parent="#menu" data-toggle="collapse" class="accordion-toggle"
						data-target="#component-param"> 
						<i class="icon-tasks"> </i>参数管理 
						<span class="pull-right"> 
							<i class="icon-angle-left"></i>
						</span>
					</a>
					<ul class="collapse" id="component-param">
						<li class="">
						<a href="javascript:void(0);" onclick="toMenu('svrInfo','svrList')"> <i
								class="icon-angle-right"></i>公众号参数配置
						</a></li>
						<li class="">
						<a href="javascript:void(0);" onclick="toMenu('svrInfo','system')"> <i
								class="icon-angle-right"></i>系统参数
						</a></li>
						<li class="">
						<a href="javascript:void(0);" onclick="toMenu('svrInfo','defaultReply')"> <i
								class="icon-angle-right"></i>自动回复
						</a></li>
					</ul>
				</li>
				<li class="panel">
					<a href="#" data-parent="#menu" data-toggle="collapse" class="accordion-toggle"
						data-target="#component-base"> <i class="icon-tasks"> </i>基础功能 <span class="pull-right"> <i
								class="icon-angle-left"></i>
						</span>
					</a>
					<ul class="collapse" id="component-base">
						<li class=""><a href="javascript:void(0);"> <i class="icon-angle-right"></i>消息管理
						</a></li>
						<li class=""><a href="javascript:void(0);"> <i class="icon-angle-right"></i>用户管理
						</a></li>
						<li class=""><a href="javascript:void(0);" onclick="toMenu('menus','menusInit')"> 
								<i class="icon-angle-right"></i>菜单管理
						</a></li>
						<li class=""><a href="javascript:void(0);"> <i class="icon-angle-right"></i>素材管理
						</a></li>
						<li class=""><a href="javascript:void(0);"> <i class="icon-angle-right"></i>关键字管理
						</a></li>
					</ul></li>
				<li class="panel"><a href="#" data-parent="#menu" data-toggle="collapse" class="accordion-toggle"
					data-target="#component-busi"> <i class="icon-tasks"> </i>营销管理 <span class="pull-right"> <i
							class="icon-angle-left"></i>
					</span>
				</a>
					<ul class="collapse" id="component-busi">
						<li class=""><a href="javascript:void(0);"> <i class="icon-angle-right"></i>专题维护
						</a></li>
						<li class=""><a href="javascript:void(0);"> <i class="icon-angle-right"></i>广告主
						</a></li>
						<li class=""><a href="javascript:void(0);"> <i class="icon-angle-right"></i>流量主
						</a></li>
						<li class=""><a href="javascript:void(0);"> <i class="icon-angle-right"></i>发布活动
						</a></li>
						<li class=""><a href="javascript:void(0);"> <i class="icon-angle-right"></i>投票管理
						</a></li>
					</ul></li>
			</ul>
		</div>
		<!--END MENU SECTION -->

		<!--PAGE CONTENT -->
		<div id="content">
			<iframe id="targetFrame" src="welcome.do" style="width:100%;min-height:500px;padding-top:10px;overflow-x:hidden;overflow-y:hidden; "></iframe>
		</div>
		<!--END PAGE CONTENT -->
	</div>

	<!--END MAIN WRAPPER -->

	<!-- FOOTER -->
	<div id="footer">
		<p>&copy; sxkiler &nbsp;2015 &nbsp;</p>
	</div>
	<!--END FOOTER -->


	<!-- GLOBAL SCRIPTS -->
	<!-- <script src="/console/assets/js/jquery-1.11.3.js"></script> -->
	<script src="http://cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>
	<script src="/console/plugins/bootstrap-3.3.5-dist/js/bootstrap.min.js"></script>
	<script src="/console/plugins/modernizr-2.6.2-respond-1.1.0.min.js"></script>
	<!-- END GLOBAL SCRIPTS -->

	<!-- PAGE LEVEL SCRIPTS -->
	<!-- <script src="/console/plugins/flot/jquery.flot.js"></script>
	<script src="/console/plugins/flot/jquery.flot.resize.js"></script>
	<script src="/console/plugins/flot/jquery.flot.time.js"></script>
	<script src="/console/plugins/flot/jquery.flot.stack.js"></script>
	<script src="/console/assets/js/for_index.js"></script> -->

	<!-- END PAGE LEVEL SCRIPTS -->
</body>

<!-- END BODY -->
</html>
