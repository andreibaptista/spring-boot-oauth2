/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.diego.oauth.server.exceptions;

/**
 *
 * @author Diego NOTE
 */
public class AutenticacaoException extends Exception {

    public AutenticacaoException() {
        super("Usuário ou senha inválidos");
    }

    public AutenticacaoException(String message) {
        super(message);
    }

}
