public class Paper
	{
			private String Papert;
			private String Paperid;
			private String Examty;
			private String Invigilator;
			private String Loc;
			private boolean isCollected;
			private int Numberostu;
			private String Date;
			private String Time;
				
	Paper(String Papert,String Paperid,String Examty,String Invigilator,
		String Loc,boolean isCollected,int Numberostu,String Date, String Time){
				this.Papert=Papert;
				this.Paperid=Paperid;
				this.Examty=Examty;
				this.Invigilator=Invigilator;
				this.Loc=Loc;
				this.isCollected=isCollected;
				this.Numberostu=Numberostu;
				this.Date=Date;
				this.Time=Time;
			}
			public String getPaperT(){
					return Papert;
				}
			public String getPaperID(){
					return Paperid;
				}
			public String getEType(){
					return Examty;
				}
			public String getInvi(){
					return Invigilator;
				}
			public String getLoc(){
					return Loc;
				}
			public void setIsCollected(boolean x){
					isCollected=x;
				}
			public boolean getIsCollected(){
					return isCollected;
				}
			public int getNoS(){
					return Numberostu;
				}
			public String getDa(){
					return Date;
				}
			public String getTime(){
					return Time;
				}
			public String toString(){
					return "Paper Titel:\t"+ Papert
					+ "\nPaper ID:\t"+ Paperid + "\nExam Type:\t" + Examty + "\nInvigilator:\t" + Invigilator 
					+ "\nPaper Location:\t" +Loc + "\nPaper Collected:\t" + isCollected+ "\nNumber of Students:\t" + Numberostu
					+ "\nDate of Paper:\t" + Date + "\nTime of Paper:\t" + Time;
					 
				}
				
		 	
	}
