/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabWork.VirtualMachine;

import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

/**
 *
 * @author 000
 */
public class VmAdder {
    public void addVM(String name, String description, String path) throws ParserConfigurationException, SAXException, IOException{
        XmlDescriptorReader descriptor = new XmlDescriptorReader();
        XmlDescriptor xmlDescriptor = descriptor.getDescriptor(path);
        VM virtualMachine = new VM(name, xmlDescriptor.getNameOS(), xmlDescriptor.getVendor(), xmlDescriptor.getVersion(),
                description, path, xmlDescriptor.getCpuCore(), xmlDescriptor.getRam(), xmlDescriptor.getCapacityHdd());
        VmStorage storage = new VmStorage();
        storage.addVm(virtualMachine);
    }
}
