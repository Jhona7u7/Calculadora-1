package Operaciones;

/**
 * La clase Operaciones proporciona métodos básicos para realizar cálculos 
 * como suma, resta, multiplicación, división y cálculo de porcentaje.
 */
public class Operaciones {

    /**
     * Suma dos números enteros.
     * 
     * @param a El primer número que se va a sumar.
     * @param b El segundo número que se va a sumar.
     * @return La suma de a y b.
     * 
     * Ejemplo de uso:
     * Operaciones op = new Operaciones();
     * int resultado = op.sumar(5, 10);  // resultado será 15
     */
    public int sumar(int a, int b) {
        return a + b;
    }

    /**
     * Resta dos números enteros.
     * 
     * @param a El número del cual se va a restar.
     * @param b El número que se va a restar a a.
     * @return La diferencia entre a y b.
     * 
     * Ejemplo de uso:
     * Operaciones op = new Operaciones();
     * int resultado = op.restar(10, 5);  // resultado será 5
     */
    public int restar(int a, int b) {
        return a - b;
    }

    /**
     * Multiplica dos números enteros.
     * 
     * @param a El primer número que se va a multiplicar.
     * @param b El segundo número que se va a multiplicar.
     * @return El producto de a y b.
     * 
     * Ejemplo de uso:
     * Operaciones op = new Operaciones();
     * int resultado = op.multiplicar(4, 5);  // resultado será 20
     */
    public int multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * Divide dos números enteros.
     * 
     * @param a El numerador (número que se va a dividir).
     * @param b El denominador (número por el que se va a dividir).
     * @return El cociente de a dividido entre b.
     * @throws IllegalArgumentException si b es 0 (no se permite la división entre cero).
     * 
     * Ejemplo de uso:
     * Operaciones op = new Operaciones();
     * int resultado = op.dividir(10, 2);  // resultado será 5
     */
    public int dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("División por cero no es permitida.");
        }
        return a / b;
    }

    /**
     * Calcula el porcentaje de un número entero.
     * 
     * @param b El número sobre el cual se desea calcular el porcentaje.
     * @return El valor de b dividido entre 100.
     * 
     * Ejemplo de uso:
     * Operaciones op = new Operaciones();
     * double resultado = op.porcentaje(50);  // resultado será 0.5
     */
    public double porcentaje(int b) {
        return b / 100.0;
    }
}
