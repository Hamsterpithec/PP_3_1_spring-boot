package PP_3_1_springboot.PP_3_1_springboot.dao;


import PP_3_1_springboot.PP_3_1_springboot.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();
    User findById(Long id);
    void addUser(User user);
    void deleteUser(long id);
    void updateUser(User user);

}
