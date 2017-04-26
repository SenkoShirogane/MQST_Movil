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

public class OrdenesAdminFragment extends Fragment implements View.OnClickListener{
    Button btn_AgregarOrden;
    Comunicador comunicador;

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public OrdenesAdminFragment() {
        // Required empty public constructor
    }

    public static OrdenesAdminFragment newInstance(String param1, String param2) {
        OrdenesAdminFragment fragment = new OrdenesAdminFragment();
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

    public interface Comunicador{
        public void enviar (String enviar);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_ordenes_admin, container, false);
        btn_AgregarOrden = (Button) v.findViewById(R.id.btn_AgregarOrden);
        btn_AgregarOrden.setOnClickListener(this);
        return v;
    }

    public void onClick(View v) {
        switch(v.getId()){
            case R.id.btn_AgregarOrden:
                Intent intent = new Intent(getActivity(), AgregarOrdenesActivity.class);
                startActivity(intent);
                break;
        }
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

    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
