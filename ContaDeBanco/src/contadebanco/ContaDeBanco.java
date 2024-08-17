//@author: Bryan
package contadebanco;

public class ContaDeBanco {

    public static void main(String[] args) {
        Conta c1 = new Conta();
        c1.abrirConta("Conta Corrente");
        c1.pagarMensalidade();
        System.out.println(c1.getSaldo());
    }
    
}
