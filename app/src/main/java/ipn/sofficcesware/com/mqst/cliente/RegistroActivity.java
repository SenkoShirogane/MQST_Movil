package ipn.sofficcesware.com.mqst.cliente;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import ipn.sofficcesware.com.mqst.R;

public class RegistroActivity extends AppCompatActivity implements View.OnClickListener{
    Button Registro, Limpiar;
    EditText nombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        Registro = (Button) findViewById(R.id.btn_RegistroCliente);
        Limpiar = (Button) findViewById(R.id.btn_LimpiarRegistroCliente);
        Registro.setOnClickListener(this);
        Limpiar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_RegistroCliente:
                Toast.makeText(getApplicationContext(), "¡Te registraste correctamente!", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(RegistroActivity.this, Cliente.class);
                startActivity(intent);
                break;
            case R.id.btn_LimpiarRegistroCliente:
                Toast.makeText(getApplicationContext(), "¡Datos Limpiados!", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
