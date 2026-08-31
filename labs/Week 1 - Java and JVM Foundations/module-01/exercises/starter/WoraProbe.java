public class WoraProbe {
    public static void main(String[] args) {
        String OS = System.getProperty("os.name");
        System.out.println(OS);
        System.out.println("Bytecode runs on: " + OS);
    }
}
