public class Shop <T extends Farm> {
    T value;

    public void setValue(T value) {
        this.value = value;
    }
    public void buyItem(Get<Farm> get) {
        System.out.println(get.getValue());
    }
}
