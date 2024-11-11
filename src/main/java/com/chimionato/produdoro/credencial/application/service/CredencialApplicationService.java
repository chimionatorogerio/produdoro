package com.chimionato.produdoro.credencial.application.service;

import com.chimionato.produdoro.usuario.application.api.UsuarioNovoRequest;
import jakarta.validation.Valid;

public interface CredencialApplicationService {
    void criaNovaCredencial(@Valid UsuarioNovoRequest usuarioNovo);
}
