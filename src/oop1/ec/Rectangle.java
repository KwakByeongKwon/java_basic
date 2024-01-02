package oop1.ec;

public class Rectangle {
    int width;
    int height;

//    void calculatePerimeter(){
//        int perimeter = 2 * (width + height);
//        System.out.println("둘레 길이: " + perimeter);
//    }
//
//    void calculateArea(){
//        int area = width * height;
//        System.out.println("넓이: " + area);
//    }
//
//    void isSquare(){
//        boolean square = width == height;
//        System.out.println("정사각형 여부: " + square);
//    }
    int calculatePerimeter(){
        return  2 * (width + height);
    }

    int calculateArea(){
        return width * height;
    }

    boolean isSquare(){
        return width == height;
    }
}
