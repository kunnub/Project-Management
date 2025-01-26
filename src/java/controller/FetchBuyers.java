/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Buyers;
import model.GetBuyers;

/**
 *
 * @author HP
 */
public class FetchBuyers extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
          GetBuyers buyerDetails = new GetBuyers();
        List<Buyers> buyerList = buyerDetails.getBuyers();
        
//        for(Buyers buyer:buyerList)
//        System.out.println("jsp page requirement :" + buyer.getRequirement());


        System.out.println("Fetched project list size: " + (buyerList != null ? buyerList.size() : "null"));

        request.setAttribute("buyerList", buyerList);
        System.out.println(buyerList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("buyers.jsp");
        dispatcher.forward(request, response);
       
    }
}
