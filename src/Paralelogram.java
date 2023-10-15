public class Paralelogram {
    int calculatePerimeter(int length, int width) {
        return 2*(length+width);
    }
    int calculatePerimeter(int sideLength) {
        return 4*sideLength;
    }

    double calculateArea(int length, double width) {
        return length*width;
    }
    int calculateArea(int sideLength) {
        return sideLength*sideLength;
    }

}
