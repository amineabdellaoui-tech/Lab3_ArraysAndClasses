package ma.um6p.lab3.ex10;

public class Calculator {
    private Floor floor;
    private Carpet carpet;

    public Calculator(Floor floor,Carpet carpet){
        this.floor =floor;
        this.carpet=carpet;
    }

    public double getTotalCost(){
        return this.floor.getArea()*this.carpet.getCost();
    }
}
