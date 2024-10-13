package com.voltz.patinhascompany.controllers;

import main.java.com.voltz.patinhascompany.models.ContaInvestimento;
import main.java.com.voltz.patinhascompany.models.Usuario;
import main.java.com.voltz.patinhascompany.services.ContaInvestimentoService;

public class ContaInvestimentoController {
    private ContaInvestimentoService contaService = new ContaInvestimentoService();

    public ContaInvestimento criarConta(String numeroConta, String tipoMoeda, Usuario usuario) {
        return contaService.criarConta(numeroConta, tipoMoeda, usuario);
    }

    public void adicionarSaldo(ContaInvestimento conta, double valor) {
        contaService.adicionarSaldo(conta, valor);
    }
}
