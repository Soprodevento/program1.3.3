//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        byte result = getAgeDiff((byte) 5,(byte) 3);
        System.out.println(result);
    }

    public static byte getAgeDiff(byte age1, byte age2) {
        return (byte) (age1 - age2);
    }
}
