public class NotificadorSms extends Notificador {
    protected Notificacao criarNotificacao() { return new NotificacaoSms(); }
}
