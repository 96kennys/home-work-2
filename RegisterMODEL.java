
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
    protected Object obj, tmp;
    ArrayList<Object> storeObject;
    
    public void addObject(String title, String author, int rating, int type){
        
        if(type == 1){
            tmp = new Game(title, author, rating, type);
        }
        if(type == 2){
            tmp = new Movie(title, author, rating, type);
        } 
        if(type == 3){
            tmp = new Book(title, author, rating, type);
        }
        //storeObject.add(tmp);
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
    
    public void chooseFile(){
        JFileChooser win = new JFileChooser( System.getProperty("user.dir"));
        win.showDialog(null, "Choose File");
        
        filePath = win.getSelectedFile().getName();
        System.out.println(filePath);
    }
    
    public ArrayList<Object> readObjects(){
        try{
            String[] post;
            BufferedReader readFile = new BufferedReader(new FileReader(filePath));
            String line = readFile.readLine();
            line = readFile.readLine();

            while(line != null){
                post = line.split(",");
   
                for(int i = 0; i < post.length; i++){
                    
                    int ratingToString = Integer.parseInt(post[2]);
                    int typeToString = Integer.parseInt(post[3]);
                    obj = new Game(post[0],post[1], ratingToString, typeToString);                    
                    
                }
                storeObject.add(obj);
                System.out.println(obj);
                line = readFile.readLine();
            }
        }catch(IOException e){
            System.out.println();
        }
        return storeObject;
    }
}
