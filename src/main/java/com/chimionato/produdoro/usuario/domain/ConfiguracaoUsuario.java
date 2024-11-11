package com.chimionato.produdoro.usuario.domain;

import com.chimionato.produdoro.pomodoro.domain.ConfiguracaoPadrao;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;

@Getter
public class ConfiguracaoUsuario {
    private Integer tempoMinutosFoco;
    private Integer tempoMinutosPausaCurta;
    private Integer tempoMinutosPausaLonga;
    private Integer repeticoesPausaLonga;

    public ConfiguracaoUsuario(ConfiguracaoPadrao configuracaoPadrao) {
        this.tempoMinutosFoco = configuracaoPadrao.getTempoMinutosFoco();
        this.tempoMinutosPausaCurta = configuracaoPadrao.getTempoMinutosPausaCurta();
        this.tempoMinutosPausaLonga = configuracaoPadrao.getTempoMinutosPausaLonga();
        this.repeticoesPausaLonga = configuracaoPadrao.getRepeticoesPausaLonga();
    }
}
