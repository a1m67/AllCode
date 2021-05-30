package Abstract;

public abstract class Employee {
    private String name;
    private String address;
    private int number;
    public  Employee(String name,String address,int number){
        System.out.println("Constructing an Employ.Employee");
        this.name = name;
        this.address=address;
        this.number=number;
    }
//    public double computePay(){
//        System.out.println("Inside Employ.Employee computePay");
//        return 0.0;
//    }
    public void mailCheck(){
        System.out.println("Mailing a check to " + this.name+ " "+ this.address);
    }
    public abstract double computePay();
//    public String toString(){
//
//    }
    public String getName()
    {
        return name;
    }
    public String getAddress()
    {
        return address;
    }
    public void setAddress(String newAddress)
    {
        address = newAddress;
    }
    public int getNumber()
    {
        return number;
    }

}

