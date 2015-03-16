public abstract class MyObject implements Comparable{
        
    protected String title;
    protected String author;
    protected String rating;
    protected String type;
    protected String sortBy;

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
    public String getSortby(){
        return sortBy;
    }
    @Override
    public String toString(){
        return title + ";" + author + ";" + rating + ";" + type + ";" + sortBy;
    } 
    @Override
    public abstract int compareTo(Object o);

    String sortString() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
