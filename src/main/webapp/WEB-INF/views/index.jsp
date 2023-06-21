<html>
<body>
<a href="/addpage">Add User</a>
<c:forEach items="${user}" var="x">
<p> ${x.name}</p>
    <a href="/deleteuser/${x.id}">delete</a>
</c:forEach>
</body>
</html>


