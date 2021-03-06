package ipn.sofficcesware.com.mqst.administrador;

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
import ipn.sofficcesware.com.mqst.cliente.ContactanosActivity;

public class Administrador extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener, OrdenesAdminFragment.OnFragmentInteractionListener,
        ProductosAdminFragment.OnFragmentInteractionListener, ProveedoresFragment.OnFragmentInteractionListener,
        ClientesAdminFragment.OnFragmentInteractionListener, PiezasAdminFragment.OnFragmentInteractionListener,
        AdministradoresFragment.OnFragmentInteractionListener, PerfilAdminFragment.OnFragmentInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_administrador);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Snackbar.make(view, "hola", Snackbar.LENGTH_LONG).setAction("Action", null).show();
                Intent intento = new Intent(Administrador.this, ContactanosActivity.class);
                startActivity(intento);
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        Fragment fragmento = new PerfilAdminFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.content_admin,fragmento).commit();
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
        // Muestra las opciones en el menu.
        getMenuInflater().inflate(R.menu.administrador, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        //Los 3 puntitos en la esquina x3
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // ¿Qué hará al presionar una opción?.
        int id = item.getItemId();

        Fragment fragment = null;
        Boolean FragmentoSeleccionado = false;

        if (id == R.id.nav_perfilAdmin) {
            fragment = new PerfilAdminFragment();
            FragmentoSeleccionado = true;
        } else if (id == R.id.nav_administradores) {
            fragment = new AdministradoresFragment();
            FragmentoSeleccionado = true;
        } else if (id == R.id.nav_clientesAdmin) {
            fragment = new ClientesAdminFragment();
            FragmentoSeleccionado = true;
        } else if (id == R.id.nav_proveedoresAdmin) {
            fragment = new ProveedoresFragment();
            FragmentoSeleccionado = true;
        } else if (id == R.id.nav_productosAdmin) {
            fragment = new ProductosAdminFragment();
            FragmentoSeleccionado = true;
        } else if (id == R.id.nav_piezasAdmin) {
            fragment = new PiezasAdminFragment();
            FragmentoSeleccionado = true;
        } else if (id == R.id.nav_ordenesAdmin) {
            fragment = new OrdenesAdminFragment();
            FragmentoSeleccionado = true;
        } else if (id == R.id.nav_manualAdmin) {

        } else if (id == R.id.nav_salirAdmin) {
            //Lógica para cerrar sesión x3
            Intent intento = new Intent(this, MainActivity.class);
            startActivity(intento);
        }

        if(FragmentoSeleccionado){
            getSupportFragmentManager().beginTransaction().replace(R.id.content_admin,fragment).commit();
        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
