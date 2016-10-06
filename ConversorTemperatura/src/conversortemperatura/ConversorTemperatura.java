package conversortemperatura;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Jorge
 */
public class ConversorTemperatura {

    Conversor conversor = new Conversor();

    public static void main(String[] args) {
        Conversor conversor = new Conversor();
        for (int celsius = 0; celsius < 101; celsius += 5) {

            try {
                double fharenheit = conversor.celsiusAFharenheit(celsius);
                double reamur = conversor.celsiusAReamur(celsius);
                System.out.println(celsius + "\t" + fharenheit + "\t" + reamur);
            } catch (TemperaturaNoValidaException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
