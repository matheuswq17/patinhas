package com.voltz.patinhascompany.services;

import com.voltz.patinhascompany.models.Transacao;
import com.voltz.patinhascompany.models.ContaInvestimento;

public class TransacaoService {

    public boolean executarTransacao(String tipo, double montante, ContaInvestimento origem, ContaInvestimento destino) {
        Transacao transacao = new Transacao(tipo, montante, origem, destino);
        return transacao.executarTransacao();
    }
}
