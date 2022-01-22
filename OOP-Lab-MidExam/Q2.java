import java.util.Scanner;

class printer {
    private int emp_id;
    private final String emp_name;
    private int pages;
    static int count = 0;


    printer() {         //Constructor#1
        emp_name = randomName();
        pages = (int) (1000 * Math.random());
        count++;
        emp_id += 100 + count;

    }

    printer(int x) {     //Constructor#2
        count++;
        emp_id += 100 + count;
        System.out.print("\n***\nEmployee ID: " + emp_id);
        System.out.print("\nEnter employee name: ");
        emp_name = Q2.x.nextLine();
        System.out.print("Enter number of pages: ");
        pages = Q2.x.nextInt();
        Q2.x.nextLine();
    }

    public String getEmp_name() {
        return emp_name;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getPages() {
        return pages;
    }

    private String randomName() {
        char[] randoms = new char[6];
        for (int i = 0; i < randoms.length; i++) {
            int number;
            for (; ; ) {
                number = (int) (26 * Math.random());
                if (number <= 25 && number >= 0) {
                    break;
                }
            }
            randoms[i] = (char) (number + 'A');
        }
        return String.valueOf(randoms);
    }
}

class Q2 {
    static Scanner x = new Scanner(System.in);

    public static void main(String[] args) {
        printer[] CS_Department = new printer[100];
        int option;
        for (; ; ) {
            System.out.println("\n\n**************\n    MENU\n**************");
            System.out.print("1. Add data\n" +
                    "2. Show Information\n" +
                    "3. Add pages to existing member\n" +
                    "4. Exit!!\n" +
                    ">>>");
            option = option(1, 4);
            if (option == 1) {
                System.out.print("\nChoice\n" +
                        "1. Randomly generate data\n" +
                        "2. Input yourself\n" +
                        ">>>\s");
                option = option(1, 2);

                switch (option) {
                    case 1:
                        CS_Department[printer.count] = new printer();
                        break;
                    case 2:
                        CS_Department[printer.count] = new printer(1);
                        break;
                }
            } else if (option == 2) {
                ShowAllInfo(CS_Department);
            } else if (option == 3) {
                AddPages(CS_Department);
            } else if (option == 4) {
                break;
            }
        }
    }

    static void AddPages(printer[] a) {
        boolean idFound = false;
        System.out.println("Enter employee Id: [101-" + (printer.count + 100) + "] ");
        int option = x.nextInt();
        x.nextLine();
        for (int i = 0; i < a.length; i++) {
            if (a[i] == null) {
                break;
            }
            if (a[i].getEmp_id() == option) {
                System.out.println("Employee ID = " + a[i].getEmp_id());
                System.out.println("Employee Name = " + a[i].getEmp_name());
                System.out.println("Pages used = " + a[i].getPages());
                System.out.print("\n***Enter pages to add:");
                int temp = x.nextInt();
                if (temp < 0) {
                    System.out.println("Not valid input value!!");
                } else {
                    a[i].setPages(temp + a[i].getPages());
                }
                idFound = true;
            }
        }
        if (!idFound) {
            System.out.println("ID doesnot exist!!!");
        }
    }

    static int option(int a, int b) {
        int opt;
        for (; ; ) {
            opt = x.nextInt();
            x.nextLine();
            if (opt <= b && opt >= a) {
                break;
            } else {
                System.out.println("Enter " + a + " - " + b + " !!!\nOption: ");
            }
        }
        return opt;
    }

    static int TotalPagesTaken(printer[] a) {
        int temp = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == null) {
                break;
            }
            temp += a[i].getPages();
        }
        return temp;
    }

    static void ShowAllInfo(printer[] a) {
        System.out.println("***Department Of Computer Science***");
        System.out.println("Total number of pages taken: " + TotalPagesTaken(a));
        for (int i = 0; i < a.length; i++) {
            if (a[i] == null) {
                break;
            }
            System.out.println("Faculty member # " + (i + 1) + " has taken:\t" + a[i].getPages() + " pages");
        }
    }
}