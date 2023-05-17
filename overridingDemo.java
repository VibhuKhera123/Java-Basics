class Bank {
    public double getRateOfInterest() {
        return 2.0;
    }
}
class SBI extends Bank {
    @Override
    public double getRateOfInterest() {
        return 12.0;
    }
}
class ICICI extends Bank {
    @Override
    public double getRateOfInterest() {
        return 8.0;
    }
}
class AXIS extends Bank {
    @Override
    public double getRateOfInterest() {
        return 22.0;
    }
}
public class overridingDemo {
    public static void main(String[] args) {
        Bank sbi = new SBI();
        Bank icici = new ICICI();
        Bank axis = new AXIS();

        System.out.println("SBI Interest Rate: " + sbi.getRateOfInterest());
        System.out.println("ICICI Interest Rate: " + icici.getRateOfInterest());
        System.out.println("AXIS Interest Rate: " + axis.getRateOfInterest());
    }
}
