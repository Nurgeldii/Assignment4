package abstractfactory;

public class ClubFactory extends AbstractClubFactory{

    Club getClubFootballer(Footballer type) {
        return switch (type) {
            case MANCHESTER -> new ManchesterUnited ( "Cristiano Ronaldo" , 7 , 40000000 );
            case LIVERPOOL -> new Liverpool ( "Mohammed Salah" , 10 , 150000000 );
        };
    }
}
