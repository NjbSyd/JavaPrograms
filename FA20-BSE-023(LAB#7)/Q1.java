class Main1{

public static void main(String[] args){
degree ob1=new degree();
ob1.getDegree();
degree.undergraduate ob2=ob1.new undergraduate();
ob2.getDegree();
degree.postgraduate ob3=ob1.new postgraduate();
ob3.getDegree();

} }

class degree{

void getDegree(){
System.out.println("I got a degree.");
}

class undergraduate{

	void  getDegree(){
		System.out.println("I got an undergraduate degree.");
		}
	}

class postgraduate{
	void  getDegree(){
			System.out.println("I got an postgraduate degree.");
		}
	}

}