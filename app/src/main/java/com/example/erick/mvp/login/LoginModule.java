package com.example.erick.mvp.login;

import dagger.Module;
import dagger.Provides;

@Module
public class LoginModule {

    @Provides
        public LoginActivityMPV.Presenter provideLoginActivityPresenter(LoginActivityMPV.Model model){
        return new LoginActivityPresenter(model);
        }

        @Provides
    public LoginActivityMPV.Model providesLoginActivityModel(LoginRepository repository){
        return new LoginActivityModel(repository);
        }

        @Provides
        public LoginRepository provideLoginRepository(){
        return new MemoryRepository();
        }


}
