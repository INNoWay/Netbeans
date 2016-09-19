/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package log4j.basico;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

/**
 *
 * @author Daniel, Samuel, Leticia, Bruno
 */
public class Log4JTesteBasico {

    static Logger log = Logger.getLogger(Log4JTesteBasico.class);

    public static void main(String[] args) {

        BasicConfigurator.configure();
        log.debug("Esta é uma mensagem do tipo DEBUG! ");
        meuMetodo();
        log.info("Esta é uma mensagem do tipo INFO");
    }

    private static void meuMetodo() {
        try {
            throw new Exception("Minha Exceção");
        } catch (Exception e) {
            log.error("Isto é uma exceção", e);
        }
    }

}
