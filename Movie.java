
public class Movie extends MyObject implements java.lang.Comparable<Movie>{
    
    public Movie(String title, String author, int rating, int type){
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

    @Override
    public int compareTo(Movie o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
