public class Main {

    public static void main(String[] args) {
        BonusService service = new BonusService();

        int expected = 150;
        int actual = (int) service.calculate(5000, true);
        System.out.println(expected +" == ? == " + actual);
    }
}