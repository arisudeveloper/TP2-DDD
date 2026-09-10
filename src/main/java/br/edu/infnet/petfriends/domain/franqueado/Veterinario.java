package br.edu.infnet.petfriends.domain.franqueado;

public class Veterinario {
    private String crmv;
    private FranqueadoId franqueadoId;

    public Veterinario(String crmv, FranqueadoId franqueadoId) {
        if (crmv == null || crmv.isBlank()) {
            throw new IllegalArgumentException("O registro CRMV é obrigatório.");
        }
        if (franqueadoId == null) {
            throw new IllegalArgumentException("Todo veterinário deve ser associado a um franqueado.");
        }
        this.crmv = crmv;
        this.franqueadoId = franqueadoId;
    }

    public String getCrmv() {
        return crmv;
    }

    public FranqueadoId getFranqueadoId() {
        return franqueadoId;
    }
}