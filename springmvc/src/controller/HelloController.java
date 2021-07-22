package controller;

import entity.User;
import mapping.usermapping;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import util.GetSqlSession;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@Controller
public class HelloController {

//    @RequestMapping("/hello")
//    public ModelAndView handleRequest(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse) throws Exception {
//        ModelAndView mav = new ModelAndView("login.jsp");
//        mav.addObject("message", "Hello Spring MVC");
//        return mav;
//    }
//    UserServlet u=new UserServlet();
    @RequestMapping("/login")
    public ModelAndView login(HttpServletRequest request,
                              HttpServletResponse response) throws IOException, ServletException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        UserServlet u=new UserServlet();
        u.service(request,response);
        return null;
    }

    @RequestMapping("/register")
    public ModelAndView register(HttpServletRequest request,
                                 HttpServletResponse response) throws IOException, ServletException {
        UserServlet u=new UserServlet();
        u.register(request,response);
//        u.service(request,response);
        return null;
    }

    @RequestMapping("/logout")
    public String login(HttpSession session,HttpServletRequest request,
                        HttpServletResponse response ){
        UserServlet u=new UserServlet();
        session.removeAttribute("messageModel");
        return "login";
    }
//    @RequestMapping("/goOut")
//    public String logout(HttpSession session ,HttpServletRequest request,
//                        HttpServletResponse response) throws ServletException, IOException {
////        UserServlet u=new UserServlet();
//        u.logout(request,response);
////        session.removeAttribute("messageModel");
//        return "login";
//    }
}