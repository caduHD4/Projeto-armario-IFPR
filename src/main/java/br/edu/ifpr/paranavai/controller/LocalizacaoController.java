/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpr.paranavai.controller;

import br.edu.ifpr.paranavai.service.LocalizacaoService;
import br.edu.ifpr.paranavai.model.Localizacao;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class LocalizacaoController {

    public static List<Localizacao> buscarListaLocalizacoes() {
        return LocalizacaoService.buscarListaLocalizacoes();
    }
}
