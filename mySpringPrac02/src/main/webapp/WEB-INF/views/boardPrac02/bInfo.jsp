<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${bdto.subject }</title>
</head>
<body>
	<div align="center">
		<h1>Board Info</h1>
	</div>
	<div align="center">
		<form action="boardWrite" method="post">
			<table border="1">
				<colgroup>
					<col width="20%">
					<col width="80%">
				</colgroup>
				<tr>
					<td>Board Number</td>
					<td>${bdto.num }</td>
				</tr>	
				<tr>
					<td>Read Count</td>
					<td>${bdto.readCount }</td>
				</tr>	
				<tr>
					<td>Writer</td>
					<td>${bdto.writer }</td>
				</tr>	
				<tr>
					<td>Reg Date</td>
					<td><fmt:formatDate value="${bdto.regDate }" pattern="yyyy-MM-dd"/> </td>
				</tr>	
				<tr>
					<td>Email</td>
					<td>${bdto.email }</td>
				</tr>	
				<tr>
					<td>Subject</td>
					<td>${bdto.subject }</td>
				</tr>	
				<tr>
					<td>Content</td>
					<td>${bdto.content }</td>
				</tr>	
				<tr align="center">
					<td colspan="2">
						<input type="button" value="Reply" onclick="">
						<input type="button" value="Update" onclick="location.href='boardUpdate?num=${bdto.num}'">
						<input type="button" value="Delete" onclick="location.href='boardDelete?num=${bdto.num}'">
						<input type="button" value="Main" onclick="location.href='simpleBoardList'">
					</td>
				</tr>
			</table>
		</form>
	</div>

</body>
</html>