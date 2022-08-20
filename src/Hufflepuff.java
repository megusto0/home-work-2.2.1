public class Hufflepuff extends Hogwarts {
    private int work, patience, justice, loyalty;

    public Hufflepuff(String name, int magicPower, int transgressionRange, int work, int patience, int justice, int loyalty) {
        super(name, magicPower, transgressionRange);
        this.work = work;
        this.patience = patience;
        this.justice = justice;
        this.loyalty = loyalty;
    }

    public void studentDescription() {
        System.out.println("House: Hufflepuff, student : " + name + ", stats(" +
                "magicPower " + this.getMagicPower() +
                ", transgressionRange " + this.getTransgressionRange() +
                ", work " + work +
                ", patience " + patience +
                ", justice " + justice +
                ", loyalty " + loyalty + ")");
    }

    public void compare(Hufflepuff student) {
        int stats1 = work + patience + justice + loyalty;
        int stats2 = student.work + student.patience + student.justice + student.loyalty;
        if (stats2 > stats1) System.out.println(student.name + "лучший Гриффиндорец, чем " + name);
        else System.out.println(name + " лучший Пуффендуец, чем " + student.name + ".");
    }
}
