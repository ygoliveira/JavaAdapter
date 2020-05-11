package teste;

import javax.xml.crypto.Data;

public class Teste {
	public static void main(String[]args) {
		Data data = new AdapterData(2020, 7, 16);
		System.out.println(data);
		
		((AdapterData)data).setDiaMes(10, 9);
		System.out.println(data);
		
		((AdapterData)data).setMesAno(11, 2022);
		System.out.println(data);
		
		((AdapterData)data).setDiaAno(19, 2021);
		System.out.println(data);
		
		
		((AdapterData)data).setDiaMesAno(18, 6, 2020);
		System.out.println(data);
		
	}
}