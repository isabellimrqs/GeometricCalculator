package org.example.planas;

public class TrianguloEquilatero {
    double lado;

    public TrianguloEquilatero(double lado){
        this.lado = lado;
    }

    public double TriEquilateroArea(){
        float raiz = (float) 3 / 4;
        return lado * Math.sqrt(raiz);
    }

    public double TriEquilateroPerimetro(){
        return lado * 3;
    }

    public String RetornaStringTriEquilatero(){
        return "A área do triângulo equilátero é " + TriEquilateroArea() + " e a do perímetro é " + TriEquilateroPerimetro();
    }


}
