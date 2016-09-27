package minor1;

public class university {
	final static String code1="E030";
	final static String code2="E241";
	int no0fStud[]=new int[8];
	school[] s=new school[8];
	static
	{
		System.out.println("welcome to KLETECH university");
		System.out.println("CET codes : "+code1+" and "+code2);
	}
	class school{
		private String sprogramCode;
		private String sSchoolCoordinator;
		private int iNoOfStud;
		private int iNoOfStaff;
		public String getsProgramCode() {
			return sprogramCode;
		}


		public String getsSchoolCoordinator() {
			return sSchoolCoordinator;
		}


		public int getiNoOfStud() {
			return iNoOfStud;
		}


		public int getiNoOfStaff() {
			return iNoOfStaff;
		}


		public school(String sProgramCode, String sSchoolCoordinator,
				int iNoOfStud, int iNoOfStaff) {
			super();
			this.sprogramCode = sProgramCode;
			this.sSchoolCoordinator = sSchoolCoordinator;
			if(iNoOfStud>120)
			System.out.println("exceeds the available seats,only 120 seats available  "+this.sprogramCode);
			else
				this.iNoOfStud = iNoOfStud;
			this.iNoOfStaff = iNoOfStaff;
		}
		
	}
void createSchool()
{
	s[0]=new school("CS", "a", 50, 20);
	s[1]=new school("EC", "b", 120, 30);
	s[2]=new school("EE", "c", 50, 12);
	s[3]=new school("AM", "d", 80, 30);
	s[4]=new school("BT", "e", 100, 50);
	s[5]=new school("CIVIL", "f", 40, 12);
	s[6]=new school("MECH", "g", 50, 12);
	s[7]=new school("ROBOTICS", "h", 124, 24);
}

void calNoOfStud()
{

	for(int i=0;i<no0fStud.length;i++)
	{
		no0fStud[i]=s[i].getiNoOfStud();
	}

}
}

