<%@ page contentType="text/html; charset=UTF-8" %>
<jsp:useBean id="content" class="jp.ac.o_hara.site.ContentBean" scope="request" />
<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="${ content.getContent() }" />
</body>
</html>