package br.edu.infnet.petfriends.domain.assinatura;

public class Assinatura {
    private String id;
    private boolean ativa;

    public Assinatura(String id) {
        if (id == null || id.isBlank()) {
            throw new IllegalArgumentException("O ID da assinatura é obrigatório.");
        }
        this.id = id;
        this.ativa = true;
    }

    public void cancelarAssinatura(EventPublisher eventPublisher) {
        if (!this.ativa) {
            throw new IllegalStateException("A assinatura de ração já está desativada.");
        }

        this.ativa = false;

        AssinaturaCanceladaEvent evento = new AssinaturaCanceladaEvent(this.id);
        eventPublisher.publish(evento);
    }

    public String getId() {
        return id;
    }

    public boolean isAtiva() {
        return ativa;
    }
}