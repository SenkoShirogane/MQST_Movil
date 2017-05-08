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
import ipn.sofficcesware.com.mqst.administrador.ModificarDatosAdminActivity;

public class ModificarProveedoresActivity extends AppCompatActivity implements View.OnClickListener{
    Button agregar, limpiar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modificar_proveedores);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        agregar = (Button) findViewById(R.id.btn_GuardarModProveedor);
        limpiar = (Button) findViewById(R.id.btn_CancelarModProveedor);
        agregar.setOnClickListener(this);
        limpiar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_GuardarModProveedor:
                Toast.makeText(getApplicationContext(), "¡Datos modificados!", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(ModificarProveedoresActivity.this, Administrador.class);
                startActivity(intent);
                break;
            case R.id.btn_CancelarModProveedor:
                Intent intent2 = new Intent(ModificarProveedoresActivity.this, Administrador.class);
                startActivity(intent2);
                break;
        }
    }
}
