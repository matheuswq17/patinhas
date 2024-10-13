package com.voltz.patinhascompany.services;

import com.voltz.patinhascompany.dao.UsuarioDao;
import com.voltz.patinhascompany.models.Usuario;

// Outras bibliotecas Java necessárias, como listas ou exceções
import java.util.List;
import java.util.Optional;


public class NotificacaoService {

    public Notificacao criarNotificacao(String mensagem, Usuario usuario) {
        Notificacao notificacao = new Notificacao(mensagem, usuario);
        enviarNotificacao(notificacao);
        return notificacao;
    }

    public void enviarNotificacao(Notificacao notificacao) {
        // Simula o envio de uma notificação ao usuário
        notificacao.enviar();
    }
}
