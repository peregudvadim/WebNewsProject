<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: vadim
  Date: 21.04.2024
  Time: 17:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<c:if test="${not (requestScope.authError eq null)}" >
  <c:out value="${requestScope.authError}">


  </c:out>


</c:if>



</body>
</html>
