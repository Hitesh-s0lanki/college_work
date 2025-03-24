using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace practical1b
{
    internal class Program
    {
        static void Main(string[] args)
        {
            // Floyd's Triangle
            Console.Write("Enter the value of n : ");
            int n = Convert.ToInt32(Console.ReadLine());

            Console.WriteLine();

            int cnt = 1;

            for (int i = 0; i < n; i++) { 
                for(int j = 0;j <= i; j++){
                    Console.Write(cnt++ + " ");
                }
                Console.WriteLine();
            }

            Console.ReadKey();
        }
    }
}
