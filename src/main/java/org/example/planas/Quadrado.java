package org.example.planas;

public class Quadrado {
    double lado;
    public Quadrado(double lado){
        this.lado = lado;
    }

    public double QuadradoArea(){
        return lado * lado;
    }
    public double QuadradoPerimetro(){
        return lado * 4;
    }
    public String RetornaStringQuadrado(){
        String areaFormatada = String.format("%.2f", QuadradoArea());
        String volumeFormatado = String.format("%.2f", QuadradoPerimetro());
        return "A área do quadrado é " + areaFormatada + " e o perímetro é " + volumeFormatado;
    }


}
