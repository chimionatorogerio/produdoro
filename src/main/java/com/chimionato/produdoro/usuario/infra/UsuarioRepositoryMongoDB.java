package com.chimionato.produdoro.usuario.infra;

import com.chimionato.produdoro.usuario.application.service.UsuarioRepository;
import com.chimionato.produdoro.usuario.domain.Usuario;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class UsuarioRepositoryMongoDB implements UsuarioRepository {
    private final UsuarioMongoSpringRepository usuarioMongoRepository;

    @Override
    public Usuario salva(Usuario usuario) {
        return usuarioMongoRepository.save(usuario);
    }
}
