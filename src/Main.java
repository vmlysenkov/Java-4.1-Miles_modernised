public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();

        int miles = service.calculate(99985);
        System.out.println("Накопленные мили:" +miles);
    }
}