/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expresionesregulares;


/**
 *
 * @author juans
 */
public class Controlador {
    public Controlador(){
        
    }
    public boolean validarEntero(String cadena){
	if(cadena.matches("[-+]?[1-9]\\d*|0")){
            return true;
        }else{
            return false;
        }
    }
    public boolean validarReal(String cadena){
        if(cadena.matches("^[+|-]?[0-9]+[.][0-9]+$")){
            return true;
        }else{
            return false;
        }
    }
    public boolean validarNotacion(String cadena){
        if(cadena.matches("^[-+]?[0-9]+[.][0-9]+[eE]([-+])?[0-9]+")){
            return true;
        }else{
            return false;
        }
    }
    public boolean validarEmail(String cadena){
        if(cadena.matches("(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\\\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\\\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:(2(5[0-5]|[0-4][0-9])|1[0-9][0-9]|[1-9]?[0-9]))\\.){3}(?:(2(5[0-5]|[0-4][0-9])|1[0-9][0-9]|[1-9]?[0-9])|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])")){
            return true;
        }else{
            return false;
        }
    }
}
