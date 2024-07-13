package br.com.didox;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args ) throws IOException    {

        // double restoDivisao = 3.5/2;
        // System.out.println("o resto da divisao é: " + restoDivisao);

        // boolean hojeEstaFrio = false;
        // System.out.println("O tempo esta frio? " + hojeEstaFrio);

        // var moeda = 4.5;
        // var inteiro = 4;
        // var stringNumero = "8";

        // var valor = moeda * inteiro;
        // var valor2 = moeda - inteiro;
        // var valor3 = moeda + inteiro + Double.parseDouble(stringNumero);
        // System.out.println("Resultado: " + valor3);

        //cooncatenaçoes
        // var rotulo = "Nome: ";
        // var nome = "Leandro";

        // var dadoCompleto = rotulo + nome;
        // System.out.println("Dado: " + dadoCompleto);

        // var dadoCompleto = rotulo.concat(nome);
        // System.out.println("Dado: " + dadoCompleto);

        //    var  resultado = String.format("O valor de nome é: %s e o valor de Rotule é %s ", nome,rotulo);
        //    System.out.println( resultado);
            
        // var calculo = 4.5555;
        //     System.out.printf("O resultado é: %.2f",calculo);
       
         /*
         * Joao tem um armazem e precisa de um programa que solicite
         * o nome do seu cliente
         * o endereco do seu cliente
         * o nome do material de construção
         * o valor do material de construção
         * e a  quantidade que o cliente deseja
         * e no final do programa mostre um relatorio com o valor total do produto comprado
         * -----------------------------------------         
         * Cliente: João
         * Endereco de Entrega: Rua...
         * Comprou o material : XXX no Vaor R$ XXX
         * O valor total da compra deu : R$ XXX
         * -----------------------------------------        * 
         * 
         */

        //  double d = 1243123.1;
        //  DecimalFormat df = new DecimalFormat("###,###.00");
        //   System.out.println(df.format(d));

        // System.out.printf("Teste %.2f\n", 4.5);
        // System.out.println("segunada Linha ");

          
        // BufferedReader reader = new BufferedReader(
        //     new InputStreamReader(System.in));

        //  System.out.println("================[Calculo Produto/Cliente]===========================");
        //  System.out.println("Olá João Seja Muito Bem Vindo, Vamos Começar?");
         
        //  System.out.println("Digite o nome do Seu Cliente: ");
        //  var nome = reader.readLine();

        //  System.out.println("Digite o Endereço do Seu Cliente: ");
        //  var endereco = reader.readLine();

        //  System.out.println("Digite o nome do Produto do seu Cliente: ");
        //  var produto = reader.readLine();

        //  System.out.printf("Digite o Valor do Produto (%s) do seu Cliente: ", produto);
        //  var valor = Double.parseDouble(reader.readLine());

        //  System.out.printf("Digite a quantidade do Produto (%s) do seu Cliente: ", produto);
        //  var quantidade = Integer.parseInt(reader.readLine());

        //  var valorTotal = valor * quantidade;

        //  System.out.println("--------------------------------------------------");        
        //  System.out.printf("Cliente: %s\n", nome);
        //  System.out.printf("Endereco de Entrega: %s\n", endereco);
        //  System.out.printf("Comprou o material : %s no Valor R$ %.2f\n",produto, valor);
        //  System.out.printf("O valor total da compra deu : R$ %.2f\n", valorTotal);
        //  System.out.println("----------------------------------------------------");



       /*
        Exercicio 1 
        João é um professor de matematica e precisa de um
        programa que faça o calculo da seguinte exmpressao:
        (X * 8 + y) - X + Y /100

        Faça um programa que resolva o problema que João 
        precisa.

        LEMBRE-SE : pense na usabilidade.
        */

        // BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        // System.out.println("digite um numero da variavel X");

        // int x = Integer.parseInt(entrada.readLine());

        // System.out.println("digite outro numero da Variavel Y");

        // int y = Integer.parseInt(entrada.readLine());

        // int calculoExpressao = (x * 8 + y) - x + y/100;

        // System.out.println("o resultado da expressao: " + calculoExpressao);
        
        
        
       
       
       
       
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


        /*
         * Joao tem um armazem e precisa de um programa que solicite
         * o nome do seu cliente
         * o endereco do seu cliente
         * o nome do material de construção
         * o valor do material de construção
         * e a  quantidade que o cliente deseja
         * e no final do programa mostre um relatorio com o valor total do produto comprado
         * Se a compra do clinete for maior que 100, fale que ele terá desconto na próxima compra
         * -----------------------------------------         
         * Cliente: João
         * Endereco de Entrega: Rua...
         * Comprou o material : XXX no Vaor R$ XXX
         * O valor total da compra deu : R$ XXX
         * Seu pedido foi maior que R$ 100 Terá um desconto na proxima compra
         * -----------------------------------------        * 
         * 
         */

         BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));

         System.out.println("================[Calculo Produto/Cliente]===========================");
         System.out.println("Olá João Seja Muito Bem Vindo, Vamos Começar?");
         
         System.out.println("Digite o nome do Seu Cliente: ");
         var nome = reader.readLine();

         System.out.println("Digite o Endereço do Seu Cliente: ");
         var endereco = reader.readLine();

         System.out.println("Digite o nome do Produto do seu Cliente: ");
         var produto = reader.readLine();

         System.out.printf("Digite o Valor do Produto (%s) do seu Cliente: ", produto);
         var valor = Double.parseDouble(reader.readLine());

         System.out.printf("Digite a quantidade do Produto (%s) do seu Cliente: ", produto);
         var quantidade = Integer.parseInt(reader.readLine());

         var valorTotal = valor * quantidade;

         System.out.println("--------------------------------------------------");        
         System.out.printf("Cliente: %s\n", nome);
         System.out.printf("Endereco de Entrega: %s\n", endereco);
         System.out.printf("Comprou o material : %s no Valor R$ %.2f\n",produto, valor);
         System.out.printf("O valor total da compra deu : R$ %.2f\n", valorTotal);

         if (valorTotal > 100)
           System.out.println("Seu pedido foi maior que 100, Terá um desconto na proxima compra");
         
         System.out.println("----------------------------------------------------");

    }


}
