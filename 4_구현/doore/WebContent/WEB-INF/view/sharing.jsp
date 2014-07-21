<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>공유신청!</title>
</head>
<body>

	<form name="sharingForm" method="get">

		<p>
			<strong>공유신청페이지^^</strong>
		</p>

		<table border="1" cellspacing="0" cellpadding="5">
			<tr>
				<th>상세정보</th>
			</tr>
			<tr>
				<td>소유자: ${product.customer_id}</td>
				<td>사진: ${product.product_picture}</td>
				<td>카테고리: ${product.category_id}</td>
				<td>물품명: ${product.product_name}</td>
				<td>저자: ${product.detail_text_1}</td>
				<td>가격: ${product.detail_text_2}</td>
				<td>줄거리: ${product.detail_text_3}</td>
				<td>상세정보: ${product.detail_decription}</td>
			</tr>
		</table>
		<br />
	</form>
	<form name="checkoutForm" action="<c:url value='/action/checkout'/>"
		method="post">
		<input type="submit" value="공유신청">
	</form>
	


</body>
</html>