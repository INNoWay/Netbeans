/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package log4j.Log4JConfigProgramatica;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;

/**
 *
 * @author Daniel, Samuel, Leticia, Bruno
 */
public class Log4JConfigProgJava {
    public static void main(String[] args) {
        // criando o PatternLayout
        PatternLayout meuLayout = new PatternLayout();
        String patternCoversao = "%-7p %d [%t] %c %x - %m%n";
        meuLayout.setConversionPattern(patternCoversao);
 
        // criando ConsoleAppender
        ConsoleAppender consoleAppender = new ConsoleAppender();
        consoleAppender.setLayout(meuLayout);
        consoleAppender.activateOptions();
 
        // criando FileAppender
        FileAppender arquivoAppender = new FileAppender();
        arquivoAppender.setFile("aplicacaolog.txt");
        arquivoAppender.setLayout(meuLayout);
        arquivoAppender.activateOptions();
 
        // configurando o rootLogger
        Logger rootLogger = Logger.getRootLogger();
        rootLogger.setLevel(Level.DEBUG);
        rootLogger.addAppender(consoleAppender);
        rootLogger.addAppender(arquivoAppender);
 
        // criando um logger e suas messagens
        Logger log = Logger.getLogger(Log4JConfigProgJava.class);
        log.warn("Esta é uma mensagem do tipo WARN! ");
        log.info("Esta é uma mensagem do tipo INFO! ");
        log.debug("Esta é uma mensagem do tipo DEBUG! ");
        log.fatal("Esta é uma mensagem to tipo FATAL! ");
    }
    
}
