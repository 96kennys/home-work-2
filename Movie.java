
public class Movie extends MyObject{
    
    public Movie(String title, String author, String rating, String type, String sortBy){
        this.title = title;
        this.author = author;
        this.rating = rating;
        this.type = type;
        this.sortBy = sortBy;
    }

    Movie() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
