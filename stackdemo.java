class StackOverFlowEg{
	static StackOverFlowEg s=new StackOverFlowEg();
	public static void main(String args[]){
		StackOverFlowEg s=new StackOverFlowEg();
		StackOverFlowEg s1=new StackOverFlowEg(58);
		{
			System.out.println("inside main inti");
		}
	}
	static{
		System.out.println("inside static");
	}
	{
		System.out.println("inside outside inti");
	}
	StackOverFlowEg(){
		System.out.println("inside default const");
	}
	StackOverFlowEg(int a){
		System.out.println("inside parameterised const");
	}
	{
		System.out.println("inside outside inti 2");
	}
	static{
		System.out.println("inside static 2 ");
	}
}
