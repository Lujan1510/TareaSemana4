package com.example.tareasemana4;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class Perfil_Mascota extends Fragment {

    ArrayList<Mascota> mascotas;
    public RecyclerView listaMascotas;
    TextView tvNombrePerfil;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
        View v = inflater.inflate(R.layout.fragment_perfil__mascota, container,false);

        listaMascotas = (RecyclerView) v.findViewById(R.id.rvPerfilMascota);
        tvNombrePerfil = (TextView) v.findViewById(R.id.tvNombrePerfil);

        GridLayoutManager glm = new GridLayoutManager(getActivity(),3);
        glm.setOrientation(GridLayoutManager.VERTICAL);
        listaMascotas.setLayoutManager(glm);
        inicializarListaMascotas();
        inicializarAdaptador();
        tvNombrePerfil.setText(mascotas.get(2).getNombreMascota().toString());


        return v;
    }
    public void inicializarAdaptador () {
        PerfilAdaptador adaptador = new PerfilAdaptador(mascotas, getActivity());
        listaMascotas.setAdapter(adaptador);
    }

    public void inicializarListaMascotas () {
        //likes = String.valueOf(contadorLikes);
        mascotas = new ArrayList<Mascota>();

        mascotas.add(new Mascota(R.drawable.img_papo,"Papo","2"));
        mascotas.add(new Mascota(R.drawable.img_erick,"Erick","5"));
        mascotas.add(new Mascota(R.drawable.img_wes,"Wes","8"));
        mascotas.add(new Mascota(R.drawable.img_rodolfo,"Rodolfo","12"));
        mascotas.add(new Mascota(R.drawable.img_cantor,"Cantor","5"));
        mascotas.add(new Mascota(R.drawable.img_manuelita,"Manuelita","7"));
        mascotas.add(new Mascota(R.drawable.img_jonas,"Jonas","1"));
        mascotas.add(new Mascota(R.drawable.img_gatubela,"Gatubela","8"));

    }
}