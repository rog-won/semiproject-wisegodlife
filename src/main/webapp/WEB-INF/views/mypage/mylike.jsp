<%@page import="ssg.com.a.dto.MylikeDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>마이페이지</title>
<style type="text/css">
#mymain {
	display: flex;
	width: 100%;
}
#leftMenu tr th{
	text-align: left;
}
#lefteMenu {
	width: 10%;	
}
#rightContet {
	width: 90%;
}
a {
	text-decoration: none;
}
</style>
</head>
<body>

<nav>
	<table border="1">
	<tr>
		<th><a href="">슬갓생 </a></th>
		<th><a href="">게시판</a></th>
		<th><a href="">학교생활</a></th>
		<th><a href="mymain.do">마이페이지</a></th>
		<th>
			<button>라이트모드</button>
		</th>
	</tr>
	</table>
</nav>

<h1>내정보</h1>

<main id="mymain">

<table id="leftMenu" border="1">
	<tr>
		<th><a href="mymain.do">기본정보</a></th>
	</tr>
	<tr>
		<th><a href="">수강 시간표 작성</a></th>
	</tr>	
	<tr>
		<th><a href="mycalendar.do">학과 일정달력</a></th>
	</tr>	
	<tr>
		<th><a href="mygradecal.do">학점 계산기</a></th>
	</tr>	
	<tr>
		<th><a href="">메시지</a></th>
	</tr>	
	<tr>
		<th><a href="">친구 정보</a></th>
	</tr>	
	<tr>
		<th><a href="mywrite.do">작성한 댓글 및 게시글</a></th>
	</tr>	
	<tr>
		<th><a href="mylike.do">좋아요한 게시글</a></th>
	</tr>
	<tr>
		<th><a href="myblacklist.do">블랙리스트</a></th>
	</tr>	
	<tr>
		<th><a href="mychange.do">개인정보 변경</a></th>
	</tr>	
	<tr>
		<th><a href="">학교 인증</a></th>
	</tr>
	<tr>
		<th><a href="myclose.do">회원 탈퇴</a></th>
	</tr>
</table>

<table>
<thead>
<tr>
	<th>번호</th><th>좋아요한 게시글</th><th>내용</th><th>조회수</th><th>작성일</th><th>작성자</th>
</tr>
</thead>
<tbody>
<%
if(likeList == null || likeList.size() == 0){
	%>
	<tr>
		<td colspan="6">작성된 글이 없습니다</td>
	</tr>
	<%
}else{
	for (int i = 0;i < likeList.size(); i++) {
		MylikeDto ml = likeList.get(i);
		%>
	<tr>
		<td><%=i + 1 %></td>
		<td style="text-align: left;" colspan="2">
			<%=ml.getTitle() %>
		</td>
		<td><%=ml.getReadcount() %></td>
		<td><%=ml.getWdate() %></td>
		<td><%=ml.getLikeid() %></td>
	</tr>	
		<%
	}
%>
</tbody>
</table>

</main>
</body>
</html>