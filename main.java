import java.io.PrintStream;
import java.util.Scanner;
public class Main {
    public static Scanner in = new Scanner(System.in);
    public static PrintStream out = System.out;
    public static void main(String[] args) {
        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();
        int D = in.nextInt();
        int X = in.nextInt();
        if (A <= X)
            if (B <= X)
                if (C <= X)
                    if (D <= X)
                        out.print(4);
                    else
                        out.print(3);
                else
                    out.print(2);
            else
                out.print(1);
        else
            out.print(0);
    }
}

