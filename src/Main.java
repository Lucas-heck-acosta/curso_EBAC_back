import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Parte 1:");
        System.out.println("Digite os nomes separados por , ");
        String nomes = scanner.next();
        String[] arrNomes = nomes.split(",");

        int lenArr = arrNomes.length;
        for (int i = 0; i < lenArr - 1; i++){
            for (int j = 0; j < lenArr - i - 1; j++)
            {
                if(arrNomes[j].compareTo(arrNomes[j+1]) > 0){
                    String temp = arrNomes[j];
                    arrNomes[j] = arrNomes[j+1];
                    arrNomes[j+1] = temp;
                }
            }
        }

        for(String name : arrNomes){
            System.out.println(name);
        }

        System.out.println("");
        System.out.println("Parte 2:");

        System.out.println("Digite os nomes e sexos (Ricardo-H) separados por , ");
        String pessoas = scanner.next();
        String[] arrPessoas = pessoas.split(",");

        String homens = "";
        String mulheres = "";
        for (String pessoa : arrPessoas){
            String[] textoSeparado = pessoa.split("-");

            String nome = textoSeparado[0];
            String sexo = textoSeparado[1].toUpperCase();

            if (sexo.equals("H")) {
                homens += nome + ',';
            } else if (sexo.equals("M")) {
                mulheres += nome + ',';
            }
        }
        String[] arrHomens = homens.split(",");
        String[] arrMulheres = mulheres.split(",");

        System.out.println("");
        System.out.println("Homens:");
        for(String h : arrHomens){
            System.out.println(h);
        }
        System.out.println("");
        System.out.println("Mulheres:");
        for(String m : arrMulheres){
            System.out.println(m);
        }
    }
}
