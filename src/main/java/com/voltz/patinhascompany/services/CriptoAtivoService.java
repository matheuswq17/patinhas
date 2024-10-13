package com.voltz.patinhascompany.services;

import com.voltz.patinhascompany.dao.CriptoAtivoDao;
import com.voltz.patinhascompany.models.CriptoAtivo;
import com.voltz.patinhascompany.models.Empresa;

public class CriptoAtivoService {
    private CriptoAtivoDao criptoAtivoDao = new CriptoAtivoDao();

    public CriptoAtivo criarCriptoAtivo(String nome, String codigo, double preco, Empresa empresa) {
        CriptoAtivo criptoAtivo = new CriptoAtivo(nome, codigo, preco, empresa);
        criptoAtivoDao.inserir(criptoAtivo);
        return criptoAtivo;
    }
}
