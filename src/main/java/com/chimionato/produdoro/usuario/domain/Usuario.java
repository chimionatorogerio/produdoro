package com.chimionato.produdoro.usuario.domain;

import com.chimionato.produdoro.pomodoro.domain.ConfiguracaoPadrao;
import com.chimionato.produdoro.usuario.application.api.UsuarioNovoRequest;
import jakarta.validation.constraints.Email;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Builder
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Document(collection = "Usuario")
public class Usuario {
    @Id
    private UUID idUsuario;
    @Email
//    @Indexed
    @Indexed(unique = true)
    private String email;
    private ConfiguracaoUsuario configuracao;
    @Builder.Default
    private StatusUsuario status = StatusUsuario.FOCO;
    @Builder.Default
    private Integer quantidadePomodorosPausaCurta = 0;

    public Usuario(UsuarioNovoRequest usuarioNovo, ConfiguracaoPadrao configuracaoPadrao) {
        this.idUsuario = UUID.randomUUID();
        this.email = usuarioNovo.getEmail();
        this.status = StatusUsuario.FOCO;
        this.configuracao = new ConfiguracaoUsuario(configuracaoPadrao);
    }
}
