/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fvgprinc.tools.common.app.configuration;

/**
 * sub factory
 * @author francisco
 */
public class DbParamManager extends  ParameterManager {

    @Override
    public AppParameter getParams() {
        return new AppDbParam();
    }
    
}
