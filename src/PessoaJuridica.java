public class PessoaJuridica extends Pessoa {
    private String cnpj;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public PessoaJuridica(String nome, String cnpj) {
        setNome(nome);
        setCnpj(cnpj);
    }

    public void apresentacao() {
        apresentar();
        System.out.println("CNPJ: " + getCnpj());
    }
}
