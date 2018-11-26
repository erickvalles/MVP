package com.example.erick.mvp.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.erick.mvp.R;
import com.example.erick.mvp.root.App;

import javax.inject.Inject;

public class LoginActivity extends AppCompatActivity implements LoginActivityMPV.View{

    @Inject
            LoginActivityMPV.Presenter presenter;

    EditText nombre, apellido;
    Button boton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((App) getApplication()).getComponent().inject(this);



        nombre = findViewById(R.id.edit_text_nombre);
        apellido = findViewById(R.id.edit_text_apellido);
        boton = findViewById(R.id.button_login);


        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                presenter.loginButtonClicked();
            }
        });

    }

    @Override
    protected void onResume() {
        super.onResume();
        presenter.setView(this);
        presenter.getCurrentUser();
    }

    @Override
    public String getFirstName() {
        return this.nombre.getText().toString();
    }

    @Override
    public String getLastName() {
        return this.apellido.getText().toString();
    }

    @Override
    public void showUserNotAvailable() {
        Toast.makeText(this,"Error, usuario no disponible",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showInputError() {
        Toast.makeText(this,"Error, el nombre ni el apellido no pueden estar vacíos",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showUserSaved() {
        Toast.makeText(this,"Usuario guardado correctamente",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void setFirstName(String firstName) {
        this.nombre.setText(firstName);
    }

    @Override
    public void setLastName(String lastName) {
        this.apellido.setText(lastName);
    }
}
