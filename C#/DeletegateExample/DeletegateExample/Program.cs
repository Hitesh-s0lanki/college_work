using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DeletegateExample
{
    internal class Program
    {

        public delegate int MathOperation(int x, int y);

        public static int Add(int x, int y) => x + y;
        static int Sub(int x, int y) => x - y;


        static void Main(string[] args)
        {
            MathOperation add = Add;
            MathOperation sub = Sub;

            Console.WriteLine(add(4, 5));
            Console.WriteLine(sub(4, 5));

            Console.ReadKey(true);
        }
    }
}
