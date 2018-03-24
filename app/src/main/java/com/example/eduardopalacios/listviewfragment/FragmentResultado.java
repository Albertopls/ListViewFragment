package com.example.eduardopalacios.listviewfragment;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentResultado extends Fragment {


    View view;
    ImageView imageView;
    public FragmentResultado() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view =inflater.inflate(R.layout.fragment_fragment_resultado, container, false);
        imageView=(ImageView)view.findViewById(R.id.imagen);

        return view;
    }

    public void colocarImagen(int bandera)
    {
        imageView.setImageResource(bandera);
    }

}
