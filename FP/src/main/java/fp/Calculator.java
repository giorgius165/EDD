package fp;
 
 import sun.reflect.generics.reflectiveObjects.NotImplementedException;
 
 import java.util.ArrayList;
 import java.util.List;
 
 public class Calculator {
 
 
 	/*
      * este metodo devuelve el Class del object que le pasamos
      */
 	public static Class classTypeOf(Object x) {
 		return x.getClass();
 	}
 
 
 	/*
      * devuelve una lista con los n números de la serie de fibonacci.
      */
 	public static List<Integer> fibonacci(int n) {
 		List<Integer> fibonacci = new ArrayList<Integer>();
 		fibonacci.add(1);
 		for (int i = 2; i < n; i++){
 			fibonacci.add(fibonacci.get(i - 1) + fibonacci.get(i - 2));
 		}
 	return fibonacci;
 	}
 
 	/*
 	 * Escribir todos los números del number al 0 de step en step.
 	 */
 	public static int[] stepThisNumber(int number, int step) {
 		
	 	if(step==0){
	 		int resultado[]={0};
	 		return resultado;
	 	}else{
	 		int resultado[];
	 		if(number%step==0){
	 			resultado = new int[number/step-1];
	 		}else{
	 			resultado = new int[number/step];
	 		}
	 		int i = number;
	 		int j = 0;
	 		while(i-step > 0){
	 			i-=step;
	 			resultado[j] = i;
	 			j++;
	 		}
	 		return resultado;
	 	}

 	}
 
 	/*
 	 * Módulo al que se le pasa un número entero del 0 al 20 y devuelve los
 	 * divisores que tiene.
 	 */
 
 	
 	
 	public static int[] divisors(int n){
 		if (n <= 0 || n > 20)
 		{
 		    return null;
 		}
 		int[] divisorsWasteSpace = new int[n]; // como máx, tendrá n divisores
 		divisorsWasteSpace[0] = n; // un número siempre es divisible por sí mismo;
 		int counter = 1;
 		int spacesWasted = 0; // A priori no puede saberse sencillamente el número de divisores, por lo que habrá elementos inútiles en el array
 		for (int i = n - 1; i >= 1; i--)
 		{
 			if (n % i == 0) divisorsWasteSpace[counter++] = i;
 			else spacesWasted++;
 		}
 		int[] divisors = new int[n - spacesWasted];
 		for (int i = 0; i < divisors.length; i++) divisors[i] = divisorsWasteSpace[i];
 	return divisors;
 	}
 
 	/*
 	 * Pedir un número de 0 a 99 y mostrarlo escrito. Por ejemplo, para 56
 	 * mostrar: cincuenta y seis
 	 */
 	
 	public static boolean checkIsPalindrome(String cadena)
 	{
 		if (cadena == null || cadena.length() == 0) return false;
 		String real = makeStandard(cadena);
 		for (int i = 0; i < real.length() / 2; i++)
 		{
 			if (real.charAt(i) != real.charAt(real.length() - i - 1)) return false;
 		}
 	return true;
 	}
 	
 	public static String makeStandard(String string) // letras en minusculas sin acentos
 	{
 		String standard = ""; // los String son inmutables
 		char[] nonStandardChars = {'á', 'í', 'ú', 'é', 'ó'};
 		char[] standardChars = {'a', 'i', 'u', 'e', 'o'};
 		int indiceSustituir;
 		for (int i = 0; i < string.length(); i++)
 		{
 			indiceSustituir = -1;
 			for (int j = 0; j < nonStandardChars.length; j++)
 			{
 				if (string.toLowerCase().charAt(i) == nonStandardChars[j])
 				{
 					indiceSustituir = j;
 					break;
 				}
 			}
 			if (indiceSustituir != -1) standard += standardChars[indiceSustituir];
 			else if (Character.isLetter(string.charAt(i))) standard += Character.toLowerCase(string.charAt(i));
 		}
 	return standard;
 	}
 
 	
 	/*
 	 * Toma como parámetros una cadena de caracteres y devuelve cierto si la cadena resulta ser un palíndromo
 	 */
 	public static String speakToMe(int n){
 		String answer = "";
 		if (n < 0 || n > 99)
 		{
 		    throw new IllegalArgumentException("Only integers between 0 and 99 are allowed");
 		}
 		// Excepciones no algoritmizitables (asumiendo que 16 == Diez y seis y no Dieciséis, 21 == Veinte y uno y no Veintiuno y análogos)
 		else switch(n)
 		{
 			case 0:
 				answer += "Cero";
 				return answer;
 			case 11:
 				answer += "Once";
 				return answer;
 			case 12:
 				answer += "Doce";
 				return answer;
 			case 13:
 				answer += "Trece";
 				return answer;
 			case 14:
 				answer += "Catorce";
 				return answer;
 			case 15:
 				answer += "Quince";
 				return answer;
 		}
 		int leftNumber = n / 10;
 		int rightNumber = n % 10;
 		switch (leftNumber){
 			case 1:
 				answer += "Diez";
 				break;
 			case 2:
 				answer += "Veinte";
 				break;
 			case 3:
 				answer += "Treinta";
 				break;
 			case 4:
 				answer += "Cuarenta";
 				break;
 			case 5:
 				answer += "Cincuenta";
 				break;
 			case 6:
 				answer += "Sesenta";
 				break;
 			case 7:
 				answer += "Setenta";
 				break;
 			case 8:
 				answer += "Ochenta";
 				break;
 			case 9:
 				answer += "Noventa";
 				break;
 		}
 		
 		if ( leftNumber != 0 && rightNumber != 0) answer += " y ";
 		
 		switch (rightNumber){
 			case 1:
 				answer += "uno";
 				break;
 			case 2:
 				answer += "dos";
 				break;
 			case 3:
 				answer += "tres";
 				break;
 			case 4:
 				answer += "cuatro";
 				break;
 			case 5:
 				answer += "cinco";
 				break;
 			case 6:
 				answer += "seis";
 				break;
 			case 7:
 				answer += "siete";
 				break;
 			case 8:
 				answer += "ocho";
 				break;
 			case 9:
 				answer += "nueve";
 				break;
 		}
 	return answer;
 	}
 	/*
 	 * este metodo devuelve cierto si el año de la fecha es bisiesto fecha
 	 * dd-MM-yyyy
 	 */
 	public static boolean isLeapYear(String fecha){
 		if (fecha == null || fecha.length() != 10) return false;
 		// el año es bisiesto si es divisible por 4 o 400, pero no por 100
 		int year = Integer.parseInt(fecha.substring(6, 10));
 		if ((year % 4 != 0 || year % 400 != 0) && year % 100 == 0) return false;
 		else return isValidDate(fecha);
 	}
 
 	/*
 	 * este metodo devuelve cierto si la fecha es válida
 	 */
 	public static boolean isValidDate(String date){
 		// Una fecha no debe ser nula y debe estar en un formato XX-YY-ZZZZ
 		if (date == null || date.length() != 10) return false;
 		if (date.charAt(2) != '-' || date.charAt(5) != '-') return false;
 		
 		// X, Y , Z deben ser numeros
 		for (int i = 0; i < date.length(); i++){
 			if (date.charAt(i) != '-' && !Character.isDigit(date.charAt(i))) return false;
 		}
 		
 		int mes = Integer.parseInt(date.substring(3, 5));
 		int anyo = Integer.parseInt(date.substring(6, 10));
 		int dia = Integer.parseInt(date.substring(0, 2));
 		
 		// ZZZZ > 0
 		if (anyo == 0) return false;
 		
 		// 01 <= YY <= 12
 		if (mes <= 0 || mes > 12) return false;
 		
 		// 01 <= XX <= 31 || 30 || 28 || 29, *según el mes*
 		if (dia <= 0) return false;
 		else switch (mes){
 			case 2:
 				if (isLeapYear(date) && dia > 29) return false;
 				else if (dia > 28) return false;
 			break;
 			case 4:
 			case 6:
 			case 9:
 			case 11:
 			{
 				if (dia > 30) return false;
 				break;
 			}
 			default:
 				if (dia > 31) return false;
 		}
 	return true;
  	}
  }