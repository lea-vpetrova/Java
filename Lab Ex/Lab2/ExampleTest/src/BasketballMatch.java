import java.util.ArrayList;
public class BasketballMatch implements IEvent{
    private Integer mostPointsScored;
    private static Competitor[] lineup;
    public BasketballMatch(int mostPointsScored){

        this.mostPointsScored = mostPointsScored;

    }

    @Override
    public Competitor[] getLineup(){
        return lineup;
    }
}
