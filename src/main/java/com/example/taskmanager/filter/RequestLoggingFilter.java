package com.example.taskmanager.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import java.io.IOException;

@Component
@WebFilter("/*")  // Intercepts all requests
public class RequestLoggingFilter implements Filter {

    private static final Logger logger = LoggerFactory.getLogger(RequestLoggingFilter.class);

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        // Initialization logic (if needed)
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {

        // Log the request details
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        logger.info("Incoming Request: {} {}", httpRequest.getMethod(), httpRequest.getRequestURI());

        // Continue with the request-response chain
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        // Clean-up logic (if needed)
    }
}
