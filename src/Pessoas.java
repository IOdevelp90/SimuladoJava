public class Pessoas {
    private String nome;
    private int idade;
    private int codigo;

    public Pessoas(String nome, int idade, int codigo) {
        this.nome = nome;
        this.idade = idade;
        this.codigo = codigo;
    }

    public String getNome(){
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public int getCodigo() {
        return codigo;
    }
}
