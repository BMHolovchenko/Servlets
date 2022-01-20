<!DOCTYPE html>
<html>
<head>
   <jsp:include page="headers.jsp" />
    </head>

<jsp:include page="navigation.jsp" />
        <div style="text-align:center">
        <p style = "color:#3c261e; font-size:20px;">Projects Info</p></div>
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
                <th scope="col">Date</th>
                <th scope="col">Project</th>
                <th scope="col">Developers</th>
             </tr>
            </thead>
            <tbody>
            <%
            Object[] projectsInfo = (Object[]) request.getAttribute("projectsInfo");
                for(Object objProjectInfo : projectsInfo){
                model.ProjectInfo projectInfo = (model.ProjectInfo) objProjectInfo;
                %>

                <tr>
                    <td><%= projectInfo.getDate() %></td>
                    <td><%= projectInfo.getProject()  %></td>
                    <td><%= projectInfo.getDevelopers()  %></td>
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