package com.voltz.patinhascompany.models;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private int id;
    private String nome;
    private List<CriptoAtivo> criptoativos;

    // Construtor vazio
    public Empresa() {
        this.criptoativos = new ArrayList<>();
    }

    // Construtor completo
    public Empresa(String nome) {
        this.nome = nome;
        this.criptoativos = new ArrayList<>();
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<CriptoAtivo> getCriptoativos() {
        return criptoativos;
    }

    public void adicionarCriptoAtivo(CriptoAtivo criptoativo) {
        this.criptoativos.add(criptoativo);
    }
}
