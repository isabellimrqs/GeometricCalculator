package org.example.espaciais;

public class Paralelepipedo {

    double comprimento;
    double altura;
    double largura;

    public Paralelepipedo(double comprimento, double altura, double largura){
        this.comprimento = comprimento;
        this.altura = altura;
        this.largura = largura;
    }

    public double ParalelepipedoVolume(){
        return comprimento * altura * largura;
    }

    public double ParalelepipedoArea(){
        return (2 * (comprimento * altura) + (altura * largura) + (comprimento * largura));
    }

    public String RetornaStringParalelepipedo(){
        return "O volume do paralelepípedo é " + ParalelepipedoVolume() + " e a área superficial é " + ParalelepipedoArea();
    }



}
