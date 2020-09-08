package com.example.tareasemana4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerView_Fragment extends Fragment {

    ArrayList<Mascota> mascotas;
    public RecyclerView listaMascotas;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
        View v = inflater.inflate(R.layout.fragment_recyclerview, container,false);

        listaMascotas = (RecyclerView) v.findViewById(R.id.rvMascota);
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        listaMascotas.setLayoutManager(llm);
        inicializarListaMascotas();
        inicializarAdaptador();

        return v;
    }
    public void inicializarAdaptador () {
        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas, getActivity());
        listaMascotas.setAdapter(adaptador);
    }

    public void inicializarListaMascotas () {
        //likes = String.valueOf(contadorLikes);
        mascotas = new ArrayList<Mascota>();
        mascotas.add(new Mascota(R.drawable.img_gatubela,"Gatubela","5"));
        mascotas.add(new Mascota(R.drawable.img_jonas,"Jonas","2"));
        mascotas.add(new Mascota(R.drawable.img_cantor,"Cantor","5"));
        mascotas.add(new Mascota(R.drawable.img_manuelita,"Manuelita","8"));
        mascotas.add(new Mascota(R.drawable.img_rodolfo,"Rodolfo","12"));
        mascotas.add(new Mascota(R.drawable.img_papo,"Papo","5"));
        mascotas.add(new Mascota(R.drawable.img_erick,"Erick","7"));
        mascotas.add(new Mascota(R.drawable.img_wes,"Wes","1"));
        mascotas.add(new Mascota(R.drawable.img_jonas,"Jonas 2","2"));
    }
}
