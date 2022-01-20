<!DOCTYPE html>
<html>
<head>
   <jsp:include page="headers.jsp" />
    </head>

<jsp:include page="navigation.jsp" />
        <div style="text-align:center">
        <p style = "color:#3c261e; font-size:20px;">Developers by projects page </p></div>
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
                <th scope="col">Project Name</th>
                <th scope="col">Developers</th>
             </tr>
            </thead>
            <tbody>
            <%
            Object[] projectDevelopers = (Object[]) request.getAttribute("projectDevelopers");
                for(Object objProjectDeveloper : projectDevelopers){
                model.ProjectDeveloper projectDeveloper = (model.ProjectDeveloper) objProjectDeveloper;
                %>

                <tr>
                    <td><%= projectDeveloper.getProject() %></td>
                    <td><%= projectDeveloper.getDeveloper()  %></td>
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