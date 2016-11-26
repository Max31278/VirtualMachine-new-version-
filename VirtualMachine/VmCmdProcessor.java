/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabWork.VirtualMachine;

import java.io.IOException;
import java.util.Map;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

/**
 *
 * @author 000
 */
public class VmCmdProcessor {
    String[] s; 
    
    public VmCmdProcessor(String[] s) { 
        for (int i = 0; i < s.length; i++) { 
            this.s[i] = s[i]; 
        } 
    } 
    
    public void addVM(String name, String description, String path) throws SAXException, IOException, ParserConfigurationException{
        VmAdder adder = new VmAdder();
        adder.addVM(name, description, path);
    }
    
    public void removeVM(String name){
        
    }
    
    public Map<String, VM> listVM(int number){
        
        return 
    }
    
    public VM getVM(String name){
        return
    }
    
}
