package main;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
        Scanner read = new Scanner(System.in);
        System.out.print("Digite um número para gerar a sequência de Fibonacci: ");
        int numero = read.nextInt();

        int primeiro = 0, segundo = 1, proximo = 0;
        boolean encontrado = false;

        System.out.print("Sequência de Fibonacci para " + numero + ": ");

        while (proximo <= numero) {
            System.out.print(primeiro + " ");

            if (proximo == numero) {
                encontrado = true;
            }

            proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
        }

        if (encontrado) {
            System.out.println("\n" + numero + " está na sequência de Fibonacci.");
        } else {
            System.out.println("\n" + numero + " não está na sequência de Fibonacci.");
        }
        
        read.close();
		
		
		
	}

}
