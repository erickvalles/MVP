package com.example.erick.mvp.login;

import android.support.annotation.Nullable;

public class LoginActivityPresenter implements LoginActivityMPV.Presenter {

    @Nullable
    private LoginActivityMPV.View view;
    private LoginActivityMPV.Model model;

    public LoginActivityPresenter(LoginActivityMPV.Model model){
        this.model = model;
    }

    @Override
    public void setView(LoginActivityMPV.View view) {
        this.view = view;
    }

    @Override
    public void loginButtonClicked() {
        if(view != null){
            if (view.getLastName().trim().equals("") || view.getLastName().trim().equals("")){
                view.showInputError();
            }else{
                model.createUser(view.getFirstName().trim(),view.getLastName().trim());
                view.showUserSaved();
            }
        }
    }

    @Override
    public void getCurrentUser() {
        User user = model.getUser();

        if(user==null){
            if(view!=null){
                view.showUserNotAvailable();
            }
        }else{
            if(view!=null){
                view.setFirstName(user.getFirstName());
                view.setLastName(user.getLastName());
            }
        }
    }
}
