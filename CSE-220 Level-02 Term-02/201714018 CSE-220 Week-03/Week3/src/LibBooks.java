
public class LibBooks {

    int totalBooksDS;
    int totalBooksAlgo;

    LibBooks(int _totalBooksDS , int _totalBooksAlgo) {

        totalBooksDS = _totalBooksDS;

        totalBooksAlgo = _totalBooksAlgo;
    }

    void issueDS() {
        if(totalBooksDS == 0)
            System.out.println("DS books cannot be issued!");
        else if (totalBooksDS <= 2 && totalBooksDS != 0) {
            System.out.println("Warning! Only 2 or less copies DS books are available.");
            totalBooksDS--;
        }
        else if(totalBooksDS != 0)
            totalBooksDS--;
        
    }

    void retDS() {
        totalBooksDS++;
    }

    void issueAlgo() {
        if (totalBooksAlgo <= 2 && totalBooksAlgo != 0) {
            System.out.println("Warning! Only 2 or less copies Algo books are available.");
            totalBooksAlgo--;
        }
        else if(totalBooksAlgo != 0)
            totalBooksAlgo--;
        else if(totalBooksAlgo == 0)
            System.out.println("Algo books cannot be issued!");
    }

    void retAlgo() {
        totalBooksAlgo++;
    }
    
    void avilableBooks(){
        System.out.println("Total DS books availabe now: " + totalBooksDS);
        System.out.println("Total Algo books availabe now: " + totalBooksAlgo);
    }

}
