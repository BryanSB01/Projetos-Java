package calculadoraimc.bryanbelum;

// Importa a classe Scanner da biblioteca java.util para capturar a entrada do usuário.
import java.util.Scanner;

public class IMC {

    // Método estático responsável por calcular e exibir o IMC do usuário.
    public static void CalculadoraIMC() {
        
        // Imprime o cabeçalho da aplicação "Calculadora de IMC".
        System.out.println("##############################");
        System.out.println("Calculadora de IMC");
        System.out.println("##############################");
        System.out.println("##############################");
        
        // Cria um objeto Scanner para receber dados do usuário.
        Scanner entrada = new Scanner(System.in);
        
        // Solicita o nome do usuário.
        System.out.print("# Digite seu nome: ");
        String nome = entrada.nextLine();  // Armazena o nome do usuário na variável 'nome'.
        
        // Solicita a altura do usuário.
        System.out.print("# Digite sua altura: ");
        double alt = entrada.nextDouble(); // Armazena a altura do usuário na variável 'alt'.
        
        // Solicita o peso do usuário.
        System.out.print("# Digite seu peso: ");
        double peso = entrada.nextDouble(); // Armazena o peso do usuário na variável 'peso'.
        
        // Calcula o IMC com base no peso e na altura fornecidos.
        double imc = (peso / (alt * alt)); 
        
        // Imprime uma linha separadora para melhor visualização.
        System.out.println("##############################");
        
        // Exibe o resultado do cálculo do IMC formatado com duas casas decimais.
        System.out.println("##############################");
        System.out.println(nome + " seu IMC é " + String.format("%.2f", imc) + " kg/m².");
        
        // Condicionais para classificar o IMC em categorias:
        if(imc > 40) {
            System.out.println("IMC Obesidade Grau III");  // IMC maior que 40.
        } 
        else if(imc > 35 && imc < 39.9){
            System.out.println("IMC Obesidade Grau II");  // IMC entre 35 e 39.9.
        }
        else if(imc > 30 && imc < 34.9){
            System.out.println("IMC Obesidade Grau I");  // IMC entre 30 e 34.9.
        }
        else if(imc > 25 && imc < 29.9) {
            System.out.println("IMC Sobrepeso");  // IMC entre 25 e 29.9.
        }
        else if(imc > 18.6 && imc < 24.9) {
            System.out.println("IMC Normal");  // IMC entre 18.6 e 24.9.
        }
        else if(imc < 18.6) {
            System.out.println("IMC Abaixo do Normal");  // IMC abaixo de 18.6.
        }
        
        // Imprime uma linha separadora ao final do programa.
        System.out.println("##############################");
        
        // Fecha o objeto Scanner para evitar vazamento de recursos.
        entrada.close();
    }
    
    // Método principal que executa o programa.
    public static void main(String[] args) {
        
        // Chama o método CalculadoraIMC para iniciar a aplicação.
        CalculadoraIMC();
    }
}
