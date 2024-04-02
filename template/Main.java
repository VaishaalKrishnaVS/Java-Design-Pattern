public class Main {
    public static void main(String[] args) {
        ComputerManf desktopManf = new DesktopManf();
        desktopManf.buildComputer();

        ComputerManf lapManf = new LaptopManf();
        lapManf.buildComputer();
    }
}
