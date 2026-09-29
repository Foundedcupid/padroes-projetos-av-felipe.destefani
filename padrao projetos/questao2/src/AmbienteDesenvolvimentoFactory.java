public class AmbienteDesenvolvimentoFactory implements AmbienteFactory {
    public BancoDeDados criarBanco() { return new BancoH2(); }
    public Cache criarCache() { return new CacheMemoria(); }
    public Logger criarLogger() { return new LoggerConsole(); }
    public String nome() { return "Desenvolvimento"; }
}
