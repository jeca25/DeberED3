/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author JECA-MATI
 */
public class Ejerciciosdeber3 {
    
    public static void ejercicio1(){  
    JOptionPane.showMessageDialog(null,"este es el ejercicio1");
   
    // 1.
    for(int i=1;i<=100;i++)
        if(i%5==0&&i%25==0)
            System.out.print(i+",");
    //2. 
    for(int i=1;i<=100;i++)
        if(i%75==0)
            System.out.print(i+",");
    }
    
    public static void ejercicio2(){
    JOptionPane.showMessageDialog(null,"este es el ejercicio2");
    
    int total=0;
    for(int i=0;i<=5;i ++){
        total+=2;
    }
    System.out.print(total);
    }
    
        public static void ejercicio3(){
        JOptionPane.showMessageDialog(null,"este es el ejercicio3");
        
        int[]primes={1,2,3};
        int sum=0;
        for(int t:primes){
            sum+=t;
        }
        System.out.print(sum++);
        
        }
        public static void ejercicio4(){
        JOptionPane.showMessageDialog(null,"este es el ejercicio4");
        
        for(int i=1;i<6;i+=2){
            for(int j=0;j<3;j++){
                if(i+j>4)
                    break;
                System.out.print(i*j);
            }
        }
        
        
        }
        
        public static void ejercicio5(){
        JOptionPane.showMessageDialog(null,"este el el ejercicio5");
        
        int x=0;
        do{
            System.out.print(x);
            x++;
        }while(x>0);
        }
       
        
    

    public static void menu(){
       int op;
        do{ 
            
            op=Integer.parseInt(JOptionPane.showInputDialog(""
                    + "1.- Ejercicio1\n"
                    + "2.- Ejercico2\n"
                    + "3.- Ejercico3\n"
                    + "4.- Ejercicio4\n "
                    + "5.- Ejercicio5\n"
                    + "6.- Salir ingrese opcion\n"));
            
            switch(op){
                case 1:
                    ejercicio1();
                    break;
                case 2:
                    ejercicio2();
                    break;
                case 3:
                    ejercicio3();
                    break;
                case 4:
                    ejercicio4();
                    break;
                case 5:
                    ejercicio5();
                    break;
            }
        } while (op!=6);
     }
}

