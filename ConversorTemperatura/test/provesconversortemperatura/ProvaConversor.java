package provesconversortemperatura;

import conversortemperatura.TemperaturaNoValidaException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import conversortemperatura.*;
import java.util.Arrays;
import java.util.List;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author Jorge
 */
@RunWith(Parameterized.class)
public class ProvaConversor {
    private double celsius;
    private double fharenheit;
    private double reamur;
    private double error;
        
    //private Conversor conversor;
    private static Conversor conversor;

    public ProvaConversor(double celsius, double fharenheit, double reamur, double error) {
        this.celsius = celsius;
        this.fharenheit = fharenheit;
        this.reamur = reamur;
        this.error = error;
    }
    
    @Parameters
    public static List<Object[]> datos(){
        return Arrays.asList(new Object[][]{
            {0.0, 32.0, 0.0, 0.0}, //{celsius, fharenheit, reamur, error}
            {15, 59.0, 12.0, 0.0},
            {30, 86.0, 24.0, 0.0},
            {50, 122.0, 40.0, 0.0},
            {90, 194.0, 72.0, 0.0},
        
    });
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

    @Test
    public final void testCelsiusAFherenheit() throws TemperaturaNoValidaException {
        //fail ("Sin implementar");
        //Conversor conversor = new Conversor();
        assertEquals(fharenheit, conversor.celsiusAFharenheit(celsius), error);
    }

    @Test
    public final void testCelsiusAReamur() throws TemperaturaNoValidaException {
        //fail ("Sin implementar");
        //Conversor conversor = new Conversor();
        assertEquals(reamur, conversor.celsiusAReamur(celsius), error);
    }
    
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