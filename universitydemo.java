package minor1;

public class universitydemo {
public static void main(String[] args) {
	university KLETECH=new university();
	
	KLETECH.createSchool();
	KLETECH.calNoOfStud();
	System.out.println("----------------------------------------------------------");
	for(int i=0;i<KLETECH.no0fStud.length;i++)
	{
		if(KLETECH.no0fStud[i]!=0)
			System.out.println("No of students in "+KLETECH.s[i].getsProgramCode()+" are: "+KLETECH.no0fStud[i]);
	}

}



}

