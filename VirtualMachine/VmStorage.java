/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabWork.VirtualMachine;

import java.util.Map;

/**
 *
 * @author 000
 */
public class VmStorage {
    private Map<String, VM> map;
    
    public void addVm(VM virtualMachine){
        map.put(virtualMachine.getName(), virtualMachine);
    }
    
    public VM getVm(String name){
        
        return
    }
    
    public Map<String, VM> listVms(int number){
        return
    }
    
    public void removeVm(String name){
        
    }
    
    public void setVms(Map<String, VM> map){
        
    }
    
    public Map<String, VM> getVms(){
        return
    }
}
