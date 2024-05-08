/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Lr1.servlets;

import Lr1.model.Fridge;
import Lr1.model.Product;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 0
 */
@WebServlet(name = "PutProductServlet", urlPatterns = {"/put"})
public class PutProductServlet extends HttpServlet {
    private Fridge fridgeObj = Fridge.getInstance();
  
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        request.getRequestDispatcher("put.jsp").forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("name");
        String productionDate = request.getParameter("productionDate");
        String expirationDate = request.getParameter("expirationDate");
        Product product = null;
        try {
            product = new Product(name,productionDate, expirationDate);
        } catch (ParseException ex) {
            Logger.getLogger(PutProductServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(fridgeObj.putProduct(product))
        {
            request.setAttribute("fridge", fridgeObj.getFridge());
            response.sendRedirect("/fridge");
        }
        else
        {
            request.setAttribute("maxSize", fridgeObj.getMaxSizeFridge());
            request.getRequestDispatcher("errorFridgeIsFull.jsp").forward(request, response);
        }
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
