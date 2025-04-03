package br.com.media;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Boletim listaNotas = new Boletim();
        Scanner s = new Scanner(System.in);
        System.out.println("Deseja calcular média?");
        System.out.println("Responda com \"sim\" ou \"nao\".");
        if (s.next().equalsIgnoreCase("sim")){
            listaNotas.setNota(s.nextDouble());
            double media = listaNotas.calcularMedia();
            if (media < 5) System.out.println("Média do aluno é " + media + ": Aluno reprovado.");
            else if (media >= 5 && media <7) System.out.println("Média do aluno é " + media + ": Aluno em recuperação.");
            else System.out.println("Média do aluno é " + media + ": Aluno em aprovado.");
        }
        else return;

    }
}