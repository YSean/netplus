<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix='fmt' uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<!--[if IE 8]> <html lang="en" class="ie8"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9"> <![endif]-->
<!--[if !IE]><!-->
<html lang="zh_CN">
<head>
	<meta charset="UTF-8" />
	<jsp:include page="/WEB-INF/zh_CN/layouts/common.jsp"></jsp:include>
	<script type="text/javascript">
		function upload(){
			var formData = new FormData($( "#postForm" )[0]);  
			$.ajax({
				url: 'http://localhost:8080/console/image/upload.do' ,  
		          type: 'POST',  
		          data: formData,  
		          async: false,  
		          cache: false,  
		          contentType: false,  
		          processData: false,  
		          success: function (returndata) {  
		              alert(returndata);  
		          },  
		          error: function (returndata) {  
		              alert(returndata);  
		          }
			});
		}
		function publish(){
			var formData = new FormData($( "#postForm" )[0]);  
			$.ajax({
				url: 'http://localhost:8080/console/image/publish.do' ,  
		          type: 'POST',  
		          async: false,  
		          cache: false,  
		          contentType: false,  
		          processData: false,  
		          success: function (returndata) {  
		              alert(returndata);  
		          },  
		          error: function (returndata) {  
		              alert(returndata);  
		          }
			});
		}
	</script>
</head>
<body>
	<form id="postForm" method="post" enctype="multipart/form-data">
		<input type="file" name="file" />
		<input type="button" value="Submit" onclick="upload()"/><br/>
		<input type="button" value="Publish" onclick="publish()"/>
		<span id="serverResponse"></span>
	</form>
	<%-- <jsp:include page="/WEB-INF/zh_CN/layouts/ueditor.jsp"></jsp:include> --%>
</body>
</html>