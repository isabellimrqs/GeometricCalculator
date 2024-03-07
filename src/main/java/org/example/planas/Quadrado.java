package org.example.planas;

public class Quadrado {

    double lado;

    double QuadradoArea(){
        return lado * 2;
    }
    double QuadradoPerimetro(){
        return lado * 4;
    }
    String RetornaString(){
        return "A área do quadrado é " + QuadradoArea() + "e a o perímetro é " + QuadradoPerimetro();
    }


}
