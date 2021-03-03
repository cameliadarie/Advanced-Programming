/**
 * Aceasta clasa contine algoritmul pentru solutionarea problemei
 */
package Lab2;

public class Solution {
    public Solution(Problem p1) {
int costtotal=0;
        int [] supply = new int [] {p1.s1.capacity,p1.s2.capacity,p1.s3.capacity};
        int [] demand = new int [] {p1.d1.commodities,p1.d2.commodities,p1.d3.commodities};
        int [][] mat = new int [100][100];
        mat=p1.cost;
        int i;
        for(i=0;i<=2;i++)
           for(int j=0;j<=2 && supply[i]!=0 ;j++)
           {   if(demand[j]!=0)
           {int ales;
               if(supply[i]<demand[j])
                   ales=supply[j];
               else
                   ales=demand[j];
               costtotal=costtotal+mat[i][j]*ales;
               System.out.println(costtotal);
               supply[i]=supply[i]-ales;
               demand[j]=demand[j]-ales;}
           }

//System.out.print(costtotal);
    }
}
