<%-- 
    Document   : editTrainerForm
    Created on : Mar 25, 2020, 3:35:03 PM
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
        <title>Edit Trainer</title>
    </head>
    <body>
          <form:form method="POST"
                   action="saveTrainer" modelAttribute="trainer">
        <fieldset>
            <br>
            <legend> Edit trainer </legend>
            <table class="Forms">
                <tr >
                    <td><form:input type="hidden" path="trainerId" value="${trainer.trainerId}"/></td>
                </tr>
                <tr>
                    <td><form:label path="firstName">First name: </form:label></td>
                    <td><form:input path="firstName" value="${trainer.firstName}"/></td>
                </tr>
                <tr>
                    <td><form:label path="lastName">Last name: </form:label></td>
                    <td><form:input path="lastName" value="${trainer.lastName}"/></td>
                </tr>
                
                <tr>
                     <td><form:label path="subject">Subject: </form:label></td>
                     <td><form:input path="subject" value="${trainer.subject}"/></td>
                </tr>               
            </table>
            <br><br>
            <div >
                <input type="reset" value="Reset" class="formButtons">
               <input type="submit" value="Submit" class="formButtons">
            </div>
            <br>
        </fieldset>
    </form:form>
    </body>
</html>
