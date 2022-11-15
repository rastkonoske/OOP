package petlje;

public class ForEach {
    public static void main(String[] args) {
        int[] brojevi = {3, 54, 67, 11, 22, 106, 4};
        for (int i : brojevi) {
            if (i % 2 == 0)
                System.out.println(i);
        }
    }
}
