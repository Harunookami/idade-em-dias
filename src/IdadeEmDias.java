public class IdadeEmDias {
    public static void main(String[] args) {
        
        // leitura da idade em anos, meses e dias
        int anos = 26;
        int meses = 8;
        int dias = 23;

        // calculo da idade em dias
        int idadeEmDias = anos * 365 + meses * 30 + dias;

        // Exibição do resultado
        System.out.println("A idade de " + anos + " anos, " + meses + " meses e " +  dias + " dias é igual a " + idadeEmDias + " dias. ");
    }
}