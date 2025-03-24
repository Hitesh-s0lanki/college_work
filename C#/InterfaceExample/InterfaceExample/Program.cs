using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace InterfaceExample
{

    interface Default
    {
        int add(int value);
    }

    internal class Program: Default
    {
        public int add(int value) {
            return value;
        }

        static void Main(string[] args)
        {

        }
    }
}
