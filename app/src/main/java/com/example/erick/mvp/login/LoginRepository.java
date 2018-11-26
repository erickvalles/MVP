package com.example.erick.mvp.login;

public interface LoginRepository {

    void saveUser(User user);
    User getUser();

}
