/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package log4j.arquivopropriedades;

// import java.io.File;
import org.apache.log4j.Logger;
// import org.apache.log4j.PropertyConfigurator;

/**
 *
 * @author Daniel, Samuel, Leticia, Bruno
 */
public class Log4JArquivoPropriedades {

    static Logger log = Logger.getLogger(Log4JArquivoPropriedades.class);

    public static void main(String[] args) {

        // Caso log4j.properties não esteja adicionada ao CLASSPATH
        //String log4JArquivoProp = System.getProperty("user.dir")
        //       +File.separator + "log4j.properties";
        //PropertyConfigurator.configure(log4JArquivoProp);
        log.debug("Esta é uma mensagem do tipo DEBUG! ");
        log.info("Esta é uma mensagem do tipo INFO");
        log.warn("Esta é uma mensagem do tipo WARN");
        log.fatal("Esta é uma mensagem to tipo FATAL! ");
        log.trace("Esta é uma mensagem do tipo TRACE!");
    }
}
