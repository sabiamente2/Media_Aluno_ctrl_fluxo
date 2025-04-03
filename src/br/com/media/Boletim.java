package br.com.media;

public class Boletim {
    private double notas[] = new double[4];
    private double media;

    public double calcularMedia(){
        for (int i = 0; i < notas.length; i++) {
            media += this.notas[i];
        }
        return media;
    }

    public void setNota(double entrada){
        for (int i = 0; i < this.notas.length; i++) {
            System.out.println("digite a nota do aluno");
            System.out.println("nota deve ser um número de 0 à 10");
            this.notas[i] = entrada;
            while (this.notas[i] < 0 ||
                    this.notas[i] > 10) {
                System.out.println("valor invalido, nota deve ser de 0 à 10.");
                this.notas[i] = entrada;
            }
        }
    }

}
