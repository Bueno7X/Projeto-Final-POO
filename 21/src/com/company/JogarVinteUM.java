package com.company;

import com.company.model.Baralho;
import com.company.model.Carta;
import java.util.Scanner;

public class JogarVinteUM {

    public static void main(String[] args) {
        Scanner menu = new Scanner (System.in);
        while (true) {

            System.out.print("##--\"Preparando o jogo.......\"--##\n\n");
            System.out.print("|-----------------------------|\n");
            System.out.print("| Opção 1 - Iniciar Jogo     |\n");
            System.out.print("| Opção 2 - Sair          |\n");
            System.out.print("|-----------------------------|\n");
            System.out.print("Digite uma opção: ");

            int opcao = menu.nextInt();

            if (opcao == 2) {
                System.out.print("\nAté logo!");
                menu.close();
            }

            switch (opcao) {
                case 1:
                    if (opcao == 1) {
                        Baralho baralho = new Baralho();
                        int i = 0;
                        for (Carta carta : baralho.exibir()) {
                            System.out.println(carta.toString());
                            System.out.println(carta.getValor_n());
                            i = i + carta.getValor_n();
                            System.out.println(i);

                            if (i >= 21) {
                                break;
                            }
                        }

                        System.out.println(i);
                        if (i == 21) {
                            System.out.println("Voce Venceu!!");
                        }

                        else if (i > 21) {
                            System.out.println("Quase Conseguiu...");
                        }

                        else if (i <= 15) {
                            System.out.println("Passou longe KKKKKKKKKKKK");
                        }
                        else {
                            System.out.println("Mais Sorte na Proxima...");
                        }
                        break;
                    }
                default:
                    System.out.print("\nOpção Inválida!");
                    break;
            }
        }
        }
    }
