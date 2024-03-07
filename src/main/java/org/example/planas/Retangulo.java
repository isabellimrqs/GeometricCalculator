package org.example.planas;

public class Retangulo {

    double base;
    double altura;

    double RetanguloArea(){
        return base * altura;
    }

    double RetanguloPerimetro(){
        return (2 * base) + (2 * altura);
    }
     String RetornaString(){
        return "A área do retângulo é " + RetanguloArea() + "e p perímetro do retângulo é " + RetanguloPerimetro();
     }


}
