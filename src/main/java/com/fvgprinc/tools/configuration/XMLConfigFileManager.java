/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fvgprinc.tools.configuration;

/**
 *
 * @author francisco
 */
public class XMLConfigFileManager extends ConfigFileManager {
    private static final XMLConfigFileManager instance;
    
    static {
        instance = new XMLConfigFileManager();
    }
    
    private XMLConfigFileManager() {
        
    }
    
    @Override
    public ConfigFile getConfigurationFile() {
        return XMLConfigFile.getInstance();
    }
    
    public static XMLConfigFileManager getInstance () {
        return instance;
    }
}
