import java.util.Random;
public class Duplicates
{

    public static void main(String []args)
    {
        int[] array1 = new int[10];
        int[] array2 = new int[10];

        Random rand = new Random();

        for(int i = 0; i < array1.length; i++)
        {
            array1[i] = rand.nextInt(19);
        }
        for(int i = 0; i < array2.length; i++)
        {
            array2[i] = rand.nextInt(19);
        }
        System.out.printf("Array 1: ");
        for(int i: array1)
        {
            System.out.print(i + ",");
        }
        System.out.println();

        System.out.printf("Array 2: ");

        for(int i: array2)
        {
            System.out.print(i + ",");
        }

        System.out.println("\nValues the exist in both arrays are... ");

        for(int i = 0; i < array1.length;i++)
        {
            for(int j = 0; j < array2.length; j++)
            {
                if(array1[i]==array2[j])
                {
                    System.out.printf(array1[i] + ",");
                }
            }
        }
    }
}
