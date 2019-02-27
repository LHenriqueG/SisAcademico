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
public class Turma {

    int codigo;
    String professor;
    String curso;
    
    Scanner entrada = new Scanner(System.in);

    public void inserirDados() {
        System.out.println("Código: ");
        codigo = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Professor: ");
        professor = entrada.nextLine();
        System.out.println("Curso: ");
        curso = entrada.nextLine();
    }

    public void exibirDados() {
        System.out.println("Código: " + codigo);
        System.out.println("Professor: " + professor);
        System.out.println("Curso: " + curso);
    }
}
