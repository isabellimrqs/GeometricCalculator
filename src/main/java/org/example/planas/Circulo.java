package org.example.planas;

public class Circulo {

    double raio;

    public Circulo(double raio){
        this.raio = raio;
    }

    public double CirculoArea(){
        return Math.PI * (raio * raio);
    }

    public double CirculoPerimetro(){
        return 2 * Math.PI * raio;
    }

    public String RetornaStringCirculo(){
        String areaFormatada = String.format("%.2f", CirculoArea());
        String volumeFormatado = String.format("%.2f", CirculoPerimetro());
        return "A área do círculo é " + areaFormatada + " e o perímetro é " + volumeFormatado;
    }



}
