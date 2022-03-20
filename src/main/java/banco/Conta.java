package banco;

public class Conta {

    private Integer agencia;
    private Integer numero;
    private Double saldo;
    private Double limite;
    private Cliente cliente;

    public Conta() {
    }

    public Conta(Integer agencia, Integer numero, Double saldo, Double limite, Cliente cliente) {
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
        this.limite = limite;
        this.cliente = cliente;
    }

    public String sacar(Double valor){
        if (valor > saldo){
            return "Você só tem R$ " + saldo + " em sua conta.";
        } else if (valor < 0) {
            return "Digite um número positivo.";
        }
        this.saldo -= valor;
        return "Você sacou R$ "+valor+" seu saldo é de R$ "+saldo;
    }

    public String depositar(Double valor){
        if (valor < 0) {
            return "Digite um número positivo.";
        }
        this.saldo += valor;
        return "Você depositou R$ "+valor+" seu saldo é de R$ "+saldo;
    }

    public Integer getAgencia() {
        return agencia;
    }

    public void setAgencia(Integer agencia) {
        this.agencia = agencia;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Double getLimite() {
        return limite;
    }

    public void setLimite(Double limite) {
        this.limite = limite;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
