package br.edu.infnet.petfriends.domain.assinatura;

public interface EventPublisher {
    void publish(Object event);
}