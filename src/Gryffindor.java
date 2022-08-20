public class Gryffindor extends Hogwarts {
    private int courage, bravery, nerve, chivalry;

    public Gryffindor(String name, int magicPower, int transgressionRange, int courage, int bravery, int nerve, int chivalry) {
        super(name, magicPower, transgressionRange);
        this.courage = courage;
        this.bravery = bravery;
        this.nerve = nerve;
        this.chivalry = chivalry;
    }

    public void studentDescription() {
        System.out.println("House: Gryffindor, student : " + name + ", stats(" +
                "magicPower " + this.getMagicPower() +
                ", transgressionRange " + this.getTransgressionRange() +
                ", courage " + courage +
                ", bravery " + bravery +
                ", nerve " + nerve +
                ", chivalry " + chivalry + ")");
    }

    public void compare(Gryffindor student) {
        int stats1 = courage + bravery + nerve + chivalry;
        int stats2 = student.courage + student.bravery + student.nerve + student.chivalry;
        if (stats2 > stats1) System.out.println(student.name + "лучший Гриффиндорец, чем " + name);
        else System.out.println(name + " лучший Гриффиндорец, чем " + student.name + ".");
    }
}
