package pauloeduardoborgesdovale;

/*Esse arquivo java é a parte do programa que mostra interface ao úsuario, e pega os argumentos
e envia para as funções lidarem.*/

import java.util.Scanner;
public class BancoTeste {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Banco meuBanco = new Banco();
    int opção = 1;
    while(opção != 0){//Enquanto não for zero
        System.out.println();
        System.out.println("1 - Cadastra");
        System.out.println("2 - depositar");
        System.out.println("3 - Sacar");
        System.out.println("4 - Detalhar uma conta do cliente");
        System.out.println("0 - Sair");
        System.out.println();
        System.out.print("Digite uma opção : ");
        opção = sc.nextInt();
        switch (opção) {
            case 1: System.out.println("Digite um nome : ");
                    String nomeCli = sc.next();
                    System.out.println("Digite um saldo : ");
                    double saldo = sc.nextDouble();
                    System.out.println("Conta criada de numero :  " + meuBanco.cadastrarConta(nomeCli, saldo));
                    break;
            case 2: System.out.println("Digite o numero de uma conta : ");
                    int nuConta = sc.nextInt();
                    System.out.println("Digite a quantidade a ser depositada : ");
                    double deposi = sc.nextDouble();
                    meuBanco.depositeEm(nuConta, deposi);
                    break;
            case 3: System.out.println("Digite o numero de uma conta : ");
                    int nConta = sc.nextInt();
                    System.out.println("Digite quantidade a ser sacada : ");
                    double sacar = sc.nextDouble();
                    meuBanco.sacarDe(nConta, sacar);
                    break;
            case 4: System.out.println("Digite o numero de uma conta : ");
                    int nCont = sc.nextInt();
                    meuBanco.listarConta(nCont);
                    break;
           case 0 : break;
          default: System.out.println("Erro.Fim de programa"); break;

        }
        close(sc);
}
}
//fechar Scanner
private static void close(Scanner sc) {
	// TODO Auto-generated method stub
	
}
}