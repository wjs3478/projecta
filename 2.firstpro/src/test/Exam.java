package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Exam
 */
@WebServlet("/baka")	//어노테이션, url 매핑
public class Exam extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Exam() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		
		PrintWriter out = response.getWriter();
		String name=request.getParameter("na");
		String id=request.getParameter("id");
		String pwd=request.getParameter("pwd");
				
		out.print("hello get<br>");
		out.print(name+"<br>");
		out.print(id+"<br>");
		out.print(pwd+"<br>");
		//서블릿 서버+애플릿
		//웹을 위한 자바 클래스
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		String name=request.getParameter("na");
		String id=request.getParameter("id");
		String pwd=request.getParameter("pwd");
				
		out.print("hello post<br>");
		out.print(name+"<br>");
		out.print(id+"<br>");
		out.print(pwd+"<br>");
	}

}
