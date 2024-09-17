<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="java.util.*, test.EmployeeBean"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Employee List</title>
    <link rel="stylesheet" type="text/css" href="styles.css">
    <script type="text/javascript">
        function confirmDelete(empId) {
            if (confirm("Are you sure you want to remove this employee?")) {
                window.location.href = "remove?eId=" + empId;
            }
        }
    </script>
</head>
<body>
    <h1>Employee List</h1>

    <!-- Display message after employee deletion -->
    <%
        String message = (String) request.getAttribute("message");
        if (message != null) {
    %>
        <div class="alert">
            <%= message %>
        </div>
    <%
        }
    %>

    <%
        Object obj = request.getAttribute("alist");
        if (obj instanceof ArrayList) {
            ArrayList<?> tempList = (ArrayList<?>) obj;
            if (!tempList.isEmpty() && tempList.get(0) instanceof EmployeeBean) {
                ArrayList<EmployeeBean> al = (ArrayList<EmployeeBean>) tempList;
                if (!al.isEmpty()) {
    %>
    <table class="employee-table">
        <tr>
            <th>Employee ID</th>
            <th>Name</th>
            <th>Designation</th>
            <th>Basic Salary</th>
            <th>HRA</th>
            <th>DA</th>
            <th>Total Salary</th>
            <th>Action</th>
        </tr>
        <%
            for (EmployeeBean eb : al) {
        %>
        <tr>
            <td><%= eb.geteId() %></td> <!-- Assuming this fetches the Employee ID (String) -->
            <td><%= eb.geteName() %></td>
            <td><%= eb.geteDesg() %></td>
            <td><%= eb.getbSal() %></td>
            <td><%= eb.getHra() %></td>
            <td><%= eb.getDa() %></td>
            <td><%= eb.getTotSal() %></td>
            <td>
                <!-- Pass the employee ID to the confirmDelete() function -->
                <button onclick="confirmDelete('<%= eb.geteId() %>')">Remove</button>
            </td>
        </tr>
        <%
            }
        %>
    </table>
    <%
                } else {
                    out.println("No employee data available.");
                }
            } else {
                out.println("The list does not contain EmployeeBean objects.");
            }
        } else {
            out.println("");
        }
    %>

</body>
</html>
