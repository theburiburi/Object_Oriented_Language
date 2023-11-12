import java.util.Random;

public class ArrayPrinter {
    public static void main(String[] args) {
        int[] data = new int[10];
        Random generator = new Random();
        for (int i = 0; i<10; i++)
        {
            data[i] = generator.nextInt(100) + 1;
        }

        for (int i = 0; i < data.length; i = i + 2)
        {
            System.out.print(data[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < data.length; i++)
        {
            if (data[i] % 2 == 0)
            {
                System.out.print(data[i] + " ");
            }
        }
        System.out.println();

        for (int i = data.length-1; i>=0; i--)
        {
            System.out.print(data[i] + " ");
        }
        System.out.println();

        System.out.printf("%d %d\n", data[0], data[data.length - 1]);
    }
}
