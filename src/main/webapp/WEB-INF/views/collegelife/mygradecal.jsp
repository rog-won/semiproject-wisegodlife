<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>마이페이지 학점계산기</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
<link rel="stylesheet" href="style/css/style.css">
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
  <script>
    $(document).ready( function() {
      $("#topnav").load("topnav.do");
      $("#leftMenu").load("collnav.do");
    });
  </script>
	<nav id="topnav"></nav>
	
	<header id="header">	
		<h1>학교생활 </h1>
	</header>
	
	<main id="mymain">
    <leftmenu id="leftMenu"></leftmenu>
		
		<table border="1">
			<thead>
				<tr>
					<th>
						<select id="changeAvg">
							<option value="firstAvg">4.5 만점</option>
							<option value="secondAvg">4.3 만점</option>
							<option value="threeAvg">4.0 만점</option>
							<option value="fourAvg">백분율 계산</option>
						</select>
					</th>
					<th colspan="2" style="text-align: left;"><input id="fcheck" type="checkbox">F학점 포함</th>
					<th><input type="button" value="과목추가" id="addSub"></th>		
				</tr>	
				<tr>
					<th>과목</th>
					<th>점수</th>
					<th>학점</th>
					<th>전공</th>
				</tr>
			</thead>		
			<tbody id="addSubject">
<!-- 				<tr>
					<th><input name="subjectName" placeholder="과목을 입력해주세요"> </th>
					<th>
						<select name="myGrade">
							<option value="A+">A+</option>
							<option value="A">A</option>
							<option value="B+">B+</option>
							<option value="B">B</option>
							<option value="C+">C+</option>
							<option value="C">C</option>
							<option value="D+">D+</option>
							<option value="D">D</option>
							<option value="F">F</option>
						</select>
					</th>
					<th><input name="credit" placeholder="학점을 입력해주세요"></th>
					<th><input type="checkbox" name="major"></th>
				</tr> -->
			</tbody>
			<tfoot>
				<tr>
				 <th colspan="4">
				 	<button type="button" id="gradeCal">학점계산</button>
				 	<button type="button" id="saveCal">저장하기</button>
				 	<button type="button" id="loadCal">불러오기</button>
				 </th>
				</tr>
			</tfoot>
		</table>	
	</main>		
	<div align="center">
		<table border="1">
			<tr>
				<th id="totalName">총 평점</th>
				<td><input type="text" id="totalAvg" readonly="readonly"></td>
				<th id="majorName">전공평점</th>
				<td><input type="text" id="majorAvg" readonly="readonly"></td>
				<th>이수학점</th>
				<td><input type="text" id="creditAll" readonly="readonly"></td>
				<th>전공학점</th>
				<td><input type="text" id="creditMajor" readonly="readonly"></td>
			</tr>
		</table>
	</div>
	
	<script type="text/javascript" src="js/collegelife/mygradecal.js"></script>
</body>
</html>