package br.com.media;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Boletim listaNotas = new Boletim();
        Scanner s = new Scanner(System.in);
        System.out.println("Deseja calcular média?");
        System.out.println("Responda com \"sim\" ou \"nao\".");
        if (s.next().equalsIgnoreCase("sim")){
            for (int i = 0; i < listaNotas.getlength(); i++){
                System.out.println("digite a " + (i + 1) + "° nota");
                listaNotas.setNota(s.nextDouble(), i);
                if (listaNotas.getNota(i) < 0 || listaNotas.getNota(i) > 10) {
                    while (true) {
                        System.out.println("Nota deve ser um numero de 0 à 10.");
                        System.out.println("digite a nota novamente.");
                        listaNotas.setNota(s.nextDouble(), i);
                        if (listaNotas.getNota(i) >= 0 && listaNotas.getNota(i) <= 10) break;
                    }
                }
            }
            double media = listaNotas.calcularMedia();
            System.out.println("Média do aluno é " + media);
            if (media < 5) System.out.println("Aluno reprovado.");
            else if (media >= 5 && media <7) System.out.println("Aluno em recuperação.");
            else System.out.println("Aluno em aprovado.");
        }
        else return;

    }
}