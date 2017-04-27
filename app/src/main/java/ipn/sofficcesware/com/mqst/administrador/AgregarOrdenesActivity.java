package ipn.sofficcesware.com.mqst.administrador;

import android.icu.util.Calendar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import ipn.sofficcesware.com.mqst.R;

public class AgregarOrdenesActivity extends AppCompatActivity implements View.OnClickListener {
    Button fecha, hora;
    TextView fechat, horat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar_ordenes);

        //getActionBar().setDisplayHomeAsUpEnabled(true); //boton atrás

        /*
        fecha = (Button) findViewById(R.id.btn_agregarOrdenFecha);
        hora = (Button) findViewById(R.id.btn_agregarOrdenHora);
        fecha.setOnClickListener(this);
        hora.setOnClickListener(this);

        fechat = (TextView) findViewById(R.id.fecha);
        horat = (TextView) findViewById(R.id.hora);
        */
    }

    @Override
    public void onClick(View v) {
        /*
        String valorFecha = fechat.getText().toString();
        String valorHora = horat.getText().toString();

        switch(v.getId()){
            case R.id.btn_agregarOrdenFecha:
                //final Calendar c = Calendar.getInstance();
                break;
            case R.id.btn_agregarOrdenHora:

                break;
        }
        */
    }
    /*
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home: //hago un case por si en un futuro agrego mas opciones
                Log.i("ActionBar", "Atrás");
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    } */
}
