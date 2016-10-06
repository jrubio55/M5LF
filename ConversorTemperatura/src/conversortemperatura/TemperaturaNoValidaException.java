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
public class TemperaturaNoValidaException extends Exception {

    public TemperaturaNoValidaException() {
        super(" La temperatura no puede se menor que -273 o C ");
    }
}
