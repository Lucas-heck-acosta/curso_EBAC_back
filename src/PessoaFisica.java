public class PessoaFisica extends Pessoa {
    private String cpf;
    private String dataNascimento;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public PessoaFisica(String nome, String cpf, String dataNascimento) {
        setNome(nome);
        setCpf(cpf);
        setDataNascimento(dataNascimento);
    }

    public void apresentacao() {
        apresentar();
        System.out.println("CPF: " + getCpf());
    }

}
