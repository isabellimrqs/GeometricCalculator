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
        return "A área superficial da esfera é " + EsferaArea() + " e o volume é " + EsferaVolume();
    }

}


