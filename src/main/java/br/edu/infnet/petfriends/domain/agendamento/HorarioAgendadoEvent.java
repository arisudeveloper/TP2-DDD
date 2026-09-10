package br.edu.infnet.petfriends.domain.agendamento;

import br.edu.infnet.petfriends.domain.shared.EventoDeDominio;
import java.time.LocalDateTime;

public class HorarioAgendadoEvent implements EventoDeDominio {
    private final String agendamentoId;
    private final String clienteId;
    private final String veterinarioId;
    private final LocalDateTime dataHora;

    public HorarioAgendadoEvent(String agendamentoId, String clienteId, String veterinarioId) {
        if (agendamentoId == null || clienteId == null || veterinarioId == null) {
            throw new IllegalArgumentException("Os identificadores do evento não podem ser nulos.");
        }
        this.agendamentoId = agendamentoId;
        this.clienteId = clienteId;
        this.veterinarioId = veterinarioId;
        this.dataHora = LocalDateTime.now();
    }

    @Override
    public LocalDateTime ocorridoEm() {
        return this.dataHora;
    }

    public String getAgendamentoId() { return agendamentoId; }
    public String getClienteId() { return clienteId; }
    public String getVeterinarioId() { return veterinarioId; }
}