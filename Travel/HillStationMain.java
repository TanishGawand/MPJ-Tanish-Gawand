package Travel;
class Hillstations {

    void famousfood() {
        System.out.println("General Hill Station Food");
    }

    void famousfor() {
        System.out.println("Famous for Scenic Beauty");
    }
}

class Manali extends Hillstations {

    void famousfood() {
        System.out.println("Manali Famous Food: Siddu");
    }

    void famousfor() {
        System.out.println("Manali Famous For: Snow Mountains");
    }
}

class Ooty extends Hillstations {

    void famousfood() {
        System.out.println("Ooty Famous Food: Chocolate");
    }

    void famousfor() {
        System.out.println("Ooty Famous For: Tea Gardens");
    }
}

class Darjeeling extends Hillstations {

    void famousfood() {
        System.out.println("Darjeeling Famous Food: Momos");
    }

    void famousfor() {
        System.out.println("Darjeeling Famous For: Tea");
    }
}

public class HillStationMain {
    public static void main(String[] args) {

        Hillstations h;

        h = new Manali();
        h.famousfood();
        h.famousfor();

        h = new Ooty();
        h.famousfood();
        h.famousfor();

        h = new Darjeeling();
        h.famousfood();
        h.famousfor();
    }
}
