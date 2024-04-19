class Exitdemo{
void method1(){
	int args[]={};
			System.out.println("exceuting:1");
			System.out.println("exceuting:2");
			//System.exit(0);
			try{
				System.out.println(args[0]);
				OwnException ov =new OwnException("Array index out of bound exception");
				throw ov;
			}
			catch(OwnException ov){
				System.out.println(ov);
			}
			//System.exit(0);
			//System.out.println("exceuting:");
}
	public static void main(String args[])/*throws OwnException */{
		Exitdemo obj=new Exitdemo();	
		obj.method1();
	}
}
class OwnException extends RuntimeException{
	OwnException(String msg){
		super(msg);
	}
}

