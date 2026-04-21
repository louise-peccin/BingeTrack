package com.example.aplicativodefilmes.model;

public class Obra {
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
    public float getNota() { return nota; }
    public String getTipo() { return tipo; }
}
