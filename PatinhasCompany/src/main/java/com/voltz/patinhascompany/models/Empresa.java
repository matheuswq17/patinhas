package com.voltz.patinhascompany.models;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private int id;
    private String nome;
    private String codigo;
    private List<CriptoAtivo> criptoativos;

    public Empresa(String nome, String codigo) {
        this.nome = nome;
        this.codigo = codigo;
        this.criptoativos = new ArrayList<>();
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public List<CriptoAtivo> getCriptoativos() {
        return criptoativos;
    }

    // Método de Negócio
    public void adicionarCriptoAtivo(CriptoAtivo criptoativo) {
        this.criptoativos.add(criptoativo);
    }
}
