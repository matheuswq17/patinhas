package com.voltz.patinhascompany.controllers;

import com.voltz.patinhascompany.models.Transacao;
import com.voltz.patinhascompany.models.ContaInvestimento;
import com.voltz.patinhascompany.services.TransacaoService;

public class TransacaoController {
    private TransacaoService transacaoService = new TransacaoService();

    public boolean executarTransacao(String tipo, double montante, ContaInvestimento origem, ContaInvestimento destino) {
        return transacaoService.executarTransacao(tipo, montante, origem, destino);
    }
}
