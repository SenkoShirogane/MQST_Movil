package ipn.sofficcesware.com.mqst.administrador;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import ipn.sofficcesware.com.mqst.R;
import ipn.sofficcesware.com.mqst.cliente.Cliente;
import ipn.sofficcesware.com.mqst.cliente.ModificarDatosClienteActivity;

public class ModificarDatosAdminActivity extends AppCompatActivity implements View.OnClickListener{
    Button guardar, cancelar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modificar_datos_admin);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        guardar = (Button) findViewById(R.id.btnGuardarModAdmin);
        cancelar = (Button) findViewById(R.id.btnCancelarModAdmin);
        guardar.setOnClickListener(this);
        cancelar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnGuardarModAdmin:
                Toast.makeText(getApplicationContext(), "¡Datos modificados!", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(ModificarDatosAdminActivity.this, Administrador.class);
                startActivity(intent);
                break;
            case R.id.btnCancelarModAdmin:
                Intent intent2 = new Intent(ModificarDatosAdminActivity.this, Administrador.class);
                startActivity(intent2);
                break;
        }
    }
}
