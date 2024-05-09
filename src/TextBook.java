public class TextBook extends Book implements BookOperation{
private String subject;
    
    public TextBook(String title, String author, int year, String subject){
        super(title, author, year);
        this.subject = subject;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("<Subject>\t: " + subject + "\n");
    }

    @Override
    public void borrowBook(){
        if (isBorrowed()){
            System.out.println("TextBook\t: " + getTitle() + " is already borrowed");
        }
        else{
            setBorrowed(true);
            System.out.println("TextBook\t: " + getTitle() + " borrowed successfully");
        }
    }

    @Override
    public void returnBook(){
        if (isBorrowed()) {
            setBorrowed(false);
            System.out.println("TextBook\t: " + getTitle() + " returned successfully");
        }
        else{
            System.out.println("TextBook\t: " + getTitle() + " is not borrowed");
    }
}
}
