public class Magazine extends Book implements BookOperation{
    private String category;
    
    public Magazine(String title, String author, int year, String category){
        super(title, author, year);
        this.category = category;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("<Category>\t: " + category + "\n");
    }

    @Override
    public void borrowBook(){
        if (isBorrowed()){
            System.out.println("Magazine\t: " + getTitle() + " is already borrowed");
        }
        else{
            setBorrowed(true);
            System.out.println("Magazine\t: " + getTitle() + " borrowed successfully");
        }
    }

    @Override
    public void returnBook(){
        if (isBorrowed()) {
            setBorrowed(false);
            System.out.println("Magazine\t: " + getTitle() + " returned successfully");
        }
        else{
            System.out.println("Magazine\t: " + getTitle() + " is not borrowed");
    }
}
}
