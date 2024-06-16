
import java.util.Scanner;

public class IdadeEmDias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        
        // leitura da idade em anos, meses e dias
        System.out.println("Digite a quaantidade de anos: ");
        int anos = scanner.nextInt();

        System.out.println("Digite a quantidade de meses: ");
        int meses = scanner.nextInt();

        System.out.println("Digite a quantidade de dias: ");
        int dias = scanner.nextInt();

        scanner.close();

        // calculo da idade em dias
        int idadeEmDias = anos * 365 + meses * 30 + dias;

        // Exibição do resultado
        System.out.println("A idade de " + anos + " anos, " + meses + " meses e " +  dias + " dias é igual a " + idadeEmDias + " dias. ");
    
    }
}