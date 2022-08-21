public class Main {
    public static void main(String[] args) {

        Gryffindor harryPotter = new Gryffindor("Гарри", 80, 90, 80, 80, 80, 100);
        Gryffindor hermioneGranger = new Gryffindor("Гермиона", 80, 90, 38, 28, 80, 76);
        Gryffindor RonWeasley = new Gryffindor("Рон", 80, 90, 69, 46, 80, 97);

        Slytherin dracoMalfoy = new Slytherin("Драко", 90, 90, 80, 80, 90, 100);
        Slytherin grahamMontagu = new Slytherin("Грэхэм", 75, 60, 1, 50, 5, 30);
        Slytherin gregoryGoyle = new Slytherin("Грегори", 75, 80, 15, 70, 9, 40);

        Hufflepuff zachariasSmith = new Hufflepuff("Захария", 80, 90, 80, 80, 80, 49);
        Hufflepuff cedricDiggory = new Hufflepuff("Седрик", 80, 27, 74, 43, 76, 56);
        Hufflepuff justinFinchFletchley = new Hufflepuff("Джастин", 80, 79, 96, 32, 86, 78);

        Ravenclaw zhouChang = new Ravenclaw("Чжоу", 49, 90, 80, 89, 80, 98);
        Ravenclaw padmaPatil = new Ravenclaw("Падма", 80, 37, 48, 80, 48, 45);
        Ravenclaw marcusBelby = new Ravenclaw("Маркус", 95, 90, 80, 80, 80, 37);

        harryPotter.studentDescription();
        dracoMalfoy.studentDescription();
        zachariasSmith.studentDescription();
        zhouChang.studentDescription();

        harryPotter.compare(hermioneGranger);
        dracoMalfoy.compare(grahamMontagu);
        zachariasSmith.compare(cedricDiggory);
        zhouChang.compare(padmaPatil);

        harryPotter.compareMagic(dracoMalfoy);


    }
}