package Academy;



public class Book {
    String name;
    int count;
    public Book(String _name , int c){
        name = _name;
        count = c;
    }
    public void issue(int n){
        if(n >= count)
            System.out.println("Cannot issue so many books!");
        else
            count = count - n;
        
        if(count == 0)
            System.out.println("Out of Book: " + name);
        else if(count <= 2)
            System.out.println("Running out of Books :  " + name);
        else
            System.out.println("Issued " + n + " " + name + " books.");
    }
    public void deposit(int n){
        count = count + n;
    }
    
}
