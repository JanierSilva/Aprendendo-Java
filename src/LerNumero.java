import java.util.Scanner;

public class LerNumero {
    public static void main(String[] args) {
        float numero;

        Scanner leia = new Scanner(System.in);

        System.out.println("Qual seu número?");
        numero = leia.nextFloat();

        if (numero >=50 && numero <= 100){
            System.out.println("Este número está no intevalo.");
        }   else {
            System.out.println("Este número não está no intervalo.");
        }
    }

}


