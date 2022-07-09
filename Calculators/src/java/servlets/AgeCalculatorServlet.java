/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author parve
 */
public class AgeCalculatorServlet extends HttpServlet {

   
  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
          getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request,response);
          return;
        
        
        
      
    
    }
 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

         String age=request.getParameter("age");
  
        
        if(age==null || age.equals("")){
            String message ="Please enter your current age";
            request.setAttribute("message",message);
        }
  
        else
        {
            int num = Integer.parseInt(age)+1;
            String message="Your next age birthday will be " + num+ " !";
            request.setAttribute("message",message);
            
        }
       
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request,response);
        
        return;
        
    }


}
