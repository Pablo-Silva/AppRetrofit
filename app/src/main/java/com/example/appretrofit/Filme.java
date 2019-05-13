package com.example.appretrofit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Objects;

public class Filme {

    @SerializedName("titulo")
    @Expose
    private String titulo;

    @SerializedName("duracao")
    @Expose
    private String duracao;

    @SerializedName("genero")
    @Expose
    private String genero;

    public Filme() {
    }

    public Filme(String titulo, String duracao, String genero) {
        this.titulo = titulo;
        this.duracao = duracao;
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Filme{" +
                ", titulo='" + titulo + '\'' +
                ", duracao='" + duracao + '\'' +
                ", genero='" + genero + '\'' +
                '}';
    }
}
