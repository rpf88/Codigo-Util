

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Date;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.gobcantabria.integracion.utils.Base64;

public class Validaciones {

	private static Log log = LogFactory.getLog(Validaciones.class);

	/**
	 * Indica si la cadena contiene un número natural válido.
	 * 
	 * @param cadena
	 * @return boolean
	 */
	public static boolean isNaturalValido(String cadena) {
		log.info("Validaciones.isNaturalValido()");
		return StringUtils.isNumeric(cadena);
	}

	/**
	 * Indica si la cadena contiene un número de entre 1 y 10 cifras.
	 * 
	 * @param cadena
	 * @return boolean
	 */
	public static boolean isNum10Valido(String cadena) {
		log.info("Validaciones.isNum10Valido()");

		if (StringUtils.isNotBlank(cadena))
			if (Pattern.matches("\\d{1,10}", cadena))
				return true;

		return false;
	}
	
	/**
	 * Indica si la cadena contiene un número de entre 1 y 3 cifras.
	 * 
	 * @param cadena
	 * @return boolean
	 */
	public static boolean isNum3Valido(String cadena) {
		log.info("Validaciones.isNum3Valido()");

		if (StringUtils.isNotBlank(cadena))
			if (Pattern.matches("\\d{1,3}", cadena))
				return true;

		return false;
	}

	/**
	 * Indica si la cadena contiene un número de enlace correcto .
	 * 
	 * @param cadena
	 * @return boolean
	 */
	public static boolean isNumEnlaceValido(String cadena) {
		log.info("Validaciones.isNumEnlaceValido()");

		if (!cadena.equals("")) {
			if (Pattern.matches("\\d{4}-\\d{1,5}", cadena)) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Indica si la cadena contiene un número de enlace correcto .
	 * 
	 * @param cadena
	 * @return boolean
	 */
	public static boolean isNumEnlaceConPartesValido(String cadena) {
		log.info("Validaciones.isNumEnlaceConPartesValido()");

		if (!cadena.equals("")) {
			if (Pattern.matches("\\d{4}-\\d{1,5}-\\d{1,3}", cadena)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Indica si la cadena contiene un número de orden correcto .
	 * 
	 * @param cadena
	 * @return boolean
	 */
	public static boolean isNumOrdenValido(String cadena) {

		log.info("Validaciones.isNumOrdenValido()");

		if (!cadena.equals("")) {
			if (Pattern.matches("\\D{3}/\\d{1,3}/\\d{4}", cadena)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Valida si una String tiene el formato dd/MM/aaaa. </br>
	 * 
	 * Comprueba si los días indicados por la fecha corresponden con el número
	 * de días de que dispone el mes. </br> Para el caso de ser un año bisiesto,
	 * el mes toma como parámetro un string indicando el año de la fecha a
	 * validar. En caso de que el parámetro no sea un año válido o sea nulo,
	 * supondrá el mes de febrero con 29 días.
	 * 
	 * @param cadena
	 * @return boolean
	 */
	public static boolean isFechaValida(String cadena) {
		log.info("Validaciones.isFechaValida()");

		if (StringUtils.isNotBlank(cadena)) {
			if (Pattern.matches(
					"(0[1-9]|1[0-9]|2[0-9]|3[0-1])/(0[1-9]|1[0-2])/(\\d{4})",
					cadena)) {
				/*
				 * Una vez comprobado que el formato de la fecha es correcto, se
				 * comprueba que el día del mes indicado es correcto
				 */

				String[] cadenas = StringUtils.split(cadena, '/');

				Map mapDiasMeses = Constantes.HASH_MAP_DIAS_MESES;

				Integer dia = new Integer(cadenas[0]);
				String mes = cadenas[1];
				int anyoNum = ((new Integer(cadenas[2]))).intValue();

				if (mes.length() == 1) {
					mes = "0".concat(mes);
				}

				int diaMax = ((Integer) mapDiasMeses.get(mes)).intValue();

				log.debug("Dia : " + dia + " Mes : " + mes + " diaMax : "
						+ diaMax);

				/*
				 * Se comprueba si el año actual es bisiesto.
				 * 
				 * Años bisiestos son :
				 *  - Todos los años múltiplos de 4 salvo los años seculares que
				 * no son múltiplos de 400.
				 * 
				 * Es año secular todo año que marca el final de un siglo, es
				 * decir, todo año múltiplo de 100.
				 */
				if ("02".equals(mes)) {
					boolean esBisiesto = false;

					/*
					 * Se comprueba si el año es múltilplo de 4
					 */
					if (anyoNum % 4 == 0) {
						/*
						 * Se comprueba que el año no sea un año secular no
						 * múltiplo de 400
						 */
						if (!((anyoNum % 100 == 0) && (anyoNum % 400 != 0))) {
							esBisiesto = true;
						}
					}

					if (!esBisiesto) {
						diaMax--;
					}
				}

				if (dia.intValue() > diaMax) {
					return false;
				} else {
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * Valida si existen datos en un campo obligatorio
	 * 
	 * @param cadena
	 * @return
	 */
	public static boolean isCampoObligatorioVacio(String cadena) {
		log.info("Validaciones.datoEnCampoObligatario()");
		if (StringUtils.isNotBlank(cadena) && cadena.compareTo("") != 0)
			return false;

		return true;
	}

	/**
	 * Valida si existen datos en un campo obligatorio
	 * 
	 * @param cadena
	 * @return
	 */
	public static boolean isComboObligatorioVacio(String cadena) {
		log.info("Validaciones.isComboObligatorioVacio()");
		if (StringUtils.isBlank(cadena) || cadena.equals("-1"))
			return true;

		return false;
	}

	/**
	 * Indica si contiene un NIF válido. La validación se
	 * realiza mediante la letra de control. Si la cadena es null o está en
	 * blanco también se devuelve false.
	 * 
	 * @param cadena
	 * @return boolean
	 */
	public static boolean isDniValido(String nif) {
		log.info("Validacion.isDniValido()");

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
		/*v2.25 NIF MOURO*/
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
		log.info("Validacion.isNIEValido()");

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
		log.info("Validacion.isCIFValido()");

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

	/**
	 * Comprueba que se trata de un pasaporte. 
	 * Formato 2 letras seguidos de 6 digitos. lldddddd
	 * @param dni
	 * @return
	 */
	public static boolean isPasaporte(String cadena) 
	{
		if (Pattern.matches("[a-zA-Z][a-zA-Z]\\d{6}", cadena))
			return true;
		else
			return false;
	}
	
	public static String getLetraDni(int dni) {
		return String.valueOf(dni)
				+ Constantes.NIF_STRING_ASOCIATION.charAt(dni % 23);
	}

	/**
	 * Metodo que inserta espacios en la cadena si para grupos de 100 caracteres
	 * no contiene ninguno. (Resuelve el problema de mostrar cadenas demasiado
	 * largas en una tabla)
	 * 
	 * @param cadena
	 * @return
	 */

	public static String validarLongitudes(String cadena, Integer elemento) {
		int longitudMaxima = 0;

		int longitudInicial = cadena.length();
		int trozos = (longitudInicial / Constantes.LONGITUD_MIN_DIVISION) + 1;
		String[] segmentosCadena = new String[trozos];
		String cadenaAux = "";
		int longitudSegmento = 99;
		
		// Si la longitud de la cadena es menor que el tamaño de division mínimo
		// no se fragmenta. (Se evitan problemas a la hora de buscar anexos por
		// nombre)
		if (longitudInicial < Constantes.LONGITUD_MIN_DIVISION)
			return cadena;

		if (elemento.intValue() == Constantes.ELEMENTO_ENTRADILLA_ANUNCIO)
			longitudMaxima = Constantes.LONGITUD_MAX_ENTRADILLA;
		else if (elemento.intValue() == Constantes.ELEMENTO_NOMBRE_ANEXO)
			longitudMaxima = Constantes.LONGITUD_MAX_NOMBRE_ANEXO;
		else if (elemento.intValue() == Constantes.ELEMENTO_RAZSOC_TERCERO)
			longitudMaxima = Constantes.LONGITUD_MAX_RAZSOC_TERCERO;
		else if(elemento.intValue() == Constantes.ELEMENTO_DESCRIP_LOTE)
			longitudMaxima = Constantes.LONGITUD_MAX_DESCRIP_LOTE;
		if (elemento.intValue() == Constantes.ELEMENTO_ENTRADILLA)
			longitudMaxima = Constantes.LONGITUD_MAX_ENTRADILLA;

		// Se divide la cadena en segmentos de 100 caracteres
		for (int i = 0; i < trozos; i++) {
			if (i != trozos - 1) // No es el ultimo trozo
			{
				segmentosCadena[i] = cadena.substring(0, longitudSegmento);
				cadena = cadena.substring(longitudSegmento);
			} else {
				segmentosCadena[i] = cadena.substring(0);
			}
		}

		for (int i = 0; i < trozos; i++) {
			// Si el segmento no contiene ningun espacio se inserta uno
			if (!segmentosCadena[i].contains(" ")) {
					segmentosCadena[i] = segmentosCadena[i] + " ";
			}
		}

		for (int i = 0; i < trozos; i++)
			cadenaAux = cadenaAux + segmentosCadena[i];

		// Se eliminan los caracteres que sobran
		if (cadenaAux.length() > longitudInicial
				&& cadenaAux.length() > longitudMaxima)
			return cadenaAux.substring(0, longitudMaxima);
		else
			return cadenaAux;
	}

	/**
	 * Indica si la cadena contiene un número de 5 cifras.
	 * 
	 * @param cadena
	 * @return boolean
	 */
	public static boolean isCodigoPostalValido(String cadena) {
		log.info("Validacion.isCodigoPostalValido()");

		if (StringUtils.isNotBlank(cadena))
			if (Pattern.matches("\\d{5}", cadena))
				return true;

		return false;
	}

	/**
	 * Indica si la cadena contiene un año válido
	 * 
	 * @param cadena
	 * @return boolean
	 */
	public static boolean isAnyoValido(String cadena) {
		log.info("Validaciones.isAnyoValido()");

		if (StringUtils.isNotBlank(cadena))
			if (Pattern.matches("\\d{4}", cadena))
				return true;

		return false;
	}
	
	/**
	 * Indica si la cadena contiene un número de lotes válido
	 * 
	 * @param cadena
	 * @return boolean
	 */
	public static boolean isNumLotesValido(String cadena) {
		log.info("Validaciones.isNumLotesValido()");

		if (StringUtils.isNotBlank(cadena))
			if (Pattern.matches("\\d{1,2}", cadena))
				return true;

		return false;
	}

	/**
	 * Indica si la cadena contiene un porcentaje con dos decimales opcionales y
	 * que el valor de este porcentaje está entre 1 y 100.
	 * 
	 * @param cadena
	 * @return boolean
	 */
	public static boolean isPorcentajeValido(String cadena) {
		log.info("Validacion.isPorcentajeValido()");

		if (StringUtils.isNotBlank(cadena)) {
			if (StringUtils.isNumeric(cadena)) {
				int prsVal = Integer.parseInt(cadena);
				if (prsVal > 0 && prsVal <= 100)
					return true;
			}
		}

		return false;
	}

	/**
	 * Indica si la cadena contiene un número con 1,2 o 3 decimales. La parte
	 * entera tiene tres numeros de maximo. El rango es 0
	 * 
	 * @param cadena
	 * @return boolean
	 */
	public static boolean isImporteValido(String cadena) {
		log.info("Validacion.isImporteValido()");

		if (StringUtils.isNotBlank(cadena)) {
			String pattern = "(\\d{1,3}([,||.]\\d{1,3})?)";
			if (Pattern.matches(pattern, cadena))
				return true;
		}
		return false;
	}
	
	/**
	 * Indica si la cadena contiene un número con 1,2,3 o 4 decimales. La parte
	 * entera tiene tres numeros de maximo. El rango es 0
	 * 
	 * @param cadena
	 * @return boolean
	 */
	public static boolean isImporteValidoTarifa(String cadena) {
		log.info("Validacion.isImporteValidoTarifa()");

		if (StringUtils.isNotBlank(cadena)) {
			String pattern = "(\\d{1,3}([,||.]\\d{1,4})?)";
			if (Pattern.matches(pattern, cadena))
				return true;
		}
		return false;
	}

	public static boolean isImporteValidoAnuncio(String cadena) {
		log.info("Validacion.isImporteValidoAnuncio()");

		if (StringUtils.isNotBlank(cadena)) {
			String pattern = "(\\d*([,||.]\\d{1,3})?)";
			if (Pattern.matches(pattern, cadena))
				return true;
		}
		return false;
	}

	/**
	 * Indica si el telefono o el fax son validos
	 * 
	 * @param cadena
	 * @return boolean
	 */
	public static boolean isFaxTelefonoValido(String cadena) {
		log.info("Validacion.isFaxTelefonoValido()");

		if (StringUtils.isNotBlank(cadena) && StringUtils.isNumeric(cadena))
			if (Pattern.matches("\\d{9}", cadena))
				return true;

		return false;
	}

	/**
	 * Comprueba y convierte las cadenas del tipo (XX), (XXX), (XXXXX)... en
	 * cadenas (XXXX). Estas cadenas representan partes modificables en una
	 * entradilla
	 * 
	 * @param cadena
	 * @return
	 */
	public static String validarCampoModificable(String cadena) {
		// Cualquier cadena entre paréntesis que contenga 2 o más símbolos X o x
		// seguidos
		// (XX), (XXXXx),(XXXXxxxXXX) ...
		String patron = ("[(](X|x){2,}[)]");

		Pattern pat = Pattern.compile(patron);
		Matcher mat = pat.matcher(cadena);
		cadena = mat.replaceAll(Constantes.PARTE_MODIFICABLE_ENTRADILLA);

		return cadena;
	}

	/**
	 * Indica si el email es valido
	 * 
	 * @param cadena
	 * @return boolean
	 */
	public static boolean isEmailValido(String cadena) {
		log.info("Validacion.isEmailValido()");

		if (StringUtils.isNotBlank(cadena))
			//if (Pattern.matches("(\\w*?\\.?\\w\\w*\\.?\\w*)@([0-9a-zA-Z]|-)*\\.[a-zA-Z]*", cadena))
			if (Pattern.matches("^[\\w\\-\\_\\+]+(\\.[\\w\\-\\_]+)*@([A-Za-z0-9-]+\\.)+[A-Za-z]{2,4}$", cadena))
				return true;

		return false;
	}

	/**
	 * Comprueba si la longitud de una cadena introducida en un textArea es
	 * correcta
	 * 
	 * @param cadena
	 * @return
	 */
	public static boolean isLongitudTextAreaValida(String cadena) {
		if (cadena.length() <= Constantes.LONGITUD_MAX_TEXTAREA)
			return true;
		return false;
	}

	public static String cortaTextArea(String cadena) {
		if (cadena.length() > Constantes.LONGITUD_MAX_TEXTAREA)
			cadena = cadena.substring(0, Constantes.LONGITUD_MAX_TEXTAREA);

		return cadena;
	}

	/**
	 * Indica si el codigo es valido. El formato para un codigo de un tipo de
	 * anuncio es de CCC. Siendo C un caracter válido.
	 * 
	 * @param cadena
	 * @return boolean
	 */
	public static boolean isCodigoTipAnuValido(String cadena) {
		log.info("Validacion.isCodigoTipAnuValido()");

		if (StringUtils.isNotBlank(cadena))
			if (Pattern.matches("[a-zA-Z]{3}", cadena))
				return true;

		return false;
	}

	// Comprueba que la primera fecha es anterior a la segunda
	/**
	 * Valida si fechaFin es posterior a fechaIni
	 * 
	 * @param fechaFin
	 * @param fechaIni
	 * @return boolean
	 */
	public static boolean sonFechasCoherentes(String fechaIni, String fechaFin) {
		log.info("Validacion.sonFechasCoherentes()");
		Date fechaIniDate;
		Date fechaFinDate;

		fechaIniDate = GestionFechas.convertStringToDate(fechaIni);
		fechaFinDate = GestionFechas.convertStringToDate(fechaFin);

		if (fechaFinDate.before(fechaIniDate))
			return false;
		else
			return true;
	}

	/**
	 * Valida si un String (fechaMayor) con formato de fecha dd/MM/aaaa es
	 * posterior en el tiempo a otro String (fechaMenor) con el mismo formato de
	 * fecha.
	 * 
	 * @param fechaMayor
	 * @param fechaMenor
	 * @return boolean
	 */
	public static boolean isFechaMayor(String fechaMayor, String fechaMenor) {
		log.info("Validacion.isFechaMayor()");

		String[] mayor = fechaMayor.split("/");
		String[] menor = fechaMenor.split("/");

		// si año menor: false
		if (Integer.valueOf(mayor[2]).intValue() < Integer.valueOf(menor[2])
				.intValue()) {
			return false;
			// si año igual
		} else if (Integer.valueOf(mayor[2]).intValue() == Integer.valueOf(
				menor[2]).intValue()) {
			// si año igual y mes menor: false
			if(Integer.valueOf(mayor[1]).intValue() < Integer.valueOf(menor[1]).intValue())
			{	
				return false;			
			//si año igual y mes igual
			}
			else if(Integer.valueOf(mayor[1]).intValue() == Integer.valueOf(menor[1]).intValue())
			{	// si año igual y mes igual y día menor o igual: false
				if(Integer.valueOf(mayor[0]).intValue() <= Integer.valueOf(menor[0]).intValue()) 
				{
					return false;					
				}			
			}
		}
		// en todos los demás casos: true
		return true;
	}

	/**
	 * Valida si un String (fechaMayor) con formato de fecha dd/MM/aaaa es
	 * posterior o igual en el tiempo a otro String (fechaMenor) con el mismo formato de
	 * fecha.
	 * 
	 * @param fechaMayor
	 * @param fechaMenor
	 * @return boolean
	 */
	public static boolean isFechaMayorOIgual(String fechaMayor, String fechaMenor) {
		log.info("Validacion.isFechaMayorOIgual()");

		String[] mayor = fechaMayor.split("/");
		String[] menor = fechaMenor.split("/");

		// si año menor: false
		if (Integer.valueOf(mayor[2]).intValue() < Integer.valueOf(menor[2])
				.intValue()) {
			return false;
			// si año igual
		} else if (Integer.valueOf(mayor[2]).intValue() == Integer.valueOf(
				menor[2]).intValue()) {
			// si año igual y mes menor: false
			if(Integer.valueOf(mayor[1]).intValue() < Integer.valueOf(menor[1]).intValue())
			{	
				return false;			
			//si año igual y mes igual
			}
			else if(Integer.valueOf(mayor[1]).intValue() == Integer.valueOf(menor[1]).intValue())
			{	// si año igual y mes igual y día menor: false
				if(Integer.valueOf(mayor[0]).intValue() < Integer.valueOf(menor[0]).intValue()) 
				{
					return false;					
				}			
			}
		}
		// en todos los demás casos: true
		return true;
	}
	
	/**
	 * Valida si un String (fechaMayor) con formato de fecha dd/MM/aaaa es
	 * igual en el tiempo a otro String (fechaMenor) con el mismo formato de
	 * fecha.
	 * 
	 * @param fechaMayor
	 * @param fechaMenor
	 * @return boolean
	 */
	public static boolean isFechaIgual(String fechaMayor, String fechaMenor) {
		log.info("Validacion.isFechaIgual()");

		String[] mayor = fechaMayor.split("/");
		String[] menor = fechaMenor.split("/");

		// si año menor: false
		if (Integer.valueOf(mayor[2]).intValue() < Integer.valueOf(menor[2])
				.intValue()) {
			return false;
			// si año igual
		} else if (Integer.valueOf(mayor[2]).intValue() == Integer.valueOf(
				menor[2]).intValue()) {
			// si año igual y mes menor: false
			if(Integer.valueOf(mayor[1]).intValue() < Integer.valueOf(menor[1]).intValue())
			{	
				return false;			
			//si año igual y mes igual
			}
			else if(Integer.valueOf(mayor[1]).intValue() == Integer.valueOf(menor[1]).intValue())
			{	// si año igual y mes igual y día menor: false
				if(Integer.valueOf(mayor[0]).intValue() < Integer.valueOf(menor[0]).intValue()) 
				{
					return false;					
				}	
				else if(Integer.valueOf(mayor[0]).intValue() > Integer.valueOf(menor[0]).intValue()) 
				{
					return false;					
				}	
			}
		}
		// en todos los demás casos: true
		return true;
	}
	
	/**
	 * Comprueba si la longitud minima de una cadena introducida es correcta
	 * 
	 * @param cadena
	 * @return
	 */
	public static boolean isLongitudMinimaValida(String cadena,
			Integer valorMinimoValido) {
		if (cadena.length() < valorMinimoValido.intValue())
			return false;
		return true;
	}

	/**
	 * Comprueba si la longitud maxima de una cadena introducida es correcta
	 * 
	 * @param cadena
	 * @return
	 */
	public static boolean isLongitudMaximaValida(String cadena, Integer valorMaximoValido) {
		if (cadena.length() > valorMaximoValido.intValue())
			return false;
		return true;
	}
	
	public static boolean isNumJustificanteValido(String cadena) {
		log.info("Validacion.isNumJustificanteValido()");

		if (StringUtils.isNotBlank(cadena) && StringUtils.isNumeric(cadena))
			if (Pattern.matches("\\d{13}", cadena))
				return true;

		return false;
	}


	/**
	 * Indica si la cadena contiene un número con 1 o 2 decimales. La parte
	 * entera tiene 6 numeros de maximo. El rango es 0
	 * 
	 * @param cadena
	 * @return boolean
	 */
	public static boolean isImportePagoValido(String cadena) {
		log.info("Validacion.isImportePagoValido()");

		if (StringUtils.isNotBlank(cadena)) {
			String pattern = "(\\d{1,6}([,||.]\\d{1,2})?)";
			if (Pattern.matches(pattern, cadena))
				return true;
		}
		return false;
	}
	
	/**
	 * Indica si la cadena contiene un número con 1 o 2 decimales. La parte
	 * entera tiene 8 numeros de maximo. El rango es 0
	 * 
	 * @param cadena
	 * @return boolean
	 */
	public static boolean isImporteLicitacionValido(String cadena) {
		log.info("Validacion.isImporteLicitacionValido()");

		if (StringUtils.isNotBlank(cadena)) {
			//String pattern = "(\\d{1,10}([,||.]\\d{1,2})?)";
			String pattern1 = "((\\d){1,2}(.(\\d){3})*(,(\\d){1,2})?)"; //d.ddd,dd --  dd.ddd,dd -- dd.ddd.ddd,dd
			String pattern2 = "(\\d{1,8}(,\\d{1,2})?)"; //dddddddd,dd
			String pattern3 = "((\\d){1,3}(.(\\d){3})(,(\\d){1,2})?)"; //ddd.ddd,dd
			if (Pattern.matches(pattern1, cadena) || Pattern.matches(pattern2, cadena) || Pattern.matches(pattern3, cadena))
				return true;
		}
		return false;
	}

	/**
	 * Metodo que corta una cadena dejandola con la longitud que se le pasa como argumento
	 * @param cadena
	 * @param longitudCorte
	 * @return
	 */
	public static String cortaCadena(String cadena, Integer longitudCorte) {
		if (cadena.length() > longitudCorte)
			cadena = cadena.substring(0, longitudCorte);

		return cadena;
	}

	
	/**
	 * Valida el número de registro de entrada asignado a un anuncio.
	 * El formato es:
	 *	 - AÑO-REGISTRO (N4)
	 *	 - UNIDAD-REGISTRO (A5)-  Unidad Valida: GC001
	 *	 - TIPO-REGISTRO (A1) - E, Registro de Entrada
	 *	 - NUMERO-DOCUMENTO (N6)
	 * 		Tipo: 2001GC001E258963
	 * (Se utiliza este método de manera provisional)
	 * @param cadena
	 * @return
	 */

	public static boolean isNumRegistroEntradaValido(String cadena) {
		log.info("Validacion.isNumRegistroEntradaValido()");
		if (StringUtils.isNotBlank(cadena))
			if (Pattern.matches("\\d{4}GC001E\\d{6}", cadena))
				return true;

		return false;
	}

	/**
	 * Metodo que valida que el número de planas tiene el formato correcto (1-1,5-2-2,5..)
	 * @param cadena
	 * @return
	 */
	public static boolean isNumPlanasValido(String cadena) {
		log.info("Validacion.isNumPlanasValido()");
		cadena=cadena.trim();//Omitir espacios
		if (StringUtils.isNotBlank(cadena)) {
			//Entero con posible parte decimal terminada en 5
			String pattern = "\\d*([,|\\.]([5]|[0])){0,1}";
			if (Pattern.matches(pattern, cadena)){
				return true;
			}
			return false;
		}
		return false;
	}
	
	
	public static boolean isDescripcionAnexoCorrecta(String cadena) {
		log.info("Validacion.isDescripcionAnexoCorrecta()");
		if (StringUtils.isNotBlank(cadena))
			if(cadena.contains("\\")||cadena.contains("/")|| cadena.contains("<")|| cadena.contains(">") || cadena.contains("."))
			 	return false;

		return true;
	}
	
	
	

	
}
