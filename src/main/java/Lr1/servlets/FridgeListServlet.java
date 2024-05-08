/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lr1.servlets;

import Lr1.model.Fridge;
import Lr1.model.Product;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 0
 */
@WebServlet(name = "FridgeListServlet", urlPatterns = {"/fridge"})
public class FridgeListServlet extends HttpServlet  {
    private Fridge fridgeObj = Fridge.getInstance();
    
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        response.setContentType("text/html");
        request.setAttribute("maxSize", fridgeObj.getMaxSizeFridge());
        request.setAttribute("fridge", fridgeObj.getFridge());
        request.getRequestDispatcher("fridgeList.jsp").forward(request, response);
//        response.setContentType("text/html;charset=UTF-8");
//        try (PrintWriter out = response.getWriter()) 
//        {
//            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Fridge</title>");
//            out.println("</head>");
//            out.println("<body>");
//
//            out.println("<table border=1>");
//            
//            out.println("<thead>");
//            out.println("<tr>");
//            out.println("<th>");
//            out.println("Название");
//            out.println("</th>");
//            
//            out.println("<th>");
//            out.println("Дата производства");
//            out.println("</th>");
//            
//            out.println("<th>");
//            out.println("Дата истечения срока годности");
//            out.println("</th>");
//            
//            out.println("</tr>");
//            out.println("</thead>");
//            
//            out.println("<tbody>");
//            
//            final List<Product> fridgeList = fridgeObj.getFridge();
//            int sizeFridge = fridgeList.size();
//            Product currentProduct = null;
//            for (int i = 1; i < sizeFridge; i++) 
//            {
//                currentProduct = fridgeList.get(i);
//                out.println("<tr>");
//                out.println("<td>");
//                if(currentProduct != null)
//                {
//                    out.println(currentProduct.getName());
//                    out.println(currentProduct.getStringProductionDate());
//                    out.println(currentProduct.getStringExpirationDate());
//                }
//                else
//                {
//                    out.println("Пусто");
//                    out.println("Пусто");
//                    out.println("Пусто");
//                }
//                
//                out.println("</td>");
//                out.println("</tr>");
//            }
//
//            out.println("</tbody>");
//            out.println("</table>");
//            out.println("</body>");
//            out.println("</html>");
//        }
    }

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
        processRequest(request, response);
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
        request.getRequestDispatcher("fridgeList.jsp").forward(request, response);
    }
}
