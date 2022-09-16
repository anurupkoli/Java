import java.util.Scanner;

class Library{
    String []list;
    int ele;
    Scanner s = new Scanner(System.in);
    Library(){
        this.list = new String[100];
        this.list[0] = "Java"; 
        this.list[1] = "Python"; 
        this.list[2] = "C++";
        this.ele = 3;
    }    
    
    void displayBooks(){
        for(int i=0; i<this.list.length; i++){
            if(this.list[i] == null){
                break;
            }
            System.out.print("*");
            System.out.println(this.list[i]);
        }
    }

    void issueBook(){
        System.out.print("Enter the name of book you want to issue: ");
        String book = s.nextLine();
        for(int i=0; i<list.length; i++){
            if(book == this.list[i]){
                System.out.println(book + " has been issued.");
                this.list[i] = null;
                this.ele--;
                return;            }
        }
        System.out.println( book+" is not available.");
    }

    void addBook(){
        System.out.print("Enter the name of book you want to add: ");
        String book = s.nextLine();
        this.list[this.ele] = book;
        System.out.println(book+" has been added");
        this.ele++;
    }


}


public class library {
    public static void main(String[] args){
        Library lib = new Library();
        boolean b = true;
        Scanner s = new Scanner(System.in);

        while(b){
            System.out.println("Welcome to My Library");
            System.out.println("Select from following options:");
            System.out.print("1. Display books\n2. Issue book\n3. Add book\n4. Exit");
            int option = s.nextInt();
            if(option == 1){
                lib.displayBooks();
                b = true;
            }

            else if(option == 2){               
                lib.issueBook();
                b = true;
            }

            else if(option == 3){
                lib.addBook();
                b = true;
            }

            else if(option == 4){
                b = false;
            }
        }
    }
}
