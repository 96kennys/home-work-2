
public class Game extends Object{
    
    public Game(String title, String author, int rating, int type){
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
    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public void setType(int type) {
        this.type = type;
    }  
}
