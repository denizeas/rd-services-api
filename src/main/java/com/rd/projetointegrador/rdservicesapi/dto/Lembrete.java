package com.rd.projetointegrador.rdservicesapi.dto;

import com.rd.projetointegrador.rdservicesapi.entity.LembreteIntervaloEntity;
import com.rd.projetointegrador.rdservicesapi.entity.UsuarioEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Lembrete {
    private BigInteger idLembrete;
    private UsuarioEntity paciente;
    //private LembreteIntervaloEntity lembreteIntervalo;
    private String lembreteIntervalo;
    private String nmTitulo;
    private String dsLembrete;
    private Date dtLembrete;
    private Date dtCriacao;
    private Date hrHora;
    private Integer nrRepeticao;
}
