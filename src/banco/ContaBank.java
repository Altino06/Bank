package banco;

public class ContaBank {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    //Status geral:
    public void statusGeral (){
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo de conta: " + this.getTipo());
        System.out.println("Dono da conta: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
    }

    //Métodos simples:
    public void abrirConta(String tipo1) {
        setTipo(tipo1);
        setStatus(true);
        if (tipo1 == "CC") {
            setSaldo(50);
        }
        if (tipo1 == "CP") {
            setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!");

    } //METODO CONSTRUCTOR

    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Processo negado. Ainda há saldo na conta.");
        } else if (this.getSaldo() < 0) {
            System.out.println("Não foi possível fechar a conta. Há saldo devedor.");
        } else {
            setStatus(false); //FALSE RESULTA QUE A CONTA DE FATO ESTÁ FECHADA
        }
        System.out.println("Conta fechada com sucesso.");
    }

    public void depositar(float valor) {
        if (isStatus()) {
            setSaldo(getSaldo() + valor);
        } else {
            System.out.println("Não há como depositar. Conta inexistente");
        }

    } //EXPLICAÇÃO: SETSALDO É O VALOR QUE EU TENHO, MAIS O VALOR A SER COLOCADO, QUE VAI SER ALOCADO NA VAR VALOR
    public void sacar(float saque) {
        if (isStatus()) {
            if (getSaldo() >= saque) {
                this.setSaldo(getSaldo() - saque);
                System.out.println("Saque realizado com sucesso!");
            } else {
                System.out.println("Saldo insuficiente para saque");
            }
        } else {
            System.out.println("Erro. Conta fechada");
        }
    }

    public void pagMensal() {
        int valor = 0;
        if (getTipo() == "CC") {
            valor = 12;
        }
        if (getTipo() == "CP") {
            valor = 20;
        }
        if (this.isStatus()) {
            setSaldo(getSaldo() - valor);
            System.out.println("Mensalidade paga com sucesso");
        } else {
            System.out.println("Saldo insuficiente");
        }

    }

    public ContaBank() {
        this.setSaldo(0);
        this.setStatus(false);
    }
// Métodos especiais:

    public int getNumConta() {
        return this.numConta;
    }

    public void setNumConta(int numConta1) {
        this.numConta = numConta1;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo1) {
        this.tipo = tipo1;
    }

    public String getDono() {
        return this.dono;
    }

    public void setDono(String dono1) {
        this.dono = dono1;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public void setSaldo(float saldo1) {
        this.saldo = saldo1;
    }

    public boolean isStatus() {
        return this.status;
    }

    public void setStatus(boolean status1) {
        this.status = status1;
    }
}
