public abstract class MyObject implements Comparable{
        
    protected String title;
    protected String author;
    protected String rating;
    protected String type;

    /**
     *
     */
    public MyObject(){
       
    }
    public abstract void setTitle(String title);
    
    public abstract void setAuthor(String author);
    
    public abstract void setRating(String rating);
    
    public abstract void setType(String type);
    
    public String getTitle(){
        return title;
    }
    
    public String getAuthor(){
        return author;
    }
    
    public String getRating(){
        return rating;
    }
    
    public String getType(){
        return type;
    }
    @Override
    public String toString(){
        return title + ";" + author + ";" + rating + ";" + type;
    } 
    @Override
    public int compareTo(Object o) {
        MyObject c = (MyObject) o;
        return this.author.compareTo(c.getAuthor());
    }
}
