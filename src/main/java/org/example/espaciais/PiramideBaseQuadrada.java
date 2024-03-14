package org.example.espaciais;

public class PiramideBaseQuadrada {

    double aresta;
    double apotema;
    double altura;

    public PiramideBaseQuadrada(double aresta, double apotema, double altura){
        this.aresta = aresta;
        this.apotema = apotema;
        this.altura = altura;
    }

    public double PiramideArea(){
        return ((2 * aresta * apotema) + (aresta * aresta));
    }

    public double PiramideVolume(){
        return ((aresta * altura) / 3);
    }

    public String RetornaStringPiramide(){
        return "A área da pirâmide é " + PiramideArea() + " e o volume é " + PiramideVolume();
    }


}
