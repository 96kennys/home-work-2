
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import java.util.*;
import javax.xml.stream.XMLEventFactory;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartDocument;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

public class RegisterMODEL{
    
    protected String sortType;
    protected String filePath;
    ArrayList<MyObject> storeObject;
    
    public RegisterMODEL(){
        storeObject = new ArrayList<MyObject>(); 
    }
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
    public ArrayList<MyObject> readObjects(String sortBy){
        storeObject.clear();
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
            
        System.out.println(storeObject);
        Collections.sort(storeObject);
        System.out.println(storeObject);
        }catch(IOException e){
            System.out.println("An issue has occured.");
        }
        return storeObject;
    }
    public void removeObject(String object){
        storeObject.clear();
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
                    
                    if(post[0].equals(object)){
                        System.out.println("Kolla in!");
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
    //The following methods are for XML use.
    //stax writer
    public void writeXML(String title, String author, String rating, String type) {
	String output = "myXML.xml";
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
            "", "reviews");
            eventWriter.add(end);
            eventWriter.add(libStartElement);
            eventWriter.add(end);
            StartElement itemStartElement = eventFactory.createStartElement("",
            "", "review");
	  
            // Contact1
			
            eventWriter.add(tab);
            eventWriter.add(itemStartElement);
            eventWriter.add(end);
            createNode(eventWriter, "title", title );
            createNode(eventWriter, "author", author );
            createNode(eventWriter, "rating", rating);
            createNode(eventWriter, "type", type);
            eventWriter.add(tab);
            eventWriter.add(eventFactory.createEndElement("", "", "review"));
            eventWriter.add(end);
      
            eventWriter.add(eventFactory.createEndElement("", "", "reviews"));
            eventWriter.add(end);
            eventWriter.add(eventFactory.createEndDocument());
            eventWriter.close();
            } catch (XMLStreamException | IOException e) {
     		e.printStackTrace();
            }
    }

    private static void createNode(XMLEventWriter eventWriter, String name,
        String value) throws XMLStreamException {

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
    /*
    @SuppressWarnings({ "unchecked", "null" })
    public static ArrayList<MyObject> readXML(String xmlFile) {
	ArrayList<MyObject> contacts = new ArrayList<>();
        try{
            // First, create a new XMLInputFactory
            XMLInputFactory inputFactory = XMLInputFactory.newInstance();
            // Setup a new eventReader
            InputStream in = new FileInputStream(xmlFile);
            XMLEventReader eventReader = inputFactory.createXMLEventReader(in);
            // read the XML document
            MyObject contact = null;

            while (eventReader.hasNext()) {
                XMLEvent event = eventReader.nextEvent();

                if (event.isStartElement()) {
                    StartElement startElement = event.asStartElement();
                    // If we have an item element, we create a new item
                    contact = new G();
                    Iterator<Attribute> attributes = startElement.getAttributes();
                    while (attributes.hasNext()) {
                    Attribute attribute = attributes.next();
                    if (attribute.getName().toString().equals(NAME)) {
                    contact.setName((attribute.getValue()) );
                    }
                    }

                    if (event.isStartElement()) {
                    if ( event.asStartElement().getName().getLocalPart().equals(ADRESS) ) {
                    event = eventReader.nextEvent();
                    contact.setAdress(event.asCharacters().getData());
                    continue;
                    }
                    }

                    if ( event.asStartElement().getName().getLocalPart().equals(PHONE) ) {
                    event = eventReader.nextEvent();
                    contact.setPhone(event.asCharacters().getData());
                    continue;
                    }
                }
                // If we reach the end of an item element, we add it to the list
                if (event.isEndElement()) {
                EndElement endElement = event.asEndElement();
                if (endElement.getName().getLocalPart() == (CONTACT)) {
                contacts.add(contact);
                }
                }
            }
            } catch (FileNotFoundException e) {
	e.printStackTrace();
	} catch (XMLStreamException e) {
	e.printStackTrace();
	}
	return contacts;
	} 
    */
}