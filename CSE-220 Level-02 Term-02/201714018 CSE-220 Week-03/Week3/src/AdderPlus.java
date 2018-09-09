public class AdderPlus extends Adder{
    int power;
    AdderPlus(int _n , int _power){
        super(_n);
        power = _power;
    }
    
    double getSum(){
        double sum = 0;
        for(int i = 1; i<=n; i++)
            sum = sum + Math.pow(i*1.0 , power*1.0);
        return sum;
    }
    
}
