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
 *
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
        System.out.println("inserir");
        Usuario user = new Usuario();
        boolean expResult = true;
        user.setCPF("1234");
        user.setNome("TESTEJUNIT");
        user.setSenha("123456");
        boolean result = PerUsuario.inserir(user);
        assertEquals(expResult, result);
    }

    /**
     * Test of excluir method, of class PerUsuario.
     */
    @Test
    public void testExcluir() {
        System.out.println("excluir");
        int id = 0;
        boolean expResult = true;
        boolean result = PerUsuario.excluir(id);
        assertEquals(expResult, result);
    }

    /**
     * Test of alterar method, of class PerUsuario.
     */
    @Test
    public void testAlterar() {
        System.out.println("alterar");
        Usuario user = new Usuario();
        user.setID(21);
        user.setNome("JUNIT_ALTERAR");
        user.setSenha("1234567alterado");
        user.setCPF("alterado");
        boolean expResult = true;
        boolean result = PerUsuario.alterar(user);
        assertEquals(expResult, result);
    }

    /**
     * Test of consultar method, of class PerUsuario.
     */
    @Test
    public void testConsultar() {
        System.out.println("consultar");
        boolean expResult = true;
        ArrayList<Usuario> result = PerUsuario.consultar();
        assertEquals(expResult, result.size()>0);
    }

    /**
     * Test of login method, of class PerUsuario.
     */
    @Test
    public void testLogin() {
        System.out.println("login");
        String usr = "Teste";
        String senha = "1234";
        boolean expResult = true;
        boolean result = PerUsuario.login(usr, senha);
        assertEquals(expResult, result);
    }
    
}
