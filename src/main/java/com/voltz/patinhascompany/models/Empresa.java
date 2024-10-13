package com.voltz.patinhascompany.models;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private int id;
    private String nome;
    private List<CriptoAtivo> criptoativos;

    public Empresa(String nome) {
        this.nome = nome;
        this.criptoativos = new ArrayList<>();
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public List<CriptoAtivo> getCriptoativos() {
        return criptoativos;
    }

    // Método de Negócio
    public void adicionarCriptoAtivo(CriptoAtivo criptoativo) {
        this.criptoativos.add(criptoativo);
    }
}
