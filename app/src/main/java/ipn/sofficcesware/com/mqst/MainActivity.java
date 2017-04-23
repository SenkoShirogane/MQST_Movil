package ipn.sofficcesware.com.mqst;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import ipn.sofficcesware.com.mqst.administrador.Administrador;
import ipn.sofficcesware.com.mqst.cliente.Cliente;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button IniciarSesion, Limpiar, IniciarSesion2;
    EditText Usuario, Contrasena;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        IniciarSesion = (Button) findViewById(R.id.btnIniciarSesion);
        IniciarSesion.setOnClickListener(this);
        IniciarSesion2 = (Button) findViewById(R.id.btnIniciarSesion2);
        IniciarSesion2.setOnClickListener(this);
        Limpiar = (Button) findViewById(R.id.btnLimpiarLogin);
        Limpiar.setOnClickListener(this);

        Usuario = (EditText) findViewById(R.id.usuarioLogin);
        Contrasena = (EditText) findViewById(R.id.contrasenaLogin);
    }

    @Override
    public void onClick(View v) {
        String usuario = Usuario.getText().toString();
        String contrasena = Contrasena.getText().toString();

        switch(v.getId()){
            case R.id.btnIniciarSesion:
                Intent intento1 = new Intent(MainActivity.this, Cliente.class);
                startActivity(intento1);
                break;
            case R.id.btnIniciarSesion2:
                Intent intento2 = new Intent(MainActivity.this, Administrador.class);
                startActivity(intento2);
                break;
            case R.id.btnLimpiarLogin:
                Usuario.setText("");
                Contrasena.setText("");
                break;
        }
    }
}
