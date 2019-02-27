/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SisAcademico;

import java.util.Scanner;

/**
 *
 * @author Laudson Souza
 */
public class Professor {

    String nome;
    int idade;
    double salario;

    Scanner entrada = new Scanner(System.in);

    public void inserirDados() {
        System.out.println("Nome: ");
        nome = entrada.nextLine();
        System.out.println("Idade: ");
        idade = entrada.nextInt();
        System.out.println("Salário: ");
        salario = entrada.nextDouble();
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.printf("Salário: R$ %5.2f\n", (salario));
    }
}
