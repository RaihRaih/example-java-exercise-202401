/*Você deve criar um algoritmo que faça a leitura de 12 temperaturas em um dia.
Cada temperatura deve ser maior ou igual a 4º C (graus Celsius)
e menor ou igual a 10º C.
O algoritmo deve calcular e imprimir a média das temperaturas aferidas naquele dia.
Valide as entradas das temperaturas - se uma temperatura lida não estiver no intervalo
entre 4 e 10, então deverá solicitar a entrada novamente.
A idéia é garantir que somente temperaturas válidas façam parte do cálculo da média.

Análise
Para te apoiar nesse desafio, foi contratado um analista de sistemas. E ele anotou dois cenários de entrada de dados:

1º Cenário

Todas as temperaturas foram medidas com 10 º C.

Logo, a saída do programa deve ser:

A média de hoje das temperaturas é: 10,0º C
2º Cenário

A entrada dos dados respeito o seguinte critério: */

import java.util.Scanner;

public class MedidorTemperatura {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int temperaturasPorDia = 12;
    int temperatura = 0;
    float mediaTemperaturas = 0;

    for (int i = 0; i <= temperaturasPorDia; i++) {
      System.out.println("Digite a temperatura ente 4C° e 10C°: ");
      temperatura = scanner.nextInt();

      System.out.println(i);
    }
  }
}
