package candidatos_lab3;

public class Candidato {
    private String nome;
    private String partido;
    private int idade;
    private int numVotos;


    public Candidato(String nome, String partido, int idade, int numVotos){
        this.nome = nome;
        this.partido = partido;
        this.idade = idade;
        this.numVotos = numVotos;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getNumVotos() {
        return numVotos;
    }

    public void setNumVotos(int numVotos) {
        this.numVotos = numVotos;
    }

    public String toString(){
        return this.nome+ " "+this.partido+ " "+this.idade+ " "+this.numVotos;

    }


}
