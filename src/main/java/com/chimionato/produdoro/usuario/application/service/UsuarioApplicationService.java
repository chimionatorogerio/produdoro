package com.chimionato.produdoro.usuario.application.service;

import com.chimionato.produdoro.usuario.application.api.UsuarioCriadoResponse;
import com.chimionato.produdoro.usuario.application.api.UsuarioNovoRequest;

public interface UsuarioApplicationService {
    UsuarioCriadoResponse criaNovoUsuario(UsuarioNovoRequest usuarioNovo);
}
