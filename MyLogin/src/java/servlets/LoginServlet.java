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
import javax.servlet.http.HttpSession;
import service.AccountService;


public class LoginServlet extends HttpServlet {
     


   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
   
        HttpSession session=request.getSession();
        session.setAttribute("sessionAttribute","You Successfully logged in!");
        
        

      
        
        
        String operate = request.getParameter("operate");
        
        if( operate != null && operate.equals("Logout") ){
            session.invalidate();
            session.setAttribute("sessionAttribute","You have Successfully logged out!");
            
                 getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request,response);
           
 
        return;
        }
       else
              session.setAttribute("sessionAttribute","You have Successfully logged in!");
        
        
           getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request,response);
           
 
        return;
        
       
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //capturing incoming parameters
        String username=request.getParameter("username");
        String password = request.getParameter("password");
        
        request.setAttribute("username",username);
        request.setAttribute("password",password);
        
        
        AccountService accountservice= new AccountService();
        
        if(accountservice.login(username,password)==null){
             String message = "Authentication Failed";
            request.setAttribute("message",message);
             getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request,response);
        return;
        
            
        
        }
                
                
        
        //validation
        if(username==null || username.equals("")||password == null || password.equals("")){
            String message = "Please enter the username or password";
            request.setAttribute("message",message);
        
            
         
            
             getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request,response);
        return;
            
        }
        
         getServletContext().getRequestDispatcher("/WEB-INF/home.jsp").forward(request,response);
        return;
        
       
    }

   

}
