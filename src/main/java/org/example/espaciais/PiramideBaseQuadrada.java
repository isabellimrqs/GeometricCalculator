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
        double areaBase = aresta * aresta;
        double areaLateral = 4 * (0.5 * aresta * apotema);
        return areaBase + areaLateral;
    }

    public double PiramideVolume(){
        return (1.0/3.0) * aresta * aresta * altura;
    }

    public String RetornaStringPiramide(){
        String areaFormatada = String.format("%.2f", PiramideArea());
        String volumeFormatado = String.format("%.2f", PiramideVolume());
        return "A área da pirâmide é " + areaFormatada + " e o volume é " + volumeFormatado;
    }
}
