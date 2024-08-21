public class BonusMilesService {
    public int calculate(int price) {
        int ratio = 20; // Ставка бонусных миль.
        int bonusMiles = price / ratio;
        return bonusMiles;
    }
}