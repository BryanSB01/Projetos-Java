//@author: Bryan
package contadebanco;

import static java.lang.Math.random;

public class Conta {
    public double numConta;
    protected String tipoConta;
    private String donoConta;
    private int saldo;
    private String statusConta;

    public double getNumConta() {
        return numConta;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public String getDonoConta() {
        return donoConta;
    }

    public int getSaldo() {
        return saldo;
    }

    public String getStatusConta() {
        return statusConta;
    }

    public void setNumConta(double numConta) {
        this.numConta = numConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public void setDonoConta(String donoConta) {
        this.donoConta = donoConta;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void setStatusConta(String statusConta) {
        this.statusConta = statusConta;
    }
    
    public void abrirConta(String tipoContaEn){
        this.numConta = Math.round(random() * 10000000);
        if(tipoContaEn.equals("Conta Corrente")){
            this.tipoConta = "Conta Corrente";
            this.setSaldo(this.getSaldo() + 50);
        }
        if(tipoContaEn.equals("Conta Poupança")){
            this.tipoConta = "Conta Poupança";
            this.setSaldo(this.getSaldo() + 150);
        }
        this.statusConta = "Aberta";
    }
    public void fecharConta(){
        if(saldo > 0){
            System.out.println("Você ainda possui " + saldo + " na conta. Use antes de fechá-la!");
        }else if(saldo < 0){
            System.out.println("Você está devendo " + Math.abs(saldo) + " na conta. Pague antes de fechá-la!");
        }else{
            this.statusConta = "Fechada";
            System.out.println("Conta fechada com sucesso!"); 
        }
    }
    public void sacar(int valor){
        if(this.statusConta.equals("Aberta") && valor <= saldo){
            this.setSaldo(this.getSaldo() - valor);
            System.out.println("Você sacou " + valor + " reais.");
        }
    }
    public void depositar(int valor){
        if(valor > 0 && statusConta.equals("Aberta")){
            this.setSaldo(this.getSaldo() + valor);
            System.out.println("Você depositou " + valor + " na conta.");
        }else if(valor > 0 && statusConta.equals("Fechada")){
            System.out.println("Primeiro abra a conta para poder depositar!");
        }else{
            System.out.println("Insira um valor válido para depositar na conta!");
        }
    }
    public void pagarMensalidade(){
        if(this.tipoConta == null && this.getStatusConta().equals("Fechada")){
            System.out.println("Abra uma conta primeiro!");
        }else if(this.tipoConta.equals("Conta Corrente") && this.getStatusConta().equals("Aberta")){
            this.setSaldo(this.getSaldo() - 12);
        } else if(this.tipoConta.equals("Conta Poupança") && this.getStatusConta().equals("Aberta")){
            this.setSaldo(this.getSaldo() - 20);
        }
    }
    public Conta(){
        saldo = 0;
        statusConta = "Fechada";
    }
}
