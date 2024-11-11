package com.chimionato.produdoro.pomodoro.application.service;

import com.chimionato.produdoro.pomodoro.domain.ConfiguracaoPadrao;
import org.springframework.stereotype.Service;

@Service
public class PomodoroService implements PomodoroApplicationService {
    @Override
    public ConfiguracaoPadrao getConfiguracaoPadrao() {
        //TODO implementar busca das configurações padrões no MongoDB
        return ConfiguracaoPadrao.builder()
                .tempoMinutosFoco(25)
                .tempoMinutosPausaCurta(5)
                .tempoMinutosPausaLonga(15)
                .repeticoesPausaLonga(3)
                .build();
    }
}
