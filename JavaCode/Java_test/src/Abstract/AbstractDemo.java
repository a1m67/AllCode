package Abstract;

public class AbstractDemo {
    public static void main(String []a){
        Salary s=new Salary("Mohd Mohtashim", "Ambehta, UP", 3, 3600.00);
        Employee e = new Salary("John Adams", "Boston, MA", 2, 2400.00);
        System.out.println("Call mailCheck using Employ.Salary reference --");
        s.mailCheck();

        System.out.println("\nCall mailCheck using Employ.Salary reference --");
        e.mailCheck();

    }
}
