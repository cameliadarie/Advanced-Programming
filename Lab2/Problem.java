/**
 * Aceasta clasa contine informatiile despre surse si destinatii si matricea de cost
 */
package Lab2;

public class Problem {
    int[][] cost = new int[100][100];

    Source s1= new Warehouse ( "s1",10);
    Source s2= new Warehouse ("s2",35);
    Source s3= new Warehouse ("s3",25);
    Destination d1 = new Destination("d1",20);
    Destination d2 = new Destination("d2",25);
    Destination d3 = new Destination("d1", 25);
    public int[][] getCost() {
        return cost;
    }

    public void setCost(int[][] cost) {
        this.cost = cost;
    }

    public Problem() {
        this.cost = new int [][]{{2,3,1},{5,4,8},{5,6,8}};

    }
}
