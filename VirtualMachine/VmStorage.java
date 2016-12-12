/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labwork.VirtualMachine;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author 000
 */
public class VmStorage {
    private Map map = new HashMap < String, VM >();
    
    public void addVm(VM virtualMachine)throws VmStorageAddedException{
        Set keys = map.keySet();
        for (Object key: keys){
            if (virtualMachine.getName().equals(key)) throw new VmStorageAddedException("Виртуальная машина с таким именем уже существует");
        }
        map.put(virtualMachine.getName(), virtualMachine);       
        System.out.println();
    }
    
    public VM getVm(String name){        
        return (VM) map.get(name);
    }
    
    public Map<String, VM> listVms(int number){
        return map;
    }
    
    public void removeVm(String name){
        
    }
    
    public void setVms(Map<String, VM> map){
        
    }
    
    public Map<String, VM> getVms(){
        return map;
    }
}
