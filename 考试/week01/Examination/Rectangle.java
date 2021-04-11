package Examination;

public class Rectangle {
     public double width=1.0;
     public double heigth=1.0;
     public Rectangle() {}
     
     public Rectangle(double width,double heigth) {
    	 this.width=width;
    	 this.heigth=heigth;
     }
     public double getArea(double width,double heigth) {
    	 double area=width*heigth;
    	 return area;
     }
     public double getPerimeter(double width,double heigth) {
    	 double perimeter=2*width+2*heigth;
    	 return perimeter;
     }
     public double  getWidth() {
    	 return width;
     }
     public double  getHeigth() {
    	 return heigth;
     }
     public void setWidth(double width) {
    	 this.width=width;
     }
     public void setHeight(double height) {
    	 this.heigth=height;
     }
     public String toString() {
		return "矩形宽为:"+width+",高为:"+heigth+",面积为:"+getArea(width, heigth)+",周长为："+getPerimeter(width, heigth);
	 }
}
