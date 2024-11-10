package com.chimionato.Produdoro.usuario.domain;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;

@Builder(access = AccessLevel.PACKAGE)
@Getter
public class ConfiguracaoUsuario {
    private Integer tempoMinutosFoco;
    private Integer tempoMinutosPausaCurta;
    private Integer tempoMinutosPausaLonga;
    private Integer repeticoesPausaLonga;
}
