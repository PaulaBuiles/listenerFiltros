package com.example.listenerFiltros.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "ListenerServlet", value = "/http-listener")
public class ListenerServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String mensajeRequest = (String) req.getAttribute("mensaje");
        String mensajeApp = (String) getServletContext().getAttribute("mensaje");

        System.out.println(mensajeRequest);
        System.out.println(mensajeApp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }


}

