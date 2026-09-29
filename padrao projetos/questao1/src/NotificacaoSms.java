public class NotificacaoSms implements Notificacao {
    public String canal() { return "SMS"; }
    public void enviar(String destinatario, String mensagem) {
        System.out.println("  [Gateway SMS] para " + destinatario + ": " + mensagem);
    }
}
