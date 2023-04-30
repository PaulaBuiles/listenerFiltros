package com.example.listenerFiltros.servlet;

import com.example.listenerFiltros.model.Producto;
import com.example.listenerFiltros.service.ProductService;
import com.example.listenerFiltros.service.impl.ProductServiceImpl;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ProductById", value = "/id-servlet")
public class ProductById extends HttpServlet {

    ProductService productService = new ProductServiceImpl();
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Long id = Long.valueOf(req.getParameter("id"));
        Producto product = productService.getProductById(id);
        if(product == null){
            resp.sendError(HttpServletResponse.SC_NOT_FOUND);
            System.out.println("No funciona");
        }else {
            resp.setContentType("text/html");
            PrintWriter out = resp.getWriter();
            out.println("<html>");
            out.println("<head><title>Buscar producto</title></head>");
            out.println("<body>");
            out.println("<h1>!Producto encontrado¡</h1>");
            out.println("<h2>Detalles del producto:</h2>");
            out.println("<p>ID: " + id + "</p>");
            out.println("<p>Nombre: " + product.getName() + "</p>");
            out.println("</body></html>");
        }
    }
}

