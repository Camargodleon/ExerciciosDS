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
public class SolicitacaoFiscal extends Solicitacao {

    private final TipoAtendimento tipoAtendimento;
    private LocalDateTime horaRegistro;

    public SolicitacaoFiscal(LocalDateTime agora) {
        horaRegistro = agora;
        tipoAtendimento = TipoAtendimento.FISCAL;
    }

    @Override
    public LocalDateTime calculaTempoRestante() {
        return horaRegistro.plusMinutes(120);
    }
}
