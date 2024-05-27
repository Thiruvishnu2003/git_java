public class Operators
{
    public static void main(String args[])
    {
        //Arithmetic Operators
        int a = 10, b = 20;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
        System.out.println(++a);
        System.out.println(--b);

        //Assignment Operators
        int c = 20, d = 40;
        c = 25;
        d += 1;
        System.out.println(d);
        d -= 1;
        System.out.println(d);
        c *= 5;
        System.out.println(c);
        c /= 2;
        System.out.println(c);
        d %= 32;
        System.out.println(d);

        //Logical Operator
        int age = 25;
        if(age > 10 && age < 30)
        {
            System.out.println("AND");
        }
        if(age < 18 || age > 18)
        {
            System.out.println("OR");
        }
        if (age != a) 
        {
            System.out.println("NOT");    
        }

        //Relational Operator
        boolean rel;
        rel = 10 > 20;
        System.out.println(rel);
        rel = 10 < 20;
        System.out.println(rel);
        rel = 10 <= 10;
        System.out.println(rel);
        rel = 20 >= 20;
        System.out.println(rel);
        rel = 10 != 20;
        System.out.println(rel);
        rel = 30 == 40;
        System.out.println(rel);

        //Ternary Operator
        int ter = 10<20? 90:100;
        System.out.println(ter);
    }
}