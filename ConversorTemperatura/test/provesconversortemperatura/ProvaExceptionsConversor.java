package provesconversortemperatura;

import conversortemperatura.TemperaturaNoValidaException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import conversortemperatura.*;

/**
 *
 * @author Jorge
 */

public class ProvaExceptionsConversor {     
    //private Conversor conversor;
    private static Conversor conversor;

    public ProvaExceptionsConversor() {
    }

    @BeforeClass
    public static void setUpClass() {
        conversor = new Conversor();
    }

    @AfterClass
    public static void tearDownClass() {
        conversor = null;
    }

    @Before
    public void setUp() {
        //conversor = new Conversor();
    }

    @After
    public void tearDown() {
        //conversor = null;
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //

    @Test(expected=TemperaturaNoValidaException.class)
    public final void testTemperaturaNoValida() throws TemperaturaNoValidaException{
        //fail ("Sin implementar");
        //Conversor conversor = new Conversor();
        assertEquals(32, conversor.celsiusAFharenheit(-400),0);
    }
    
    @Test    
    public final void testTemperaturaNoValida2() throws TemperaturaNoValidaException {
        //fail ("Sin implementar");
        //Conversor conversor = new Conversor();
        try {
            assertEquals(32, conversor.celsiusAFharenheit(-400), 0);
            fail("Para temperaturas por encima de -273 la prueba debe pasar.");
        } catch (Exception e) {

        }

    }
}