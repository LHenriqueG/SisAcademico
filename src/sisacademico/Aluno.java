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
public class Aluno {

    String matricula;
    String nome;
    int idade;
    String curso;
    String turma;
    String endereco;
    double nota1;
    double nota2;
    double nota3;
    double media;
    
    Scanner entrada = new Scanner(System.in);
    
    public double calcularMedia() {
        double media = (nota1 + nota2 + nota3) / 3;
        return media;        
    }

    public void inserirDados() {
        System.out.println("Matrícula: ");
        matricula = entrada.nextLine();
        System.out.println("Nome: ");
        nome = entrada.nextLine();
        System.out.println("Idade: ");
        idade = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Curso: ");
        curso = entrada.nextLine();
        System.out.println("Turma: ");
        turma = entrada.nextLine();
        System.out.println("Endereço: ");
        endereco = entrada.nextLine();
        System.out.println("Nota 1: ");
        nota1 = entrada.nextDouble();
        System.out.println("Nota 2: ");
        nota2 = entrada.nextDouble();
        System.out.println("Nota 3: ");
        nota3 = entrada.nextDouble();
        media = calcularMedia();
    }
    
    public void compararMedia(Aluno aluno2){
        if (media>aluno2.media){
            System.out.println("Média do Aluno 1 é maior!");
        } else{
            System.out.println("Média do Aluno 2 é maior!");
        }
    }

    public void exibirDados() {
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Curso: " + curso);
        System.out.println("Turma: " + turma);
        System.out.println("Endereço: " + endereco);
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Nota 3: " + nota3);
        System.out.println("Média: " + media);
    }
}
