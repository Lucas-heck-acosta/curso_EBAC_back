public abstract class Pessoa {

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void apresentar() {
        System.out.println("Meu nome é " + getNome());
    }
}
