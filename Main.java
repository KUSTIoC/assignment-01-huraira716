public class Main
	{
		public static void main(String[] args){
			Paper obj1=new Paper ("Pak Study","CS113","Mid Term","Sir Ali Zeb","KUST ", false,50,"May/11/202","11:00");
			Paper obj2=new Paper ("Pak Study","CS113","Mid Term","Sir Ali Zeb","KUST ", false,50,"May/11/202","11:00");
			Paper obj3=new Paper ("Pak Study","CS113","Mid Term","Sir Ali Zeb","KUST ", false,50,"May/11/202","11:00");
			Course C1=new Course("JAVA", "Jav123", "BS CS", "Fall 2019 2nd Semester");
			Course C2=new Course("JAVA", "Jav123", "BS CS", "Fall 2019 2nd Semester");
			System.out.println("**************************************"+C1);
			System.out.println(obj1+"\n**************************************"+C2);
			System.out.println(obj2+"\n**************************************");
			System.out.println(obj3);	
		}
	}