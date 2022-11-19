package com.kt.interface1;


 interface IBank {
  int CAUTIONMONEY = 2000;
String CAUTION_MONEY = null;
  String createAccount(Customer customer);
  double issueVehicleLoan(String vehicletype, Customer customer);
  double issueHouseLoan(Customer customer);
  double issueGoldLoan(Customer customer);
}


 class Customer {
  private String name;
  private String customerId;

  public String getName() {
    return name;
  }

  public void setname(String name) {
    this.name=name;
  }
  public String getCustomerId() {
    return customerId;
  }
  public void setCustomerId(String customerId) {
    this.customerId= customerId;
  }
}



class MumbaiOffice implements IBank {
    public String createAccount(Customer customer){
    return "Acc12345";
    }
    public double issueVehicleLoan(String vehicleType,Customer customer) {
      if(vehicleType.equals("bike")) {
        return 100000;
      }
      else {
        return 500000;
      }
    }
    public double issueHouseLoan(Customer customer){
      return 200000;
    }
  public double issueGoldLoan(Customer customer){
    return 500000;
  }
    
}

public class ExeceuteInterface {
	public static void main(String[] args){
        IBank bank=new MumbaiOffice();  
        Customer customer = new Customer();
        customer.setCustomerId("cust1001");
        customer.setname("Ajay");
        String accountNumber = bank.createAccount(customer);
        System.out.println("Account number is..." +accountNumber);
        double gloan = bank.issueGoldLoan(customer);
        System.out.println("Gold loan amount is..." +gloan);
        double hloan = bank.issueHouseLoan(customer);
        System.out.println("House loan amount is..." +hloan);
        double vloan = bank.issueVehicleLoan(accountNumber, customer);
        System.out.println("Vehicle loan amount is..." +vloan);
        System.out.println("Caution money is..." +IBank.CAUTION_MONEY);
    }
}
