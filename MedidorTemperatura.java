import java.util.Scanner;

public class MedidorTemperatura {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int temperaturasPorDia = 12;
        int[] temperaturas = new int[temperaturasPorDia];
        float mediaTemperaturas = 0;

        // Solicitação das temperaturas
        for (int i = 0; i < temperaturasPorDia; i++) {
            do {
                System.out.println("Digite a temperatura entre 4°C e 10°C: ");
                temperaturas[i] = scanner.nextInt();
            } while (temperaturas[i] < 4 || temperaturas[i] > 10);
        }

        // Cálculo da média das temperaturas
        for (int temperatura : temperaturas) {
            mediaTemperaturas += temperatura;
        }
        mediaTemperaturas /= temperaturasPorDia;

        // Exibição da média das temperaturas
        System.out.println("A média de hoje das temperaturas é: " + mediaTemperaturas + "°C");

        scanner.close();
    }
}