package com.sunil;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SqServlet extends HttpServlet {

public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	int k=Integer.parseInt(req.getParameter("k"));
	k=k*k;
	resp.getWriter().println("square:"+k);
}
}
