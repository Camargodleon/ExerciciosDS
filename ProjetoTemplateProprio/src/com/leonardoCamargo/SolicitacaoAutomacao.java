/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leonardoCamargo;

import java.time.LocalDateTime;

/**
 *
 * @author Matheus Mendes
 */
public class SolicitacaoAutomacao extends Solicitacao {

    private final TipoAtendimento tipoAtendimento;
    private LocalDateTime horaRegistro;

    public SolicitacaoAutomacao(LocalDateTime agora) {
        horaRegistro = agora;
        tipoAtendimento = TipoAtendimento.AUTOMACAO;
    }

    @Override
    public LocalDateTime calculaTempoRestante() {
        return horaRegistro.plusMinutes(90);
    }

}
