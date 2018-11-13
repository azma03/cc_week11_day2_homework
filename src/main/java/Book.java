public class Book {

    private String title;
    private String author;
    private String genre;
    private Boolean available;

    public Book(String title, String author, String genre){
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.available = true;
    }

    public String getTitle(){
        return this.title;
    }

    public String getAuthor(){
        return this.author;
    }

    public String getGenre(){
        return this.genre;
    }

    public Boolean getAvailablility(){
        return available;
    }

    public void setAvailable(Boolean value){
        this.available = value;
    }

}
