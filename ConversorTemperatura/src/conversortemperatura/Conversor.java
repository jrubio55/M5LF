/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversortemperatura;

/**
 *
 * @author Jorge
 */
public class Conversor {

    private final double CEROABSOLUTO = -273.15;

    public Conversor() {
        super();
    }

    public double celsiusAFharenheit(double celsius) throws TemperaturaNoValidaException {
        if (celsius < CEROABSOLUTO) {
            throw new TemperaturaNoValidaException();
        }
        return 9.0 / 5.0 * celsius + 32.0;
    }

    public double celsiusAReamur(double celsius) throws TemperaturaNoValidaException {
        if (celsius < CEROABSOLUTO) {
            throw new TemperaturaNoValidaException();
        }
        return 4.0 / 5.0 * celsius;
    }
}
