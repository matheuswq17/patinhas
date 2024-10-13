package main.java.com.voltz.patinhascompany.models;

import java.util.Date;

public class Notificacao {
    private int id;
    private String mensagem;
    private Date data;
    private Usuario usuario;

    public Notificacao(String mensagem, Usuario usuario) {
        this.mensagem = mensagem;
        this.usuario = usuario;
        this.data = new Date();  // Define a data atual como padrão
    }

    // Getters e Setters
    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    // Método de Negócio
    public void enviar() {
        System.out.println("Notificação enviada para " + usuario.getNome() + ": " + mensagem);
    }
}
