<!DOCTYPE html>
<html>
<head>
   <jsp:include page="headers.jsp" />
    </head>

<jsp:include page="navigation.jsp" />
        <div style="text-align:center">
        <p style = "color:#3c261e; font-size:20px;">Java developers page </p></div>
<div class="container">
    <div class="row">
    </div>
    <div class="row">
        <div class="btn-toolbar" role="toolbar" aria-label="Toolbar with button groups">
            <div class="btn-group me-2" role="group" aria-label="Second group">
            </div>
        </div>
        <table class="table">
            <thead>
            <tr>
                <th scope="col">Developer</th>
                <th scope="col">Age</th>
                <th scope="col">Gender</th>
             </tr>
            </thead>
            <tbody>
            <%
            Object[] javaDevelopers = (Object[]) request.getAttribute("javaDevelopers");
                for(Object objJavaDeveloper : javaDevelopers){
                model.JavaDeveloper javaDeveloper = (model.JavaDeveloper) objJavaDeveloper;
                %>

                <tr>
                    <td><%= javaDeveloper.getDeveloper() %></td>
                    <td><%= javaDeveloper.getAge()  %></td>
                    <td><%= javaDeveloper.getGender()  %></td>
                    <td>
                        </td>
                 </tr>

            <% } %>

            </tbody>
        </table>
    </div>
</div>

</body>
</html>