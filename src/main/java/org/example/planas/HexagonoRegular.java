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
        String areaFormatada = String.format("%.2f", HexRegularArea());
        String volumeFormatado = String.format("%.2f", HexRegularAPerimetro());
        return "A área do hexágono é " + areaFormatada + " e o perímetro é " + volumeFormatado;
    }


}


