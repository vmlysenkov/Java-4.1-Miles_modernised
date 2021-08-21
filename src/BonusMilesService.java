public class BonusMilesService {
    public int calculate(int price) {

        int proportion = 20;
        int miles = price / proportion;

        return miles;
    }
}