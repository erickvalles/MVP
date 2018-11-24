package com.example.erick.mvp.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.erick.mvp.R;
import com.example.erick.mvp.root.App;

public class MainActivity extends AppCompatActivity {

    EditText nombre, apellido;
    Button boton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((App) getApplication()).getComponent().inject(this);
        nombre = findViewById(R.id.edit_text_nombre);
        apellido = findViewById(R.id.edit_text_apellido);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}
