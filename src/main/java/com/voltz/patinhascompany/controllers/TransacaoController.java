package com.voltz.patinhascompany.controllers;

import com.voltz.patinhascompany.services.TransacaoService;
import com.voltz.patinhascompany.models.ContaInvestimento;
import com.voltz.patinhascompany.models.CriptoAtivo;

public class TransacaoController {
    private TransacaoService transacaoService = new TransacaoService();

    public boolean executarTransacao(String tipo, double montante, ContaInvestimento origem, ContaInvestimento destino, CriptoAtivo criptoativo) {
        if (tipo == null || montante <= 0 || origem == null || destino == null || criptoativo == null) {
            throw new IllegalArgumentException("Parâmetros inválidos para executar transação.");
        }
        return transacaoService.executarTransacao(tipo, montante, origem, destino, criptoativo);
    }
}
