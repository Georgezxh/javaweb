package mapping;

import entity.User;

import java.util.List;

public interface usermapping {
//    public List<User> selectuser();
    public User queryByName(String username);
//    public void modifyName(String username);
    public void reg(User user);
}
