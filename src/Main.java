public class Main {

    public static void main(String[] args) {
        TextBook textbook = new TextBook("Introduction to Computer Science", "John Doe", 2020, "Computer Science");
        Novel novel = new Novel("Laskar Pelangi", "Andrea Hirata", 2005, "Drama");
        Magazine majalah = new Magazine("TechToday", "Tech Publishing", 2021, "Technology");

        System.out.println("---- Book Information ----");
        System.out.println();
        textbook.displayInfo();
        novel.displayInfo();
        majalah.displayInfo();
        System.out.println();
        
        System.out.println("---- Borrowing and Returning Book ----");
        System.out.println();
        textbook.borrowBook();
        majalah.borrowBook();
        textbook.returnBook();
        novel.returnBook();
        System.out.println();
    }
}