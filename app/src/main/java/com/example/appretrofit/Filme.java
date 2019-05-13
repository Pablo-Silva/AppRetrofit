package com.example.appretrofit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Objects;

public class Filme {

    @SerializedName("id")
    @Expose
    private long id;

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

    public Filme(long id, String titulo, String duracao, String genero) {
        this.id = id;
        this.titulo = titulo;
        this.duracao = duracao;
        this.genero = genero;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", duracao='" + duracao + '\'' +
                ", genero='" + genero + '\'' +
                '}';
    }
}
