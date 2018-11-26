package com.example.erick.mvp.root;
import com.example.erick.mvp.login.LoginActivity;
import com.example.erick.mvp.login.LoginModule;

import dagger.Component;


@Component(modules = {ApplicationModule.class, LoginModule.class})
public interface ApplicationComponent {

    void inject(LoginActivity target);

}
