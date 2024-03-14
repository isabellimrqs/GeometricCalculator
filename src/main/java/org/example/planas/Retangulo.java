package org.example.planas;

public class Retangulo {
    double base;
    double altura;
    public Retangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public double RetanguloArea(){
        return base * altura;
    }

    public double RetanguloPerimetro(){
        return (2 * base) + (2 * altura);
    }
    public String RetornaStringRetangulo(){
        return "A área do retângulo é " + RetanguloArea() + " e a do perímetro é " + RetanguloPerimetro();
    }

}
