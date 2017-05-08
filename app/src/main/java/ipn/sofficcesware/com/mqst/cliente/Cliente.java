package ipn.sofficcesware.com.mqst.cliente;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import ipn.sofficcesware.com.mqst.MainActivity;
import ipn.sofficcesware.com.mqst.R;

public class Cliente extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener, PerfilClienteFragment.OnFragmentInteractionListener,
        ProductosClienteFragment.OnFragmentInteractionListener, OrdenesClienteFragment.OnFragmentInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cliente);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Lo sentimos, no se pueden contactar administradores.", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        Fragment fragmento = new PerfilClienteFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.content_cliente,fragmento).commit();
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.cliente, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Menu de los 3 puntitos
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // ¿Qué se hace al presionar una opcion en el menu?.
        int id = item.getItemId();

        Fragment fragment = null;
        Boolean FragmentoSeleccionado = false;

        if (id == R.id.nav_perfilCliente) {
            fragment = new PerfilClienteFragment();
            FragmentoSeleccionado = true;
        } else if (id == R.id.nav_ordenesCliente) {
            fragment = new OrdenesClienteFragment();
            FragmentoSeleccionado = true;
        } else if (id == R.id.nav_productosCliente) {
            fragment = new ProductosClienteFragment();
            FragmentoSeleccionado = true;
        } else if (id == R.id.nav_manualCliente) {

        } else if (id == R.id.nav_salirCliente) {
            //Lógica para cerrar sesión x3
            Intent intento = new Intent(this, MainActivity.class);
            startActivity(intento);
        }

        if(FragmentoSeleccionado){
            getSupportFragmentManager().beginTransaction().replace(R.id.content_cliente,fragment).commit();
        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
