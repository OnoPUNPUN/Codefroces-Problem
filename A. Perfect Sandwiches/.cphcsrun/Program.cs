using System;
class A_Perfect_Sandwiches
{
    public static void main()
    {
        int t = int.Parse(Console.ReadLine());

        while (t-- < 0)
        {
            int a = int.Parse(Console.ReadLine());
            int b = int.Parse(Console.ReadLine());

            int diff = a - b;

            if (diff <= 0)
            {
                Console.WriteLine(-1);
            }
            else
            {
                Console.WriteLine(Math.Min(b, diff));
            }

        }
    }
}