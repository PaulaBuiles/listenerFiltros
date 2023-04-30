package com.example.listenerFiltros.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "Servlet", urlPatterns = "/http-request")
public class Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //Nos indica el metodo que estamos usando en el servlet que en este caso es un "GET"
        String metodoHttp = req.getMethod();
        //Nos trae la url sin el esquema y sin el host o ip
        String requestUri = req.getRequestURI();
        //Nos trae la url completa de el servidor http con el nombre de el servidor
        String requestUrl = req.getRequestURL().toString();
        //Obtiene el contexto de la aplicación web que maneja la solicitud HTTP actual y lo almacena en la variable contexPath.
        String contexPath = req.getContextPath();
        //Obtiene la ruta de acceso del servlet que está manejando la solicitud HTTP actual y lo almacena en la variable servletPath.
        String servletPath = req.getServletPath();
        //Nos indica cual es la ip de el cliente
        String ipCliente = req.getRemoteAddr();
        //Nos indica la ip de el servidor http
        String ip = req.getLocalAddr();
        //Nos dice cual es el puerto que estamos utilizando
        int port = req.getLocalPort();
        //Nos indica que protocolo se esta utilizando y en este caso es Http
        String scheme = req.getScheme();
        //Identifica el nombre del servidor al que se dirige la solicitud. Por lo tanto, la variable host contendrá una cadena que representa el nombre del servidor al que se dirige la solicitud HTTP actual.
        String host = req.getHeader("host");
        //URL de el servidor con el HOST
        String url = scheme + "://" + host + contexPath + servletPath;
        //URL de el servidor con la direccion IP
        String url2 = scheme + "://" + ip + ":" + port + contexPath + servletPath;
        System.out.println(url + "-------- " + url2);
        System.out.println(requestUrl);
        System.out.println(requestUri);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("login.jsp");
    }
}
