package abstractfactory;

public class ThrowCreator {
    public static AbstractClubFactory get(ClubType club) {
        return switch (club){
            case ENGLAND -> new ClubFactory();
        };
    }
}
