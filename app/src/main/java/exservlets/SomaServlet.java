package exservlets;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name="SomaServlet", urlPatterns = "/soma")
public class SomaServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
    throws ServletException, IOException{
        request.getRequestDispatcher("/soma.jsp").forward(request, response);
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
    throws ServletException, IOException{
       int numero = Integer.parseInt(request.getParameter("numero"));
       int numero2 = Integer.parseInt(request.getParameter("numero2"));
       int resultado;
       resultado = numero + numero2;
       request.setAttribute("Resultado", resultado);

       request.getRequestDispatcher("/soma.jsp").forward(request, response);
    }
}

