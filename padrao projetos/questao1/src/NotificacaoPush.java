public class NotificacaoPush implements Notificacao {
    public String canal() { return "Push"; }
    public void enviar(String destinatario, String mensagem) {
        System.out.println("  [FCM] para o dispositivo " + destinatario + ": " + mensagem);
    }
}
