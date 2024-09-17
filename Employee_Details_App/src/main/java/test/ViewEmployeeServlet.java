package test;
import java.io.*;
import java.util.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
@WebServlet("/view")
public class ViewEmployeeServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;

	@Override
	 protected void doGet(HttpServletRequest req,HttpServletResponse res)throws
	 ServletException,IOException{
	 ViewEmployeeDAO ved = new ViewEmployeeDAO();
	 ArrayList<EmployeeBean> al = ved.retrieve();
	 req.setAttribute("alist", al);//Adding Attribute to request Object
	 RequestDispatcher rd = req.getRequestDispatcher("ViewEmployee.jsp");
	 rd.forward(req, res);
	 }
}
