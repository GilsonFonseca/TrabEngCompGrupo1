package persistencia;

import entidade.Dependente;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class PerDependenteTest {
    
    public PerDependenteTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of inserir method, of class PerDependente.
     */
    @Test (timeout=2000)
    public void testInserir() {
        System.out.println("inserir - Dependente");
        Dependente user = new Dependente();
        user.setCPF("123JUNIT");
        user.setNome("NAME_JUNIT");
        user.setResponsavel(2);
        boolean expResult = true;
        boolean result = PerDependente.inserir(user);
        assertEquals(expResult, result);
    }
    
}
