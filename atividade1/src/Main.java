void main() {
    ContaBancaria conta1 = new ContaBancaria();
    ContaBancaria conta2 = new ContaBancaria();

    conta1.titular = "Rodolfo";
    conta1.numero = 101;
    conta1.saldo = 0.0;


    conta2.titular = "Fernando";
    conta2.numero = 103;
    conta2.saldo = 0.0;

    conta1.depositar(500);
    conta1.depositar(200);
    conta1.sacar(100);

    conta2.depositar(1000);
    conta2.depositar(500);
    conta2.sacar(300);

    System.out.println("Extrato Da Conta 1");
    conta1.exibirExtrato();

    System.out.println("\nExtrato Da Conta 2");
    conta2.exibirExtrato();

}


