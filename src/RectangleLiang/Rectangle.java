package RectangleLiang;

public class Rectangle {

    //------- Variables
    private double width = 1;
    private double height = 1;
    //------- Constructors
    protected Rectangle(){}
    protected Rectangle(double width, double height){
    }
    //------- Methods
    public void outputArea(double inputHeight, double inputWidth){
        double width=inputWidth;
        double height=inputHeight;
        System.out.println(calcArea(width,height));

    }
    public void outputPeri(double inputHeight, double inputWidth){
        double width=inputWidth;
        double height=inputHeight;
        calcPerimeter(width,height);
        System.out.println(calcPerimeter(width,height));
    }

    private double calcArea(double width,double height){
        double area = width*height;
        return area;
    }

    private double calcPerimeter(double width,double height){
        double perimeter = width+width+height+height;
        return perimeter;
    }

}
