package test;

import java.io.IOException;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/remove")
public class RemoveEmployeeServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String empId = req.getParameter("eId");  
        System.out.println("Removing employee with ID: " + empId);  // Debugging

        RemoveEmployeeDAO removeDao = new RemoveEmployeeDAO();
        
        // Get the employee name before deletion
        String employeeName = removeDao.getEmployeeNameById(empId);

        // Remove the employee and store the result
        int result = removeDao.removeEmployee(empId);

        if (result > 0) {
            
            req.setAttribute("message", employeeName + "'s details have been deleted Successfully.");
        } else {
            req.setAttribute("message", "Failed to remove employee.");
        }

        RequestDispatcher rd = req.getRequestDispatcher("ViewEmployee.jsp");
        rd.forward(req, res);
    }
}
