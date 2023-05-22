package aufgabe3;

import java.util.Arrays;

public class MedienArray<T extends Medium>
{
	Medium[] arr = new Medium[10];
	int fuellstand = 0;
	
	
	
	public void einfuegen(T ref)
	{
		arr[fuellstand] = ref;
		fuellstand++;
	}
	
	public void ausgeben()
	{
		for (int i = 0; i < fuellstand; i++)
		{
			System.out.println(arr[i]);
		}		
	}
	
	public void sortieren()
	{
		Arrays.sort(arr, 0, fuellstand);
	}

}
