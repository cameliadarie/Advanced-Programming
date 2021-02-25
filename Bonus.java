package bonus;

public class Bonus {

    public static void main(String[] args) {
        long startTime=System.nanoTime();
        int i;
        int j = 0;
        int n = Integer.parseInt(args[0]);
        if (n <= 0) {
            throw new IllegalArgumentException("argumentul dat nu este valid0");
        }
        int a;

        int[][] mat = new int[n + 1][n + 1];
        for (i = 0; i < n; i++) {
            {
                for (j = 0; j < n && i <= j; j++) { // punere 0 sau 1 in matrice
                    if (i == j) {
                        mat[i][j] = 0;
                    } else {
                        {
                            a = (int) (Math.random() * 2);
                            mat[i][j] = a;
                            mat[j][i] = a;
                        }
                    }

                }

            } if(n<101)
            for (i = 0; i < n; i++) { // afisare matrice unicode
                for (j = 0; j < n; j++) {
                    if (mat[i][j] == 0) {
                        System.out.print("\u2B21 ");
                    } else {
                        System.out.print("\u2B22 ");
                    }
                }
                System.out.println();
            }

        }
        
        int[][] pt = new int[n + 1][n + 1];// 0 in partial tree matrix
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                pt[i][j] = 0;
            }
        }
        
        int[] vizitat = new int[n + 1];

        for (i = 0; i < n; i++) {//afisare componente conexe
            if (vizitat[i] == 0) {
                BFS(i, n, mat, vizitat, pt);
                System.out.println();
            }
        }
        if(n<101)
          for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(pt[i][j] );
            }
            System.out.println();
        }
        if(n>=101)
        {long endTime = System.nanoTime();
long totalTime = endTime - startTime;
System.out.println(totalTime);}
    }

    public static void BFS(int x, int n, int[][] mat, int[] vizitat, int[][] pt) {
        int[] coada = new int[100];

        int p, u, i;
        p = u = 0;
        coada[p] = x;
        vizitat[x] = 1;
        System.out.print(x);
        while (p <= u + 1) {
            x = coada[p++];
            for (i = 0; i < n; ++i) {
                if (mat[x][i] == 1 && vizitat[i] == 0) {
                    pt[x][i] = 1;
                    pt[i][x] = 1;
                    coada[++u] = i;
                    System.out.print(i);
                    vizitat[i] = 1;
                }
            }
        }

    }

}
