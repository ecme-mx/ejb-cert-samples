/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecme.singleton;

import javax.annotation.PostConstruct;
import javax.ejb.DependsOn;
import javax.ejb.Singleton;
import javax.ejb.Startup;

/**
 *
 * @author edgar
 */
@Singleton
@Startup
@DependsOn("SessionBeanEg")
public class OtherSessionBean {
    private String state;
    
    @PostConstruct
    private void initialize(){
        state="OtherSessionBean state is INITIALIZE";
        System.out.println("Post construct method of SINGLETON with Startup annotation");
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    /**
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(String state) {
        this.state = state;
    }
}
