<!DOCTYPE html>
<html>
<head>
   <jsp:include page="headers.jsp" />
    </head>

<jsp:include page="navigation.jsp" />
        <div style="text-align:center">
        <p style = "color:#3c261e; font-size:20px;">Salaries Page </p></div>
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
                <th scope="col">Salaries</th>
             </tr>
            </thead>
            <tbody>
            <%
            Object[] salaries = (Object[]) request.getAttribute("salaries");
                for(Object objSalary : salaries){
                model.Salary salary = (model.Salary) objSalary;
                %>

                <tr>
                    <td><%= salary.getName() %></td>
                    <td><%= salary.getSalaries()  %></td>
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