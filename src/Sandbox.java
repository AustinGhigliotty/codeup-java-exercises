class Person2 {
    private String name;
    public Person2(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
class SuperHero extends Person {
    private String alterEgo;

    public SuperHero(String name, String alterEgo) {
        super(name);
        this.alterEgo = alterEgo;
    }

    public String getName() {
        return alterEgo;
    }

    public String getSecretIdentity() {
        return super.getName();
    }

    public static void main(String[] args) {
        SuperHero theManOfSteel = new SuperHero("Clark Kent", "Superman");

        System.out.println(theManOfSteel.getName()); // "Superman"
        System.out.println(theManOfSteel.getSecretIdentity()); // "Clark Kent"
    }
}