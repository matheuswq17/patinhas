package com.voltz.patinhascompany.models;

public class Notificacao {
    private int id;
    private String mensagem;
    private Usuario usuario;

    // Construtor vazio
    public Notificacao() {
    }

    // Construtor completo
    public Notificacao(String mensagem, Usuario usuario) {
        this.mensagem = mensagem;
        this.usuario = usuario;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void enviar() {
        System.out.println("Notificação enviada para " + usuario.getNome() + ": " + mensagem);
    }
}
