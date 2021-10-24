package factory;

import java.util.Scanner;

public class Factory {
    public static void main(String[] args) {
        TypeFactory factory = new TypeFactory ();
        Scanner scanner = new Scanner ( System.in );
        Type type = factory.getType ( scanner.next () );
        type.type ();
    }
}
