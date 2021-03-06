package ipn.sofficcesware.com.mqst.administrador;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import ipn.sofficcesware.com.mqst.R;
import ipn.sofficcesware.com.mqst.proveedor.AgregarProveedoresActivity;
import ipn.sofficcesware.com.mqst.proveedor.EliminarProveedoresActivity;
import ipn.sofficcesware.com.mqst.proveedor.ModificarProveedoresActivity;
import ipn.sofficcesware.com.mqst.proveedor.verProveedoresActivity;

public class ProveedoresFragment extends Fragment implements View.OnClickListener{
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public ProveedoresFragment() {
        // Required empty public constructor
    }

    public static ProveedoresFragment newInstance(String param1, String param2) {
        ProveedoresFragment fragment = new ProveedoresFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.fragment_proveedores, container, false);
        Button verProv = (Button) v.findViewById(R.id.btn_VerProveedoresAdmin);
        verProv.setOnClickListener(this);
        Button agregarProv = (Button) v.findViewById(R.id.btn_AgregarProveedor);
        agregarProv.setOnClickListener(this);
        Button modProv = (Button) v.findViewById(R.id.btn_ModificarProveedor);
        modProv.setOnClickListener(this);
        Button elProv = (Button) v.findViewById(R.id.btn_EliminarProveedor);
        elProv.setOnClickListener(this);
        return v;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_VerProveedoresAdmin:
                Intent intento = new Intent(getActivity(), verProveedoresActivity.class);
                startActivity(intento);
                break;
            case R.id.btn_AgregarProveedor:
                Intent intento2 = new Intent(getActivity(), AgregarProveedoresActivity.class);
                startActivity(intento2);
                break;
            case R.id.btn_ModificarProveedor:
                Intent intento3 = new Intent(getActivity(), ModificarProveedoresActivity.class);
                startActivity(intento3);
                break;
            case R.id.btn_EliminarProveedor:
                Intent intento4 = new Intent(getActivity(), EliminarProveedoresActivity.class);
                startActivity(intento4);
                break;
        }
    }

    public interface OnFragmentInteractionListener {
        void onFragmentInteraction(Uri uri);
    }
}
