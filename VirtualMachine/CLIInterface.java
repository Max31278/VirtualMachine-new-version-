/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabWork.VirtualMachine;

import java.io.IOException;
import java.util.Scanner;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

/**
 *
 * @author 000
 */
public class CLIInterface {
    public static void main(String[] args) throws SAXException, IOException, ParserConfigurationException{
        System.out.println("Enter command: "); 
        String str = new String(); 
        Scanner in = new Scanner(System.in); 
        str = in.nextLine(); 
        String[] s = str.split(" "); 
            if(s[0] == "addVM"){ 
                VmCmdProcessor cmd = new VmCmdProcessor(s); 
                cmd.addVM(s[1], s[2], s[3]); 
            } 
            else if(s[0] == "removeVM"){ 

            } 
            else if(s[0] == "getVM"){ 

            } 
            else if(s[0] == "get"){ 
            }
        }       
    }
