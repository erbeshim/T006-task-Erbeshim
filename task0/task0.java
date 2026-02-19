import java.util.Scanner;

void main() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Write a");
    int a = sc.nextInt();
    System.out.println("Write b");
    int b = sc.nextInt();

    System.out.println("Write c");
    int c = sc.nextInt();
    System.out.println("Write d");
    int d = sc.nextInt();

    int q = b*d;
    int p = a*d+c*b;
    System.out.println(p);
    System.out.println("_");
    System.out.println(q);


}
