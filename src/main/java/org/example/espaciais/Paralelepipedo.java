package org.example.espaciais;

public class Paralelepipedo {

    double comprimento;
    double altura;
    double largura;

    public Paralelepipedo(double comprimento, double altura, double largura){
        this.comprimento = comprimento;
        this.altura = altura;
        this.largura = largura;
    }

    public double ParalelepipedoVolume(){
        return comprimento * altura * largura;
    }

    public double ParalelepipedoArea(){
        return (2 * (comprimento * altura) + (altura * largura) + (comprimento * largura));
    }

    public String RetornaStringParalelepipedo(){
        String areaFormatada = String.format("%.2f", ParalelepipedoArea());
        String volumeFormatado = String.format("%.2f", ParalelepipedoVolume());
        return "A área do paralelepípedo é " + areaFormatada + " e o volume é " + volumeFormatado;
    }



}
