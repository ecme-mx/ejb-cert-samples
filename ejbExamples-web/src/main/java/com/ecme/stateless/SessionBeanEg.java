/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecme.stateless;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Stateless;

/**
 *
 * @author edgar
 */
@Stateless
public class SessionBeanEg {
    
    private int variableTest=0;

    
    @PostConstruct
    private void initialize(){
        System.out.println("Session Bean Stateless Created");
        variableTest=100;
    }
    
    @PreDestroy
    private void destroy(){
        System.out.println("Clean up Session Bean Stateless");
    }
    
    public double exampleMethod(double radious){
        return Math.PI*radious;
    }

    /**
     * @return the variableTest
     */
    public int getVariableTest() {
        return variableTest;
    }

    /**
     * @param variableTest the variableTest to set
     */
    public void setVariableTest(int variableTest) {
        this.variableTest = variableTest;
    }
    
    
}
