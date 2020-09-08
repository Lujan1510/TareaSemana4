package com.example.tareasemana3;

import java.util.ArrayList;

public class Data {
    public static ArrayList<Mascota> mascotas= new ArrayList<Mascota>(){
        { //lista de mascotas
            add(new Mascota(R.drawable.rodolfo, "Rodolfo", 4, false));
            add(new Mascota(R.drawable.manuelita, "Manuel", 0, false));
            add(new Mascota(R.drawable.gatubela, "Gaty", 3, false));
            add(new Mascota(R.drawable.cantor, "Teo", 2, false));
            add(new Mascota(R.drawable.jonas, "Jonas", 0, false));
            add(new Mascota(R.drawable.wes, "Wes", 1, false));
            add(new Mascota(R.drawable.erick, "Erick", 0, false));
            add(new Mascota(R.drawable.papo, "Papo", 0, false));

        }
    };
    public static int getItemFavorite(){
        int cnt=0;
        for (Mascota m:mascotas) {
            if(m.getFavorite()){
                cnt++;
            }
        }
        return cnt;
    }
}
