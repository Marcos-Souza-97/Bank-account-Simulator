public class Conta {
  private double saldo = 0;

  public double sacar(double valor) {
    if (valor <= saldo) {
      saldo -= valor;
      System.out.println("Saque de " + valor + " realizado com sucesso.");
      System.out.println("Saldo atual: " + saldo);
    } else {
      System.out.println("Saldo insuficiente.\nOperação não realizada.");
    }
    return saldo;
  }
public double depositar (double valor) {
    if (valor > 0) {
      saldo += valor;
      System.out.println("Deposito de " + valor + " realizado com sucesso.");
      System.out.println("Saldo atual: " + saldo);
    } else {
      System.out.println("O deposito precisa ser maio que zero.\nTente novamente");
    }
    return saldo;
  }






  
}
