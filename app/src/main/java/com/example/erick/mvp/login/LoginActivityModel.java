package com.example.erick.mvp.login;

import javax.inject.Inject;

public class LoginActivityModel implements LoginActivityMPV.Model {

    private LoginRepository repository;

    public LoginActivityModel(LoginRepository repository){
        this.repository = repository;
    }

    @Override
    public void createUser(String firstName, String lastName) {

        //lógica de business, validaciones, etc.

        repository.saveUser(new User(firstName,lastName));

    }

    @Override
    public User getUser() {
        return repository.getUser();
    }
}
