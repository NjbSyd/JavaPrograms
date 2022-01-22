import java.util.Scanner;

class publication {
    public Scanner x = new Scanner(System.in);
    protected String title;
    protected int price;

    public void setPrice_Title(String opt) {
        System.out.println();
        System.out.println(opt + " Info\n");
        System.out.print("Enter the title:");
        title = x.nextLine();
        System.out.print("Enter the price:");
        price = x.nextInt();
        x.nextLine();
    }

    public int getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }

    public void display() {
        System.out.println("title = " + title);
        System.out.println("price = " + price);
    }
}

class book extends publication {
    private int pages;

    public int getPages() {
        return pages;
    }

    public void setPages() {
        System.out.print("Enter the number of pages:");
        pages = x.nextInt();
        x.nextLine();
    }

    public void display() {
        System.out.println("\n\n\t|``````````````````````````````````````|");
        System.out.println("\t\t***Book Info***\n");
        System.out.println("\t\tTitle =\t" + title);
        System.out.println("\t\tPages =\t" + pages);
        System.out.println("\t\tPrice =\t" + price);
       System.out.println("\t|______________________________________|");
    }
}

class tape extends publication {
    private int playingTime;

    public int getPlayingTime() {
        return playingTime;
    }

    public void setPlayingTime() {
        System.out.print("Enter the playing time in minutes:");
        playingTime = x.nextInt();
        x.nextLine();
    }

    public void display() {
        System.out.println("\n\n\t|``````````````````````````````````````|");
        System.out.println("\n\t\t***Tape Info***\n");
        System.out.println("\t\tTitle =\t\t" + title);
        System.out.println("\t\tPlayingTime =\t" + playingTime);
        System.out.println("\t\tPrice =\t\t" + price);
        System.out.println("\t|______________________________________|\n\n");
    }
}

class Q1 {
    public static void main(String[] args) {
        book BOOK = new book();
        tape TAPE = new tape();
        BOOK.setPrice_Title("Book");
        BOOK.setPages();
        TAPE.setPrice_Title("Tape");
        TAPE.setPlayingTime();
        BOOK.display();
        TAPE.display();
    }
}