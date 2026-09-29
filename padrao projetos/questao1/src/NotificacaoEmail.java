public class NotificacaoEmail implements Notificacao {
    public String canal() { return "E-mail"; }
    public void enviar(String destinatario, String mensagem) {
        System.out.println("  [SMTP] para " + destinatario + ": " + mensagem);
    }
}
