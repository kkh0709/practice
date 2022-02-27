<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.4.1.js"></script>
</head>

<body>
<h1>게시판 목록</h1>
<script>
    $(document).ready(function(){
    
    	let result = '<c:out value="${result}"/>';
        
        checkAlert(result);
        
        function checkAlert(result){
            
            if(result === ''){
                reutrn;
            }
            
            if(result === "enrol success"){
                alert("등록이 완료되었습니다.");
            }
        }
 
    });
 
</script>
</body>
</html>