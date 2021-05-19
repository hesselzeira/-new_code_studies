import java.sql.SQLOutput;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {

        Scanner inputUsuario = new Scanner(System.in);

        String palavra;

        do {
            try {
                System.out.println("> Digite um anagrama...");
                palavra = inputUsuario.next();
            } catch (Exception erro){
                System.out.println("Ixi, algo deu errado :/");
            }
        } while (inputUsuario == null);{
            System.out.println("--------------------------------");
        }
    }
}
