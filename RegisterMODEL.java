
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import java.util.*;

public class RegisterMODEL{
    
    protected String filePath;
    ArrayList<MyObject> storeObject;
    
    public RegisterMODEL(){
        storeObject = new ArrayList<MyObject>(); 
    }
    public void addObject(String title, String author, String rating, String type){
        
        storeObject.clear();
        MyObject tmp;
        
        if(type.equals("Game")){
            tmp = new Game(title, author, rating, type);
        }
        else if(type.equals("Movie")){
            tmp = new Movie(title, author, rating, type);
        } 
        else{
            tmp = new Album(title, author, rating, type);
        }
        
        storeObject.add(tmp);
        System.out.println(tmp.toString());
        
        addObjectToFile();
    }
    protected void addObjectToFile(){
        try{
            String[] post;
            BufferedReader rFile = new BufferedReader(new FileReader(filePath));
            String line = rFile.readLine();
            line = rFile.readLine();
            MyObject obj = null;
            System.out.println("line: " + line);
            
            while(line != null){
                post = line.split(";");
                System.out.println("loop");
                for(int i = 0; i < post.length; i++){
                    System.out.println(post[3]);
                    if(post[3].equals("Movie")){
                        obj = new Movie(post[0], post[1], post[2], post[3]); 
                        System.out.println("Den jlrs");
                    }
                    else if(post[3].equals("Album")){
                        obj = new Album(post[0],post[1], post[2], post[3]);                
                    }
                    else{
                        obj = new Game(post[0],post[1], post[2], post[3]);                
                    }
                }
                if(obj != null){
                    storeObject.add(obj);
                }
                line = rFile.readLine();
            }
        }catch(IOException e){
            System.out.println("An issue has occured.");
        }
        try{
            PrintWriter writeToFile =
                new PrintWriter(new BufferedWriter(new FileWriter(filePath)));
            writeToFile.println("title;author;rating;type");
            Collections.sort(storeObject);
            for(MyObject obj : storeObject){
                writeToFile.println(obj.toString());
            }
            writeToFile.close();
        }
        catch(IOException e){            
            System.out.println("An issue has occured.");
        }
        storeObject.clear();
    }
    public void chooseFile(){
        JFileChooser win = new JFileChooser( System.getProperty("user.dir"));
        win.showDialog(null, "Choose File");
        
        filePath = win.getSelectedFile().getName();
        System.out.println(filePath);
    }
    //Gör en funktion som organiserar det man skriver in
    //och sedan lägger till det nya objektet
    public ArrayList<MyObject> readObjects(){
        try{
            String[] post;
            BufferedReader rFile = new BufferedReader(new FileReader(filePath));
            String line = rFile.readLine();
            line = rFile.readLine();
            MyObject obj = null;
            System.out.println("line: " + line);
            
            while(line != null){
                post = line.split(";");
                for(int i = 0; i < post.length; i++){
                    System.out.println(post[3]);
                    if(post[3].equals("Movie")){
                        obj = new Movie(post[0], post[1], post[2], post[3]); 
                    }
                    else if(post[3].equals("Album")){
                        obj = new Album(post[0],post[1], post[2], post[3]);                
                    }
                    else{
                        obj = new Game(post[0],post[1], post[2], post[3]);                
                    }
                }
                if(obj != null){
                    storeObject.add(obj);
                }
                line = rFile.readLine();
                
        System.out.println(storeObject);
        Collections.sort(storeObject);
        System.out.println(storeObject);
            }
        }catch(IOException e){
            System.out.println("An issue has occured.");
        }
        return storeObject;
    }
}