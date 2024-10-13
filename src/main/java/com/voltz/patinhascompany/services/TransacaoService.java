package com.voltz.patinhascompany.services;

import com.voltz.patinhascompany.dao.UsuarioDao;
import com.voltz.patinhascompany.models.Usuario;

// Outras bibliotecas Java necessárias, como listas ou exceções
import java.util.List;
import java.util.Optional;


public class TransacaoService {

    public boolean executarTransacao(String tipo, double montante, ContaInvestimento origem, ContaInvestimento destino, CriptoAtivo criptoativo) {
        Transacao transacao = new Transacao(tipo, montante, origem, destino, criptoativo);
        return transacao.executarTransacao();
    }
}
