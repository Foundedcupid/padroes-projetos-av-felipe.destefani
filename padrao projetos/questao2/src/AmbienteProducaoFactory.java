public class AmbienteProducaoFactory implements AmbienteFactory {
    public BancoDeDados criarBanco() { return new BancoPostgres(); }
    public Cache criarCache() { return new CacheRedis(); }
    public Logger criarLogger() { return new LoggerNuvem(); }
    public String nome() { return "Produção"; }
}
