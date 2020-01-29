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
public class SolicitacaoAtualizacao extends Solicitacao {

    private TipoAtendimento tipoAtendimento;
    private final LocalDateTime horaRegistro;

    public SolicitacaoAtualizacao(LocalDateTime agora) {
        horaRegistro = agora;
        tipoAtendimento = TipoAtendimento.ATUALIZACAO;
    }

    @Override
    public LocalDateTime calculaTempoRestante() {
        return horaRegistro.plusDays(2);
    }

}
