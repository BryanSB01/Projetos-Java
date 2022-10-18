//@author: Bryan
package contadebanco;

public class ContaDeBanco {

    public static void main(String[] args) {
        Conta c1 = new Conta();
        System.out.println("A conta está: " + c1.getStatusConta() + "\n" + "O saldo da conta é de: " + c1.getSaldo());
    }
    
}
