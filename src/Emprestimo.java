/* 3-Calcule o valor final de um empréstimo, a partir
do valor solicitado. Taxas e parcelas influenciam.
Defina arbitrariamente as faixas que influenciam nos valores.  */

public class Emprestimo {
  public static int getDuasParcelas(){
    return 2;
  }
  public static int getTresParcelas(){
    return 3;
  }
  public static double getTaxasDuasParcelas(){
    return 0.3;
  }
  public static double getTaxasTresParcelas(){
    return 0.45;
  }

  public static void calcular(double valor, int parcelas) {
    if(parcelas == 2){
      double valorFinal= valor + (valor * getTaxasDuasParcelas());

      System.out.println("Valor final do empréstimo para 2 parcelas: R$ " + valorFinal);
    
    } else if (parcelas == 3){
      double valorFinal = valor +(valor*getTaxasTresParcelas());

      System.out.println("Valor final do empréstimo para 3 parcelas: R$ " + valorFinal);

    }else{
      System.out.println("Quantidade de parcelas não aceita");
    }
  }
}

//Nesse exercicios usamos dentro do parâmetro valores de tipos diferentes e usamos métodos dentro de métodos