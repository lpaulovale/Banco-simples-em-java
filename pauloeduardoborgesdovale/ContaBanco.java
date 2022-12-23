package pauloeduardoborgesdovale;

//funções para lidar com os dados recebidos do Banco
class ContaBanco{

	//Declara variaveis para criar nova conta de um cliente
    private int numeConta;
    private String nomeCliente;
    private double saldo;
    //Declara variavel de contagem de contas:
    private static int nDeContas=0; 

//Escreve as informações da conta quando é chamada por listar
    public String pegarInfoConta(){
        return "Número da conta : " + numeConta + "\nNome do Cliente : " + nomeCliente + "\nSaldo:" + saldo +"\n";
    }
//Guarda informações da conta
    public ContaBanco(String nome, double clienteSaldo){
      nomeCliente = nome;
      saldo = clienteSaldo;
      nDeContas ++;
      numeConta = nDeContas;
    }

//Chamada para verificar se o numero da conta digitada existe nas funções de chamada dentro de um for
 public int pegarNconta(){
     return numeConta;
 }

 //Deposita quantidade
 public void deposito(double quantidade){
     //Se quantidade para deposito for menor do que zero.
	 if (quantidade<=0) {
         System.out.println("Quantidade para depositar deve ser positiva.");
     } else {
         saldo = saldo + quantidade;
     }
 }
 //Saque de uma quantidade
 public void saque(double quantidade)
 {
	   //Se quantidade para sacar for menor do que zero.
     if (quantidade<=0){
          System.out.println("Quantidade para ser sacada deve ser positiva.");
      }
     else
     {
         if (saldo < quantidade) {
             System.out.println("Saldo insuficiente.");
         } else {
             saldo = saldo - quantidade;
         }
     }
 }

 }