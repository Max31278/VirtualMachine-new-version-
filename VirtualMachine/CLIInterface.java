/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labwork.VirtualMachine;

import java.io.IOException;
import java.util.Scanner;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

/**
 *
 * @author 000
 */
public class CLIInterface  {
    public static void main(String[] args) throws SAXException, IOException, ParserConfigurationException, CLIInterfaceAddedException, VmStorageAddedException{
        VmStorage storage = new VmStorage();
        VmStorageOperator storageOperator = new VmStorageOperator(storage);
        VmCmdProcessor cmd = new VmCmdProcessor(storage);
        
        System.out.println("Enter command: "); 
        String str = new String(); 
        Scanner in = new Scanner(System.in); 
        String[] s ;
        boolean chek = false;
        do{
        char[] error = new char[]{'/', ':', '*', '?', '<', '>', '|'};     
        str = in.nextLine(); 
        s = str.split(" "); 
            if(s[0].equals("addVM")){ 
                if (s[1].equals(null) || s[2].equals(null) || s[3].equals(null)) throw new CLIInterfaceAddedException("введены не все параметры");
                char[] cr = s[1].toCharArray();
                for (int i=0; i< cr.length; i++){
                    for (char er:error){
                        if (cr[i] == er)throw new CLIInterfaceAddedException("Имя введено некорректно");
                    }
                }
                 
                cmd.addVM(s[1], s[2], s[3]);
                
            } 
            else if(s[0].equals("removeVM")){ 

            } 
            else if(s[0].equals("getVM")){ 
                if (s[1].equals(null)) throw new CLIInterfaceAddedException("введены не все параметры");
                char[] cr = s[1].toCharArray();
                for (int i=0; i< cr.length; i++){
                    for (char er:error){
                        if (cr[i] == er)throw new CLIInterfaceAddedException("Имя введено некорректно");
                    }
                }                
                VM vm = cmd.getVM(s[1]);
                String buf = vm.toString();
                System.out.println(buf);
            } 
            else if(s[0].equals("get")){ 
            }
            else if (s[0].equals("exit")){
                chek = true;                
                storageOperator.save();
                break;
            }
        }while(chek == false);
        }       
    }
