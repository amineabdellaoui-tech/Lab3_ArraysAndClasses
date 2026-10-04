package ma.um6p.lab3.ex10;

public class Floor {
    private double width;
    private double length;

    public Floor(double width,double length){
        if(width<0){ //case of negative width
            this.width=0;
        }else{
            this.width=width;
        }
        if(length<0){  //case of negative length
            this.length=0;
        }else{
            this.length=length;
        }
    }

    public double getArea(){ //getter
        return this.width*this.length;
    }
}
