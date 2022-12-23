package pauloeduardoborgesdovale;

class Banco {
private ContaBanco[] contas; //Todas as contas do banco são armazenadas nessa matriz(ou array) de objetos     
private int numeContas;   //Número de contas armazenadas, começa em zero após compilação do programa   

//Contrutor da primeira contaBanco
public Banco() {
    contas = new ContaBanco[100];
    numeContas = 0;
    }

//Abre uma conta com os parametros nome e saldo, guarda no objeto contas, e retorna o número da conta
public int cadastrarConta(String clienteNome, double saldoAbrir) {

    ContaBanco b = new ContaBanco(clienteNome, saldoAbrir);
    contas[numeContas] = b;
    numeContas++;
    System.out.println(b.pegarInfoConta());
    return b.pegarNconta();
}

//Verifica se o número da conta existe e se existir envia argumentos para a função saque
public void sacarDe(int contaNum, double quantidade) {
    for (int i =0; i<numeContas; i++) {
        if (contaNum == contas[i].pegarNconta()  ) {
            contas[i].saque(quantidade);
            System.out.println("Quantidade sacada com sucesso.");
            return;
        }
    }
    System.out.println("Número da conta não encontrado.");
    }

//Deposita em determinada conta uma quantidade se a conta não existir vai mostrar o erro
public void depositeEm(int numeroConta, double quantidade) {
    for (int i =0; i<numeContas; i++) {
        if (numeroConta == contas[i].pegarNconta()  ) {
            contas[i].deposito(quantidade);
            System.out.println("Quantidade depositada com sucesso.");
            return;
        }
    }//em caso de não encontrar o número da conta
    System.out.println("Número da conta não encontrado.");
}

//Pega as informações das contas referentes ao nome, e saldo
public void listarConta(int numContas) {
    for (int i =0; i<numeContas; i++) {
                if (numContas == contas[i].pegarNconta()  ) {
                    System.out.println(contas[i].pegarInfoConta());
                    return;
                }
            }//em caso de não encontrar o número da conta
    System.out.println("Número da conta não encontrado.");
}
}