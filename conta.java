import java.util.Scanner;
public class conta {
Scanner entrada = new Scanner(System.in);

public void pagamentos(criar minhaConta) {
int opcao = entrada.nextInt();
entrada.nextLine();
switch (opcao) {
 case 1 -> {
  System.out.println("\nVocê escolheu o PIX.\n");
  System.out.println("Informe o tipo da chave PIX:\n 1 - Email     2 - CPF     3 - Número\n");
  int opcao2 = entrada.nextInt();
  entrada.nextLine();
  switch (opcao2) {
   case 1 -> {
    System.out.println("Você escolheu email\nDigite o email que você quer transferir: ");
     String email = entrada.nextLine();
    System.out.println("Email: " + email);
    boolean validador = false;

    while (!validador) {
    System.out.println("Insira o valor que busca transferir: ");
     double quantia = entrada.nextDouble();


    if (quantia >= 0) {
     minhaConta.valor = (minhaConta.valor - quantia);
     System.out.println("\nTransferência realizada com Sucesso!");
     System.out.printf("Saldo atual da conta: R$ %.2f\n", minhaConta.valor);
     validador = true;
       }
    else {
     System.out.println("Insira um valor válido!");
         }
        }
       }


    case 2 -> {
     System.out.println("Você escolheu o CPF\nDigite o número de CPF: ");
      String cpf = entrada.nextLine();
     boolean validador2 = false;
     while (!validador2) {
     System.out.println("CPF: " + cpf);
     System.out.println("Insira o valor que busca transferir: ");
      double quantia2 = entrada.nextDouble();

     if (quantia2 >= 0) {
      minhaConta.valor = minhaConta.valor - quantia2;
      System.out.println("Transferência realizada com sucesso!");
      System.out.printf("Saldo atual da conta: R$ %.2f\n", minhaConta.valor);
      validador2 = true;
       }
     else {
      System.out.println("Insira um valor válido!");
          }
        }
      }


    case 3 -> {
     System.out.println("Você escolheu o Número\nDigite o número de telefone: ");
      String numero = entrada.nextLine();
     System.out.println("Número: " + numero);

     boolean validador3 = false;

     while (!validador3) {
     System.out.println("Insira o valor que busca transferir: ");
      double quantia3 = entrada.nextDouble();

     if (quantia3 >= 0) {
      minhaConta.valor = minhaConta.valor - quantia3;
      System.out.println("Transferência realizada com sucesso!");
      System.out.printf("Saldo atual da conta: R$ %.2f\n", minhaConta.valor);
      validador3 = true;
            }
     else {
      System.out.println("Insira um valor válido!");
          }
         }
        }
     default -> {
      System.out.println("Opção invalída.");
                }
     }
   }
 case 2 -> {
  System.out.println("Você escolheu o BOLETO\nDigite os Números do Boleto: ");
   String codigoBoleto = entrada.nextLine();
  System.out.println("N* do Boleto: " + codigoBoleto);

  boolean validador4 = false; 
  while(!validador4) {
  System.out.println("\nInsira o valor que busca transferir: ");
   double transf = entrada.nextDouble();

  if (transf >= 0) {
   minhaConta.valor = minhaConta.valor - transf;
   System.out.println("Transferência realizada com sucesso!");
   System.out.printf("Saldo atual da conta: R$ %.2f\n", minhaConta.valor);
   validador4 = true;
       }
  else {
   System.out.println("Insira um valor válido!");
       }
     }
   }
 case 3 -> {
  String operadora;
  System.out.println("Você escolheu a RECARGA\nDigite sua Operadora de Telefonia: ");
  operadora = entrada.nextLine();
  System.out.println("Operadora: " + operadora + "\nDigite o seu número de telefone: ");
   var celular = entrada.nextLine();
  System.out.println("Número: " + celular + "\nOperadora: " + operadora);
  boolean validador5 = false;
  while (!validador5) {
   System.out.println("\nInsira o valor para RECARGA: ");
    double transf2 = entrada.nextDouble();

   if (transf2 >= 0) {
    minhaConta.valor = minhaConta.valor - transf2;
    System.out.println("RECARGA realizada com sucesso!");
    System.out.printf("Saldo atual da conta: R$ %.2f\n", minhaConta.valor);
    validador5 = true;
       }
   else {
    System.out.println("Insira um valor valído para recarga!");
        }
       }
     }
   default -> {
    System.out.println("Insira uma opção válido!");
       }
     }
   entrada.close();
   }
  } 
