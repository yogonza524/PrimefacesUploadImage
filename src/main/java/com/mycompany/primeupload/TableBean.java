/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.primeupload;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author Gonza
 */
@ManagedBean(name="table")
public class TableBean {
    
    List<String> names;

    public List<String> getNames() {
        return names;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }
    
    @PostConstruct
    public void init(){
        names = new ArrayList<>();
        names.add("Gonzalo");
        names.add("Rodrigo");
        names.add("Fabio");
    }
}
