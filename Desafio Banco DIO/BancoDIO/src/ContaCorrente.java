
public class ContaCorrente extends Conta{

    @Override
    public void imprimirDados(){
        System.out.println("---- Informações conta Corrente ----");
        System.out.println(String.format("Agencia: %d", getAgencia()));
        System.out.println(String.format("Conta: %d", getConta()));
        System.out.println(String.format("Saldo: %.2f", getSaldo()));
    }


}
