public class NotificadorEmail extends Notificador {
    protected Notificacao criarNotificacao() { return new NotificacaoEmail(); }
}
