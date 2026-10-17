public class Main {
    public static void main(String[] args) {
        criar criacao = new criar();
        criacao.cadastro();

        conta operacao = new conta();
        operacao.pagamentos(criacao);
    }
}
