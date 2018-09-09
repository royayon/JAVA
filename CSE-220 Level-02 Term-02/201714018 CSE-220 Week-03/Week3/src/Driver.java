import Academy.Library;
public class Driver {
    public static void main(String[] args) {
        //1+2+3+.....+n
        Adder addn = new Adder(10);
        System.out.println("Sum is: " + addn.nSum());
        
        //1^2 +2^2 +3^2........+n^2
        AdderPlus addn2 = new AdderPlus(3 , 2);
        System.out.println("Sum is: "+ addn2.getSum());
        
        //1^3 +2^3 +3^3........+n^3
        AdderPlus addn3 = new AdderPlus(2 , 3);
        System.out.println("Sum is: "+ addn3.getSum());
        
        
        
        //Library Books DS and Algo
        LibBooks books = new LibBooks(4 , 6);
        books.issueDS();
        books.avilableBooks();
        
        books.issueAlgo();
        books.avilableBooks();
        
        books.retAlgo();
        books.retDS();
        books.avilableBooks();
        
        books.issueDS();
        books.issueDS();
        books.issueDS();
        books.issueDS();
        
        books.avilableBooks();
        
        
        //Two Points
        Point p1 = new Point(1,2);
        Point p2 = new Point(2,4);
        
        System.out.println("Length is: " + p1.length(p2));
        System.out.println("MidPoint is: (" + p1.midPointX(p2) + " , " + p1.midPointY(p2) + ")");
        
        //Library Problem in OOP
        Library lib1 = new Library(10 , 20);
        lib1.DS.issue(9);
        
        
    }
    
}
