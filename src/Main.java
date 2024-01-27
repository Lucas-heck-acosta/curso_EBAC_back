import java.util.Scanner;
import java.util.ArrayList;


public class Main {


    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> homens = new ArrayList<>();
        ArrayList<String> mulheres = new ArrayList<>();
        while (true) {
            System.out.print("Digite um nome (ou 'sair' para encerrar): ");
            String nome = scanner.nextLine();

            if (nome.equalsIgnoreCase("sair"))
            {
                break;
            }

            do {
                System.out.print("Digite o sexo (H ou M): ");
                char sexo = scanner.nextLine().toUpperCase().charAt(0);

                if (sexo == 'H')
                {
                    homens.add(nome);
                    break;
                }
                else if (sexo == 'M')
                {
                    mulheres.add(nome);
                    break;
                }
                else
                {
                    System.out.println("Sexo inválido.");
                }
            } while (true);
            System.out.println("");

        }
        System.out.println("");
        System.out.println("Homens:");
        for (String homem : homens)
        {
            System.out.println(homem);
        }
        System.out.println("");
        System.out.println("Mulheres:");
        for (String mulher : mulheres)
        {
            System.out.println(mulher);
        }

        scanner.close();
    }
}
