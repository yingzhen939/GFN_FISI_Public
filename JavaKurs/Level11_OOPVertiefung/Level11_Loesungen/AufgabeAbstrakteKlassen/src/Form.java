public abstract class Form {
    private String name; // Name der Form

    public Form(String name) {
        this.name = name;
    }

    public abstract double berechneFlaeche();

    public String getName() {
        return name;
    }
}