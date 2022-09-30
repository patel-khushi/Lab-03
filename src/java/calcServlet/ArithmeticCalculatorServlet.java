
package calcServlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("result", "---");
        // Load a JSP and forward to the browser
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        return; // IMPORTANT! Stop the code call
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //Capture incoming age parameter as int
        String firstarithmetic = request.getParameter("first_arithmetic");
        String secondarithmetic = request.getParameter("second_arithmetic");
        String calc = request.getParameter("calc_arithmetic");
      
        request.setAttribute("FirstEntered", firstarithmetic);
        request.setAttribute("SecondEntered", secondarithmetic);
       
        if(firstarithmetic.equals("") || secondarithmetic.equals("")){
            request.setAttribute("result", " invalid");
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request,response);
            return;
        }
        
        try {
            int first =   Integer.parseInt(firstarithmetic);
            int second =   Integer.parseInt(secondarithmetic);
            
            if(calc.equals("+")){
                request.setAttribute("result", first + second);                
            }
            else if(calc.equals("-")){
                request.setAttribute("result", first - second); 
            }
            else if(calc.equals("*")){
                request.setAttribute("result", first * second); 
            }
            else if(calc.equals("%")) {
                request.setAttribute("result", first % second); 
            }
            else {
                 request.setAttribute("result", "Invalid");
            }
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request,response);
            return; // IMPORTANT! Stop the code call
        }
        catch (NumberFormatException e){
            String error = "Invalid";
            request.setAttribute("error", error);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        return; // IMPORTANT! Stop the code call
           
        }
        
    }
}
