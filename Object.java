import java.util.ArrayList;  

public abstract class Object{
        
    protected String title;
    protected String author;
    protected int rating;
    protected int type;

    public Object(){
       
    }
    public abstract void setTitle(String title);
    
    public abstract void setAuthor(String author);
    
    public abstract void setRating(int rating);
    
    public abstract void setType(int type);
    
    public String getTitle(){
        return title;
    }
    
    public String getAuthor(){
        return author;
    }
    
    public int getRating(){
        return rating;
    }
    
    public int getType(){
        return type;
    }
    @Override
    public String toString(){
        return title + ";" + author + ";" + rating + ";" + type;
    }
}
