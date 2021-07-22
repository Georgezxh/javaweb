package service;

import entity.User;
import mapping.usermapping;
import org.apache.ibatis.session.SqlSession;
import util.GetSqlSession;

public class Check {
    public boolean match(String username, String password) {
        SqlSession session = GetSqlSession.createSqlSession();

        usermapping mapper = session.getMapper(usermapping.class);

        User user = mapper.queryByName(username);

        if (user == null) {
            return false;
        } else if (user.username.equals(username) && user.password.equals(password)) {
            return true;
        } else
            return false;
    }
}
