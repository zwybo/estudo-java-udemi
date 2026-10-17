import java.util.Scanner;
import java.util.Scanner;

public class criar {
    Scanner entrada = new Scanner(System.in);
    public String usuario;
    public String senha;
    public double valor = 50.0;

    public void cadastro() {
        System.out.println("Para acessar o sistema, você precisa cadastrar sua conta.\n");
        System.out.println("Digite seu nome: ");
        this.usuario = entrada.nextLine();
        System.out.println("Certo, " + this.usuario + ".");

        boolean senhaVeri = false;

        while (!senhaVeri) {
            System.out.println("Digite sua nova senha: ");
            this.senha = entrada.nextLine();
            System.out.println("Confirme sua senha: ");
            String senhaConfirma = entrada.nextLine();

            if (senhaConfirma.equals(this.senha)) {
                System.out.println("Cadastro realizado com sucesso!");
                senhaVeri = true;
            } else {
                System.out.println("ERRO! As senhas não se COINCIDEM, Tente novamente.");
            }
        }

        System.out.println("\n\nUSUARIO: " + this.usuario + ".");
        System.out.println("Dinheiro na conta: R$ " + this.valor);
        System.out.println("\n1 - PIX      2 - BOLETOS      3 - RECARGA");
    }
}
