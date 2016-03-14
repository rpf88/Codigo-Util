package es.cargador.util;

import java.util.regex.Pattern;

public class Validaciones {

	/**
	 * Indica si contiene un NIF válido. La validación se
	 * realiza mediante la letra de control. Si la cadena es null o está en
	 * blanco también se devuelve false.
	 * 
	 * @param cadena
	 * @return boolean
	 */
	public static boolean isDniValido(String nif) {


		String cadena = (nif == null) ? "" : nif.trim().toUpperCase();

		if (cadena.length() != 9) {
			return false;
		}

		/* NIF */
		if (Pattern.matches("\\d{8}[A-Z]", cadena)) {
			int valor = Integer.parseInt(cadena.substring(0, 8));
			int posicion = valor % 23;
			char letra = cadena.charAt(8);
			return (letra == Constantes.PATRON_CONTROL_LETRA_DNI
					.charAt(posicion));
		}
	
		if(Pattern.matches("[W]\\d{7}[A-Z]", cadena))
		{
			int valor = Integer.parseInt(cadena.substring(1, 8));
			int posicion = valor % 23;
			char letra = cadena.charAt(8);
			return (letra == Constantes.PATRON_CONTROL_LETRA_DNI
					.charAt(posicion));
		}
		
		return false;
	}

	/**
	 * Indica si contiene un NIE válido. La validación se
	 * realiza mediante la letra de control. Si la cadena es null o está en
	 * blanco también se devuelve false.
	 * 
	 * @param cadena
	 * @return boolean
	 */
	public static boolean isNIEValido(String nif) {


		String cadena = (nif == null) ? "" : nif.trim().toUpperCase();

		if (cadena.length() != 9) {
			return false;
		}	

		/* NIE */
		if (Pattern.matches("[XY]\\d{7}[A-Z]", cadena)) {
			int valor = Integer.parseInt(cadena.substring(1, 8));
			if (cadena.charAt(0) == 'Y') {
				valor += 10000000;
			}
			int posicion = valor % 23;
			char letra = cadena.charAt(8);
			return (letra == Constantes.PATRON_CONTROL_LETRA_DNI
					.charAt(posicion));
		}

		return false;
	}
	/**
	 * Indica si contiene un CIF válido. Si la cadena es null o está en
	 * blanco también se devuelve false.
	 * 
	 * @param cadena
	 * @return boolean
	 */

	public static boolean isCIFValido(String nif) {
	

		String cadena = (nif == null) ? "" : nif.trim().toUpperCase();

		if (cadena.length() != 9) {
			return false;
		}
		
		/* CIF */
		if (Pattern.matches("[A-HJ-NP-SU-W]\\d{7}[A-Z0-9]", cadena)) {
			int sumaA = 0;
			for (int i = 2; i <= 6; i += 2) {
				sumaA += Character.getNumericValue(cadena.charAt(i));
			}

			int sumaB = 0;
			for (int i = 1; i <= 7; i += 2) {
				int valor = Character.getNumericValue(cadena.charAt(i));
				sumaB += (valor == 9) ? 9 : ((valor * 2) % 9);
			}

			int digitoControl = 10 - ((sumaA + sumaB) % 10);		

			char letra = cadena.charAt(0);
			char letraControl = cadena.charAt(8);

			if (letra == 'K' || letra == 'P' || letra == 'Q' || letra == 'S') {
				return (letraControl == (char) (digitoControl + 64));
			} else if (letra == 'A' || letra == 'B' || letra == 'E' || letra == 'H') {				
				return (letraControl == Character.forDigit((digitoControl == 10) ? 0 : digitoControl, 10));
			} else {
				return (letraControl == (char) (digitoControl + 64))
					|| (letraControl == Character.forDigit((digitoControl == 10) ? 0 : digitoControl, 10));
			}
		}
		
		return false;
	}
}
