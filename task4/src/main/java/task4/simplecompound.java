package task4;
import java.util.*;

public class simplecompound {
	public double simpleInterest(double Rate,double Time,double Principle)

	{

		double SI=((Rate)*(Time)*(Principle))/100;

		return SI;

		

	}

	public double CompoundInterest(double Rate,double Time,double Principle,String CItype)

	{

		double Amount=0;

		if(CItype.equals("Annually"))

		{

			

			Amount=Principle*Math.pow(1+((Rate)/100),Time);

		}

		else if(CItype.equals("Half-Yearly"))

		{

			Amount=Principle*Math.pow(1+((Rate)/200),2*Time);

		}

		else if(CItype.equals("Quarterly"))

		{

			Amount=Principle*Math.pow(1+((Rate)/400),4*Time);

		}

		else if(CItype.equals("Monthly"))

		{

			Amount=Principle*Math.pow(1+((Rate)/1200),12*Time);

		}

		double CI=Amount-Principle;

		return CI;

	}

	}


