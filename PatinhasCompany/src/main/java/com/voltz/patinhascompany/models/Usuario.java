package com.voltz.patinhascompany.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Usuario {
    private int id;
    private String nome;
    private String email;
    private String senha;
    private Date dataCadastro;
    private Carteira carteira;
    private List<Notificacao> notificacoes;

    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.dataCadastro = new Date();
        this.carteira = new Carteira(this); // Cada usuário tem sua carteira
        this.notificacoes = new ArrayList<>();
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public Carteira getCarteira() {
        return carteira;
    }

    public List<Notificacao> getNotificacoes() {
        return notificacoes;
    }

    // Outros métodos
    public boolean autenticar(String email, String senha) {
        return this.email.equals(email) && this.senha.equals(senha);
    }

    public void receberNotificacao(Notificacao notificacao) {
        this.notificacoes.add(notificacao);
    }
}
