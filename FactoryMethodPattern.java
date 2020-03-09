
import java.io.*;

abstract class Plan{
    protected double rate;
    abstract void getRate();

    public void calculateBill(int unitsRecorded){
        System.out.print("BILL : ");
        System.out.println(unitsRecorded*rate);
    }
}

class DomesticPlan extends Plan{
    public void getRate(){
        rate = 3.75;
    }
}

class CommercialPlan extends Plan{
    public void getRate(){
        rate = 7.52;
    }
}

class InstitutionPlan extends Plan{
    public void getRate(){
        rate = 5.56;
    }
}

class GetPlan{
    public Plan getPlanType(String planType){
        if(planType==null)
            return null;
        else if(planType.equalsIgnoreCase("domestic"))
            return new DomesticPlan();
        else if(planType.equalsIgnoreCase("commercial"))
            return new CommercialPlan();
        else if(planType.equalsIgnoreCase("institution"))
            return new InstitutionPlan();
        else
            return null;
    }
}


public class FactoryMethodPattern{
    public static void main(String args[]) throws IOException{
        GetPlan getPlan = new GetPlan();
        System.out.println("Domestic/ Commercial/ Institution");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String planType = br.readLine();
        System.out.println("Enter number of units for bill");
        int units = Integer.parseInt(br.readLine());

        Plan p = getPlan.getPlanType(planType);
        p.getRate();
        p.calculateBill(units);
    }
}