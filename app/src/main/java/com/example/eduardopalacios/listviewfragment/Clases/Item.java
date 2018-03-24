package com.example.eduardopalacios.listviewfragment.Clases;

/**
 * Created by eduardopalacios on 22/03/18.
 */

public class Item {

    String tiulo;
    int imagen;

    public Item(String tiulo,int imagen)
    {
        this.tiulo=tiulo;
        this.imagen=imagen;

    }

    public String getTiulo()
    {
        return tiulo;
    }

    public int getImagen()
    {
        return imagen;
    }
}
