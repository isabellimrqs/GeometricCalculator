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
        return "A área do círculo é " + CirculoArea() + " e o perímetro é " + CirculoPerimetro();
    }



}
