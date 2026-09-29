public class NotificadorPush extends Notificador {
    protected Notificacao criarNotificacao() { return new NotificacaoPush(); }
}
