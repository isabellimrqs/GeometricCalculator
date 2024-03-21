package org.example.espaciais;

public class Cilindro {
    double altura;
    double raio;

    public Cilindro(double raio, double altura){
        this.raio = raio;
        this.altura = altura;
    }

    public double CilindroVolume(){
        return Math.PI * altura * raio;
    }

    public double CilindroArea(){
        return ((2 * Math.PI * raio * altura) + (2 * Math.PI * (raio * raio)));
    }

    public String RetornaStringCilindro(){
        String areaFormatada = String.format("%.2f", CilindroArea());
        String volumeFormatado = String.format("%.2f", CilindroVolume());
        return "A área do cilindro é " + areaFormatada + " e o volume é " + volumeFormatado;
    }

}
