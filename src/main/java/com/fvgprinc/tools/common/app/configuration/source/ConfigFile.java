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
public abstract class  ConfigFile {

    
    private String locationFile;

    public String getLocationFile() {
        return locationFile;
    }

    public void setLocation(String locationFile) {
        this.locationFile = locationFile;
    }
    
    
    public abstract  URL readURLFile();
}
