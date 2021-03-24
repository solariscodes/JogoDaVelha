public class JogoDaVelha {
    private String[][] n = {{"1","2","3"}, {"4", "5", "6"}, {"7", "8", "9"}};

    public String Show() {
        for (int linha = 0; linha < 3; linha++) {
            for (int row = 0; row < 3; row++) {
                System.out.printf("  " + n[linha][row]);
            }
            System.out.println("\n");

        }
        return null;
    }
    public boolean isValid(String posicao){
        for (int linha = 0; linha < 3; linha++) {
            for (int row = 0; row < 3; row++) {
                if(n[linha][row].equals(posicao))
                    return true;
            }
        }
        return false;
    }
    public void realizaJogada(String posicao, String jogador){
        if(posicao.equals("1"))
            n[0][0] = jogador;
        else if(posicao.equals("2"))
            n[0][1] = jogador;
        else if(posicao.equals("3"))
            n[0][2] = jogador;
        else if(posicao.equals("4"))
            n[1][0] = jogador;
        else if(posicao.equals("5"))
            n[1][1] = jogador;
        else if(posicao.equals("6"))
            n[1][2] = jogador;
        else if(posicao.equals("7"))
            n[2][0] = jogador;
        else if(posicao.equals("8"))
            n[2][1] = jogador;
        else if(posicao.equals("9"))
            n[2][2] = jogador;
    }
    public String verificaGanhador(int jogadas){
        String[] vetor = new String[8];
        String ganhador = "null";
        if(jogadas == 9){
            ganhador = "SEM GANHADOR.";
        }
        // encontrei essa ideia pesquisando

        vetor[0] = n[0][0] + n[0][1] + n[0][2];
        vetor[1] = n[1][0] + n[1][1] + n[1][2];
        vetor[2] = n[2][0] + n[2][1] + n[2][2];
        vetor[3] = n[0][0] + n[1][0] + n[2][0];
        vetor[4] = n[0][1] + n[1][1] + n[2][1];
        vetor[5] = n[0][2] + n[1][2] + n[2][2];
        vetor[6] = n[0][0] + n[1][1] + n[2][2];
        vetor[7] = n[0][2] + n[1][1] + n[2][0];
        for(int i = 0; i < vetor.length; i++){
            if(vetor[i].equals("XXX")) {
                ganhador = "1";
            }
            else if(vetor[i].equals("OOO")) {
                ganhador = "2";
            }
        }
        return ganhador;
    }
}