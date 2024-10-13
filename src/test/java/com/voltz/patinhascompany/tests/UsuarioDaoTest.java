package com.voltz.patinhascompany.tests;

import com.voltz.patinhascompany.dao.UsuarioDao;
import com.voltz.patinhascompany.models.Usuario;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class UsuarioDaoTest {

    private UsuarioDao usuarioDao;
    private Usuario usuarioTeste;

    @BeforeEach
    public void setUp() {
        usuarioDao = new UsuarioDao();
        usuarioTeste = new Usuario();
        usuarioTeste.setNome("Teste Nome");
        usuarioTeste.setEmail("teste@email.com");
        usuarioTeste.setSenha("123456");
        usuarioDao.inserir(usuarioTeste);
    }

    @AfterEach
    public void tearDown() {
        List<Usuario> usuarios = usuarioDao.listarTodos();
        for (Usuario usuario : usuarios) {
            usuarioDao.remover(usuario.getId());
        }
    }

    @Test
    public void testInserirUsuario() {
        Usuario usuario = new Usuario();
        usuario.setNome("Novo Usuario");
        usuario.setEmail("novo@teste.com");
        usuario.setSenha("senha123");

        usuarioDao.inserir(usuario);
        Usuario usuarioInserido = usuarioDao.buscarPorId(usuario.getId());

        assertNotNull(usuarioInserido);
        assertEquals("Novo Usuario", usuarioInserido.getNome());
        assertEquals("novo@teste.com", usuarioInserido.getEmail());
    }

    @Test
    public void testAtualizarUsuario() {
        usuarioTeste.setNome("Nome Atualizado");
        usuarioDao.atualizar(usuarioTeste);

        Usuario usuarioAtualizado = usuarioDao.buscarPorId(usuarioTeste.getId());
        assertEquals("Nome Atualizado", usuarioAtualizado.getNome());
    }

    @Test
    public void testRemoverUsuario() {
        usuarioDao.remover(usuarioTeste.getId());
        Usuario usuarioRemovido = usuarioDao.buscarPorId(usuarioTeste.getId());
        assertNull(usuarioRemovido);
    }

    @Test
    public void testListarTodosUsuarios() {
        List<Usuario> usuarios = usuarioDao.listarTodos();
        assertFalse(usuarios.isEmpty());
    }

    @Test
    public void testBuscarUsuarioPorId() {
        Usuario usuarioEncontrado = usuarioDao.buscarPorId(usuarioTeste.getId());
        assertNotNull(usuarioEncontrado);
        assertEquals(usuarioTeste.getNome(), usuarioEncontrado.getNome());
    }
}
