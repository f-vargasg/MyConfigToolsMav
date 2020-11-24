/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fvgprinc.tools.common.app.configuration.source;

import java.net.URL;

/**
 *
 * @author francisco
 */
public class XMLConfigFile extends ConfigFile {
 //   public static final String xmlPropName = "resources/appProperties.xml";
    private static final XMLConfigFile instance;

    static {
        instance = new XMLConfigFile();
    }
    
    
    private XMLConfigFile() {
        
    }

    @Override
    public URL readURLFile() {
         String str = this.getLocationFile();
        //String str = "appProperties.xml";
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        // URL configURL = getClass().getResource(str);
        String scrap = str;
        URL configURL = loader.getResource(str);
        
        return configURL;
    }
    
    
    
    public static XMLConfigFile getInstance() {
        return instance;
    }
    
}
