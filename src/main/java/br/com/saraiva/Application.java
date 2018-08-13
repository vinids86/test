package br.com.saraiva;

import br.com.saraiva.exercises.ComplexNumber;
import br.com.saraiva.exercises.Exercise2;

import java.util.Arrays;

public class Application {

    public static void main(String[] args) {

        System.out.println("Exercise 1:");
        final ComplexNumber complexNumber1 = new ComplexNumber(6, 5);
        final ComplexNumber complexNumber2 = new ComplexNumber(2, -1);
        System.out.println(complexNumber1.sum(complexNumber2));
        System.out.println(ComplexNumber.sum(complexNumber1, complexNumber2));

        System.out.println("Exercise 2:");
        System.out.println(new Exercise2().counterNames(Arrays.asList("Pedro", "João", "Maria", "JOAO", "Alberto", "João", "MARiA")));
    }
}
