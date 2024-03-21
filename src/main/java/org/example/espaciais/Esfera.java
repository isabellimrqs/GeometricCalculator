package org.example.espaciais;

public class Esfera {

    double raio;

    public Esfera(double raio){
        this.raio = raio;
    }

    public double EsferaArea(){
        return 4 * Math.PI * Math.pow(raio, 2);
    }
    public double EsferaVolume(){
        return ((double) 4 /3) * Math.PI * Math.pow(raio, 3);
    }

    public String RetornaStringEsfera(){
        String areaFormatada = String.format("%.2f", EsferaArea());
        String volumeFormatado = String.format("%.2f", EsferaVolume());
        return "A área da esfera é " + areaFormatada + " e o volume é " + volumeFormatado;
    }

}


