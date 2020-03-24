public class Course{
		private static String Coursename;
		private String Cousrecode;
		private String Programname;
		private String Semester;	
	Course(String Programname, String Semester,String Coursename, String Cousrecode){
			this.Coursename=Coursename;
			this.Cousrecode=Cousrecode;
			this.Programname=Programname;
			this.Semester=Semester;
		}
		public String getCourseName(){
				return Coursename;
			}	
		public void setCCode(String x){
				Cousrecode=x;
			}
		public String getCCode(){
				return Cousrecode;
			}
		
		public String toString(){
				return "\nCourse Name:\t" + Coursename + "\nCourse Code:\t" + Cousrecode+ "\nProgram Name:\t" + Programname
				+ "\nSemester: \t" + Semester;
			}
		}