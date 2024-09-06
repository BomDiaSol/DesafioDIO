public class ContaPoupanca extends Conta {

    @Override
    public void imprimirDados(){
        System.out.println("---- Informações conta Poupança ----");
        System.out.println(String.format("Agencia: %d", getAgencia()));
        System.out.println(String.format("Conta: %d", getConta()));
        System.out.println(String.format("Saldo: %.2f", getSaldo()));
    }

}
