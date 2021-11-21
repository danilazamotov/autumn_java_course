import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<FruitsType> apple = new ArrayList<>();
        List<VegetablesType> carrot = new ArrayList<>();
        carrot.add(new Carrot("Морковь"));
//        carrot.add(new Apple("Яблоки"));

        Farm <FruitsType> farm = new Farm<>();
//        farm.setValue(apple.);

        Get <Farm> get = new Get<>(); // взять с фермы
        get.setValue(get.getValue());

        Shop<? super Farm> shop = new Shop<>();
        shop.setValue(get.getValue());

        shop.buyItem(get);

    }
}