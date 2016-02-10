/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecme.stateful;

import java.util.ArrayList;
import java.util.List;  
import javax.annotation.PostConstruct;
import javax.ejb.PostActivate;
import javax.ejb.PrePassivate;
import javax.ejb.Stateful;

/**
 *
 * @author edgar
 */
@Stateful
public class SessionBean {
    
    private List<String> names;
    
    @PostConstruct
    private void initialize(){
        names=new ArrayList<String>();
    }
    
    @PrePassivate
    public void prepareForPassivate(){
        System.out.println("Preparing for Passivation ---------------->");
    }
    
   @PostActivate
    public void restoreFromPassivation(){
        System.out.println("Restoring from Passivation ---------------->");
    }
    
    public void addName(String name){
        names.add(name);
    }
    
    
    
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    /**
     * @return the names
     */
    public List<String> getNames() {
        return names;
    }
}
