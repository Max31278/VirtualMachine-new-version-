/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labwork.VirtualMachine;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author 000
 */
public class VmStorageOperator {
    VmStorage storage; 
    public VmStorageOperator(VmStorage storage){
       this.storage = storage; 
    }
    public void save() throws FileNotFoundException, IOException{
       ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("VirtualMachine.txt"));
       out.writeObject(storage.getVms());
       out.close();
    }
    public void load(){
        
    }
}
