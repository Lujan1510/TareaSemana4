package com.example.tareasemana3;

import java.io.Serializable;

public class Mascota implements Serializable {

    private int imagen;
    private String nombre;
    private int rating;
    private boolean favorite;

    public Mascota(int imagen, String nombre, int rating,boolean favorite) {
        this.imagen = imagen;
        this.nombre = nombre;
        this.rating = rating;
        this.favorite=favorite;
    }

    //getters  & setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public boolean getFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }

    public void favorite(){
        this.favorite=!this.favorite;
        if(this.favorite){
            this.rating++;
        }else{
            this.rating--;
        }
    }
}
