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
public class ArithmeticCalculator extends HttpServlet {



 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request,response);
        return;
        

    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String first=request.getParameter("firstno");
        String second=request.getParameter("secondno");
        String calculation=request.getParameter("calculate");
  
        String message="";
        
        int num1=Integer.parseInt(first);
        int num2=Integer.parseInt(second);
        int result=0;
       
        if(first==null||first.equals("")||second==null || second.equals("")){
            message="Result:--";
        
        }
            
            else{
           
                    if(calculation.equals("+")){
                        result=num1+num2;
                        message="Result:" + result;
                    }
                    else if (calculation.equals("-")){
                        result=num1-num2;
                        message="Result:" + result;
                    }
                   else if(calculation.equals("*")){
                        result=num1*num2;
                        message="Result:" + result;
                    }
                    else if(calculation.equals("%")){
                        result=num1%num2;
                        message="Result:" + result;
                    }
            }
                  
            
            
               request.setAttribute("message",message);     
            
            
             getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request,response);
        return;
        }
       
        
        
    }

   

