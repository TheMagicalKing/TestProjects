package RectangleLiang;

public class Rectangle {

    //------- Variables
    double width = 1;
    double height = 1;
    //------- Constructors
    private void RectangleLiang(){}
    private void RectangleLiang(double width, double height){
    }
    //------- Methods
    public void outputArea(double inputHeight, double inputWidth){
        double width=inputWidth;
        double height=inputHeight;
        getArea(width,height);

    }
    public void outputPeri(double inputHeight, double inputWidth){
        double width=inputWidth;
        double height=inputHeight;
        getPerimeter(width,height);

    }

    private void getArea(double width,double height){
        double area = width*height;
        System.out.println(area);
    }

    private void getPerimeter(double width,double height){
        double perimeter = width+width+height+height;
        System.out.println(perimeter);
    }

}
