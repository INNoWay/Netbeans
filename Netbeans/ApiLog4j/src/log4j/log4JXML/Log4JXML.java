/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package log4j.log4JXML;

// import java.io.File;
import org.apache.log4j.Logger;
// import org.apache.log4j.xml.DOMConfigurator;

/**
 *
 * @author Daniel, Samuel, Leticia, Bruno
 */
public class Log4JXML {

    
    static Logger log = Logger.getLogger(Log4JXML.class);

    public static void main(String[] args) {

        // Caso log4j.xml não esteja adicionada ao CLASSPATH
        //     String log4jConfigFile = System.getProperty("user.dir")
        //     + File.separator + "log4j.xml";
        // DOMConfigurator.configure(log4jConfigFile)        
        log.info("Esta é uma mensagem do tipo INFO");
        log.debug("Esta é uma mensagem do tipo DEBUG! ");
        log.warn("Esta é uma mensagem do tipo WARN");
        log.fatal("Esta é uma mensagem to tipo FATAL! ");
        log.trace("Esta pe uma mensagem do tipo TRACE!");

    }
}
