import java.util.Scanner;

public class DadosBancarios {
    public static void main(String[] args) {
    
    double saldoDoCliente = 2500.00;
    int operacoes = 0;
    
    
    String operacoesLoop = """
        
    
        Operações

        1- Consultar saldo
        2- Transferir valor
        3- Receber transferência
        4- Sair
            """;
    String dadosDoCliente = """
    *******************************************************************
    Dados iniciais do cliente:
    
    Nome:               Ericles Silva dos Santos  
    Tipo conta:         Corrente 
    Saldo inicial:      R$: 2500,00
    
    *******************************************************************


    Operações

    1- Consultar saldo
    2- Transferir valor
    3- Receber transferência
    4- Sair
            """;

    System.out.println(dadosDoCliente);
    Scanner leitura = new Scanner (System.in);

    while (operacoes != 4) {
        System.out.println("Digite a opção desejada: ");
        operacoes = leitura.nextInt();

        if (operacoes == 1) {
            System.out.println("Seu saldo é de R$: " + saldoDoCliente);
        } else if (operacoes == 2){
            System.out.println("Qual o valor que deseja transferir?");
            double valor = leitura.nextDouble();
            if (valor > saldoDoCliente) {
                System.out.println("Saldo Insuficiente.");
            } else {
                saldoDoCliente -= valor;
                System.out.println("Novo saldo R$: " + saldoDoCliente);
            }

        } else if (operacoes == 3){
            System.out.println("Valor recebido: ");
            double valor = leitura.nextDouble();
            saldoDoCliente += valor;
            System.out.println("Novo saldo R$: " + saldoDoCliente);
        }

        else if (operacoes != 4){
            System.out.println("Opção Inválida!");
        }

        else if (operacoes == 4){
            System.out.println("Você saiu!");
        }
        System.out.println(operacoesLoop);
    }      
    }
}
