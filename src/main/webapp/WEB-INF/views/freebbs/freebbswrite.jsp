<%@ page import="ssg.com.a.dto.FriendDto" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	FriendDto login = (FriendDto) session.getAttribute("login");
    if (login == null || login.getId().isEmpty()) {
        session.setAttribute("prevView", "freebbswrite");
%>
<script>
    alert("로그인해 주십시오");
    location.href = "./login.do";
</script>
<%
    }
%>
<!DOCTYPE html>
<html>
<head>
    <title>글쓰기</title>
    <link rel="icon" href="images/favicon.svg">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
   
   	<!-- Jquery 추가 -->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
	
    <!-- 섬머노트 추가 -->
    <script src="./js/summernote-lite.js"></script>
	<script src="./js/summernote-ko-KR.js"></script>
	<link rel="stylesheet" href="./style/css/summernote-lite.css">

    <style>
		.mytable {
			width: 800px;
			border: 1px solid lightgray;
		}
		
		th {
			border: 1px solid lightgray;
			vertical-align: middle;
			text-align: center;
       		font-size: 15px;
       		
       		--bs-table-color: white;
   			--bs-table-bg: royalblue;
		}
		
		button {
			/* margin: 0 20px; */			
		}
</style>
</head>
<body>
<h1>글쓰기</h1>
<div align="center">
    <form action="freebbswriteAf.do" method="post">
        <table class="table mytable">
            <col width="200"/>
            <col width="400"/>
            <tr>
                <th>작성자</th>
                <td>
                    <% if (login != null && !login.getId().isEmpty()) { %>
                    <input type="text" class="form-control" name="id" size="50px" value="<%=login.getId()%>" readonly>
                    <% } %>
                </td>
            </tr>
            <tr>
                <!-- <th>제목</th> -->
                <td colspan="2"><input type="text" class="form-control" id="title" name="title" size="50px" placeholder="제목을 작성해주세요"></td>
            </tr>
            <tr>
                <!-- <th>내용</th> -->
                <td colspan="2"><textarea id="summernote" name="content" class="form-control" cols="50" rows="20"
                              placeholder="내용을 작성해주세요"></textarea></td>
            </tr>
        </table>
        <br/>
        <button id="freebbsWriteSubmit" type="submit" class="btn btn-primary">글작성완료</button>
        <button type="button" class="btn btn-primary" onclick="returnlist()">글목록으로</button>
    </form>
</div>

<script type="text/javascript">
	$('#freebbsWriteSubmit').click(function(){
		let title = $('#title').val();
		
		if(title.trim() === ''){
			alert('제목을 입력해주세요');
			return false;	//전송보류시에는 false를 반환해주면 된다.
		}
	});
</script>

<script>
$(document).ready(function() {
	
	/*
	&lt;나 &gt;는 웹사이트에 적용시 < > 그대로 출력됩니다.
	저장할 때 replaceAll으로 변환을 해줬으니 불러올 때도 title.replaceAll("&lt;", "<"); 
	*/
	
	//여기 아래 부분
	$('#summernote').summernote({
		  height: 150,              				    // 에디터 높이
		  minHeight: null,        					    // 최소 높이
		  maxHeight: null,    					        // 최대 높이
		  focus: true,           						// 에디터 로딩후 포커스를 맞출지 여부
		  lang: "ko-KR",								// 한글 설정
		  placeholder: '최대 2048자까지 쓸 수 있습니다'	//placeholder 설정
	});
	
	$('.note-view').remove();
	$('.note-fontname').remove();
	$('.note-color').remove();
	
	});

	function returnlist() {
		location.href = "freebbslist.do";
	}
</script>
</body>
</html>