/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fvgprinc.tools.common.app.configuration.source;

import com.fvgprinc.tools.common.app.configuration.AppConfigUtils;
import com.fvgprinc.tools.common.app.configuration.AppGlobalParamConfigFile;

/**
 *
 * @author francisco
 */
public class ConfigFileFactory {

    private static final ConfigFileFactory instance;

    static {
        instance = new ConfigFileFactory();
    }
    ConfigFileManager configFileManager;

    private ConfigFileFactory() {
        configFileManager = initSpecificConfigFile(AppGlobalParamConfigFile.getInstance().getDefTypeConfFile());
    }

    private ConfigFileManager initSpecificConfigFile(AppConfigUtils.AppConfigFileTypes pTypeFile) {
        ConfigFileManager res;

        switch (pTypeFile) {
            case XMLFile:
                res = XMLConfigFileManager.getInstance();
                break;
            default:
                res = null;
                break;

        }
        return res;

    }

    public static ConfigFileFactory getInstance() {
        return instance;
    }

    public ConfigFileManager getConfigFileManager() {
        return configFileManager;
    }
}
