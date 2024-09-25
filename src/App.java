import java.util.Random;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        /*1) Crie um vetor de inteiros ( int ) de 10 posições. 
        Preencha-o com 10 valores digitados pelo usuário . 
        Use um for para exibir os valores deste vetor. */






       /*  int[] numeros = new int[10];

        for(int n = 0; n < 10; n++){
            System.out.println("Digite um numero: ");
            numeros[n] = scan.nextInt();
        }*/









        /*2) Crie uma matriz char com x linhas por 4 colunas que imprima seu nome completo respeitando os espaços. */







       /*  char[][] nome = {
            {'C', 'A', 'I', 'O'},
            {' ', 'C', 'E', 'Z'},
            {'A', 'R', ' ', 'R'},
            {'I', 'B', 'E', 'I'},
            {'R', 'O', ' ', 'B'},
            {'A', 'L', 'T', 'A'},
            {'Z', 'A', 'R', ' '}
        };

        for(char[] linhas:nome){
            for(char coluna:linhas){
                System.out.print(coluna);
            }

        }*/
    


        /*3) Faça um programa com uma matriz 5x5 de inteiros
            positivos ou negativos digitados pelo usuário e encontre e
            exiba o maior elemento desta matriz. */







        /*int[][] num =new  int[5][5];
        int mr = Integer.MIN_VALUE; /*Existe Min Value e Max value - serve p/ comparação */

       /*  for(int nu = 0; nu < 5; nu++){
            for(int nd = 0; nd< 5; nd++){
                System.out.println("digite um numero: ");
                num[nu][nd] = scan.nextInt();

                if(num[nu][nd] > mr){
                    mr = num[nu][nd];
                }
            }
        }

        System.out.println("O maior numero digitado foi: " + mr); 

         */








        /*4) Faça um programa com um vetor com 10 elementos inteiros positivos (aleatórios e de sua escolha).
         Permita que seja solicitado um determinado valor inteiro e positivo para ser procurado neste vetor. Caso exista, 
         o programa deve exibir o índice no qual o valor está posicionado. 
        Caso contrário, o programa deve informar que o elemento não existe no vetor. */








        /*int[] vet = new int[10];

        for(int i = 0; i < vet.length; i++){
            vet[i] = random.nextInt(50) +1;
        }

        System.out.print("Vetor gerado: ");
        for (int num : vet) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("Digite um valor inteiro de 1 a 50 para ser buscado no vetor: ");
        int busca = scan.nextInt();

        int nv;
        for(nv = 0; nv < vet.length; nv++){
            if(vet[nv] == busca){
                    System.out.println("O valor digitado foi encontrado na indice: " + nv);
                    break;
            }
        }

        if (nv == vet.length) {
            System.out.println("O valor digitado não foi encontrado no vetor.");
        }*/






        /*5) Faça um programa com uma matriz com 9 elementos (3x3) reais positivos (aleatórios e de sua escolha). 
        Calcule e exiba a soma dos elementos de cada linha desta matriz. */





        /*int[][] mat = new int[3][3];

        for(int li = 0; li < mat.length; li++){
            for(int colun = 0; colun <mat.length; colun++){
                mat[li][colun] = random.nextInt(10) +1;
            }
        }

        for(int li = 0; li < mat.length; li++){
            int somali = 0;
            for(int colun = 0; colun <mat[li].length; colun++){
              System.out.print(mat[li][colun] + " ");
              somali += mat[li][colun];
            }
            System.out.println(" | a soma da linha foi: " + somali);
        }*/
    }
}