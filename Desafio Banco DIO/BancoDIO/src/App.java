public class App {
    public static void main(String[] args) throws Exception {
        Conta cc = new ContaCorrente();
        cc.setAgencia(11111);
        cc.setConta(22222);
        cc.setSaldo(200);

        cc.depositar(100);
        cc.sacar(50);
        
        Conta cp = new ContaPoupanca();
        cp.setAgencia(3333333);
        cp.setConta(6666666);
        cp.setSaldo(100);

        cc.transferir(100, cp);

        cc.imprimirDados();
        cp.imprimirDados();
    }
}
