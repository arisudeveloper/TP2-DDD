package br.edu.infnet.petfriends.domain.franqueado;

import java.util.Objects;

public class FranqueadoId {
    private final String valor;

    public FranqueadoId(String valor) {
        if (valor == null || valor.isBlank()) {
            throw new IllegalArgumentException("O ID não pode ser vazio.");
        }
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FranqueadoId that = (FranqueadoId) o;
        return Objects.equals(valor, that.valor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(valor);
    }
}