package com.example.eduardopalacios.listviewfragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.eduardopalacios.listviewfragment.Adaptadores.AdapterItem;
import com.example.eduardopalacios.listviewfragment.Clases.Item;
import com.example.eduardopalacios.listviewfragment.Interfaces.Cominicador;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragmentlistview extends Fragment {


    View view;
    ListView listView;
    List<Item> list=new ArrayList<>();
    AdapterItem adapterItem;
    Cominicador cominicador;
    public Fragmentlistview() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        view=inflater.inflate(R.layout.fragment_fragmentlistview, container, false);
        cominicador=(Cominicador)getActivity();

        listView=(ListView)view.findViewById(R.id.listview);

        list.add(new Item("Mexico",R.drawable.peso));
        list.add(new Item("Estados Unidos",R.drawable.dolar));
        list.add(new Item("Europa",R.drawable.euro));
        list.add(new Item("Japon",R.drawable.yen));

        adapterItem=new AdapterItem(getContext(),R.layout.disenio_listview,list);

        listView.setAdapter(adapterItem);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                cominicador.enviarDatos(list.get(i).getImagen());
            }
        });

        return view;
    }

}
