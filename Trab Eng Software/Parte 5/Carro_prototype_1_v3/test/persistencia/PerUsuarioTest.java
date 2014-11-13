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
   // @Ignore
    @Test
    public void testInserir() {
        System.out.println("inserir");
        Usuario a = new Usuario();
        a.setCPF("1234678910");
        a.setNome("Gilson_TEST_JUNIT");
        a.setSenha("test2e");
        boolean expResult = true;
        boolean result = PerUsuario.inserir(a);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of excluir method, of class PerUsuario.
     */
   // @Ignore
    @Test
    public void testExcluir() {
        System.out.println("excluir");
        int id = 1;
        boolean expResult = true;
        boolean result = PerUsuario.excluir(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of alterar method, of class PerUsuario.
     */
    //@Ignore
    @Test
    public void testAlterar() {
        System.out.println("alterar");
        Usuario a = new Usuario();
        a.setCPF("12345678910");
        a.setNome("Gilson");
        a.setID(1);
        a.setSenha("teste");
        boolean expResult = true;
        boolean result = PerUsuario.alterar(a);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of consultar method, of class PerUsuario.
     */
    @Test
    public void testConsultar() {
        System.out.println("consultar");
        ArrayList<Usuario> expResult = new ArrayList<>();
        Usuario a = new Usuario();
        a.setCPF("12345678910");
        a.setNome("Gilson");
        a.setID(1);
        a.setSenha("teste");
        expResult.add(a);
        ArrayList<Usuario> result = PerUsuario.consultar();
        assertEquals(expResult.size(), result.size());
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
