import java.lang.*;
import java.util.*;
class Testt
{
	public static void main(String ar[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		s.nextLine();
		int tot,flip;
		int upper=0,low=0,chef=0,bro=0;
		while(n>0)
		{
			tot=flip=upper=low=chef=0;
			bro=-1;
			tot=s.nextInt();
			flip=s.nextInt();
			s.nextLine();
			String st=s.nextLine();
			//System.out.println(st);
			for(int i=0;i<tot;i++)
			{	
				if(st.charAt(i)>='A' && st.charAt(i)<='Z')
				{
					upper+=1;
				}
				if(st.charAt(i)>='a' && st.charAt(i)<='z')
				{
					low+=1;
				}
			}
			//System.out.println("upper:"+upper+" lower:"+low);
			if(flip>=upper)
				chef=1;
			if(flip>=low)
				bro=1;
			if(chef==bro){
				System.out.println("both");
			}
			else if(chef==1)
				System.out.println("chef");
			else if(bro==1)
				System.out.println("brother");
			
			if(chef==0 && bro==-1)
				System.out.println("none");
			
			n--;
		}
	}
}