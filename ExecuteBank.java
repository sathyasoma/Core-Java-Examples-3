package com.kt.abstraction;

abstract class Branch{
	
	public abstract boolean validatePhotoProof(String proof);
	public abstract boolean validateAddressProof(String proof);
	
	public void openAccount(String photoProof,String addressProof,int amount) {
		if(amount>=1000) {
			if(validateAddressProof(addressProof)&&validatePhotoProof(photoProof))
			{
				System.out.println("Account Opened succusfully");
			}
			else
			{
				System.out.println("Account not opened");
			}
		}else
		{
			System.out.println("Cnnot open Account");
		}
	}
	
}
class MainBranch extends Branch{

	@Override
	public boolean validatePhotoProof(String proof) {
		if(proof.equalsIgnoreCase("pan card")) {
		return true;}
		return false;
	}

	@Override
	public boolean validateAddressProof(String proof) {
		if(proof.equalsIgnoreCase("ration card")) {
		return true;}
		return false;
	}
	
}
public class ExecuteBank {
public static void main(String[] args) {
	
	//Branch mb= new Branch();  error : we canot create object for abstarct class
	
	Branch mb= new MainBranch();
	mb.openAccount("pan card", "ration card", 2000);
	
	
} 

}
