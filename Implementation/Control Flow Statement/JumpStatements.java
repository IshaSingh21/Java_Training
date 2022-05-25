package controlFlowStatement;

public class JumpStatements {

	public static void main(String[] args) {
		
		// break statement
		for(int i=0;i<=6;i++)
		{
			System.out.println(i);
			if(i==3)
				break;
		}
		System.out.println("--------------------------");
		//continue
		
		for(int i=0;i<=2;i++)
		{
			for(int j=0;j<=3;j++)
			{
				if(j==2)
				{
					continue;
				}
			System.out.println(j);
		
			}				
		}
	}

}
