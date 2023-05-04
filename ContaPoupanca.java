public class ContaPoupanca extends Conta {
    public void rejustar(double percentual){
        double saldoAtual = this.getSaldo();//Obtem o saldo atual da conta
        double reajuste = saldoAtual * percentual; //Calcula o reajuste
        this.depositar(reajuste); //deposito o reajuste 
    }
    public ContaPoupanca(int numero, String nome_titular){
        super(numero, nome_titular);
    }
}
