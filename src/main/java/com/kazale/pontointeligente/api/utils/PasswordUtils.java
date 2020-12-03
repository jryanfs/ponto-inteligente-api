package com.kazale.pontointeligente.api.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordUtils {
    
    private static final Logger log = LoggerFactory.getLogger(PasswordUtils.class);

    public PasswordUtils(){

    }

    /**
     * Gera um hash utilizando o Bcrypt.
     * 
     * @param Senha
     * @return String 
     */

    public static String gerarBcrypt(String senha){
        if(senha == null){
            return senha;
        }

        log.info("Gerando hash com o Bcrypt");
        BCryptPasswordEncoder bCryptEncoder = new BCryptPasswordEncoder();

        return bCryptEncoder.encode(senha);

    }
}
