<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c"      uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="kr">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <meta name="viewport" content="width=device-width, initial-scale=1"/>
    <title>Cywell Members LIST</title>

    <!-- Bootstrap core CSS-->
    <link href="../css/bootstrap.css" rel="stylesheet" type="text/css" />

</head>

<body>


<form name="listFrm" method="get">


    <div class="container">

        <div class="jumbotron mt-3">

            <h1>Cywellsystem</h1>
            <p style="float:right;" class="btn pull-right">Total : ${cnt.CNT}명</p>

            <div class="input-group mb-3">
                <input name="searchNm" value="${params.searchNm}" class="form-control" placeholder="이름">
                <div class="input-group-append">
                    <button class="btn btn-outline-secondary" type="submit" id="button-addon2">찾기</button>
                </div>
            </div>

            <table class="table table-striped">
                <tr>
                    <th>이름</th>
                    <th>ID</th>
                    <th>email</th>
                </tr>
                <c:forEach var="result" items="${resultMap.list}" varStatus="status">
                    <tr>
                        <td>${result.USERNM}</td>
                        <td>${result.USERID}</td>
                        <td>${result.EMAIL}</td>
                    </tr>
                </c:forEach>
            </table>
        </div>

    </div> <!-- /container -->
</form>


<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="/js/bootstrap.js"></script>
</body>
</html>