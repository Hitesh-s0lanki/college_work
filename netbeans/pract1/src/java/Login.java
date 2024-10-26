import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        PrintWriter out = response.getWriter();
        
        try {
            String Username = "Hitesh";
            String password = "hitesh123";
            
            if(request.getParameter("username").equals(Username) && request.getParameter("username").equals(password)){
                   out.println("Hello");
            }else{
                out.println("Login Failed");
            }
        }catch(Exception e){
            out.println("Not valid");
        }
    }
}
