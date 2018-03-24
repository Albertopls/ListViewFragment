package com.example.eduardopalacios.listviewfragment.Adaptadores;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.eduardopalacios.listviewfragment.Clases.Item;
import com.example.eduardopalacios.listviewfragment.Holders.holderItem;
import com.example.eduardopalacios.listviewfragment.R;

import java.util.List;

/**
 * Created by eduardopalacios on 22/03/18.
 */

public class AdapterItem extends ArrayAdapter<Item> {

    List<Item>list;
    Context context;
    int resource;
    public AdapterItem( Context context, int resource,  List<Item>list) {
        super(context, resource, list);

        this.context=context;
        this.resource=resource;
        this.list=list;

    }

    @NonNull
    @Override
    public View getView(int position, View convertView,  ViewGroup parent) {

        View view=convertView;
        holderItem holder=null;
        if (view==null) {


            LayoutInflater inflater = LayoutInflater.from(context);
            view = inflater.inflate(resource, parent, false);
            holder=new holderItem();
            holder.imagen=(ImageView) view.findViewById(R.id.imagenBandera);
            holder.texto=(TextView)view.findViewById(R.id.nombreBandera);

            view.setTag(holder);

        }
        else {
           holder=(holderItem) view.getTag();
        }

        holder.texto.setText(list.get(position).getTiulo());
        holder.imagen.setImageResource(list.get(position).getImagen());

        return view;
    }
}
