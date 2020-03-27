<%-- 
    Document   : alltrainers
    Created on : Mar 24, 2020, 2:12:28 PM
    Author     : user
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/StylingCSS.css">
        <title>Trainers</title>
    </head>
    <body>
        <br>
        <div class="topBanner" style="background-color:rgb(80, 105, 80);">
            <img id="logo" src="${pageContext.request.contextPath}/css/logo.png" alt="logo"><br> 
           trainers
        </div>
        <p style="color:red; text-align: center" > <strong> ${message} </strong> </p>
        <div>
            <h1 class="white" style="text-align:center; font-size: xx-large; "> ♫ &nbsp &nbsp All Trainers &nbsp &nbsp ♫ </h1>
        </div>
        <br>
        <div style="margin-left: 20px; margin-right: 20px;">
            <table class="tableTrainers">
                <thead>
                    <tr>
                        <th>first name</th>
                        <th>last name</th>
                        <th>subject</th>
                        <th colspan="2">actions</th>
                    </tr>
                </thead>               
                <tbody>
                    <c:forEach items="${trainers}" var="trainer">        
                     <tr>
                    <td>${trainer.firstName}</td>
                    <td>${trainer.lastName}</td>
                    <td>${trainer.subject}</td>
                    <td><a href="edittrainer-${trainer.trainerId}"><button class="tableButtons" style="background-color:rgb(80, 105, 80)">edit</button></a></td>
                    <td><a href="deletetrainer-${trainer.trainerId}"><button class="tableButtons" style="background-color:rgb(163,38,38)">delete</button></a></td>
                </tr>
                        </c:forEach>
                </tbody>
        </table>
                
                <br>
                <hr>
                   <a href="addtrainer" > <button class="tableButtons" style="color: whitesmoke; padding: 20px 16px; background-color: rgb(80, 105, 80);">add more trainers</button></a>
        </div>
        </body>
                </html>
