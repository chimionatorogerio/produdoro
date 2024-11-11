package com.chimionato.produdoro.usuario.application.service;

import com.chimionato.produdoro.credencial.application.service.CredencialApplicationService;
import com.chimionato.produdoro.pomodoro.application.service.PomodoroApplicationService;
import com.chimionato.produdoro.pomodoro.domain.ConfiguracaoPadrao;
import com.chimionato.produdoro.usuario.application.api.UsuarioCriadoResponse;
import com.chimionato.produdoro.usuario.application.api.UsuarioNovoRequest;
import com.chimionato.produdoro.usuario.domain.Usuario;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
@RequiredArgsConstructor
public class UsuarioService implements UsuarioApplicationService {
    private final PomodoroApplicationService pomodoroService;
    private final CredencialApplicationService credencialService;
    private final UsuarioRepository usuarioRepository;

    @Override
    public UsuarioCriadoResponse criaNovoUsuario(@Valid UsuarioNovoRequest usuarioNovo) {
        log.info("[inicia] UsuarioService - criaNovoUsuario");
        var configuracaoPadrao = pomodoroService.getConfiguracaoPadrao();
        credencialService.criaNovaCredencial(usuarioNovo);
        log.info("<< request >> {}", usuarioNovo);
        var usuario = new Usuario(usuarioNovo, configuracaoPadrao);
        usuarioRepository.salva(usuario);
        log.info("[FINALIZA] UsuarioService - criaNovoUsuario");
        return new UsuarioCriadoResponse(usuario);
    }
}