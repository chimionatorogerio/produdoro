package com.chimionato.produdoro.usuario;

import com.chimionato.produdoro.usuario.application.api.UsuarioAPI;
import com.chimionato.produdoro.usuario.application.api.UsuarioCriadoResponse;
import com.chimionato.produdoro.usuario.application.api.UsuarioNovoRequest;
import com.chimionato.produdoro.usuario.application.service.UsuarioApplicationService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
@RequiredArgsConstructor
public class UsuarioController implements UsuarioAPI {
    private final UsuarioApplicationService usuarioApplicationService;

    @Override
    public UsuarioCriadoResponse postNovoUsuario(UsuarioNovoRequest usuarioNovo) {
        log.info("[inicia] PetController - postNovoUsuario");
        UsuarioCriadoResponse usuarioCriado = usuarioApplicationService.criaNovoUsuario(usuarioNovo);
        log.info("[FINALIZA] PetController - postNovoUsuario");
        return usuarioCriado;
    }
}
