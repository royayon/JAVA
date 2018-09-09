package Academy;

public class Library {
    public Book DS;
    public Book Algo;
    public Library(int _DS , int _Algo){
        DS = new Book("DS" , _DS);
        Algo = new Book("Algo" , _Algo );
    }
    
}
