/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labwork.VirtualMachine;

import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

/**
 *
 * @author 000
 */
public class VmAdder {
    VmStorage storage;
    public VmAdder(VmStorage storage){
        this.storage = storage;
    }
    public void addVM(String name, String description, String path) throws ParserConfigurationException, SAXException, IOException, VmStorageAddedException{
        XmlDescriptorReader descriptor = new XmlDescriptorReader();
        XmlDescriptor xmlDescriptor = descriptor.getDescriptor(path);
        VM virtualMachine = new VM(name, xmlDescriptor.getNameOS(), xmlDescriptor.getVendor(), xmlDescriptor.getVersion(),
                description, path, xmlDescriptor.getCpuCore(), xmlDescriptor.getRam(), xmlDescriptor.getCapacityHdd());
        
        storage.addVm(virtualMachine);
    }
}
