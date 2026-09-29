public class Deploy {
    private final String ambiente;
    private final BancoDeDados banco;
    private final Cache cache;
    private final Logger logger;

    public Deploy(AmbienteFactory fabrica) {
        this.ambiente = fabrica.nome();
        this.banco = fabrica.criarBanco();
        this.cache = fabrica.criarCache();
        this.logger = fabrica.criarLogger();
    }

    public void executar() {
        System.out.println("Deploy em " + ambiente);
        System.out.println("  Banco : " + banco.descricao());
        System.out.println("  Cache : " + cache.descricao());
        System.out.println("  Logger: " + logger.descricao());
    }
}
