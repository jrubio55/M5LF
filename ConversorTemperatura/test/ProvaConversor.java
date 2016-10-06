/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import conversortemperatura.TemperaturaNoValidaException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import conversortemperatura.*;
import org.junit.Ignore;

/**
 *
 * @author Jorge
 */
public class ProvaConversor {
    
    //private Conversor conversor;
    //private static Conversor conversor;

    public ProvaConversor() {
    }

    @BeforeClass
    public static void setUpClass() {
        //conversor = new Conversor();
    }

    @AfterClass
    public static void tearDownClass() {
        //conversor = null;
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
        fail ("Sin implementar");
        /*Conversor conversor = new Conversor();
        assertEquals(32, conversor.celsiusAFharenheit(0), 0);*/
    }

    @Test
    public final void testCelsiusAReamur() throws TemperaturaNoValidaException {
        fail ("Sin implementar");
        /*Conversor conversor = new Conversor();
        assertEquals(0, conversor.celsiusAReamur(0), 0);*/
    }

    /*@Test
    //@Test(expected=TemperaturaNoValidaException.class)
    public final void testTemperaturaNoValida() throws TemperaturaNoValidaException{
        //fail ("Sin implementar");
        Conversor conversor = new Conversor();
        assertEquals(0, conversor.celsiusAFharenheit(-400),0);
    }*/
    
    @Test
    public final void testTemperaturaNoValida() throws TemperaturaNoValidaException {
        //fail ("Sin implementar");
        Conversor conversor = new Conversor();
        try {
            assertEquals(32, conversor.celsiusAFharenheit(-400), 0);
            fail("Para temperaturas por encima de -273 la prueba debe pasar.");
        } catch (Exception e) {

        }

    }
}
