public interface Notificacao {
    String canal();
    void enviar(String destinatario, String mensagem);
}
