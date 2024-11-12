package com.chimionato.produdoro.usuario.infra;

import com.chimionato.produdoro.usuario.domain.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface UsuarioMongoSpringRepository extends MongoRepository<Usuario, UUID> {
}
