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
        return "O volume do cubo é " + CuboVolume() + " e a área superficial é " + CuboArea();
    }













}
