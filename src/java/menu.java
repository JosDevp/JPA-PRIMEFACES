/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ApplicationScoped;

/**
 *
 * @author guru
 */
@ManagedBean
@ApplicationScoped
public class menu {

    /**
     * Creates a new instance of menu
     */
    public menu() {
    }
    
    
   public String toPersonal(){
       
       return "/personal/List";
   }
}
