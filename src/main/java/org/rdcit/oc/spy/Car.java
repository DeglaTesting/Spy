/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.rdcit.oc.spy;

/**
 *
 * @author sa841
 */
public class Car {
    
    String id;
    String name;
    String color;
    
    public Car(String id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public Car(){}
  

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
       
    }

    public String setId(String id) {
        this.id = id;
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    
    
    
    public final String fMethod(){
    return "Me fianl";}
    
    
}
