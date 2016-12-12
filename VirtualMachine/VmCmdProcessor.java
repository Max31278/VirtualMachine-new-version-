/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labwork.VirtualMachine;

import java.io.IOException;
import java.util.Map;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

/**
 *
 * @author 000
 */
public class VmCmdProcessor {
 
    
   VmStorage vm;
    VmAdder adder;
    
    public VmCmdProcessor(VmStorage vm){
        this.vm = vm;
        adder = new VmAdder(this.vm);
    }
    public void addVM(String name, String description, String path) throws SAXException, IOException, ParserConfigurationException, VmStorageAddedException{
        
        adder.addVM(name, description, path);
    }
    
    public void removeVM(String name){
        
    }
    
    public Map<String, VM> listVM(int number){
         
        return vm.getVms();
    }
    
    public VM getVM(String name){
        
        VM virtual = vm.getVm(name);
        return virtual;
    }
    
}
