/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import entidade.Usuario;
import java.util.ArrayList;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *  Testes relativos a persistencia com o banco nos dados do usuário
 * @author Gilson
 */
public class PerUsuarioTest {
    
    public PerUsuarioTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of inserir method, of class PerUsuario.
     */
    @Test
    public void testInserir() {
        System.out.println("inserir - Usuario");
        Usuario user = new Usuario();
        boolean expResult = true;
        user.setCPF("1234");
        user.setNome("TESTEJUNIT");
        user.setSenha("123456");
        boolean result = PerUsuario.inserir(user);
        //com dados esperados corretos, testa se o banco responde como esperado
        assertEquals(expResult, result);
    }

    /**
     * Test of excluir method, of class PerUsuario.
     */
    @Test
    public void testExcluir() {
        System.out.println("excluir - Usuario");
        int id = 0;
        boolean expResult = true;
        boolean result = PerUsuario.excluir(id);
        //espera resultado afirmativo do banco numa exclusão de tupla
        assertEquals(expResult, result);
    }

    /**
     * Test of alterar method, of class PerUsuario.
     */
    @Test
    public void testAlterar() {
        //gera dados para alteração
        System.out.println("alterar - Usuario");
        Usuario user = new Usuario();
        user.setID(21);
        user.setNome("JUNIT_ALTERAR");
        user.setSenha("1234567alterado");
        user.setCPF("alterado");
        boolean expResult = true;
        boolean result = PerUsuario.alterar(user);
        //verifica se resultado é de alteração com sucesso
        assertEquals(expResult, result);
    }

    /**
     * Test of consultar method, of class PerUsuario.
     */
    @Test
    public void testConsultar() {
        System.out.println("consultar - Usuario");
        boolean expResult = true;
        ArrayList<Usuario> result = PerUsuario.consultar();
        //verifica se o banco responde bem a uma consulta
        assertEquals(expResult, result.size()>0);
    }

    /**
     * Test of login method, of class PerUsuario.
     */
    @Test
    public void testLogin() {
        //cria-se dados para login
        System.out.println("login - Usuario");
        String usr = "Teste";
        String senha = "1234";
        boolean expResult = true;
        boolean result = PerUsuario.login(usr, senha);
        //se verifica o comportamento afirmativo do banco com esses dados
        assertEquals(expResult, result);
    }
    
}
