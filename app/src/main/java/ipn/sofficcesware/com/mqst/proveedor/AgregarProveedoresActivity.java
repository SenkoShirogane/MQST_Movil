package ipn.sofficcesware.com.mqst.proveedor;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import ipn.sofficcesware.com.mqst.R;
import ipn.sofficcesware.com.mqst.administrador.Administrador;

public class AgregarProveedoresActivity extends AppCompatActivity implements View.OnClickListener{
    Button agregar, limpiar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar_proveedores);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        agregar = (Button) findViewById(R.id.btn_RegistroProveedor);
        limpiar = (Button) findViewById(R.id.btn_LimpiarRegistroProveedor);
        agregar.setOnClickListener(this);
        limpiar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_RegistroProveedor:
                Toast.makeText(getApplicationContext(), "¡Registrado correctamente!", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(AgregarProveedoresActivity.this, Administrador.class);
                startActivity(intent);
                break;
            case R.id.btn_LimpiarRegistroProveedor:
                Toast.makeText(getApplicationContext(), "¡Datos Limpiados!", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
