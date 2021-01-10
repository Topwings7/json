<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.5.1.js"
	integrity="sha256-QWo7LDvxbWT2tbbQ97B53yJnYU3WhH/C8ycbRAkjPDc="
	crossorigin="anonymous"></script>
<script>
	$(function() {
		$("button").click(function() {
			$.ajax({
				url : "http://localhost:8080/top/json",
				success : function(rs) {
					console.log(rs)
				}

			})
		})
	})
</script>
</head>

<body>

	<button>json호출</button>

</body>
</html>