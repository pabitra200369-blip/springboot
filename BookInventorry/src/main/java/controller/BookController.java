package controller;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
@WebServlet("/resister")
public class BookController extends HttpServlet {
    @Override
    protected void  doPost(HttpServletRequest req, HttpServletResponse resp)throws ServletException,IOException{
        String name = req.getParameter("username");
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        System.out.println(name +""+ email+""+password);
        resp.getWriter().println("success");
        resp.sendRedirect("login.html");
    }
}