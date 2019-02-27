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
public class SisAcademico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        Aluno aluno1 = new Aluno();
        Professor professor1 = new Professor();
        Turma turma1 = new Turma();
        Aluno aluno2 = new Aluno();
        while (true) {
            System.out.println("1 - Cadastrar Aluno 1"
                    + "\n2 - Cadastrar Professor"
                    + "\n3 - Cadastrar Turma"
                    + "\n4 - Exibir Dados do Aluno 1"
                    + "\n5 - Exibir Dados do Professor"
                    + "\n6 - Exibir Dados da Turma"
                    + "\n7 - Cadastrar Aluno 2"
                    + "\n8 - Exibir Dados do Aluno 2"
                    + "\n9 - Compara Médias"
                    + "\n0 - Sair");
            int opcao = entrada.nextInt();
            if (opcao == 0) {
                break;
            }
            entrada.nextLine();
            switch (opcao) {
                case 1:
                    aluno1.inserirDados();
                    break;
                case 2:
                    professor1.inserirDados();
                    break;
                case 3:
                    turma1.inserirDados();
                    break;
                case 4:
                    aluno1.exibirDados();
                    break;
                case 5:
                    professor1.exibirDados();
                    break;
                case 6:
                    turma1.exibirDados();
                    break;
                case 7:
                    aluno2.inserirDados();
                    break;
                case 8:
                    aluno2.exibirDados();
                    break;
                case 9:
                    aluno1.compararMedia(aluno2);
                    break;
                default:
                    System.out.println("Opção Inválida!");
            }
        }
    }
}
