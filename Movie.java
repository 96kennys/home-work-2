/**
 * @author © Kent Nystedt Björknäsgymansiet TE12
 */
//Adds methods and components from the abstract class "MyObject".
public class Movie extends MyObject{
    
    /**
     * Creates the movie witht he corresponding items.
     * @param title the title of the game as a string.
     * @param author the author of the game as a string.
     * @param rating the rating of the game as a string.
     * @param type the type of the game as a string.
     * @param sortBy the type that the movie is sorted after.
     */
    public Movie(String title, String author, String rating, String type, String sortBy){
        this.title = title;
        this.author = author;
        this.rating = rating;
        this.type = type;
        this.sortBy = sortBy;
    }
    
    @Override
    public String sortString(){
        String sortString = "Movie" + this.title + this.author + this.rating;
        return sortString;
    }
    @Override
    public int compareTo(Object o) {
        MyObject c = (MyObject) o;
        
        if(this.sortBy == null){
            return this.sortString().compareTo(c.sortString());
        }
        else if(this.sortBy.equals("title")){
            return this.title.compareTo(c.getTitle());
        }
        else if(this.sortBy.equals("author")){
            return this.author.compareTo(c.getAuthor());
        }
        else if(this.sortBy.equals("rating")){
            return this.rating.compareTo(c.getRating());
        }
        else{
           return this.title.compareTo(c.getAuthor());
        }
    }
}
