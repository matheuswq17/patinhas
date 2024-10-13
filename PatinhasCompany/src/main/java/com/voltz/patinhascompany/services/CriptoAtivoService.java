package com.voltz.patinhascompany.services;

import com.voltz.patinhascompany.models.CriptoAtivo;
import com.voltz.patinhascompany.models.Empresa;

public class CriptoAtivoService {

    public CriptoAtivo criarCriptoAtivo(String nome, String codigo, double preco, Empresa empresa) {
        return new CriptoAtivo(nome, codigo, preco, empresa);
    }
}
