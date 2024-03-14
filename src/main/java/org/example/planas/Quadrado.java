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
        return "A área do quadrado é " + QuadradoArea() + " e a do perímetro é " + QuadradoPerimetro();
    }


}
