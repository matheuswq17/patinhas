package com.voltz.patinhascompany.controllers;

import com.voltz.patinhascompany.services.UsuarioService;
import com.voltz.patinhascompany.models.Usuario;

// Outras dependências necessárias para controlar a lógica de negócios
import java.util.List;
import java.util.Scanner; // Caso use entradas de usuário


public class TransacaoController {
    private TransacaoService transacaoService = new TransacaoService();

    public boolean executarTransacao(String tipo, double montante, ContaInvestimento origem, ContaInvestimento destino, CriptoAtivo criptoativo) {
        return transacaoService.executarTransacao(tipo, montante, origem, destino, criptoativo);
    }
}
