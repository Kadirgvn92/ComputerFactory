public class Main {

    public static void main(String[] args) {
        ComputerCase theCase = new ComputerCase("Çelik Kasa",
                "MSI","240 DC" );
        Monitor monitor = new Monitor("27 inç Curved",
                "MSI", 27, "2560 x 1440");
        Motherboard motherboard = new Motherboard("BJ-220",
                "Asus", 2,2,"v2-78u");
        PersonalComputer thePc = new PersonalComputer("Katana",
                "MSI", theCase, monitor, motherboard);


        thePc.powerUp();
    }
}
