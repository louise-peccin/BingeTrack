package com.example.aplicativodefilmes.model;

import java.io.Serializable;

public class Obra implements Serializable {
    private String titulo;
    private float nota;
    private String tipo; // "Filme" ou "Série"

    public Obra(String titulo, float nota, String tipo) {
        this.titulo = titulo;
        this.nota = nota;
        this.tipo = tipo;
    }

    // Getters e Setters
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public float getNota() { return nota; }
    public void setNota(float nota) { this.nota = nota; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    @Override
    public String toString() {
        return this.titulo;
    }
}