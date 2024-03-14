package org.example.planas;

public class HexagonoRegular {

    double lado;

    public HexagonoRegular(double lado){
        this.lado = lado;
    }

    public double HexRegularArea(){
        return 6 * lado * Math.sqrt(0.75);
    }

    public double HexRegularAPerimetro(){
        return lado * 6;
    }

    public String RetornaStringHexagono(){
        return "A área do hexagono regular é " + HexRegularArea() + " e o perímetro é " + HexRegularAPerimetro();
    }


}


