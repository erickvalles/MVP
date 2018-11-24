package com.example.erick.mvp.root;
import com.example.erick.mvp.login.MainActivity;

import dagger.Component;


@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(MainActivity target);

}
