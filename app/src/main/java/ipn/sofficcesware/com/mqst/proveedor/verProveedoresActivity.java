package ipn.sofficcesware.com.mqst.proveedor;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

import ipn.sofficcesware.com.mqst.R;

public class verProveedoresActivity extends AppCompatActivity {
    ListView Lista;
    String[] valores = new String[] {"Juan Carlos - Apple",
            "Luis López - Sofficcesware",
            "Angie Mont - Carmiine",
            "Raúl Sanchez - Microsoft"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_proveedores);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        Lista = (ListView) findViewById(R.id.cat_proveedores);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,valores);
        Lista.setAdapter(adapter);
    }
}
