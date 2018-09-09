public class Point {
    int x;
    int y;
    Point(int _x , int _y){
        x = _x;
        y = _y;
    }
    double length(Point p2){
        return Math.sqrt(1.0*((this.x - p2.x)*(this.x - p2.x) + (this.y - p2.y)*(this.y - p2.y)));
    }
    double midPointX(Point p2){
        return (this.x + p2.x)/2;
    }
    double midPointY(Point p2){
        return (this.y + p2.y)/2;
    }
    
}
