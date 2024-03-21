package org.example;
import org.example.espaciais.*;
import org.example.planas.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nome;
        int opcao;


        System.out.println("Digite seu nome: ");
        nome = scanner.nextLine();
        System.out.println("Olá " + nome + "! Seja bem vindo à... \n" +
                "░█████╗░░█████╗░██╗░░░░░░█████╗░██╗░░░██╗██╗░░░░░░█████╗░██████╗░░█████╗░██████╗░░█████╗░\n" +
                "██╔══██╗██╔══██╗██║░░░░░██╔══██╗██║░░░██║██║░░░░░██╔══██╗██╔══██╗██╔══██╗██╔══██╗██╔══██╗\n" +
                "██║░░╚═╝███████║██║░░░░░██║░░╚═╝██║░░░██║██║░░░░░███████║██║░░██║██║░░██║██████╔╝███████║\n" +
                "██║░░██╗██╔══██║██║░░░░░██║░░██╗██║░░░██║██║░░░░░██╔══██║██║░░██║██║░░██║██╔══██╗██╔══██║\n" +
                "╚█████╔╝██║░░██║███████╗╚█████╔╝╚██████╔╝███████╗██║░░██║██████╔╝╚█████╔╝██║░░██║██║░░██║\n" +
                "░╚════╝░╚═╝░░╚═╝╚══════╝░╚════╝░░╚═════╝░╚══════╝╚═╝░░╚═╝╚═════╝░░╚════╝░╚═╝░░╚═╝╚═╝░░╚═╝\n" +
                "\n" +
                "░██████╗░███████╗░█████╗░███╗░░░███╗███████╗████████╗██████╗░██╗░█████╗░░█████╗░\n" +
                "██╔════╝░██╔════╝██╔══██╗████╗░████║██╔════╝╚══██╔══╝██╔══██╗██║██╔══██╗██╔══██╗\n" +
                "██║░░██╗░█████╗░░██║░░██║██╔████╔██║█████╗░░░░░██║░░░██████╔╝██║██║░░╚═╝███████║\n" +
                "██║░░╚██╗██╔══╝░░██║░░██║██║╚██╔╝██║██╔══╝░░░░░██║░░░██╔══██╗██║██║░░██╗██╔══██║\n" +
                "╚██████╔╝███████╗╚█████╔╝██║░╚═╝░██║███████╗░░░██║░░░██║░░██║██║╚█████╔╝██║░░██║\n" +
                "░╚═════╝░╚══════╝░╚════╝░╚═╝░░░░░╚═╝╚══════╝░░░╚═╝░░░╚═╝░░╚═╝╚═╝░╚════╝░╚═╝░░╚═╝");

        System.out.println("Bom, " + nome + ", hoje vamos fazer alguns cálculos de formas geométricas...");


        boolean continuar = true;
        while (continuar) {
            try {
                System.out.println(nome + ", agora você quer calcular figuras planas ou espaciais: \n 1 - Figuras Planas \n 2 - Figuras Espaciais \n 3  - Sair");
                opcao = scanner.nextInt();

                if (opcao == 1) {
                    System.out.println("Escolha a figura plana: \n 1 - Quadrado \n 2 - Retângulo \n 3 - Triângulo Equilátero \n 4 - Círculo \n 5 - Hexagono Regular");
                    int opcaoFiguraPlana = scanner.nextInt();
                    switch (opcaoFiguraPlana) {
                        case 1 -> {
                            System.out.println("Digite o lado do quadrado: ");
                            int ladoQuadrado = scanner.nextInt();
                            Quadrado quadrado = new Quadrado(ladoQuadrado);
                            System.out.println(quadrado.RetornaStringQuadrado());
                        }
                        case 2 -> {
                            System.out.println("Digite a base do retângulo: ");
                            int baseRetangulo = scanner.nextInt();
                            System.out.println("Digite a altura do retângulo: ");
                            int alturaRetangulo = scanner.nextInt();
                            Retangulo retangulo = new Retangulo(baseRetangulo, alturaRetangulo);
                            System.out.println(retangulo.RetornaStringRetangulo());
                        }
                        case 3 -> {
                            System.out.println("Digite o lado do triângulo equilátero: ");
                            int ladoTriEquilatero = scanner.nextInt();
                            TrianguloEquilatero trianguloEquilatero = new TrianguloEquilatero(ladoTriEquilatero);
                            System.out.println(trianguloEquilatero.RetornaStringTriEquilatero());
                        }
                        case 4 -> {
                            System.out.println("Digite o raio do círculo: ");
                            int raioCirculo = scanner.nextInt();
                            Circulo circulo = new Circulo(raioCirculo);
                            System.out.println(circulo.RetornaStringCirculo());
                        }
                        case 5 -> {
                            System.out.println("Digite o lado do hexágono regular: ");
                            int ladoHex = scanner.nextInt();
                            HexagonoRegular hexRegular = new HexagonoRegular(ladoHex);
                            System.out.println(hexRegular.RetornaStringHexagono());
                        }
                        default -> System.out.println("Opção inválida!!!!!!!!!!!!!!!!!!!!!!!!"  +
                                "\n░░░░░░░░░░░░░░░░░░░░░▓████████████████████████▒░░░░░░░░░░░░░░░░░░░░\n" +
                                "░░░░░░░░░░░░░░░░░░▓█████▓▒░░░░░░░░░░░░░░░▒██████▒░░░░░░░░░░░░░░░░░░\n" +
                                "░░░░░░░░░░░░░░░░████▒░░░░░░░░░░░░░░░░░░░░░░░░░▓███▒░░░░░░░░░░░░░░░░\n" +
                                "░░░░░░░░░░░░░░░███░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░███░░░░░░░░░░░░░░░\n" +
                                "░░░░░░░░░░░░░▒██░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒██░░░░░░░░░░░░░░\n" +
                                "░░░░░░░░░░░░▒██░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░██░░░░░░░░░░░░░\n" +
                                "░░░░░░░░░░░░██░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░██░░░░░░░░░░░░\n" +
                                "░░░░░░░░░░░██▓░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒░░██░░░░░░░░░░░░\n" +
                                "░░░░░░░░░░░██░░██░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░██░░██░░░░░░░░░░░\n" +
                                "░░░░░░░░░░░██░░██░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░██░░██░░░░░░░░░░░\n" +
                                "░░░░░░░░░░░██░░██░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░██░░██░░░░░░░░░░░\n" +
                                "░░░░░░░░░░░██▒░██▓░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░██▓░▒██░░░░░░░░░░░\n" +
                                "░░░░░░░░░░░░██░░██░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░██░░██░░░░░░░░░░░░\n" +
                                "░░░░░░░░░░░░██▒░██░░░░░▒▒▓███▒░░░░░░░▒███▓▒▒░░░░░██░▓██░░░░░░░░░░░░\n" +
                                "░░░░░░░░░░░░░██░██░░██████████▒░░░░░▓██████████░░██▒██░░░░░░░░░░░░░\n" +
                                "░░░░░░░░░░░░░░████░████████████░░░░░████████████░████░░░░░░░░░░░░░░\n" +
                                "░░░░░░░░░░░░░░░███░▒██████████░░░░░░░██████████▒░██▒░░░░░░░░░▒░░░░░\n" +
                                "░░░▒████░░░░░░░▓█▒░░█████████░░░░░░░░░█████████░░▒█▓░░░░░░▓████░░░░\n" +
                                "░░░██░▒██▒░░░░░██░░░░██████▓░░░░█░█░░░░███████░░░░██░░░░░███░░██░░░\n" +
                                "░░░██░░░██▓░░░░██░░░░░░▒▓▓░░░░▒██░██░░░░░▓▓▒░░░░░▒██░░░░███░░░██░░░\n" +
                                "░▓██▒░░░░████▓░░██░░░░░░░░░░░░███░███░░░░░░░░░░░░██░░█████░░░░▓██▒░\n" +
                                "██▓░░░░░░░░▒████████▓░░░░░░░░████░███▓░░░░░░░▒▓████████░░░░░░░░░███\n" +
                                "██▓▒▓███▓░░░░░░▓████████▓░░░░████░███▓░░░░▓████████▓░░░░░░████▓▓███\n" +
                                "░███████████▒░░░░░░███████░░░░██░░░██░░░░██████▓░░░░░░▓███████████░\n" +
                                "░░░░░░░░░░▓█████░░░░██▓▓░██░░░░░░░░░░░░░██░█▒██░░░▒█████▓░░░░░░░░░░\n" +
                                "░░░░░░░░░░░░░▒█████▒▒█▓█░███▓▓▒▒▒▓▒▒▓▓▓███▒███░▓█████░░░░░░░░░░░░░░\n" +
                                "░░░░░░░░░░░░░░░░░▒████▒▓█▒▒█░█▒█░█░█▓█▒█▓░█░█████▒░░░░░░░░░░░░░░░░░\n" +
                                "░░░░░░░░░░░░░░░░░░░░██░░██▓█▓█▓█▒█▒█▓█▓████░▓█▓░░░░░░░░░░░░░░░░░░░░\n" +
                                "░░░░░░░░░░░░░░░░░▓████▓░▓█▓█░█▒█░█░█▒█▒███▒░██████░░░░░░░░░░░░░░░░░\n" +
                                "░░░░░░░░░░░░░▓█████░░██░░░▒█████▓█▓█████▒░░░██░▒█████▓░░░░░░░░░░░░░\n" +
                                "░░░░▒██████████▓░░░░░███░░░░░░░░░░░░░░░░░░░██▒░░░░░▓██████████▒░░░░\n" +
                                "░░░░██░░░▓▓▓░░░░░░▒██████▓░░░░░░░░░░░░░░░███████▒░░░░░░▓▓▒░░▒██░░░░\n" +
                                "░░░░▓██░░░░░░░░▓████▓░░░█████▒░░░░░░▒▓█████░░░▓████▓░░░░░░░▒██▓░░░░\n" +
                                "░░░░░░███░░░░████▒░░░░░░░░▓█████████████▒░░░░░░░░▒████░░░░███░░░░░░\n" +
                                "░░░░░░░██░░░██▒░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▓██░░░██░░░░░░░\n" +
                                "░░░░░░░██▒▓██░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒██▒▓██░░░░░░░\n" +
                                "░░░░░░░░████░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░████░░░░░░░░\n" +
                                "░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n");
                    }
                } else if (opcao == 2) {
                    System.out.println("Escolha a figura espacial: \n 1 - Cilindro \n 2 - Cone \n 3 - Cubo \n 4 - Paralelepípedo \n 5 - Pirâmide de Base Quadrada \n 6 - Esfera");
                    int opcaoFiguraEspacial = scanner.nextInt();
                    switch (opcaoFiguraEspacial) {
                        case 1 -> {
                            System.out.println("Digite o raio do cilindro: ");
                            int raioCilindro = scanner.nextInt();
                            System.out.println("Digite a altura do cilindro: ");
                            int alturaCilindro = scanner.nextInt();
                            Cilindro cilindro = new Cilindro(raioCilindro, alturaCilindro);
                            System.out.println(cilindro.RetornaStringCilindro());
                        }
                        case 2 -> {
                            System.out.println("Digite o raio do cone: ");
                            int raioCone = scanner.nextInt();
                            System.out.println("Digite a altura do cone: ");
                            int alturaCone = scanner.nextInt();
                            Cone cone = new Cone(raioCone, alturaCone);
                            System.out.println(cone.RetornaStringCone());
                        }
                        case 3 -> {
                            System.out.println("Digite o lado do cubo: ");
                            int ladoCubo = scanner.nextInt();
                            Cubo cubo = new Cubo(ladoCubo);
                            System.out.println(cubo.RetornaStringCubo());
                        }
                        case 4 -> {
                            System.out.println("Digite o comprimento do paralelepípedo: ");
                            int comprimentoParalelepipedo = scanner.nextInt();
                            System.out.println("Digite a altura do paralelepípedo: ");
                            int alturaParalelepipedo = scanner.nextInt();
                            System.out.println("Digite a largura do paralelepípedo: ");
                            int larguraParalelepipedo = scanner.nextInt();
                            Paralelepipedo paralelepipedo = new Paralelepipedo(comprimentoParalelepipedo, alturaParalelepipedo, larguraParalelepipedo);
                            System.out.println(paralelepipedo.RetornaStringParalelepipedo());
                        }
                        case 5 -> {
                            System.out.println("Digite a aresta da pirâmide: ");
                            int arestaPiramide = scanner.nextInt();
                            System.out.println("Digite a apótema da pirâmide: ");
                            int apotemaPiramide = scanner.nextInt();
                            System.out.println("Digite a altura da pirâmide: ");
                            int alturaPiramide = scanner.nextInt();
                            PiramideBaseQuadrada piramide = new PiramideBaseQuadrada(arestaPiramide, apotemaPiramide, alturaPiramide);
                            System.out.println(piramide.RetornaStringPiramide());
                        }
                        case 6 -> {
                            System.out.println("Digite o raio da esfera: ");
                            int raioEsfera = scanner.nextInt();
                            Esfera esfera = new Esfera(raioEsfera);
                            System.out.println(esfera.RetornaStringEsfera());
                        }
                    } // swtitch espacial

                } else if (opcao == 3) {
                    continuar = false;
                    System.out.println("Finalizamos por hoje, " + nome + "! Até mais :D \n" +
                            "████████████████████████████████████████\n" +
                            "██████▀░░░░░░░░▀████████▀▀░░░░░░░▀██████\n" +
                            "████▀░░░░░░░░░░░░▀████▀░░░░░░░░░░░░▀████\n" +
                            "██▀░░░░░░░░░░░░░░░░▀▀░░░░░░░░░░░░░░░░▀██\n" +
                            "██░░░░░░░░░░░░░░░░░░░▄▄░░░░░░░░░░░░░░░██\n" +
                            "██░░░░░░░░░░░░░░░░░░█░█░░░░░░░░░░░░░░░██\n" +
                            "██░░░░░░░░░░░░░░░░░▄▀░█░░░░░░░░░░░░░░░██\n" +
                            "██░░░░░░░░░░████▄▄▄▀░░▀▀▀▀▄░░░░░░░░░░░██\n" +
                            "██▄░░░░░░░░░████░░░░░░░░░░█░░░░░░░░░░▄██\n" +
                            "████▄░░░░░░░████░░░░░░░░░░█░░░░░░░░▄████\n" +
                            "██████▄░░░░░████▄▄▄░░░░░░░█░░░░░░▄██████\n" +
                            "████████▄░░░▀▀▀▀░░░▀▀▀▀▀▀▀░░░░░▄████████\n" +
                            "██████████▄░░░░░░░░░░░░░░░░░░▄██████████\n" +
                            "████████████▄░░░░░░░░░░░░░░▄████████████\n" +
                            "██████████████▄░░░░░░░░░░▄██████████████\n" +
                            "████████████████▄░░░░░░▄████████████████\n" +
                            "██████████████████▄▄▄▄██████████████████\n"
);
                    break;
                } else if ( opcao < 0 ){
                    System.out.println("Números negativos não são permitidos... ( ͡╥ \uD83D\uDC45 ͡╥)  ");
                }

            } catch (Exception e) {
                System.out.println(nome + ", os valores devem ser números... \n" +
                                "░░░░░░░░░░░░░░░░░░░░░▓████████████████████████▒░░░░░░░░░░░░░░░░░░░░\n" +
                                "░░░░░░░░░░░░░░░░░░▓█████▓▒░░░░░░░░░░░░░░░▒██████▒░░░░░░░░░░░░░░░░░░\n" +
                                "░░░░░░░░░░░░░░░░████▒░░░░░░░░░░░░░░░░░░░░░░░░░▓███▒░░░░░░░░░░░░░░░░\n" +
                                "░░░░░░░░░░░░░░░███░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░███░░░░░░░░░░░░░░░\n" +
                                "░░░░░░░░░░░░░▒██░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒██░░░░░░░░░░░░░░\n" +
                                "░░░░░░░░░░░░▒██░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░██░░░░░░░░░░░░░\n" +
                                "░░░░░░░░░░░░██░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░██░░░░░░░░░░░░\n" +
                                "░░░░░░░░░░░██▓░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒░░██░░░░░░░░░░░░\n" +
                                "░░░░░░░░░░░██░░██░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░██░░██░░░░░░░░░░░\n" +
                                "░░░░░░░░░░░██░░██░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░██░░██░░░░░░░░░░░\n" +
                                "░░░░░░░░░░░██░░██░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░██░░██░░░░░░░░░░░\n" +
                                "░░░░░░░░░░░██▒░██▓░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░██▓░▒██░░░░░░░░░░░\n" +
                                "░░░░░░░░░░░░██░░██░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░██░░██░░░░░░░░░░░░\n" +
                                "░░░░░░░░░░░░██▒░██░░░░░▒▒▓███▒░░░░░░░▒███▓▒▒░░░░░██░▓██░░░░░░░░░░░░\n" +
                                "░░░░░░░░░░░░░██░██░░██████████▒░░░░░▓██████████░░██▒██░░░░░░░░░░░░░\n" +
                                "░░░░░░░░░░░░░░████░████████████░░░░░████████████░████░░░░░░░░░░░░░░\n" +
                                "░░░░░░░░░░░░░░░███░▒██████████░░░░░░░██████████▒░██▒░░░░░░░░░▒░░░░░\n" +
                                "░░░▒████░░░░░░░▓█▒░░█████████░░░░░░░░░█████████░░▒█▓░░░░░░▓████░░░░\n" +
                                "░░░██░▒██▒░░░░░██░░░░██████▓░░░░█░█░░░░███████░░░░██░░░░░███░░██░░░\n" +
                                "░░░██░░░██▓░░░░██░░░░░░▒▓▓░░░░▒██░██░░░░░▓▓▒░░░░░▒██░░░░███░░░██░░░\n" +
                                "░▓██▒░░░░████▓░░██░░░░░░░░░░░░███░███░░░░░░░░░░░░██░░█████░░░░▓██▒░\n" +
                                "██▓░░░░░░░░▒████████▓░░░░░░░░████░███▓░░░░░░░▒▓████████░░░░░░░░░███\n" +
                                "██▓▒▓███▓░░░░░░▓████████▓░░░░████░███▓░░░░▓████████▓░░░░░░████▓▓███\n" +
                                "░███████████▒░░░░░░███████░░░░██░░░██░░░░██████▓░░░░░░▓███████████░\n" +
                                "░░░░░░░░░░▓█████░░░░██▓▓░██░░░░░░░░░░░░░██░█▒██░░░▒█████▓░░░░░░░░░░\n" +
                                "░░░░░░░░░░░░░▒█████▒▒█▓█░███▓▓▒▒▒▓▒▒▓▓▓███▒███░▓█████░░░░░░░░░░░░░░\n" +
                                "░░░░░░░░░░░░░░░░░▒████▒▓█▒▒█░█▒█░█░█▓█▒█▓░█░█████▒░░░░░░░░░░░░░░░░░\n" +
                                "░░░░░░░░░░░░░░░░░░░░██░░██▓█▓█▓█▒█▒█▓█▓████░▓█▓░░░░░░░░░░░░░░░░░░░░\n" +
                                "░░░░░░░░░░░░░░░░░▓████▓░▓█▓█░█▒█░█░█▒█▒███▒░██████░░░░░░░░░░░░░░░░░\n" +
                                "░░░░░░░░░░░░░▓█████░░██░░░▒█████▓█▓█████▒░░░██░▒█████▓░░░░░░░░░░░░░\n" +
                                "░░░░▒██████████▓░░░░░███░░░░░░░░░░░░░░░░░░░██▒░░░░░▓██████████▒░░░░\n" +
                                "░░░░██░░░▓▓▓░░░░░░▒██████▓░░░░░░░░░░░░░░░███████▒░░░░░░▓▓▒░░▒██░░░░\n" +
                                "░░░░▓██░░░░░░░░▓████▓░░░█████▒░░░░░░▒▓█████░░░▓████▓░░░░░░░▒██▓░░░░\n" +
                                "░░░░░░███░░░░████▒░░░░░░░░▓█████████████▒░░░░░░░░▒████░░░░███░░░░░░\n" +
                                "░░░░░░░██░░░██▒░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▓██░░░██░░░░░░░\n" +
                                "░░░░░░░██▒▓██░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒██▒▓██░░░░░░░\n" +
                                "░░░░░░░░████░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░████░░░░░░░░\n" +
                                "░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n");
                scanner.nextLine();
            }
        }








    }
}
