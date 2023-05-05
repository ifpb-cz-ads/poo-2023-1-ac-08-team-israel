import java.util.Scanner;

public class Conta {
    private int numero;
    private String nome_titular;
    private double saldo;
    
    public Conta(int numero, String nome_titular) {
        this.numero = numero;
        this.nome_titular = nome_titular;
        this.saldo = 0;
    }
    
    public void depositar(double valor){
        this.saldo = this.getSaldo() + valor;
    }

    public boolean sacar(double valor){
        if(this.getSaldo() >= valor){
            this.saldo -= valor;
            return true;
        }
        return false;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public int getNumero(){
        return numero;
    }
    
    public String getNome_titular(){
        return nome_titular;
    }
    
    public void setNome_titular(String nome_titular){
        this.nome_titular = nome_titular;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o tipo de conta que deseja criar:");
        System.out.println("1 - Conta");
        System.out.println("2 - Conta Especial");
        System.out.println("3 - Conta Poupança");
        int opcao = input.nextInt();
        
        System.out.println("Digite o número da conta:");
        int numero = input.nextInt();
        
        System.out.println("Digite o nome do titular:");
        String nome_titular = input.next();
        
        if (opcao == 1) {
            Conta conta = new Conta(numero, nome_titular);
        } else if (opcao == 2) {
            System.out.println("Digite o limite da conta especial:");
            double limite = input.nextDouble();
            ContaEspecial conta_especial = new ContaEspecial(numero, nome_titular, limite);
        } else if (opcao == 3) {
            ContaPoupanca conta_poupanca = new ContaPoupanca(numero, nome_titular);
        } else {
            System.out.println("Opção inválida!");
        }
        
        input.close();
    }
}
