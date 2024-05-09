public class Book {
    private String title;
    private String author;
    private int year;
    private boolean borrowed;
    
    public Book(String title, String author, int year){
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public void setYear(int year){
        this.year = year;
    }

    public void setBorrowed(boolean borrowed){
        this.borrowed = borrowed;
    }

    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public int getYear(){
        return year;
    }

    public boolean isBorrowed(){
        return borrowed;
    }

    public void displayInfo(){
        System.out.println("Title\t\t: " + title);
        System.out.println("Author\t\t: " + author);
        System.out.println("Year\t\t: " + year);
        System.out.println("Borrowed\t: " + borrowed);
    }
}
