/**
 * @author © Kent Nystedt Björknäsgymansiet TE12
 */
//Implements the interface comparable.
public abstract class MyObject implements Comparable{
    //The membervariables are defined;
    protected String title;
    protected String author;
    protected String rating;
    protected String type;
    protected String sortBy;

    public MyObject(){
       
    }
    /**
     * Gets the title of the object.
     * @return the title as a string.
     */
    public String getTitle(){
        return title;
    }
    /**
     * Gets the author of the object.
     * @return the author as a string.
     */
    public String getAuthor(){
        return author;
    }
    /**
     * Gets the rating of the object.
     * @return the rating as a string.
     */
    public String getRating(){
        return rating;
    }
    /**
     * Returns the type of the object.
     * @return the type as a string.
     */
    public String getType(){
        return type;
    }
    /**
     * Return the sortBy variable of the object.
     * @return the sortBy variable as a string.
     */
    public String getSortby(){
        return sortBy;
    }
    /**
     * Creates a string that that has the variabler of the object seperated by a
     * semicolon.
     * @return a string with the variables seperated by a semicolon.
     */
    @Override
    public String toString(){
        return title + ";" + author + ";" + rating + ";" + type + ";" + sortBy;
    }
    /**
     * This interface comparable imposes a total ordering on the objects that implements it.
     * @param o an abstract item.
     * @return an int that imposes the ordering of the objects.
     */ 
    @Override
    public abstract int compareTo(Object o);
    /**
     * A method that is extended and modyfied in the subclasses.
     * @return nothing.
     * 
     */
    String sortString() {
        return null;
    }
}
