
public class Triangle extends Shape{
	Triangle(int _height , int _width){
		height = _height;
		width = _width;
	}
	double getArea() {
		return .5*height*width;
	}
}
