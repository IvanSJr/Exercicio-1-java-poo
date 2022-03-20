package banco;

import java.util.List;

public class Main {

    public static void main(String args[]) {
        Cliente cliente = new Cliente("Ivan", "050.104.025-78", "ivanrjesus01@gmail.com", "Rua Nossa Senhora Aparecida Quadra M Lote 22");
        Conta conta = new Conta(1, 1, 2000.00, 5000.00, cliente);
        Conta conta2 = new Conta(1, 1, 2500.00, 5000.00, cliente);
        System.out.println(conta2.sacar(500.00));
        System.out.println(conta2.depositar(500.00));
    }

}
