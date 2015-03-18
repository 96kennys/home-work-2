/**
 * @author © Kent Nystedt Björknäsgymansiet TE12
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import java.util.*;
import javax.swing.JOptionPane;
import javax.xml.stream.XMLEventFactory;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartDocument;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
public class RegisterMODEL{
    //The references to the membervariables are defined.
    protected String sortType;
    protected String filePath;
    ArrayList<MyObject> storeObject;
    ArrayList<MyObject> storeXMLObject;
    //The contstructor
    public RegisterMODEL(){
        //The ArrayList is initialized.
        storeObject = new ArrayList<MyObject>(); 
    }
    /**
     * Creates an temporary object and makes it a movie, game, or album depending
     * on the type. Then it's added to an arraylist and the method calls the 
     * method "addObjectToFile".
     * @param title The title of the object added as a string.
     * @param author The author of the object added as a string.
     * @param rating The rating of the object added as a string.
     * @param type The type of the object added as a string.
     */
    public void addObject(String title, String author, String rating, String type){
        
        
        storeObject.clear();
        MyObject tmp;
        
        if(type.equals("Game")){
            tmp = new Game(title, author, rating, type, "o");
        }
        else if(type.equals("Movie")){
            tmp = new Movie(title, author, rating, type, "o");
        } 
        else{
            tmp = new Album(title, author, rating, type, "o");
        }
        
        storeObject.add(tmp);
        
        addObjectToFile();
        
    }
    /**
     * Adds the objects from "addObject" to the file. Creates a buffered 
     * reader with a filereader as the path of the file. The methods loops the
     * file aslong as there isn't a new line of text to read and creates and instance
     * of the subclass depending on the class and the text at post[3] and ads 
     * it to the arraylist with the object from "addObject". 
     * Then the arraylist is sorted then looped and written to the file.
     */
    protected void addObjectToFile(){
        try{
            String[] post;
            BufferedReader rFile = new BufferedReader(new FileReader(filePath));
            String line = rFile.readLine();
            line = rFile.readLine();
            MyObject obj = null;
            
            while(line != null){
                post = line.split(";");
                for(int i = 0; i < post.length; i++){
                    if(post[3].equals("Movie")){
                        obj = new Movie(post[0], post[1], post[2], post[3], "o");
                    }
                    else if(post[3].equals("Album")){
                        obj = new Album(post[0],post[1], post[2], post[3], "o");                
                    }
                    else{
                        obj = new Game(post[0],post[1], post[2], post[3], "o");                
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
            writeToFile.println("title;author;rating;type;sortby");
            Collections.sort(storeObject);
            for(MyObject obj : storeObject){
                writeToFile.println(obj.toString());
            }
            writeToFile.close();
        }
        catch(IOException e){            
            System.out.println("An error has occured.");
        }
        //Clears the arraylist.
        storeObject.clear();
    }
    /**
     * Encourages the user to select an file by showing a window with a file
     * gallery of the pc. The filepath is saved to be used.
     */
    public void chooseFile(){
        JFileChooser win = new JFileChooser( System.getProperty("user.dir"));
        win.showDialog(null, "Choose File");
        
        filePath = win.getSelectedFile().getName();
    }
    /**
     * Reads the objects from the file and if sortBy is defined as rating,
     * author or title the arraylist will be sorted in that pattern when returned.
     * @param sortBy the pattern the the arraylist will be sorted as a string.
     * @return an ArrayList with the objects sorted.
     */
    public ArrayList<MyObject> readObjects(String sortBy){
        storeObject.clear();
        try{
            String[] post;
            BufferedReader rFile = new BufferedReader(new FileReader(filePath));
            String line = rFile.readLine();
            line = rFile.readLine();
            MyObject obj = null;
            
            while(line != null){
                post = line.split(";");
                for(int i = 0; i < post.length; i++){
                    if(post[3].equals("Movie")){
                        obj = new Movie(post[0], post[1], post[2], post[3], sortBy); 
                    }
                    else if(post[3].equals("Album")){
                        obj = new Album(post[0],post[1], post[2], post[3], sortBy);                
                    }
                    else{
                        obj = new Game(post[0],post[1], post[2], post[3], sortBy);                
                    }
                }
                if(obj != null){
                    storeObject.add(obj);
                }
                line = rFile.readLine();
            }
            
        Collections.sort(storeObject);
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "You haven't selected a file!");
        }
        return storeObject;
    }
    /**
     * Reads the objects from the file and creates them, unless the title of an object
     * is the same as the "object" then it isn't created and therefore removed because
     * it isn't saved along witht the objects.
     * @param object the title of the object as a string.
     */
    public void removeObject(String object){
        storeObject.clear();
        try{
            String[] post;
            BufferedReader rFile = new BufferedReader(new FileReader(filePath));
            String line = rFile.readLine();
            line = rFile.readLine();
            MyObject obj = null;
            
            while(line != null){
                post = line.split(";");
                for(int i = 0; i < post.length; i++){
                    if(post[0].equals(object)){
                        obj = null;
                        break;
                    }else{
                        if(post[3].equals("Movie")){
                            obj = new Movie(post[0], post[1], post[2], post[3], "a");
                        }
                        else if(post[3].equals("Album")){
                            obj = new Album(post[0],post[1], post[2], post[3], "a");                
                        }
                        else if(post[3].equals("Game")){
                            obj = new Game(post[0],post[1], post[2], post[3], "a");                
                        }
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
            writeToFile.println("title;author;rating;type;sortby");
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
    /**
     * Searches the omdb api for an item.
     * @param item the title to search for as a string.
     * @return the XML data of the movie from imdb's api as a string.
     */
    public String searchItem(String item){
        String inputLine = "";
        try{
            URL oracle = new URL("http://www.omdbapi.com/?t="+item+"&y=&plot=short&r=xml");
            URLConnection yc = oracle.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));
            while ((inputLine = in.readLine()) != null){
                return inputLine;
            }
            in.close();
        }
        catch(IOException e){
            System.out.println("An error has occured.");
        }
        return inputLine;
    }
    /**
     * Writes an XML file by creating different tags that are fillable.
     * @param title the title of the object as a string.
     * @param author the author of the object as a string.
     * @param rating the rating of the object as a string.
     * @param type  the type of the object as a string.
     */
    public void writeXML(String title, String author, String rating, String type) {
	String output = filePath;
        try{
            // create an XMLOutputFactory
            XMLOutputFactory outputFactory = XMLOutputFactory.newInstance();
            // create XMLEventWriter
            XMLEventWriter eventWriter = outputFactory
                .createXMLEventWriter(new FileOutputStream(output));

            // create an EventFactory
            XMLEventFactory eventFactory = XMLEventFactory.newInstance();
            XMLEvent end = eventFactory.createDTD("\n");
            XMLEvent tab = eventFactory.createDTD("\t");
            // create and write Start Tag
            StartDocument startDocument = eventFactory.createStartDocument();
            eventWriter.add(startDocument);

            // create config open tag
            StartElement libStartElement = eventFactory.createStartElement("",
            "", "objects");
            eventWriter.add(end);
            eventWriter.add(libStartElement);
            eventWriter.add(end);
            StartElement itemStartElement = eventFactory.createStartElement("",
            "", "object");
	  
            // Contact1
			
            eventWriter.add(tab);
            eventWriter.add(itemStartElement);
            eventWriter.add(end);
            createNode(eventWriter, "title", title );
            createNode(eventWriter, "author", author );
            createNode(eventWriter, "rating", rating);
            createNode(eventWriter, "type", type);
            eventWriter.add(tab);
            eventWriter.add(eventFactory.createEndElement("", "", "object"));
            eventWriter.add(end);
      
            eventWriter.add(eventFactory.createEndElement("", "", "objects"));
            eventWriter.add(end);
            eventWriter.add(eventFactory.createEndDocument());
            eventWriter.close();
            } catch (XMLStreamException | IOException e) {
     		e.printStackTrace();
            }
    }
    /**
     * Created an XML node that can be filled with information.
     * @param eventWriter the top tag of the XMl document.
     * @param name the name of the XML element as a string.
     * @param value the value of the created character event.
     */
    private static void createNode(XMLEventWriter eventWriter, String name,
        String value){
        try{
            XMLEventFactory eventFactory = XMLEventFactory.newInstance();
            XMLEvent end = eventFactory.createDTD("\n");
            XMLEvent tab = eventFactory.createDTD("\t");
            // create Start node
            StartElement sElement = eventFactory.createStartElement("", "", name);
            eventWriter.add(tab);
            eventWriter.add(tab);
            eventWriter.add(sElement);
            // create Content
            Characters characters = eventFactory.createCharacters(value);
            eventWriter.add(characters);

            // create End node
            EndElement eElement = eventFactory.createEndElement("", "", name);
            eventWriter.add(eElement);
            eventWriter.add(end);
        }
        catch(XMLStreamException e){
            System.out.println("An error has occured.");
        }
    }
}