package com.example.fcauserano.activitiesejercitacion1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.lang.annotation.Target;

public class MainActivity extends AppCompatActivity {

    private String nombre;
    private String apellido;
    private String edad;
    private EditText editEdad;
    private EditText editNombre;
    private EditText editApellido;
    private Button botonEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editEdad = findViewById(R.id.editEdad);
        editNombre = findViewById(R.id.editNombre);
        editApellido = findViewById(R.id.editApellido);

        botonEnviar = findViewById(R.id.botonEnviar);

        botonEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nombre = editNombre.getText().toString();
                apellido = editApellido.getText().toString();
                edad = editEdad.getText().toString();

                Intent unIntent = new Intent(MainActivity.this, ReceptorActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString(ReceptorActivity.CLAVE_NOMBRE, nombre);
                bundle.putString(ReceptorActivity.CLAVE_APELLIDO, apellido);
                bundle.putString(ReceptorActivity.CLAVE_EDAD, edad);
                unIntent.putExtras(bundle);
                startActivity(unIntent);
            }
        });
    }

/*    public void OnClickEnviar(View view) {
        nombre = editNombre.getText().toString();
        apellido = editApellido.getText().toString();
        edad = editEdad.getText().toString();

        Intent unIntent = new Intent(MainActivity.this, ReceptorActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString(ReceptorActivity.CLAVE_NOMBRE, nombre);
        bundle.putString(ReceptorActivity.CLAVE_APELLIDO, apellido);
        bundle.putString(ReceptorActivity.CLAVE_EDAD, edad);
        unIntent.putExtras(bundle);
        startActivity(unIntent);
    }*/
}
