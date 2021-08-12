<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글쓰기페이지</title>
</head>
<body>
	<div align="center">
		<h1>Board Write</h1>
	</div>
	<div align="center">
		<form action="boardWrite" method="post">
			<table border="1">
				<colgroup>
					<col width="20%">
					<col width="80%">
				</colgroup>
				<tr>
					<td><span style="color: red">*</span>Writer</td>
					<td><input type="text" id="writer" name="writer"></td>
				</tr>	
				<tr>
					<td><span style="color: red">*</span>Subject</td>
					<td><input type="text" id="subject" name="subject"></td>
				</tr>	
				<tr>
					<td><span style="color: red">*</span>E-mail</td>
					<td><input type="email" id="email" name="email"></td>
				</tr>	
				<tr>
					<td><span style="color: red">*</span>Password</td>
					<td><input type="password" id="password" name="password"></td>
				</tr>	
				<tr>
					<td>Content</td>
					<td><textarea rows="5" cols="50" id="content" name="content"></textarea></td>
				</tr>
				<tr align="center">
					<td colspan="2">
						<input type="submit" value="Write">
						<input type="reset" value="Reset">
						<input type="button" value="Main" onclick="location.href='simpleBoardList'">
					</td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>