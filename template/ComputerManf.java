public abstract class ComputerManf {

    public void buildComputer() {

        System.out.println(addHardDisk());
        System.out.println(addRAM());
        System.out.println(addKeyBoard());

    }

    public abstract String addHardDisk();

    public abstract String addRAM();

    public abstract String addKeyBoard();

}