
public class Rectangle extends Shape{
	Rectangle(int _height , int _width){
		height = _height;
		width = _width;
	}
	double getArea() {
		return height*width;
	}
}
