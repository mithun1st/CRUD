
package crud;

import java.io.*;
import java.util.ArrayList;

public class cls {
    
    
    public void write(ArrayList a,ArrayList b,ArrayList c){
        try {
            FileOutputStream f=new FileOutputStream("crud.dat");
            ObjectOutputStream o=new ObjectOutputStream(f);
            o.writeObject(a);
            o.writeObject(b);
            o.writeObject(c);
            o.close();
        } catch (IOException e) {
            e.printStackTrace();
        }           
    }
 
    public ArrayList read1() throws ClassNotFoundException{
        ArrayList<String> a = new ArrayList<String>();
        ArrayList<Integer> b = new ArrayList<Integer>();
        ArrayList<String> c = new ArrayList<String>();
        try {
            FileInputStream f=new FileInputStream("crud.dat");
            ObjectInputStream o=new ObjectInputStream(f);
            a=(ArrayList<String>) o.readObject();
            b=(ArrayList<Integer>) o.readObject();
            c=(ArrayList<String>) o.readObject();       
            o.close();
        } catch (IOException e) {
            e.printStackTrace();
        } 
        return a;
    }
    public ArrayList read2() throws ClassNotFoundException{
        ArrayList<String> a = new ArrayList<String>();
        ArrayList<Integer> b = new ArrayList<Integer>();
        ArrayList<String> c = new ArrayList<String>();
        try {
            FileInputStream f=new FileInputStream("crud.dat");
            ObjectInputStream o=new ObjectInputStream(f);
            a=(ArrayList<String>) o.readObject();
            b=(ArrayList<Integer>) o.readObject();
            c=(ArrayList<String>) o.readObject();    
            o.close();
        } catch (IOException e) {
            e.printStackTrace();
        } 
        return b;
    }
    public ArrayList read3() throws ClassNotFoundException{
        ArrayList<String> a = new ArrayList<String>();
        ArrayList<Integer> b = new ArrayList<Integer>();
        ArrayList<String> c = new ArrayList<String>();
        try {
            FileInputStream f=new FileInputStream("crud.dat");
            ObjectInputStream o=new ObjectInputStream(f);
            a=(ArrayList<String>) o.readObject();
            b=(ArrayList<Integer>) o.readObject();
            c=(ArrayList<String>) o.readObject();  
            o.close();
        } catch (IOException e) {
            e.printStackTrace();
        } 
        return c;
    }
    
        
}
