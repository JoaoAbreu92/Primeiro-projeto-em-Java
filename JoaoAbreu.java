package exercicio;

import java.util.Arrays;
import java.util.Scanner;

public class JoaoAbreu {

	public static void main(String[] args) {

		JoaoAbreu joao = new JoaoAbreu();
		joao.metodo1();
		joao.metodo2();
		joao.metodo3();

	}

	private void metodo1() {

		// Primeiro metodo resolvido

		int num1 = 1;
		int num2 = 0;

		for (int i = 1; i <= 10; i++) {
			if (i < 2) {

				System.out.println(1);

			} else {
				num1 = num1 + num2;
				num2 = num1 - num2;

				System.out.println(num1 + " ");
			}
		}

	}

	private void metodo2() {
		// Segundo metodo resolvido
		// resolvi fazer com as notas que temos em reais para ficar diferente, mas o
		// calculo é o mesmo

		Scanner ler = new Scanner(System.in);
		int valor;

		System.out.println("Informe um valor: \n");
		valor = ler.nextInt();

		 int Notas10 = valor / 10;
		    int restante = valor % 10;
		    int Notas5 = restante / 5;
		    restante = restante % 5;
		    int Notas2 = restante / 2;
		    int Notas1 = restante % 2;

		System.out.println("==============================");
		System.out.println("Valor: " + valor);
		System.out.println("Notas de 10$:  " + Notas10);
		System.out.println("Notas de 5$:   " + Notas5);
		System.out.println("Notas de 2$:   " + Notas2);
		System.out.println("Notas de 1$:   " + Notas1);


		System.out.println("==============================");

	}

	private void metodo3() {
		// Esse foi o mais dificil de todos 

		String[] nomes;
		nomes = new String[10];

		for (int i = 0; i < 10; i++) {

			System.out.println("Qual o nome do aluno: " + (i + 1));
			nomes[i] = new Scanner(System.in).nextLine();

		}
		Arrays.sort(nomes);
		for (String aluno : nomes)
			System.out.println("Os nomes ordenados são: " + (aluno));
	}

}
