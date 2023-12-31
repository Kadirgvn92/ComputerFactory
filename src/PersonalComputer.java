public class PersonalComputer extends Product {

    private final ComputerCase computerCase;
    private final Monitor monitor;
    private final Motherboard motherboard;

    public PersonalComputer(String model, String manufacturer,
                            ComputerCase computerCase, Monitor monitor,
                            Motherboard motherboard) {
        super(model, manufacturer);
        this.computerCase = computerCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }


    public void powerUp(){
        computerCase.pressPowerButton();
        motherboard.loadProgram("Ios");
        monitor.drawPixelAt(10,10,"red");
    }
   /* public ComputerCase getComputerCase() {
        return computerCase;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }*/
}
