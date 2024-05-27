public class conditional
{
    public static void main(String args[])
    {
        int age = 15;
        //if, if-else, else-if
        if (age>=18)
        {
            System.out.println("Major");    
        }
        else if(age< 10)
        {
            System.out.println("Boy");
        }
        else
        {
            System.out.println("Minor");
        }

        //Switch
        String day = "Monday";
        switch (day) 
        {
            case "Monday":
                System.out.println("Monday");
                break;
            case "Tuesday":
                System.out.println("Tuesday");
                break;
            case "Wednesday":
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Day Not Found");
                break;
        }
    }   
}
