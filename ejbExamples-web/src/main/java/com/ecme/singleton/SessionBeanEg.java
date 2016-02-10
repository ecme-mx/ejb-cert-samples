/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecme.singleton;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;

/**
 *
 * @author edgar
 */
@Singleton
public class SessionBeanEg {
    private String name;
    
        
    @PostConstruct
    private void initialize(){
       
        System.out.println("Post construct method of SINGLETON FATHER");
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name=name;
    }
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
