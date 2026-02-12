public class Hund extends Tier {

    public Hund(String name) {
        super(name);
    }

    @Override
    public void geraeuschMachen() {
        System.out.println(getName() + " bellt: Wuff Wuff");
    }

}
