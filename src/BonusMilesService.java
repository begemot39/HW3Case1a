public class BonusMilesService {
    int bonusMiles;
    int ratio = 20;
    public int calculate( int a ){
        bonusMiles = a / ratio;
        return bonusMiles;
    }

}