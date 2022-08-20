public class Ravenclaw extends Hogwarts {
    private int intelligence, learning, wisdom, wit;

    public Ravenclaw(String name, int magicPower, int transgressionRange, int intelligence, int learning, int wisdom, int wit) {
        super(name, magicPower, transgressionRange);
        this.intelligence = intelligence;
        this.learning = learning;
        this.wisdom = wisdom;
        this.wit = wit;
    }

    public void studentDescription() {
        System.out.println("House: Ravenclaw, student : " + name + ", stats(" +
                "magicPower " + this.getMagicPower() +
                ", transgressionRange " + this.getTransgressionRange() +
                ", intelligence " + intelligence +
                ", learning " + learning +
                ", wisdom " + wisdom +
                ", wit" + wit + ")");
    }

    public void compare(Ravenclaw student) {
        int stats1 = intelligence + learning + wisdom + wit;
        int stats2 = student.intelligence + student.learning + student.wisdom + student.wit;
        if (stats2 > stats1) System.out.println(student.name + "лучший Гриффиндорец, чем " + name);
        else System.out.println(name + " лучший Когтевранец, чем " + student.name + ".");
    }
}
