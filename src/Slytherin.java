public class Slytherin extends Hogwarts {
    private int ambition, cunning, leadership, resourcefulness;

    public Slytherin(String name, int magicPower, int transgressionRange, int ambition, int cunning, int leadership, int resourcefulness) {
        super(name, magicPower, transgressionRange);
        this.ambition = ambition;
        this.cunning = cunning;
        this.leadership = leadership;
        this.resourcefulness = resourcefulness;
    }

    public void studentDescription() {
        System.out.println("House: Slytherin, student : " + name + ", stats(" +
                "magicPower " + this.getMagicPower() +
                ", transgressionRange " + this.getTransgressionRange() +
                ", ambition  " + ambition  +
                ", cunning " + cunning +
                ", leadership " + leadership +
                ", resourcefulness " + resourcefulness + ")");
    }

    public void compare(Slytherin student) {
        int stats1 = ambition + cunning + leadership + resourcefulness;
        int stats2 = student.ambition + student.cunning + student.leadership + student.resourcefulness;
        if (stats2 > stats1) System.out.println(student.name + "лучший Гриффиндорец, чем " + name);
        else System.out.println(name + " лучший Слизериец, чем " + student.name + ".");
    }
}
