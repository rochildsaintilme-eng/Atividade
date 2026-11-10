public class ContaBancaria {
    String titular;
    int numero;
    double saldo;

    void depositar(double valor) {
        saldo = saldo + valor;
    }
    void sacar(double valor) {
        if(valor <= saldo) {
            saldo = saldo - valor;
        }else {
            System.out.println("Saldo insuficiente!!");
        }
    }
    void exibirExtrato(){
        System.out.println("Titular\n" + titular);
        System.out.println("Numero\n" + numero);
        System.out.println("Saldo R$\n" + saldo);
    }

}
