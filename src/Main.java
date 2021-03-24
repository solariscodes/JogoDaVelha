import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        JogoDaVelha partida = new JogoDaVelha();
        String posicao;
        int valid = 0, rodada = 0;
        Jogador p1, p2;
        System.out.println("Digite o nome do jogador 1:");
        p1 = new Jogador(input.next(), 0);
        System.out.println("Digite o nome do jogador 2:");
        p2 = new Jogador(input.next(), 0);

        while(true) {
            System.out.println("Jogo da Velha");
            partida.Show();
            do {
                System.out.print(p1.getNome() + ", é sua vez de jogar: ");
                posicao = input.next();

                while (!partida.isValid(posicao)) {
                    System.out.println("Jogada inválida.");
                    System.out.print("Player 1, jogue novamente:");
                    posicao = input.next();
                    valid = 0;
                }
                partida.realizaJogada(posicao, "X");
                valid = 1;

            }while(valid == 0);
            rodada++;
            valid = 0;
            partida.Show();
            if(!partida.verificaGanhador(rodada).equals("null")){
                break;
            }
            do{
                System.out.print(p2.getNome() + ", é sua vez de jogar: ");
                posicao = input.next();

                while (!partida.isValid(posicao)) {
                    System.out.println("Jogada inválida.");
                    System.out.print("Player 2, jogue novamente:");
                    posicao = input.next();
                    valid = 0;
                }
                partida.realizaJogada(posicao, "O");
                valid = 1;

            }while(valid == 0);
            rodada++;
            valid = 0;

            if(!partida.verificaGanhador(rodada).equals("null")){
                break;
            }
        }
        if(partida.verificaGanhador(rodada).equals("1")){
            System.out.println(p1.getNome() + " venceu!");}
            else if(partida.verificaGanhador(rodada).equals("2")){
                System.out.println(p2.getNome() + " venceu!");
            }
        }
}


