
class bank{
	int bankA=1000;
	int bankB=1500;
	int bankC=2000;

	int getbalance(){
		return 0;
		}

	class bank1{
		int getbalance(){
				return bankA;
			}
		}

	class bank2{
			int getbalance(){
					return bankB;
			}
		}

	class bank3{
				int getbalance(){
						return bankC;
				}
		}
	}

	class Main2{

	public static void main(String[] args){

		bank b=new bank();
		bank.bank1 b1=b.new bank1();
		bank.bank2 b2=b.new bank2();
		bank.bank3 b3=b.new bank3();
		System.out.println("Balance in Bank #1: "+b1.getbalance());
		System.out.println("Balance in Bank #2: "+b2.getbalance());
		System.out.println("Balance in Bank #3: "+b3.getbalance());
	}
	}
