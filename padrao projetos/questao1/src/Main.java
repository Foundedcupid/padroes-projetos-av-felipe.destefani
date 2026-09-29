public class Main {
    public static void main(String[] args) {
        Notificador email = new NotificadorEmail();
        Notificador sms   = new NotificadorSms();
        Notificador push  = new NotificadorPush();

        email.notificar("felipe@exemplo.com", "Seu pedido foi aprovado.");
        sms.notificar("+55 41 99999-0000", "Seu código é 4821.");
        push.notificar("device-9r9A", "Nova mensagem recebida.");
    }
}
