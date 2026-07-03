using System;

class A_Even_Odds
{
    public static void Main(string[] args)
    {
        string[] input = Console.ReadLine().Split();

        long n = long.Parse(input[0]);
        long k = long.Parse(input[1]);

        long oddCount = (n + 1) / 2;
        long answer;

        if (k <= oddCount)
        {
            answer = 2 * k - 1;
        }
        else
        {
            long idx = k - oddCount;
            answer = 2 * idx;
        }

        Console.WriteLine(answer);
    }
}