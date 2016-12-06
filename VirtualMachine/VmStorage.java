/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabWork.VirtualMachine;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author 000
 */
public class VmStorage implements Serializable{
    private Map<String, VM> map;
    
    public void addVm(VM virtualMachine){
        map.put(virtualMachine.getName(), virtualMachine);
    }
    
    public VM getVm(String name){
        return map.get(name);
    }
    
    public Map<String, VM> listVms(int number){
        return
    }
    
    public void removeVm(String name){
        
    }
    
    public void setVms(Map<String, VM> map){
        
    }
    
    public Map<String, VM> getVms(){
        return map;
    }
}
