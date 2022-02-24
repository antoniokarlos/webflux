package br.com.webflux.application.ports;


import br.com.webflux.application.core.domain.Usuario;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioServicePort extends ReactiveMongoRepository<Usuario, String> {



}
