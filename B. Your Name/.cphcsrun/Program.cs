using System;
using System.Linq;

public class B_Your_Name
{
    public static void Main(string[] args)
    {
        int t = int.Parse(Console.ReadLine());

        while (t-- > 0)
        {
            int n = int.Parse(Console.ReadLine());
            string s = Console.ReadLine();
            string q = Console.ReadLine();

            Console.WriteLine(check(s, q));
        }
    }

    public static string check(string str1, string str2)
    {
        bool isSame = str1.OrderBy(c => c).SequenceEqual(str2.OrderBy(c => c));

        return isSame ? "YES" : "NO";
    }
}