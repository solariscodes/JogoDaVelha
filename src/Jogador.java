public class Jogador {
    private int pontos = 0;
    private String nome;

    public Jogador(String nome, int pontos){
        this.nome = nome;
        this.pontos = pontos;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setPontos(int pontos){
        this.pontos = pontos;
    }
    public int getPontos(){
        return pontos;
    }



}
