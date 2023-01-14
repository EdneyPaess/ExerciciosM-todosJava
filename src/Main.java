public class Main {
  public static void main(String[] args) {
    //Calculadora
    System.out.println("Exercícios calculadora:");
    Calculadora.soma(3,6);
    Calculadora.subtracao(9,1.8);
    Calculadora.multiplicacao(7,8);
    Calculadora.divisao(5,2.5);
    // O que possibilida eu chamar esse método diretamente da classe?
    //R: é a "palavrinha" static, será melhor explicado em orientação a objetos

    //Mensagem
    System.out.println("Exercícios mensagem:");
    Mensagem.obterMensagem(9);
    Mensagem.obterMensagem(14);
    Mensagem.obterMensagem(1);

    //Emprestimo
    System.out.println("Exercícios emprestimo:");
    Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
    Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
    Emprestimo.calcular(1000,5);

    //aqui chamamos a classe, o método principal que era calcular, e entre parentese, chamamos outro metodo com parametros, o que isso significa, o retorno que esse metodo com parametro me der, eu vou passar como parametro para meu outro métoco calcular. esse getDuasParcelas é exatamente o numero 2 lá da classe empprestimo. Com isso tou dizendo que vou pagar meu emprestimo de 100 reais em 2 vezes, o outro de 1000 vou pagar em tres vezes.
    
    // Poderiamos ter feito igual na ultima chamada ali onde colocamos apenas 1000 que representa o valor do emprestimo e 5 que é quantidade de parcelas.
  }
}


