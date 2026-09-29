public class Main {
    public static void main(String[] args) {
        new Deploy(new AmbienteDesenvolvimentoFactory()).executar();
        System.out.println();
        new Deploy(new AmbienteProducaoFactory()).executar();
    }
}
