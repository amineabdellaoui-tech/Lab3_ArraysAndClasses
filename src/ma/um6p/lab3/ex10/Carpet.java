package ma.um6p.lab3.ex10;

public class Carpet {
    private double cost;

    public Carpet(double cost){
        if(cost<0){ //case of negative cost
            this.cost=0;
        }else {
            this.cost=cost;
        }
    }

    public double getCost(){ //getter
        return this.cost;
    }
}

