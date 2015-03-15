
public class Game extends MyObject{
    
    public Game(String title, String author, String rating, String type){
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
}
