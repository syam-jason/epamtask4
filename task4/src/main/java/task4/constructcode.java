package task4;

public class constructcode {
	public double Cost(String Materials,double HouseArea)

	{

		double Areacost=0;

		if(Materials.equals("StandardMaterials"))

		{

			Areacost=12000*HouseArea;	

		}

		else if(Materials.equals("AboveStandardMaterials"))

		{

			Areacost=15000*HouseArea;

		}

		else if(Materials.equals("HighStandardMaterials"))

		{

			Areacost=18000*HouseArea;

		}

		else if(Materials.equals("HighStandardMaterialsAndFullAutomatedHome"))

		{

			Areacost=25000*HouseArea;

		}

		return Areacost;

	}



}


