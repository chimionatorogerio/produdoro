package com.chimionato.produdoro.credencial.application.service;

import com.chimionato.produdoro.usuario.application.api.UsuarioNovoRequest;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;

@Service
public class CredencialService implements CredencialApplicationService {
    @Override
    public void criaNovaCredencial(@Valid UsuarioNovoRequest usuarioNovo) {
        // TODO implementar método para criar nova credencial
    }
}
