package exam.test;

//서블릿
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Test
 */
@WebServlet("/zzzz")
public class Test extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Test() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		String ma=request.getParameter("gg");
		String na=request.getParameter("na");
		String co=request.getParameter("co");
		String em=request.getParameter("em");
		String[] che=request.getParameterValues("cv");
		String min=request.getParameter("min");
		String su=request.getParameter("txt");
				
		PrintWriter out=response.getWriter();
		out.print(na+"<br>");
		out.print(ma+"<br>"); //1이 남자 2가 여자
		out.print("<font color='"+co+"'>"+co+"</font><br>"); //1이 남자 2가 여자
		out.print(em+"<br>"); //1이 남자 2가 여자
		out.print(min+"<br>"); //1이 남자 2가 여자
		
		
		if(che==null)
		{
			out.print("select please<br>");
		}else{
		
			for(int i=0;i<che.length;i++)
			{
			out.print(che[i]+"<br>"); //1이 남자 2가 여자
			}
		}
		
		out.print(su+"<br>"); //1이 남자 2가 여자
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
