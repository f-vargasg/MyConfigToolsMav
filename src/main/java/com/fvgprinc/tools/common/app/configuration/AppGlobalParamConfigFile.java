/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fvgprinc.tools.common.app.configuration;

import com.fvgprinc.tools.common.app.configuration.AppConfigUtils.AppConfigFileTypes;
import com.fvgprinc.tools.common.string.MyCommonString;

/**
 * This class is a singleton class, to set parameteres required
  * to my framework config file
 * @author francisco
 */
public class AppGlobalParamConfigFile {
    private static AppGlobalParamConfigFile instance;
    
    static {
        instance = new AppGlobalParamConfigFile();
    }
    
    private String cfpath;

    public String getCfpath() {
        return cfpath;
    }

    public void setCfpath(String cfpath) {
        this.cfpath = cfpath;
    }
    
    
    private AppConfigFileTypes defTypeConfFile;

    public AppConfigFileTypes getDefTypeConfFile() {
        return defTypeConfFile;
    }

    public void setDefTypeConfFile(AppConfigFileTypes defTypeConfFile) {
        this.defTypeConfFile = defTypeConfFile;
    }

    private AppGlobalParamConfigFile() {
        this.cfpath = MyCommonString.EMPTYSTR;
        this.defTypeConfFile = AppConfigFileTypes.XMLFile;
    }
    
    public static AppGlobalParamConfigFile getInstance(){
        return instance;
    }
    
    
    
    
    
}
