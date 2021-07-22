package controller;

import entity.model.MessageModel;
import service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet
public class UserServlet extends HttpServlet {
    UserService userService = new UserService();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        MessageModel messageModel = userService.login(username, password);
        req.getSession().setAttribute("messageModel", messageModel);
        if (messageModel.code == 1) {
            resp.sendRedirect("success.jsp");
        }else {
            req.getRequestDispatcher("login.jsp").forward(req,resp);
        }
    }

    protected void register(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        MessageModel messageModel = userService.register(username,password);
        req.getSession().setAttribute("messageModel", messageModel);
        if (messageModel.code == 1) {
            resp.sendRedirect("success.jsp");
        }else {
            req.getRequestDispatcher("register.jsp").forward(req,resp);
        }
    }

//    @Override
//    protected void logout(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
////        String username = req.getParameter("username");
////        String password = req.getParameter("password");
//        req.getSession().removeAttribute("messageModel");
//        req.getSession().setAttribute("messageModel", messageModel);
//        if (messageModel.code == 1) {
//            resp.sendRedirect("success.jsp");
//        }else {
//            req.getSession().setAttribute("messageModel",messageModel);
//            req.getRequestDispatcher("login.jsp").forward(req,resp);
//        }
    }



