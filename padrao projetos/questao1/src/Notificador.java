public abstract class Notificador {

    protected abstract Notificacao criarNotificacao();

    public final void notificar(String destinatario, String assunto) {
        Notificacao notificacao = criarNotificacao();
        String mensagem = "Olá! " + assunto;                      
        System.out.println("Canal: " + notificacao.canal());
        notificacao.enviar(destinatario, mensagem);               
        System.out.println("  [LOG] " + notificacao.canal()       
                + " enviado para " + destinatario);
    }
}
