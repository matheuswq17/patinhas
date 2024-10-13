package com.voltz.patinhascompany.services;

import com.voltz.patinhascompany.dao.NotificacaoDao;
import com.voltz.patinhascompany.models.Notificacao;
import com.voltz.patinhascompany.models.Usuario;

public class NotificacaoService {
    private NotificacaoDao notificacaoDao = new NotificacaoDao();

    public Notificacao criarNotificacao(String mensagem, Usuario usuario) {
        Notificacao notificacao = new Notificacao(mensagem, usuario);
        enviarNotificacao(notificacao);
        notificacaoDao.inserir(notificacao);
        return notificacao;
    }

    public void enviarNotificacao(Notificacao notificacao) {
        // Simula o envio de uma notificação ao usuário
        notificacao.enviar();
    }
}
