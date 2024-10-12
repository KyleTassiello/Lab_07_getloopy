public class Main
{
    public static void main(String[] args)
    {
        System.out.print("|");
        for (int i = 0; i <= 30; i++)
        {
            System.out.printf("%3d |", i);
        }
        System.out.print("\n");


        System.out.print("|");
        for (int i = 30; i >= 0; i--)
        {
            System.out.printf("%3d |", i);
        }
        System.out.print("\n");

        System.out.print("|");
        for (int i = 0; i <= 18; i += 3)
        {
            System.out.printf("%3d |", i);
        }
        System.out.print("\n");

        System.out.print("|");
        for (int i = 10; i >= 0; i-=2)
        {
            System.out.printf("%3d |", i);
        }
        System.out.print("\n");

        System.out.print("\n");
        for (int i = 0; i < 5; i++)
        {
            for (int c = 0; c <= i; c++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
        for (int i = 5; i > 0; i--)
        {
            for (int c = 0; c < i; c++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
        for (int i = 0; i < 5; i++)
        {
            System.out.print("*****");
            System.out.print("\n");
        }


    }
}