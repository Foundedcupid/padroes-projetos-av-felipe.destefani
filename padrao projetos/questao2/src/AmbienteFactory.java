public interface AmbienteFactory {
    BancoDeDados criarBanco();
    Cache criarCache();
    Logger criarLogger();
    String nome();
}
