package laboratorul1;

public class Laboratorul1 {

    public static void main(String[] args) {
        System.out.println("ex1: ");
        System.out.println("Hello World!");

        System.out.println("ex2: ");
        String languages[] = {"C", "C++", "C#", "Python", "Go", "Rust", "JavaScript", "PHP", "Swift", "Java"};

        System.out.println("ex3: ");
        int n = (int) (Math.random() * 1_000_000);
        System.out.println(n);
        System.out.println("ex4: ");
        n = n * 3;
        n = n + 0b10101;
        n = n + 0xFF;
        n = n * 6;
        System.out.println(n);
        System.out.println("ex5: ");
        int s = 0;
        int aux=0;
        do {
            while (n >=1) {
                s = s + n % 10;
                n = n / 10;
            }
            n=s;
           s=0;
        }while (n>9);
        System.out.println("Willy-nilly, this semester I will learn ");
               System.out.println(languages[n]);
   
    }

}
