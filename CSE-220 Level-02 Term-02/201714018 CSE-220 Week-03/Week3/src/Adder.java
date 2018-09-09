public class Adder {
    int n;
    Adder(int _n){
        n = _n;
    }
    
    int nSum(){
        int sum = 0;
        for(int i = 1; i<=n; i++)
            sum = sum + i;
        
        return sum;
    }
    
}
