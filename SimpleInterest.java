

public class SimpleInterest {

    public double calculateInterest(double p, double r, int t) {
        double amount = p * t * r / 100;
        return amount;
    }

    
    public static void main(String[] args) {
        SimpleInterest SI = new SimpleInterest();
        
        double result = SI.calculateInterest(200, 12, 2);
        
        System.out.println("Simple Interest is : " + result);
    }
}
