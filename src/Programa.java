public class Programa {

    public static void main(String args[]) {
        PessoaFisica pf = new PessoaFisica("Joao", "123.233.422-12", "10/10/2000");
        PessoaJuridica pj = new PessoaJuridica("Pedro", "11.123.123/0001");

        pf.apresentacao();
        System.out.println("");
        pj.apresentacao();
    }
}
