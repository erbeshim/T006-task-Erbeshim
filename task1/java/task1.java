
import java.util.Scanner;

void main() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Write students");
    int st = sc.nextInt();
    System.out.println("Write groups of size");
    int gr = sc.nextInt();

    int fullGr = st/gr;
    System.out.println("groups "+fullGr);
    int leftSt = st%gr;
    System.out.println("students left "+leftSt);


}
