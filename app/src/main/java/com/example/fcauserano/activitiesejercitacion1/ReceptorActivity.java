package com.example.fcauserano.activitiesejercitacion1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ReceptorActivity extends AppCompatActivity {

    public static final String CLAVE_NOMBRE = "clave nombre";
    public static final String CLAVE_APELLIDO = "clave apellido";
    public static final String CLAVE_EDAD = "clave edad";
    private String nombreRecibido;
    private String apellidoRecibido;
    private String edadRecibida;
    private TextView textNombre;
    private TextView textApellido;
    private TextView textEdad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receptor);

        Intent intentRecibido = getIntent();
        Bundle bundleRecibido = intentRecibido.getExtras();
        nombreRecibido = bundleRecibido.getString(CLAVE_NOMBRE);
        apellidoRecibido = bundleRecibido.getString(CLAVE_APELLIDO);
        edadRecibida = bundleRecibido.getString(CLAVE_EDAD);

        textNombre = findViewById(R.id.textNombreRecibido);
        textApellido = findViewById(R.id.textApellidoRecibido);
        textEdad = findViewById(R.id.textEdadRecibida);

        textNombre.setText(nombreRecibido);
        textApellido.setText(apellidoRecibido);
        textEdad.setText(edadRecibida);
    }
}
