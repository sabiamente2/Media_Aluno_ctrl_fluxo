package br.com.media;

public class Boletim {
    private double notas[] = {-1, -1, -1, -1};
    private double media;

    public double calcularMedia(){
        for (int i = 0; i < notas.length; i++) {
            media += this.notas[i];
        }
        return media / this.notas.length;
    }
    public int getlength(){
        return this.notas.length;
    }

    public double getNota(int indice) {
        return this.notas[indice];
    }

    public void setNota(double nota, int indice) {
        this.notas[indice] = nota;
    }
}
