/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fvgprinc.tools.common.app.configuration;

import com.fvgprinc.tools.common.app.configuration.source.ConfigFile;
import com.fvgprinc.tools.common.app.configuration.source.ConfigFileFactory;

/**
 *
 * @author francisco
 */
public class AppConfigUtils {

    /**
     * ESTA RUTINA PUEDE IR EN LA CLASE BASE DEL FRAME
     */
    public static void initGlobalSettings(String pfileNameProp) {
        AppGlobalParamConfigFile.getInstance().setDefTypeConfFile(AppGlobalParamConfigFile.getInstance().getDefTypeConfFile());
        AppGlobalParamConfigFile.getInstance().setCfpath(pfileNameProp);
        ConfigFile xmlCf;
        xmlCf = ConfigFileFactory.getInstance().getConfigFileManager().getConfigurationFile();
        xmlCf.setLocation(AppGlobalParamConfigFile.getInstance().getCfpath());
    }
    public enum AppConfigFileTypes {
        XMLFile, PropertyFile, PlainTextFile
    }
    
    public static final AppConfigFileTypes DEFAULTCONFIGFILETYPE = AppConfigFileTypes.XMLFile; 
    
}
