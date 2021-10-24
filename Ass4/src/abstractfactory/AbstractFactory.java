package abstractfactory;

public class AbstractFactory {
    public static void main(String[] args) {
        Club england = ThrowCreator.get ( ClubType.ENGLAND ).getClubFootballer ( Footballer.MANCHESTER );
        System.out.println (england.getFootballers ());
    }
}
