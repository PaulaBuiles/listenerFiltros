package com.example.listenerFiltros.servlet;


import com.example.listenerFiltros.service.LoginService;
import com.example.listenerFiltros.service.impl.LoginServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Optional;

@WebServlet(name = "LoginServlet", urlPatterns = "/http-login")
public class LoginServlet extends HttpServlet {
    final static String USERNAME = "admin";
    final static String PASSWORD = "12345";
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        if (USERNAME.equals(username) && PASSWORD.equals(password)) {
            Cookie usernameCookie = new Cookie("username", username);
            resp.addCookie(usernameCookie);
            resp.setContentType("text/html;charset=UTF-8");
            HttpSession session = req.getSession();
            session.setAttribute("username", username);
            /*resp.sendRedirect(req.getContextPath() + "/login.jsp");*/
            resp.setContentType("text/html;charset=UTF-8");
            try (PrintWriter out = resp.getWriter()) {
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println(" <head>");
                out.println(" <meta charset=\"UTF-8\">");
                out.println(" <title>Login correcto</title>");
                out.println(" </head>");
                out.println(" <body>");
                out.println(" <h1>Login correcto!</h1>");
                out.println(" <h3>Hola "+ username + " has iniciado sesión con éxito!</h3>");
                out.println("<a href=\"url.jsp\">Ir a las url</a></br>");
                out.println(" </body>");
                out.println("</html>");
            }
        } else {

            resp.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Lo sentimos no esta autorizado para ingresar a esta página!");
        }
    }

       /* String username = req.getParameter("username");
        String password = req.getParameter("password");
        if (USERNAME.equals(username) && PASSWORD.equals(password)) {
            Cookie usernameCookie = new Cookie("username", username);
            resp.addCookie(usernameCookie);
          *//*  resp.sendRedirect(req.getContextPath() + "/login.html");*//*
            resp.setContentType("text/html;charset=UTF-8");
            try (PrintWriter out = resp.getWriter()) {
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println(" <head>");
                out.println(" <meta charset=\"UTF-8\">");
                out.println(" <title>Login correcto</title>");
                out.println(" </head>");
                out.println(" <body>");
                out.println(" <h1>Login correcto!</h1>");
                out.println(" <h3>Hola "+ username + " has iniciado sesión con éxito!</h3>");
                out.println(" </body>");
                out.println("</html>");
            }
        } else {
            //Se probró el eroor 401 y funciona correctamente
            resp.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Lo sentimos no esta autorizado para ingresar a esta página!");
        }}*/


    //En este momento en el jsp estamos usando el metodo post, si se quiere volver a ver la configuracion del get, debemos cambiarla en el jsp. (al igual que la url a http-login)
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException {
        LoginService auth = new LoginServiceImpl();
        Optional<String> cookieOptional = auth.getUsername(req);
        System.out.println(cookieOptional);
        if (cookieOptional.isPresent()) {
            System.out.println("hola");
            resp.setContentType("text/html;charset=UTF-8");
            try (PrintWriter out = resp.getWriter()) {
                System.out.println("hola 2");
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println(" <head>");
                out.println(" <meta charset=\"UTF-8\">");
                out.println(" <title>Hola " + cookieOptional.get() +
                        "</title>");
                out.println(" </head>");
                out.println(" <body>");
                out.println(" <h1>Hola " + cookieOptional.get() + " has iniciado sesión con éxito!</h1>");
                out.println("<p><a href='" + req.getContextPath() +
                        "/login.jsp'>volver</a></p>");
                out.println("<p><a href='" + req.getContextPath() +
                        "/index.jsp'>cerrar sesión</a></p>");
                out.println(" </body>");
                out.println("</html>");
            }
        } else {
            getServletContext().getRequestDispatcher("/login.jsp").forward(req, resp);
        }
    }
}
