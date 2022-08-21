public class Hogwarts {
    private int magicPower;
    private int transgressionRange;
    String name;

    public Hogwarts(String name, int magicPower, int transgressionRange) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgressionRange = transgressionRange;
    }

    public void compareMagic(Hogwarts student) {
        int stats1 = magicPower + transgressionRange;
        int stats2 = student.magicPower + student.transgressionRange;
        if (stats2 > stats1) System.out.println(student.name + " обладает большей мощностью магии, чем " + name);
        else System.out.println(name + " обладает большей мощностью магии, чем " + student.name + ".");
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgressionRange() {
        return transgressionRange;
    }

    public String getName() {
        return name;
    }
}
