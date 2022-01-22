package com.example.sportyshoes.dao;

import com.example.sportyshoes.model.Users;

import java.util.List;

public interface UsersDaoCustom {
    public List<Users> getAllUsers();

    public boolean validateUser(String u, String p);

    public Users getUser(String lid);

    public boolean updateUser(String lid, String upw, String uemail, String uphone);

    public boolean addUser(Users user);
}
