package com.netease;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.netease.Kitchen;

public class NoodlesServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();
        
        Logger logger = Logger.getLogger(NoodlesServlet.class.getName());
        
        String vegetable = request.getParameter("vegetable");
        String noodles = Kitchen.makeNoodles(vegetable);
        
        logger.info("面条中加的蔬菜为：" + vegetable);
        writer.println(noodles);
    }
}
