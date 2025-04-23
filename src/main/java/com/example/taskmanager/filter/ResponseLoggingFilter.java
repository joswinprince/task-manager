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
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
@WebFilter("/*")
public class ResponseLoggingFilter implements Filter {

    private static final Logger logger = LoggerFactory.getLogger(ResponseLoggingFilter.class);

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {}

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {

        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpServletResponse httpResponse = (HttpServletResponse) response;

        // Log the request details
        logger.info("Request: {} {}", httpRequest.getMethod(), httpRequest.getRequestURI());

        // Continue with the chain
        chain.doFilter(request, response);

        // Log the response status
        logger.info("Response Status: {}", httpResponse.getStatus());
    }

    @Override
    public void destroy() {}
}
