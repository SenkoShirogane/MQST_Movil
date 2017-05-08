package ipn.sofficcesware.com.mqst.cliente;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import ipn.sofficcesware.com.mqst.R;

public class ContactanosActivity extends AppCompatActivity implements View.OnClickListener{
    EditText usuario, mensaje;
    Button limpiar, aceptar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contactanos);

        usuario = (EditText) findViewById(R.id.edit_UsuarioContacto);
        mensaje = (EditText) findViewById(R.id.edit_mensajeContacto);
        limpiar = (Button) findViewById(R.id.btn_borrarEnvio);
        aceptar = (Button) findViewById(R.id.btn_aceptarEnvio);

        limpiar.setOnClickListener(this);
        aceptar.setOnClickListener(this);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public void onClick(View v) {
        String Usuario = usuario.getText().toString();
        String Mensaje = mensaje.getText().toString();

        switch(v.getId()){
            case R.id.btn_aceptarEnvio:
                if(Usuario.isEmpty() || Mensaje.isEmpty()){
                    Toast.makeText(getApplicationContext(), "¡No puede haber campos vacíos!", Toast.LENGTH_LONG).show();

                } else {

                    Toast.makeText(getApplicationContext(), "¡Mensaje enviado!", Toast.LENGTH_LONG).show(); //mensaje al iniciar
                }
                break;
            case R.id.btn_borrarEnvio:
                usuario.setText("");
                mensaje.setText("");
                Toast.makeText(getApplicationContext(), "¡Datos limpiados!", Toast.LENGTH_SHORT).show(); //Mensajito x3
                break;
        }
    }
}
