package main.java.com.voltz.patinhascompany.controllers;

import main.java.com.voltz.patinhascompany.models.CriptoAtivo;
import main.java.com.voltz.patinhascompany.models.Empresa;
import main.java.com.voltz.patinhascompany.services.CriptoAtivoService;

public class CriptoAtivoController {
    private CriptoAtivoService criptoAtivoService = new CriptoAtivoService();

    public CriptoAtivo criarCriptoAtivo(String nome, String codigo, double preco, Empresa empresa) {
        return criptoAtivoService.criarCriptoAtivo(nome, codigo, preco, empresa);
    }
}
