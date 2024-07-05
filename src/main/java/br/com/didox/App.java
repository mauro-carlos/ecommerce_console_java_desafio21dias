package br.com.didox;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args ) throws IOException    {

       /*
        Exercicio 1 
        João é um professor de matematica e precisa de um
        programa que faça o calculo da seguinte exmpressao:
        (X * 8 + y) - X + Y /100

        Faça um programa que resolva o problema que João 
        precisa.

        LEMBRE-SE : pense na usabilidade.
        */

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("digite um numero da variavel X");

        int x = Integer.parseInt(entrada.readLine());

        System.out.println("digite outro numero da Variavel Y");

        int y = Integer.parseInt(entrada.readLine());

        int calculoExpressao = (x * 8 + y) - x + y/100;

        System.out.println("o resultado da expressao: " + calculoExpressao);
        
        
        
       
       
       
       
        // Scanner entrada = new Scanner(System.in);

        // System.out.println("Digite um  Numero");
        // int numero = Integer.parseInt(entrada.nextLine());

        // var resultado = numero + 1000;

        // System.out.println("resultado de (" + numero + ") + 1000 : " + resultado);


        // BufferedReader reader = new BufferedReader(
        //     new InputStreamReader(System.in));

        //     System.out.println("Digite um  Numero");
        //     int numero = Integer.parseInt(reader.readLine());

        //     var resultado = numero + 1000;


        //     System.out.println("resultado de (" + numero + ") + 1000 : " + resultado);

            // System.out.println("Digite o Seu Nome :");

            // var nome = reader.readLine();

            // System.out.println("O nome digitado foi " + nome);

        // Reading data using readLine
        // String name = reader.readLine();
        // int num1 = 3;
        // var num2 = 5;

        // int soma = num1 + num2;

        // System.out.println("O resultado da Operaççao é: " + soma);
    }
}
