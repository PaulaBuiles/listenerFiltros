package com.example.listenerFiltros.filter;

import com.example.listenerFiltros.service.LoginService;
import com.example.listenerFiltros.service.impl.LoginServiceImpl;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Optional;

@WebFilter({"/url.jsp"})
public class PageFiltro implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        LoginService service = new LoginServiceImpl();
        Optional<String> username = service.getUsername((HttpServletRequest) servletRequest);
        if (username.isPresent()) {
            filterChain.doFilter(servletRequest, servletResponse);
        } else {
            ((HttpServletResponse)servletResponse).sendError(HttpServletResponse.SC_UNAUTHORIZED,
                    "No estás autorizado para ingresar a esta página!");
        }
    }
}
