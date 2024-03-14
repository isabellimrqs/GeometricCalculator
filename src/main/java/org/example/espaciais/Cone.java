package org.example.espaciais;

public class Cone {

    double raio;
    double altura;

    public Cone(double raio, double altura){
        this.raio = raio;
        this.altura = altura;
    }

    public double ConeVolume(){
        return (((double) 1 / 3) * Math.PI * (raio * raio));
    }

    public double ConeArea(){
        return Math.PI * raio * raio + Math.PI * raio * altura;
    }

    public String RetornaStringCone(){
        return "O volume do cone é " + ConeVolume() + " e a área superficial é " + ConeArea();
    }




}
