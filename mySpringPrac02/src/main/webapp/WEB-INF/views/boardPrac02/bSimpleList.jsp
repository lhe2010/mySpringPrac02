<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>boardList page</title>
</head>
<body>
	<h1><a href="simpleBoardList">Board Prac 02</a></h1>
	<div>
		<div>
			<h5>Total<span style="color:red; font-weight: bold"> 000 </span>Entries</h5>
		</div>
		<div>
			<select id="onePageViewCount" >
				<option value="5">5</option>
				<option value="7">7</option>
				<option value="10">10</option>
			</select> entries
		</div>
		<div>
			<input type="button" value="makeDummyData" onclick="location.href='makeDummyData'">
			<input type="button" value="Write" onclick="location.href='boardWrite'">
		</div>
		<table border="1">
			<colgroup>
				<col width="5%">
				<col width="60%">
				<col width="20%">
				<col width="10%">
				<col width="5%">
			</colgroup>
			<thead>
				<tr>
					<th>Order</th>
					<th>Subject</th>
					<th>Writer</th>
					<th>RegDate</th>
					<th>View</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${boardList }" var="bdto">
					<tr>
						<td>${bdto.num }</td>
						<td><a href="boardInfo?num=${bdto.num}">${bdto.subject }</a></td>
						<td>${bdto.writer }</td>
						<td><fmt:formatDate value="${bdto.regDate }" pattern="yyyy-MM-dd"/></td>
						<td>${bdto.readCount }</td>
				</c:forEach>
			
			</tbody>
			<tfoot>
				<tr>
					<td colspan="5" align="center">
						<select id="searchKeyword">
							<option value="total">Total</option>
							<option value="writer">Writer</option>
							<option value="subject">Subject</option>
						</select>
						<input type="text" id="searchWord" name="searchWord" style="width: 300px; display: inline;" >
						<input type="button" id="getSearchBoard" value="Search">
					</td>
				</tr>
			</tfoot>
		</table>
		<div>Pager
			<ul>
				<li></li>
			</ul>
		</div>
	</div>
	

</body>
</html>