<html>
<body bgcolor = black	text = red>
<h1>
<%@taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>


<c:set	var = "a"	value = "0" />

<c:choose>
	
		<c:when test = "${a>0}">
					<c:out value = "Positive  bcoz	a = ${a}	"/>
		</c:when>
	
			<c:when test = "${a<0}">
					<c:out value = "Negative  bcoz	a = ${a}	"/>
		</c:when>

		<c:otherwise>
					<c:out value = "ZERO  bcoz	a = ${a}	"/>
		</c:otherwise>

</c:choose>


</h1>
</body>
</html>
