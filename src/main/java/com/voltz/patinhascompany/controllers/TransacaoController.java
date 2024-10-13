package com.voltz.patinhascompany.controllers;

import main.java.com.voltz.patinhascompany.models.CriptoAtivo;
import main.java.com.voltz.patinhascompany.models.Transacao;
import main.java.com.voltz.patinhascompany.models.ContaInvestimento;
import main.java.com.voltz.patinhascompany.services.TransacaoService;

public class TransacaoController {
    private TransacaoService transacaoService = new TransacaoService();

    public boolean executarTransacao(String tipo, double montante, ContaInvestimento origem, ContaInvestimento destino, CriptoAtivo criptoativo) {
        return transacaoService.executarTransacao(tipo, montante, origem, destino, criptoativo);
    }
}
