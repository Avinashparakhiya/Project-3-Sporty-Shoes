package com.example.sportyshoes.dao;

import com.example.sportyshoes.model.Users;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class UsersDaoImpl implements UsersDaoCustom {

    @Autowired
    private UsersDao usersDao;


    @Override
    public List<Users> getAllUsers() {

        List<Users> users = (List<Users>) usersDao.findAll();

        return users;
    }

    @Override
    public boolean validateUser(String u, String p) {
        List<Users> user = getAllUsers();
        Users userData = new Users();
        for (Users uid : user) {
            String un = uid.getLoginId();
            String up = uid.getPassword();
            if (un.equals(u)) {
                if (up.equals(p)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public Users getUser(String lid) {
        return usersDao.findByLoginId(lid);
    }

    @Override
    public boolean updateUser(String lid, String upw, String uemail, String uphone) {
        Users user = usersDao.findByLoginId(lid);
        user.setEmail(uemail);
        user.setPassword(upw);
        user.setPhone(uphone);

        usersDao.save(user);

        return true;
    }

    @Override
    public boolean addUser(Users user) {
        usersDao.save(user);
        return true;
    }

}
