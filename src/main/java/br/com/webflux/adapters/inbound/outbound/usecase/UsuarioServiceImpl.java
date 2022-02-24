package br.com.webflux.adapters.inbound.outbound.usecase;

import br.com.webflux.application.core.domain.Usuario;
import br.com.webflux.application.ports.UsuarioServicePort;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
@Slf4j
public class UsuarioServiceImpl {

    private final UsuarioServicePort usuarioServicePort;

    public Mono<Usuario> salvar(Usuario usuario) {
        //log.info("====================== Insert Item in Collection ======================");
        Mono<Usuario> user = usuarioServicePort.save(usuario);
        return user;
    }


    public Flux<Usuario> findAll() {
        return usuarioServicePort.findAll();
    }


    public Mono<Usuario> findById(String id) {
        return usuarioServicePort.findById(id);
    }
}
