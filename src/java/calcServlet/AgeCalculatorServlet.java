package calcServlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AgeCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Load a JSP and forward to the browser
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
        return; // IMPORTANT! Stop the code call
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //Capture incoming age parameter as int
        String age = request.getParameter("age_entered");
        request.setAttribute("AgeEntered", age);
       
        if(age == null){
            String message = "You must give your current age";
            request.setAttribute("message", message);
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request,response);
        }
        
        try{
            int age_next;
            age_next = Integer.parseInt(age) + 1;
            String s = "Your age next birthday will be ";
            request.setAttribute("result", age_next);
            request.setAttribute("str", s);
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
        return; // IMPORTANT! Stop the code call
        }
        catch (NumberFormatException e){
            String error = "You must enter a number.";
            request.setAttribute("error", error);
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
        return; // IMPORTANT! Stop the code call
            
        }
       
        
    }
}
