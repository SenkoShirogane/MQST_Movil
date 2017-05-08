package ipn.sofficcesware.com.mqst.cliente;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import ipn.sofficcesware.com.mqst.R;

public class ModificarDatosClienteActivity extends AppCompatActivity implements View.OnClickListener{
    Button guardar, cancelar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modificar_datos_cliente);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        guardar = (Button) findViewById(R.id.btnGuardarModCliente);
        cancelar = (Button) findViewById(R.id.btnCancelarModCliente);
        guardar.setOnClickListener(this);
        cancelar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.btnGuardarModCliente:
                Toast.makeText(getApplicationContext(), "¡Datos modificados!", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(ModificarDatosClienteActivity.this, Cliente.class);
                startActivity(intent);
                break;
            case R.id.btnCancelarModCliente:
                Intent intent2 = new Intent(ModificarDatosClienteActivity.this, Cliente.class);
                startActivity(intent2);
                break;
        }
    }
}
