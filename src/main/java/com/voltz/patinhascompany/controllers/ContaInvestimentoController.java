package com.voltz.patinhascompany.controllers;

import com.voltz.patinhascompany.services.ContaInvestimentoService;
import com.voltz.patinhascompany.models.ContaInvestimento;
import com.voltz.patinhascompany.models.Usuario;

public class ContaInvestimentoController {
    private ContaInvestimentoService contaService = new ContaInvestimentoService();

    public ContaInvestimento criarConta(String numeroConta, String tipoMoeda, Usuario usuario) {
        if (usuario == null || numeroConta == null || tipoMoeda == null) {
            throw new IllegalArgumentException("Parâmetros inválidos para criar conta de investimento.");
        }
        return contaService.criarConta(numeroConta, tipoMoeda, usuario);
    }

    public void adicionarSaldo(ContaInvestimento conta, double valor) {
        if (conta == null || valor <= 0) {
            throw new IllegalArgumentException("Parâmetros inválidos para adicionar saldo.");
        }
        contaService.adicionarSaldo(conta, valor);
    }
}
