package ma.um6p.lab3.ex9;

public class Point {
    private int x;
    private int y;

    public Point(){ //empty default constructor

    }

    //constructor with parameters to initialize coordinates
    public Point(int x,int y){
        this.x=x;
        this.y=y;
    }

    public int getX(){return this.x;}
    public int getY(){return this.y;}

    public void setX(int x){
        this.x=x;
    }
    public void setY(int y){
        this.y=y;
    }

    //distance from the origin (0,0)
    public double distance(){
        return Math.sqrt(this.x*this.x + this.y*this.y);
    }

    //distance between this point and another Point object
    public double distance(Point p1){
        return Math.sqrt((this.x - p1.getX()) * (this.x - p1.getX()) + (this.y - p1.getY()) * (this.y - p1.getY()));
    }

    //distance to specific x and y coordinates
    public double distance(int x, int y){
        return Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
    }

    public static void main(String[] args){
        //testing
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        Point third = new Point();

        third.setX(3);
        third.setY(4);

        System.out.println("Distance de 'first' à (0,0) : " + first.distance());
        System.out.println("Distance de 'first' à 'second' : " + first.distance(second));
        System.out.println("Distance de 'first' au point (2, 2) : " + first.distance(2, 2));
        System.out.println("Distance de 'third' (3,4) à (0,0) : " + third.distance());
    }
}
