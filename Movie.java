
public class Movie extends MyObject{
    
    public Movie(String title, String author, String rating, String type){
        this.title = title;
        this.author = author;
        this.rating = rating;
        this.type = type;
    }
    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public void setRating(String rating) {
        this.rating = rating;
    }

    @Override
    public void setType(String type) {
        this.type = type;
    } 
 
    
    @Override
    public int compareTo(Object o) {
        MyObject c = (MyObject) o;
        return this.type.compareTo(c.getType());
    }
}
