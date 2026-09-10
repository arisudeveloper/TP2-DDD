package br.edu.infnet.petfriends.domain.assinatura;

import java.time.LocalDateTime;

public class AssinaturaCanceladaEvent {
    private final String assinaturaId;
    private final LocalDateTime ocorridoEm;

    public AssinaturaCanceladaEvent(String assinaturaId) {
        this.assinaturaId = assinaturaId;
        this.ocorridoEm = LocalDateTime.now();
    }

    public String getAssinaturaId() {
        return assinaturaId;
    }

    public LocalDateTime getOcorridoEm() {
        return ocorridoEm;
    }
}