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
        String[] s;
        do{
        str = in.nextLine(); 
        s = str.split(" "); 
            if(s[0].equals("addVM")){ 
                if (s[1].equals(null) || s[2].equals(null) || s[3].equals(null)){
                    System.out.println("Введены не все параметры");
                    break;
                }
                VmCmdProcessor cmd = new VmCmdProcessor(s); 
                cmd.addVM(s[1], s[2], s[3]); 
            } 
            else if(s[0].equals("removeVM")){ 

            } 
            else if(s[0].equals("getVM")){ 
                if (s[1].equals(null)){
                    System.out.println("Не введен параметр name");
                    break;
                }
                VmCmdProcessor cmd = new VmCmdProcessor(s);
                VM vm = cmd.getVM(s[1]);
                vm.toString();
            } 
            else if(s[0].equals("get")){ 
            }
            else if (s[0].equals("exit")){
                VmStorageOperator storage = new VmStorageOperator();
                storage.save();
            }
        }while(s[0].equals("exit"));
        }       
    }
