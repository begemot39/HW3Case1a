public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;// Стоимость билета.
        int bonusMiles = service.calculate(price); // Бонусные мили.
        System.out.println("Ваши бонусные мили: " + bonusMiles);
    }
}