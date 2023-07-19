/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fvgprinc.tools.configuration;

import java.net.URL;

/**
 *
 * @author francisco
 */
public class AppConfigUtils {

    /**
     * ESTA RUTINA PUEDE IR EN LA CLASE BASE DEL FRAME
     */
    public static void initGlobalSettings(String pfileNameProp) {
        /*AppGlobalParamConfigFile.getInstance().setDefTypeConfFile(AppGlobalParamConfigFile.getInstance().getDefTypeConfFile());
        AppGlobalParamConfigFile.getInstance().setCfpath(pfileNameProp);
        ConfigFile xmlCf;
        xmlCf = ConfigFileFactory.getInstance().getConfigFileManager().getConfigurationFile();
        xmlCf.setLocation(AppGlobalParamConfigFile.getInstance().getCfpath());
        System.out.println("com.fvgprinc.tools.common.app.configuration.AppConfigUtils.initGlobalSettings()");
        System.out.println(xmlCf.getConfigURL());*/
        
        
        AppGlobalParamConfigFile.getInstance().setDefTypeConfFile(AppGlobalParamConfigFile.getInstance().getDefTypeConfFile());
        AppGlobalParamConfigFile.getInstance().setCfpath(pfileNameProp);
        ConfigFile xmlCf ;
        xmlCf = ConfigFileFactory.getInstance().getConfigFileManager().getConfigurationFile();
        ClassLoader loader = Thread.currentThread().getContextClassLoader();           
        URL configURL = loader.getResource(pfileNameProp);
        xmlCf.setConfigURL(configURL);        
        xmlCf.setLocation(AppGlobalParamConfigFile.getInstance().getCfpath());
        System.out.println("com.fvgprinc.tools.common.app.configuration.AppConfigUtils.initGlobalSettings()");
        System.out.println(xmlCf.getConfigURL());
        
        
    }
    public enum AppConfigFileTypes {
        XMLFile, PropertyFile, PlainTextFile
    }
    
    public static final AppConfigFileTypes DEFAULTCONFIGFILETYPE = AppConfigFileTypes.XMLFile; 
    
}
