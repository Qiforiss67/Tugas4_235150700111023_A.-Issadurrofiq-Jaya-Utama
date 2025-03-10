public class Novel extends Book implements BookOperation {
    private String genre;
    
    public Novel(String title, String author, int year, String genre){
        super(title, author, year);
        this.genre = genre;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("<Genre>\t\t: " + genre + "\n");
    }

    @Override
    public void borrowBook(){
        if (isBorrowed()){
            System.out.println("Novel\t\t: " + getTitle() + " is already borrowed");
        }
        else{
            setBorrowed(true);
            System.out.println("Novel\t\t: " + getTitle() + " borrowed successfully");
        }
    }

    @Override
    public void returnBook(){
        if (isBorrowed()) {
            setBorrowed(false);
            System.out.println("Novel\t\t: " + getTitle() + " returned successfully");
        }
        else{
            System.out.println("Novel\t\t: " + getTitle() + " is not borrowed");
    }
}
}
