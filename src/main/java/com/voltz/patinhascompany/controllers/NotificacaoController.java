package com.voltz.patinhascompany.controllers;

import com.voltz.patinhascompany.services.NotificacaoService;
import com.voltz.patinhascompany.models.Notificacao;
import com.voltz.patinhascompany.models.Usuario;

public class NotificacaoController {
    private final NotificacaoService notificacaoService = new NotificacaoService();

    public Notificacao criarNotificacao(String mensagem, Usuario usuario) {
        return notificacaoService.criarNotificacao(mensagem, usuario);
    }

    public void enviarNotificacao(Notificacao notificacao) {
        notificacaoService.enviarNotificacao(notificacao);
    }
}
