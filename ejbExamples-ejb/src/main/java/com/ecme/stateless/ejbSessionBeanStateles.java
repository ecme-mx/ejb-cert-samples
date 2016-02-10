/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecme.stateless;

import javax.ejb.Stateless;

/**
 *
 * @author edgar
 */
@Stateless
public class ejbSessionBeanStateles implements ejbSessionBeanStatelesLocal {

    public double exampleMethod(double radious){
        return Math.PI*radious;
    }
}
