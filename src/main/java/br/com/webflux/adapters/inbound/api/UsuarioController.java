package br.com.webflux.adapters.inbound.api;

import br.com.webflux.adapters.inbound.outbound.usecase.UsuarioServiceImpl;
import br.com.webflux.application.core.domain.Usuario;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@RestController
@RequestMapping("/usuario")
@Slf4j
@RequiredArgsConstructor
public class UsuarioController {

    private final UsuarioServiceImpl usuarioImpl;

    @GetMapping
    public Flux<Usuario> listaAll(){
        return usuarioImpl.findAll();
    }
    @GetMapping("/{id}")
    public Mono<Usuario> findById(@PathVariable("id") String id){
        return usuarioImpl.findById(id)
                .switchIfEmpty(Mono.error(new ResponseStatusException(HttpStatus.NOT_FOUND, "Nenhuma informação encontrada!")))
                .log();
    }
    @PostMapping
    public Mono<Usuario> salvar(@RequestBody Usuario usuario){
        return usuarioImpl.salvar(usuario).log();
    }



}
