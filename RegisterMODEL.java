
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JFileChooser;

public class RegisterMODEL{
    
    protected String filePath;
    ArrayList<MyObject> storeObject;
    
    public RegisterMODEL(){
        storeObject = new ArrayList<MyObject>(); 
    }
    public void addObject(String title, String author, int rating, int type){
        
        MyObject tmp;
        
        if(type == 1){
            tmp = new Game(title, author, rating, type);
        }
        else if(type == 2){
            tmp = new Movie(title, author, rating, type);
        } 
        else{
            tmp = new Album(title, author, rating, type);
        }
        
        storeObject.add(tmp);
        System.out.println(tmp.toString());
       
        try{
            PrintWriter writeToFile =
                    new PrintWriter(new BufferedWriter(new FileWriter(filePath,true)));
            writeToFile.println(tmp.toString());
            writeToFile.close();
        }
        catch(IOException e){            
            System.out.println("An issue has occured.");
        }
    }
    //write to
    public void chooseFile(){
        JFileChooser win = new JFileChooser( System.getProperty("user.dir"));
        win.showDialog(null, "Choose File");
        
        filePath = win.getSelectedFile().getName();
        System.out.println(filePath);
    }
    
    public ArrayList<MyObject> readObjects(){
        try{
            String[] post;
            BufferedReader rFile = new BufferedReader(new FileReader(filePath));
            String line = rFile.readLine();
            line = rFile.readLine();
            MyObject obj = null;
            
            while(line != null){
                post = line.split(",");
                
                for(int i = 0; i < post.length; i++){
                    System.out.println(post);
                    
                    int ratingToString = Integer.parseInt(post[2]);
                    int typeToString = Integer.parseInt(post[3]);
                    
                    if(typeToString == 1){
                        obj = new Movie(post[0],post[1], ratingToString, typeToString);                
                    }
                    else if(typeToString == 2){
                        obj = new Album(post[0],post[1], ratingToString, typeToString);                
                    }
                    else{
                        obj = new Game(post[0],post[1], ratingToString, typeToString);                
                    }
                }
                if(obj != null){
                    storeObject.add(obj);
                }
                System.out.println(obj);
                line = rFile.readLine();
            }
        }catch(IOException e){
            System.out.println("An issue has occured.");
        }
        return storeObject;
    }
}
