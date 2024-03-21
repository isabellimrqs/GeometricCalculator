package org.example.espaciais;

public class Cubo {

    double lado;

    public Cubo(double lado){
        this.lado = lado;
    }

    public double CuboVolume(){
        return Math.pow(lado, 3);
    }

    public double CuboArea(){
        return Math.pow(lado, 2) * 6;
    }

    public String RetornaStringCubo(){
        String areaFormatada = String.format("%.2f", CuboArea());
        String volumeFormatado = String.format("%.2f", CuboVolume());
        return "A área do cubo é " + areaFormatada + " e o volume é " + volumeFormatado;
    }













}
