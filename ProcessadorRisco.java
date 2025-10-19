public class ProcessadorRisco {
  public static void main(String[] args) {

    int[] notasRisco = { 10, 25, 35, 40, 55, 60, 70, 75, 85, 90, 95, 100, 45, 20, 15 };

    double somaPonderada = 0;
    double somaPesos = 0;

    for (int i = 0; i < notasRisco.length; i++) {
      int peso;
      if (i >= 0 && i <= 4) {
        peso = 3;
      } else {
        peso = 1;
      }

      somaPonderada += notasRisco[i] * peso;
      somaPesos += peso;
    }

    double mediaPonderada = somaPonderada / somaPesos;

    int otimistas = 0;
    int alarmantes = 0;

    for (int nota : notasRisco) {
      if (nota <= 20) {
        otimistas++;
      } else if (nota >= 90) {
        alarmantes++;
      }
    }

    String parecerFinal;
    if (mediaPonderada > 70) {
      parecerFinal = "Alto Risco: Venda ou reajuste de portfólio recomendado.";
    } else if (mediaPonderada >= 40 && mediaPonderada <= 70) {
      parecerFinal = "Risco Moderado: Acompanhar de perto, mas manter os ativos.";
    } else {
      parecerFinal = "Baixo Risco: Excelente momento para capitalização.";
    }

    System.out.println("Processamento da Análise de Risco:");
    System.out.println("------------------------------------------");
    System.out.printf("Média Ponderada do Risco: %.2f%n", mediaPonderada);
    System.out.println("Analistas Otimistas (Nota <= 20): " + otimistas);
    System.out.println("Analistas Alarmantes (Nota >= 90): " + alarmantes);
    System.out.println("------------------------------------------");
    System.out.println("Parecer Final: " + parecerFinal);
  }
}
