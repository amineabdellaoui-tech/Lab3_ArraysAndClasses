package ma.um6p.lab3.ex8;

public class Wall {
    private double width;
    private double height;

    public Wall(){ //default empty constructor

    }

    public Wall(double width, double height){
        if(width<0){ //check for negative values to avoid a wall with negative width
            this.width=0;
        }else{
            this.width=width;
        }
        if(height<0){ //Same check for the height
            this.height=0;
        }else{
            this.height=height;
        }
    }

    public double getWidth(){
        return this.width;
    }

    public double getHeight(){
        return this.height;
    }

    public void setWidth(double width){
        if(width<0){ //validation to prevent setting a negative width later on
            this.width=0;
        }else{
            this.width = width;
        }
    }

    public void setHeight(double height){
        if(height<0){ //validation to prevent setting a negative height
            this.height=0;
        }else{
            this.height = height;
        }
    }

    // Calculate the area of the wall
    public double getArea(){
        return this.width*this.height;
    }

    public static void main(String[] args){
        //testing
        Wall wall = new Wall(5,4);
        System.out.println("area= " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());
    }
}
