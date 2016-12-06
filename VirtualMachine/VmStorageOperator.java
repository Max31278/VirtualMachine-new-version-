/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabWork.VirtualMachine;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Map;

/**
 *
 * @author 000
 */
public class VmStorageOperator implements Serializable {
    public void save() throws FileNotFoundException, IOException{
       VmStorage storage = new VmStorage();
       ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("VirtualMachine.txt"));
       out.writeObject(storage.getVms());
       out.close();
    }
    public void load(){
        
    }
}
