using System;
using System.Diagnostics.CodeAnalysis;
using System.Reflection.Metadata;
using System.Runtime.InteropServices;

namespace CSharp1
{
    class Program
    {
        static void Main(string[] args) 
        {
            //Comentarios == Java ?
            Console.WriteLine("C#");
            
            //Las variables str se pueden crear con S y s
            String str = "A";
            string str2 = "a";
            Console.WriteLine(str);
            Console.WriteLine(str2);

            int entero = 1;
            Console.WriteLine(entero);

            float flotantexd = 6.5f;
            Console.WriteLine(flotantexd);

            double doble = 1.0;
            Console.WriteLine(doble);

            Console.WriteLine(entero + flotantexd + doble);

            dynamic wtf = 6;
            Console.WriteLine("La variable wtf contiene el valor: "+wtf);
            wtf = "KE?";
            Console.WriteLine("Y ahora este valor: "+wtf);

            //var "crea" variables "automaticas" (con las variables simples)
            var variable_automatica = 3;
            //variable_automatica = "a"; - esto daría error porque la variable ya se definió
            //como un int, no como string
            Console.WriteLine(variable_automatica);

            Console.WriteLine($"Variable int = {entero} y float = {flotantexd}");

            const string CONSTANTE = "Constante numero 1";
            Console.WriteLine(CONSTANTE);

            // - Estructuras -

            var lista = new string[] {"Fede","a","e",""};
            Console.WriteLine(lista[1]);

            lista[3] = "36";
            Console.WriteLine(lista[3]);

            var dict = new Dictionary<string, int>
            {
                {"fede", 16},
                {"bob", 30000}
            };

            Console.WriteLine(dict["fede"]);

            //Conjuntos?
            var set = new HashSet<string> { "A", "B" };
            
            var tupla = ("a","b","c");
            Console.WriteLine(tupla);

            // - Bucles -
            
            for (int index = 0; index < 10; index++)
            {
                Console.WriteLine(index);
            }

            //No se por qué no funciona
            /*
            foreach (var myItem in set)
            {
                Console.WriteLine(myItem);
            }
            */

            // - Flujos -

            int int1 = 11;
            if (int1 == 11)
            {
                Console.WriteLine("a");
            }



        }
    }
}