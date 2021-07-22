package service;

import entity.User;
import entity.model.MessageModel;
import mapping.usermapping;
import org.apache.ibatis.session.SqlSession;
import util.GetSqlSession;


import javax.servlet.annotation.WebServlet;


@WebServlet
public class UserService {
    public MessageModel login(String username, String password) {
        MessageModel messageModel = new MessageModel();
        User u = new User();
        u.setPassword(password);
        u.setUsername(username);
        messageModel.setObject(u);
        if (username.equals("") || password.equals("")) {
            messageModel.setCode(0);
            messageModel.setMsg("用户名和密码不能为空！");

            return messageModel;
        }

        SqlSession session = GetSqlSession.createSqlSession();
        usermapping mapper = session.getMapper(usermapping.class);
        User user = mapper.queryByName(username);

        if (user == null) {
            messageModel.setCode(0);
            messageModel.setMsg("用户名错误！");
        } else if (!user.password.equals(password)) {
            messageModel.setCode(0);
            messageModel.setMsg("密码错误！");
        }

        return messageModel;
    }

    public MessageModel register(String username, String password) {
        MessageModel messageModel = new MessageModel();
        User u = new User();
        u.setPassword(password);
        u.setUsername(username);
        messageModel.setObject(u);
        if (username.equals("") || password.equals("")) {
            messageModel.setCode(0);
            messageModel.setMsg("用户名和密码不能为空！");
            return messageModel;
        }

        SqlSession session = GetSqlSession.createSqlSession();
        usermapping mapper = session.getMapper(usermapping.class);
        User user = mapper.queryByName(username);
        if (user != null) {
            messageModel.setCode(0);
            messageModel.setMsg("用户名已存在！");
        } else {
            System.out.println(0);
            messageModel.setMsg("注册成功！");
            System.out.println(111);
            SqlSession session2 = GetSqlSession.createSqlSession();
            System.out.println(222);
            usermapping mapper2 = session2.getMapper(usermapping.class);
            System.out.println(333);
            System.out.println(username);
            System.out.println(password);
            mapper2.reg(u);
            System.out.println(777);
        }

        return messageModel;
    }

//    public MessageModel modifyName(String username) {
//        MessageModel messageModel = new MessageModel();
//        User u = new User();
//        u.setUsername(username);
//        messageModel.setObject(u);
//
//        SqlSession session = GetSqlSession.createSqlSession();
//        usermapping mapper = session.getMapper(usermapping.class);
//        mapper.modifyName(username);
//
//        return messageModel;
//    }
}
