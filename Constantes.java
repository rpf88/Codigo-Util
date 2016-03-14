package com.amap.sigboc.util;

import java.util.HashMap;
import java.util.Map;

public class Constantes {

	// ********************************************

	// ****  RECUERDA QUE ESTE ARCHIVO TIENE QUE GUARDARSE EN ISO-8859-1
	// !!!!! **********/
	// ********************************************

	/* OBJETOS EN SESION */

	// usuario en sesion
	/** The Constant USUARIO. */
	public final static String USUARIO = "USUARIO";

	// usuario en sesion
	/** The Constant OBJETO MENU. */
	public final static String MENU = "MENU_OBJECT";

	// titulo en sesion
	/** The Constant TITULO. */
	public final static String TITULO = "TITULO";

	/** The Constant MESSAGE_RESOURCE. */
	public final static String MESSAGE_RESOURCE = "ApplicationResources";

	// Comunes
	/** The Constant SI. */
	public final static String SI = "Si";

	/** The Constant NO. */
	public final static String NO = "No";

	/** The Constant ERROR. */
	public final static String ERROR = "error";

	/** The Constant MENSAJE. */
	public final static String MENSAJE = "message";

	/** The Constant APPLICATION_ENCODING */
	//public final static String APPLICATION_ENCODING = "ISO-8859-1";
	 public final static String APPLICATION_ENCODING ="UTF-8";

	/** The Constant TIPO_MENSUAL */
	public static final String TIPO_MENSUAL = "Mensual";

	/** The Constant TIPO_ANUAL */
	public static final String TIPO_ANUAL = "Anual";

	/** The Constant HASH_MAP_DIAS_MESES */
	public static final Map<String, Integer> HASH_MAP_DIAS_MESES = new HashMap<String, Integer>();
	static {
		HASH_MAP_DIAS_MESES.put("01", new Integer(31));
		HASH_MAP_DIAS_MESES.put("02", new Integer(29));
		HASH_MAP_DIAS_MESES.put("03", new Integer(31));
		HASH_MAP_DIAS_MESES.put("04", new Integer(30));
		HASH_MAP_DIAS_MESES.put("05", new Integer(31));
		HASH_MAP_DIAS_MESES.put("06", new Integer(30));
		HASH_MAP_DIAS_MESES.put("07", new Integer(31));
		HASH_MAP_DIAS_MESES.put("08", new Integer(31));
		HASH_MAP_DIAS_MESES.put("09", new Integer(30));
		HASH_MAP_DIAS_MESES.put("10", new Integer(31));
		HASH_MAP_DIAS_MESES.put("11", new Integer(30));
		HASH_MAP_DIAS_MESES.put("12", new Integer(31));
	}

	public static final Map<Integer, String> HASH_MAP_MESES = new HashMap<Integer, String>();
	static {
		HASH_MAP_MESES.put(Integer.valueOf(1), "Enero");
		HASH_MAP_MESES.put(Integer.valueOf(2), "Febrero");
		HASH_MAP_MESES.put(Integer.valueOf(3), "Marzo");
		HASH_MAP_MESES.put(Integer.valueOf(4), "Abril");
		HASH_MAP_MESES.put(Integer.valueOf(5), "Mayo");
		HASH_MAP_MESES.put(Integer.valueOf(6), "Junio");
		HASH_MAP_MESES.put(Integer.valueOf(7), "Julio");
		HASH_MAP_MESES.put(Integer.valueOf(8), "Agosto");
		HASH_MAP_MESES.put(Integer.valueOf(9), "Septiembre");
		HASH_MAP_MESES.put(Integer.valueOf(10), "Octubre");
		HASH_MAP_MESES.put(Integer.valueOf(11), "Noviembre");
		HASH_MAP_MESES.put(Integer.valueOf(12), "Diciembre");
	}

	public static final Map<Integer, String> HASH_MAP_DIAS = new HashMap<Integer, String>();
	static {
		HASH_MAP_DIAS.put(Integer.valueOf(1), "Lunes");
		HASH_MAP_DIAS.put(Integer.valueOf(2), "Martes");
		HASH_MAP_DIAS.put(Integer.valueOf(3), "Miércoles");
		HASH_MAP_DIAS.put(Integer.valueOf(4), "Jueves");
		HASH_MAP_DIAS.put(Integer.valueOf(5), "Viernes");
		HASH_MAP_DIAS.put(Integer.valueOf(6), "Sábado");
		HASH_MAP_DIAS.put(Integer.valueOf(7), "Domingo");
	}

	/** The Constant PATRON_CONTROL_LETRA_DNI */
	public static final String PATRON_CONTROL_LETRA_DNI = "TRWAGMYFPDXBNJZSQVHLCKET";

	// Constantes para estados de anuncios
	/** The Constant PDTE_ENVIO. */
	public final static Integer ANUNCIO_PDTE_ENVIO_OAC = Integer.valueOf("1");

	/** The Constant DEVUELTO_DESDE_OAC. */
	public final static Integer ANUNCIO_DEVUELTO_DESDE_OAC = Integer
			.valueOf("2");

	/** The Constant ENVIADO_A_OAC. */
	public final static Integer ANUNCIO_ENVIADO_A_OAC = Integer.valueOf("3");

	/** The Constant ESTADO_REENVIADO. */
	public final static Integer ANUNCIO_REENVIADO_A_OAC = Integer.valueOf("4"); // ENVIADO_A_OAC_MODIFICADO

	/** The Constant APROBADO. */
	public final static Integer ANUNCIO_APROBADO_EN_OAC = Integer.valueOf("5"); // ENVIADO
																				// A
																				// SBAG

	/** The Constant ANUNCIO_ASIGNADO_A_BOLETIN. */
	public final static Integer ANUNCIO_ASIGNADO_A_BOLETIN = Integer
			.valueOf("6");

	/** The Constant PDTE_REVISION. */
	public final static Integer ANUNCIO_PDTE_REVISION = Integer.valueOf("7");

	/** The Constant ANUNCIO_CORREGIDO. */
	public final static Integer ANUNCIO_CORREGIDO = Integer.valueOf("8");

	/** The Constant ANUNCIO_EN_MAQUETACION. */
	public final static Integer ANUNCIO_EN_MAQUETACION = Integer.valueOf("9");

	/** The Constant ANUNCIO_PDTE_PUBLICACION. */
	public final static Integer ANUNCIO_PDTE_PUBLICACION = Integer
			.valueOf("10");

	/** The Constant ANUNCIO_PUBLICADO. */
	public final static Integer ANUNCIO_PUBLICADO = Integer.valueOf("11");

	/** The Constant ANUNCIO_NO_PUBLICADO. */
	public final static Integer ANUNCIO_NO_PUBLICADO = Integer.valueOf("12");

	/** The Constant ANUNCIO_PDTE_SUJETO_PASIVO. */
	public final static Integer ANUNCIO_PDTE_SUJETO_PASIVO = Integer
			.valueOf("13");

	/** The Constant ANUNCIO_PDTE_PAGO. */
	public final static Integer ANUNCIO_PDTE_PAGO = Integer.valueOf("14");

	/** The Constant ANUNCIO_RECUPERADO. */
	public final static Integer ANUNCIO_RECUPERADO = Integer.valueOf("15");

	/** The Constant ANUNCIO_ENVIADO_OAC_RECUPERADO. */
	public final static Integer ANUNCIO_ENVIADO_OAC_RECUPERADO = Integer
			.valueOf("16");

	/** The Constant ANUNCIO_PDTE_ENVIO_SBAG. */
	public final static Integer ANUNCIO_PDTE_ENVIO_SBAG = Integer.valueOf("17");

	/** The Constant ANUNCIO_PDTE_SUJETO_PASIVO_CONSEJERIA. */
	public final static Integer ANUNCIO_PDTE_SUJETO_PASIVO_CONSEJERIA = Integer
			.valueOf("18");

	/** The Constant ANUNCIO_DEVUELTO_DESDE_IMPRENTA. */
	public final static Integer ANUNCIO_DEVUELTO_DESDE_IMPRENTA = Integer
			.valueOf("19");

	/** The Constant ANUNCIO_PDTE_ASIGNAR_LOTES. */
	public final static Integer ANUNCIO_PDTE_ASIGNAR_LOTES = Integer
			.valueOf("20");

	/** The Constant ANUNCIO_PDTE_ASIGNAR_LOTES_OAC. */
	public final static Integer ANUNCIO_PDTE_ASIGNAR_LOTES_OAC = Integer
			.valueOf("21");

	// Constantes para tipos de anuncios
	/** The Constant TIPO_ANUNCIO_CORRECCION. */
	public final static Integer TIPO_ANUNCIO_CORRECCION = Integer.valueOf("1");

	// Constantes para anuncios
	/** The Constant RECUPERADO. */
	public final static Integer RECUPERADO = Integer.valueOf("1");

	/** The Constant NO_RECUPERADO. */
	public final static Integer NO_RECUPERADO = Integer.valueOf("0");

	// Constantes para pagos anuncios
	/** The Constant PAGADO. */
	public final static Integer PAGADO = Integer.valueOf("1");

	/** The Constant NO_PAGADO. */
	public final static Integer NO_PAGADO = Integer.valueOf("0");

	// Constantes para pagos anuncios
	/** The Constant REQUIERE_PAGO. */
	public final static Integer REQUIERE_PAGO = Integer.valueOf("1");

	/** The Constant NO_REQUIERE_PAGO. */
	public final static Integer NO_REQUIERE_PAGO = Integer.valueOf("0");

	// Constantes para pagos anuncios
	/** The Constant REQUIERE_PAGO_PREVIO. */
	public final static Integer REQUIERE_PAGO_PREVIO = Integer.valueOf("1");

	/** The Constant NO_REQUIERE_PAGO_PREVIO. */
	public final static Integer NO_REQUIERE_PAGO_PREVIO = Integer.valueOf("0");

	/** The Constant PAGO_PREVIO. */
	public final static Integer PAGO_PREVIO = Integer.valueOf("1");

	/** The Constant PAGO_DIFERIDO. */
	public final static Integer PAGO_DIFERIDO = Integer.valueOf("0");

	// Constantes de tramitación
	/** The Constant TRAMITACION_URGENTE. */
	public final static Integer TRAMITACION_URGENTE = Integer.valueOf("1");

	/** The Constant TRAMITACION_NORMAL. */
	public final static Integer TRAMITACION_NORMAL = Integer.valueOf("0");

	// Constantes de revision de anuncios
	/** The Constant REVISADO. */
	public final static Integer REVISADO = Integer.valueOf("1");

	/** The Constant NO_REVISADO. */
	public final static Integer NO_REVISADO = Integer.valueOf("0");

	/** The Constant NO_CORREGIDO. */
	public final static Integer NO_CORREGIDO = Integer.valueOf("0");

	/** The Constant CORREGIDO. */
	public final static Integer CORREGIDO = Integer.valueOf("1");

	/** The Constant NO_CORRECCION. */
	public final static Integer NO_CORRECCION = Integer.valueOf("0");

	/** The Constant CORRECCION. */
	public final static Integer CORRECCION = Integer.valueOf("1");

	/** The Constant SECCION. */
	public final static String SECCION = "000";

	/** The Constant TRUE. */
	public static final String TRUE = "true";

	/** The Constant FALSE. */
	public static final String FALSE = "false";

	/** The Constant DEVUELTO_Y_NO_MODIFICADO. */
	public final static Integer DEVUELTO_Y_NO_MODIFICADO = Integer.valueOf("0");

	/** The Constant DEVUELTO_Y_MODIFICADO. */
	public final static Integer DEVUELTO_Y_MODIFICADO = Integer.valueOf("1");

	/** The Constant RECUPERADO_Y_CAMBIADO. */
	public final static Integer RECUPERADO_Y_CAMBIADO = Integer.valueOf("2");

	/** The Constant NO_MODIFICADO */
	public final static Integer NO_MODIFICADO = Integer.valueOf("0");

	/* BEAN ANUNCIO */
	public static final String PROPERTY_ANUNCIO_ID = "id";

	/* BEAN ANEXO */
	/** The Constant PROPERTY_ANEXO_ID. */
	public static final String PROPERTY_ANEXO_ID = "id";

	/** The Constant PROPERTY_ANEXO_NOMBRE. */
	public static final String PROPERTY_ANEXO_NOMBRE = "nombre";

	/* BEAN TERCERO */
	/** The Constant PROPERTY_TERCERO_ID. */
	public static final String PROPERTY_TERCERO_ID = "id";

	/** The Constant PROPERTY_TERCERO_NIF. */
	public static final String PROPERTY_TERCERO_NIF = "nif";

	/** The Constant PROPERTY_TARIFA_ID. */
	public static final String PROPERTY_TARIFA_ID = "id";

	/** The Constant PROPERTY_TARIFA_ID. */
	public static final String PROPERTY_TARIFA_ANYO = "ano";

	/** The Constant PROPERTY_ENTRADILLA_ID. */
	public static final String PROPERTY_ENTRADILLA_ID = "id";

	/** The Constant PROPERTY_SECCION_ID. */
	public static final String PROPERTY_SECCION_ID = "id";

	/** The Constant PROPERTY_SUBSECCION_ID. */
	public static final String PROPERTY_SUBSECCION_ID = "id";

	/** The Constant PROPERTY_TIPOANUNCIO_ID. */
	public static final String PROPERTY_TIPOANUNCIO_ID = "id";

	/** The Constant PROPERTY_ORGANIZACION_ID. */
	public static final String PROPERTY_ORGANIZACION_ID = "id";

	/* Atributo indicador del perfil de la consejeria */
	public static final Integer PERFIL_CONSEJERIA = Integer.valueOf("1");

	/* Atributo indicador del PERFIL_CONSEJERIA_BASICO */
	public static final Integer PERFIL_CONSEJERIA_BASICO = Integer.valueOf("6");

	/* Atributo indicador del PERFIL_SECRETARIO_GENERAL */
	public static final Integer PERFIL_SECRETARIO_GENERAL = Integer
			.valueOf("7");

	/* Atributo indicador del PERFIL_USUARIO_NO_ASIGNADO */
	public static final Integer PERFIL_USUARIO_NO_ASIGNADO = Integer
			.valueOf("8");

	/* Atributo indicador del perfil de la oac */
	public static final Integer PERFIL_OFICINA_ATENCION_CIUDADANO = Integer
			.valueOf("2");

	/* Atributo indicador del perfil de la imprenta */
	public static final Integer PERFIL_RESPONSABLE_IMPRENTA = Integer
			.valueOf("3");

	/* Atributo indicador del perfil del tag */
	public static final Integer PERFIL_TECNICO_ARTES_GRAFICAS = Integer
			.valueOf("4");

	/* Atributo indicador del perfil del administrador */
	public static final Integer PERFIL_ADMINISTRADOR = Integer.valueOf("5");

	/* Atributo indicador del perfil del administrador */
	public static final Integer PERFIL_RESPONSABLE_TECNICO = Integer
			.valueOf("9");

	/* Atributo indicador del perfil del administrador */
	public static final Integer PERFIL_CONSOLA_ADMINISTRACION = Integer
			.valueOf("10");

	/* Atributo indicador de la realización de una busqueda */
	public static final String FILTRADO_POR_BUSQUEDA = "filtradoPorBusqueda";

	/* Atributo indicador de la pagina principal */
	public static final String NOMBRE_PRINCIPAL = "nombrePrincipal";

	/* Atributo indicador de la pagina secundaria */
	public static final String NOMBRE_SECUNDARIO = "nombreSecundario";

	/* Atributo indicador de consjeria */
	public static final String LITERAL_CONSEJERIA = "Consejería";

	/* Atributo indicador de consjeria */
	public static final String LITERAL_OAC = "Oficina de Atención a la Ciudadanía";

	/* Atributo indicador de consjeria */
	public static final String LITERAL_RESPONSABLE_IMPRENTA = "Responsable de Imprenta";

	/* Atributo indicador de consjeria */
	public static final String LITERAL_RESPONSABLE_BOLETIN = "Responsable del Boletín";

	/* Atributo indicador de consjeria */
	public static final String LITERAL_TAG = "Técnico de Artes Gráficas";

	/* Atributo indicador de consjeria */
	public static final String LITERAL_ADMINISTRADOR = "Administrador";

	/* Atributo indicador de consjeria */
	public static final String LITERAL_CONSOLA = "Consola de Administración";

	/** The Constant LITERAL_TARIFAS. */
	public static final String LITERAL_TARIFAS = "Tarifas";

	/** The Constant LITERAL_PAGOS_PREVIOS. */
	public static final String LITERAL_PAGOS_PREVIOS = "Pagos Previos (046)";

	/** The Constant LITERAL_PAGOS_DIFERIDOS. */
	public static final String LITERAL_PAGOS_DIFERIDOS = "Pagos Diferidos (047)";

	/** The Constant LITERAL_LISTADO_CORREOS. */
	public static final String LITERAL_LISTADO_CORREOS = "Listado Correos Pagos Previos (046)";

	/** The Constant LITERAL_LISTADO_CORREOS_EXCEL. */
	public static final String LITERAL_LISTADO_CORREOS_EXCEL = "Correos Pagos Previos (046)";

	/** The Constant LITERAL_CONSULTA_PAGOS_DIFERIDOS. */
	public static final String LITERAL_CONSULTA_PAGOS_DIFERIDOS = "Consulta Pagos Diferidos (047)";

	/** The Constant LITERAL_CONSULTA_PAGOS_DIFERIDOS_EXCEL. */
	public static final String LITERAL_CONSULTA_PAGOS_DIFERIDOS_EXCEL = "Consulta Pagos Diferidos";

	/** The Constant LITERAL_SOLICITUD_ALTA */
	public final static String LITERAL_SOLICITUD_ALTA = "Solicitud de alta de emisor";

	/** The Constant LITERAL_INSERCION_ANUNCIOS */
	public final static String LITERAL_INSERCION_ANUNCIOS = "Inserción de Anuncios";

	/** The Constant LITERAL_CONSULTA_TASAS */
	public final static String LITERAL_CONSULTA_TASAS = "Cálculo de Tasas";

	/** The Constant LITERAL_BUSQUEDA_ANUNCIOS */
	public final static String LITERAL_BUSQUEDA_ANUNCIOS = "Búsqueda de Anuncios";

	/** The Constant LITERAL_BUZON_CONSEJERIA */
	public final static String LITERAL_BUZON_CONSEJERIA = "Buzón de Consejería";

	/** The Constant LITERAL_ENVIO_ANUNCIOS_OAC */
	public final static String LITERAL_ENVIO_ANUNCIOS_OAC = "Envío a OAC";

	/** The Constant LITERAL_JUSTIFICANTE_RECEPCION */
	public final static String LITERAL_JUSTIFICANTE_RECEPCION = "Copia de Solicitud";

	/** The Constant LITERAL_ANOTACIONES_ANUNCIOS */
	public final static String LITERAL_ANOTACIONES_ANUNCIOS = "Anotaciones de Anuncios";

	/** The Constant LITERAL_BUSQUEDA_ANEXOS */
	public final static String LITERAL_BUSQUEDA_ANEXOS = "Búsqueda de Anexos";

	/** The Constant LITERAL_BUSQUEDA_TERCEROS */
	public final static String LITERAL_BUSQUEDA_TERCEROS = "Búsqueda de Terceros";

	/** The Constant LITERAL_BUSQUEDA_LOTES */
	public final static String LITERAL_BUSQUEDA_LOTES = "Búsqueda de Lotes";

	/** The Constant LITERAL_ASIGNACION_CORRECCIONES */
	public final static String LITERAL_ASIGNACION_CORRECCIONES = "Asignación de Revisiones";

	/** The Constant LITERAL_BUSQUEDA_ANUNCIOS_PUBLICADOS */
	public final static String LITERAL_BUSQUEDA_ANUNCIOS_PUBLICADOS = "Búsqueda de Anuncios publicados";

	/** The Constant LITERAL_BUSQUEDA_ANUNCIOS_PUBLICADOS_EXCEL */
	public final static String LITERAL_BUSQUEDA_ANUNCIOS_PUBLICADOS_EXCEL = "Búsqueda Anuncios publicados";

	/** The Constant LITERAL_BUSQUEDA_ANUNCIOS_RECEPCION */
	public final static String LITERAL_BUSQUEDA_ANUNCIOS_RECEPCION = "Buzón de la Oficina de Atención a la Ciudadanía";

	/** The Constant LITERAL_BUSQUEDA_ANUNCIOS_RECEPCION_EXCEL */
	public final static String LITERAL_BUSQUEDA_ANUNCIOS_RECEPCION_EXCEL = "Buzón OAC.";

	/** The Constant LITERAL_REVISION_ANUNCIOS_OAC */
	public final static String LITERAL_REVISION_ANUNCIOS_OAC = "Revisión de Anuncios";

	/** The Constant LITERAL_DEVOLUCION_ANUNCIOS_OAC */
	public final static String LITERAL_DEVOLUCION_ANUNCIOS_OAC = "Devolución de Anuncios";

	/** The Constant LITERAL_DEVOLUCION_ANUNCIOS_IMPRENTA */
	public final static String LITERAL_DEVOLUCION_ANUNCIOS_IMPRENTA = "Devolución de Anuncios";

	/** The Constant LITERAL_APROBACION_ANUNCIOS_OAC */
	public final static String LITERAL_APROBACION_ANUNCIOS_OAC = "Aprobación de Anuncios";

	/** The Constant LITERAL_RECUPERACION_ANUNCIOS_OAC */
	public final static String LITERAL_RECUPERACION_ANUNCIOS_OAC = "Recuperación de Anuncios";

	/** The Constant LITERAL_PAGOS_SUJETO_PASIVO_OAC */
	public final static String LITERAL_PAGOS_SUJETO_PASIVO_OAC = "Pagos de Terceros";

	/** The Constant LITERAL_SUJETOS_PASIVOS_ANUNCIO_OAC */
	public final static String LITERAL_SUJETOS_PASIVOS_ANUNCIO_OAC = "Terceros por Anuncio";

	/** The Constant LITERAL_DETALLE_TERCEROS_SUJETO_PASIVO_OAC */
	public final static String LITERAL_DETALLE_TERCEROS_SUJETO_PASIVO_OAC = "Terceros";

	/** The Constant LITERAL_BUSQUEDA_ANUCIOS_ARCHIVAR_OAC */
	public final static String LITERAL_BUSQUEDA_ANUCIOS_ARCHIVAR_OAC = "Archivar Anuncios";

	/** The Constant LITERAL_BUSQUEDA_TERCEROS_ANUNCIOS_ARCHIVAR_OAC */
	public final static String LITERAL_BUSQUEDA_TERCEROS_ANUNCIOS_ARCHIVAR_OAC = "Búsqueda de terceros de anuncios para archivar";

	/** The Constant LITERAL_BUSQUEDA_TERCEROS_ANUNCIOS_ARCHIVAR_OAC_EXCEL */
	public final static String LITERAL_BUSQUEDA_TERCEROS_ANUNCIOS_ARCHIVAR_OAC_EXCEL = "Búsqueda terceros a archivar";

	/** The Constant LITERAL_BUSQUEDA_PAGOS_PENDIENTES_POR_EMISOR_OAC */
	public final static String LITERAL_BUSQUEDA_PAGOS_PENDIENTES_POR_EMISOR_OAC = "Pagos por Emisor";

	/** The Constant LITERAL_BUSQUEDA_PAGOS_PENDIENTES_POR_EMISOR_OAC_EXCEL */
	public final static String LITERAL_BUSQUEDA_PAGOS_PENDIENTES_POR_EMISOR_OAC_EXCEL = "Pagos por Emisor";

	/** The Constant LITERAL_TRAZAS_ANUNCIO */
	public final static String LITERAL_TRAZAS_ANUNCIO = "Trazas Anuncio";

	/** The Constant LITERAL_REABRIR_ARCHIVADOS */
	public final static String LITERAL_REABRIR_ARCHIVADOS = "Reabrir Anuncios Archivados";

	/** The Constant LITERAL_PROTEGER_LOPD */
	public final static String LITERAL_PROTEGER_LOPD = "Proteger Anuncios LOPD";

	/** The Constant LITERAL_BOLETINES_PUBLICADOS */
	public final static String LITERAL_BOLETINES_PUBLICADOS = "Boletines Publicados";

	/* Literales de administraciones */
	/** The Constant LITERAL_ADMINISTRACIONES */
	public final static String LITERAL_ADMINISTRACIONES = "Tipo de Administración";

	/** The Constant LITERAL_ENTIDADES */
	public final static String LITERAL_ENTIDADES = "Tipo de Entidad";

	/** The Constant LITERAL_ORGANIZACIONES */
	public final static String LITERAL_ORGANIZACIONES = "Tipo de Organización";

	/** The Constant LITERAL_UNIDADES */
	public final static String LITERAL_UNIDADES = "Tipo de Unidades";

	/** The Constant LITERAL_ORDEN_PUBLICACION */
	public final static String LITERAL_ORDEN_PUBLICACION = "Orden de Publicación";

	/** The Constant LITERAL_USUARIOS */
	public final static String LITERAL_USUARIOS = "Usuarios";

	/** The Constant LITERAL_USUARIOS_NO_ASIGNADOS */
	public final static String LITERAL_USUARIOS_NO_ASIGNADOS = "Usuarios no Asignados";

	/** The Constant LITERAL_ENTRADILLAS */
	public final static String LITERAL_ENTRADILLAS = "Entradillas";

	/** The Constant LITERAL_ENTRADILLAS_TIPO_ANUNCIO */
	public final static String LITERAL_ENTRADILLAS_TIPO_ANUNCIO = "Entradilla por Tipo de Anuncio";

	/** The Constant LITERAL_ENTRADILLAS_TIPO_ANUNCIO_EXCEL */
	public final static String LITERAL_ENTRADILLAS_TIPO_ANUNCIO_EXCEL = "Entradilla Tipo de Anuncio";

	/** The Constant LITERAL_SECCIONES */
	public final static String LITERAL_SECCIONES = "Secciones";

	/** The Constant LITERAL_SUBSECCIONES */
	public final static String LITERAL_SUBSECCIONES = "Subsecciones";

	/** The Constant LITERAL_TIPOS_ANUNCIO */
	public final static String LITERAL_TIPOS_ANUNCIO = "Tipos de Anuncios";

	/** The Constant LITERAL_EMISORES */
	public final static String LITERAL_EMISORES = "Cambio de Emisores";

	/** The Constant LITERAL_HISTORICOS */
	public final static String LITERAL_HISTORICOS = "Paso a Históricos";

	/** The Constant LITERAL_HISTORICOS */
	public final static String LITERAL_DATOS_FIRMADOS_ANUNCIO = "Datos Firmados del Anuncio";

	/** The Constant LITERAL_CAMBIO_NUM_EXPEDIENTE */
	public final static String LITERAL_CAMBIO_NUM_EXPEDIENTE = "Cambio de número de Expediente";

	/** The Constant LITERAL_CAMBIO_NUM_EXPEDIENTE */
	public final static String LITERAL_BORRADO_EXPEDIENTE_ALFRESCO = "Borrar expediente de Alfesco";

	/** The Constant LITERAL_BORRADO_ANUNCIOS */
	public final static String LITERAL_BORRADO_ANUNCIOS = "Borrado de Anuncios";

	/** The Constant LITERAL_ANULAR_HTML */
	public final static String LITERAL_ANULAR_HTML = "Anular HTML";

	/** The Constant LITERAL_DESPUBLICAR */
	public final static String LITERAL_DESPUBLICAR = "Despublicar Boletines";

	/** The Constant LITERAL_HISTORICOS */
	public final static String LITERAL_CREACION_CARPETAS = "Creación de carpetas";

	/** The Constant LITERAL_RECUPERACION_ANUNCIOS */
	public final static String LITERAL_RECUPERACION_ANUNCIOS = "Recuperación de Anuncios";

	/** The Constant LITERAL_PARAMETROS */
	public final static String LITERAL_PARAMETROS = "Parámetros";

	// Literales de Responsable de impresión
	/** The Constant LITERAL_ASIGNAR_ANUNCIOS_AL_BOLETIN */
	public final static String LITERAL_ASIGNAR_ANUNCIOS_AL_BOLETIN = "Asignar Anuncios al Boletín";

	/** The Constant LITERAL_GESTION_DE_TAREAS */
	public final static String LITERAL_GESTION_DE_TAREAS = "Gestión de Tareas";

	/** The Constant LITERAL_CORRECCIONES_ASIGNADAS */
	public final static String LITERAL_CORRECCIONES_ASIGNADAS = "Revisiones Asignadas";

	/** The Constant LITERAL_MAQUETACIONES_ASIGNADAS */
	public final static String LITERAL_MAQUETACIONES_ASIGNADAS = "Maquetaciones Asignadas";

	/** The Constant LITERAL_PLANIFICACION */
	public final static String LITERAL_PLANIFICACION = "Planificación";

	/** The Constant LITERAL_ASIGNAR_TAREAS_BOLETINES */
	public final static String LITERAL_ASIGNAR_TAREAS_BOLETINES = "Asignación de Tareas a TAG";

	/** The Constant LITERAL_ASIGNAR_TAREAS_BOLETINES_EXCEL */
	public final static String LITERAL_ASIGNAR_TAREAS_BOLETINES_EXCEL = "Asignación Tareas Boletines";

	/** The Constant LITERAL_ASIGNAR_REVISIONES */
	public final static String LITERAL_ASIGNAR_REVISOR = "Asignar Revisor";

	/** The Constant LITERAL_ASIGNAR_MAQUETADOR */
	public final static String LITERAL_ASIGNAR_MAQUETADOR = "Asignar Maquetador";

	/** The Constant LITERAL_ASIGNAR_LECTOR */
	public final static String LITERAL_ASIGNAR_LECTOR = "Asignar Lector";

	/** The Constant LITERAL_ORDENACION_BOLETINES */
	public final static String LITERAL_ORDENACION_BOLETINES = "Ordenación de Boletines";

	/** The Constant LITERAL_ANUNCIOS */
	public final static String LITERAL_ANUNCIOS = "Anuncios";

	/** The Constant LITERAL_CAMBIAR_ASIGNACION */
	public final static String LITERAL_CAMBIAR_ASIGNACION = "Cambiar Asignación";

	/** The Constant LITERAL_BOLETINES_INDICES */
	public final static String LITERAL_BOLETINES_INDICES = "Boletines de índices";

	/** The Constant LITERAL_VALIDACION_BOLETIN */
	public final static String LITERAL_VALIDACION_BOLETIN = "Validación de Boletín";

	/** The Constant LITERAL_ASIGNAR_REVISIONES */
	public final static String LITERAL_ASIGNAR_REVISIONES = "Asignar Revisiones";

	/** The Constant LITERAL_APROBACION_BOLETINES */
	public final static String LITERAL_APROBACION_BOLETINES = "Aprobación de Boletines";

	/** The Constant LITERAL_REVISIONES */
	public final static String LITERAL_REVISIONES = "Revisiones";

	/** The Constant LITERAL_ERROR_MAQUETACION */
	public final static String LITERAL_ERROR_MAQUETACION = "Error de Maquetación";

	/** The Constant LITERAL_GESTION_TAREAS */
	public final static String LITERAL_GESTION_TAREAS = "Gestión de tareas TAG";

	/** The Constant LITERAL_GESTION_TAREAS_ASIGNADAS_TAG */
	public final static String LITERAL_GESTION_TAREAS_ASIGNADAS_TAG = "Revisiones asignadas TAG";

	/** The Constant LITERAL_MATERIAS */
	public final static String LITERAL_MATERIAS = "Materias";

	/** The Constant LITERAL_CONTROL_BOLETINES */
	public final static String LITERAL_CONTROL_BOLETINES = "Control de Boletines para Textos Autonómicos";

	/** The Constant LITERAL_CONTROL_ANUNCIOS */
	public final static String LITERAL_CONTROL_ANUNCIOS = "Control de Anuncios";
	// Literales de Técnicos de artes Gráficas

	/** The Constant LITERAL_BOLETIN_EDICION */
	public final static String LITERAL_BOLETIN_EDICION = "Boletín en Edición";

	/** The Constant LITERAL_PASAR_SERVIDOR */
	public final static String LITERAL_PASAR_SERVIDOR = "Pasar a Servidor";

	/** The Constant LITERAL_ERRORES_MAQUETACION */
	public final static String LITERAL_ERRORES_MAQUETACION = "Errores de Maquetación";

	/** The Constant LITERAL_LECTURA_BOLETINES */
	public final static String LITERAL_LECTURA_BOLETINES = "Lectura de Boletines";

	/** The Constant TIPO_ANEXO_PDF. */
	public final static Integer TIPO_ANEXO_PDF = Integer.valueOf("0");

	/** The Constant TIPO_ANEXO_TIFF. */
	public final static Integer TIPO_ANEXO_TIFF = Integer.valueOf("1");

	/** The Constant TIPO_ANEXO_TIF. */
	public final static Integer TIPO_ANEXO_TIF = Integer.valueOf("2");

	/** The Constant TIPO_ANEXO_DOC. */
	public final static Integer TIPO_ANEXO_DOC = Integer.valueOf("3");
	
	/** The Constant TIPO_ANEXO_DOCX. */
	public final static Integer TIPO_ANEXO_DOCX =Integer.valueOf("4");

	/** The Constant VALOR_PDF. */
	public final static int VALOR_PDF = 0;

	/** The Constant VALOR_TIFF. */
	public final static int VALOR_TIFF = 1;

	/** The Constant VALOR_TIF. */
	public final static int VALOR_TIF = 2;

	/** The Constant VALOR_WORD. */
	public final static int VALOR_WORD = 3;

	/** The Constant EXTENSION_TIFF. */
	public final static String EXTENSION_TIFF = ".tiff";

	/** The Constant EXTENSION_TIFF_MAYUSCULAS. */
	public final static String EXTENSION_TIFF_MAYUSCULAS = ".TIFF";

	/** The Constant EXTENSION_TIF. */
	public final static String EXTENSION_TIF = ".tif";

	/** The Constant EXTENSION_TIF_MAYUSCULAS. */
	public final static String EXTENSION_TIF_MAYUSCULAS = ".TIF";

	/** The Constant EXTENSION_PDF. */
	public final static String EXTENSION_PDF = ".pdf";

	/** The Constant EXTENSION_PDF_MAYUSCULAS. */
	public final static String EXTENSION_PDF_MAYUSCULAS = ".PDF";

	/** The Constant EXTENSION_XML. */
	public final static String EXTENSION_XML = ".xml";

	/** The Constant EXTENSION_XML. */
	public final static String EXTENSION_XML_MAYUSCULAS = ".XML";

	/** The Constant EXTENSION_ZIP. */
	public final static String EXTENSION_ZIP = ".zip";

	/** The Constant EXTENSION_XML. */
	public final static String EXTENSION_ZIP_MAYUSCULAS = ".ZIP";

	/** The Constant EXTENSION_DOC. */
	public final static String EXTENSION_DOC = ".doc";

	/** The Constant EXTENSION_DOC_MAYUSCULAS. */
	public final static String EXTENSION_DOC_MAYUSCULAS = ".DOC";


	
	/** The Constant EXTENSION_DOCX. */
	public final static String EXTENSION_DOCX = ".docx";

	/** The Constant EXTENSION_DOCX_MAYUSCULAS. */
	public final static String EXTENSION_DOCX_MAYUSCULAS = ".DOCX";
	
	
	
	/** The Constant EXTENSION_TXT. */
	public final static String EXTENSION_TXT = ".txt";

	/** The Constant EXTENSION_P7S. */
	public final static String EXTENSION_P7S = ".p7s";

	/** The Constant MIME_TIFF. */
	public final static String MIME_TIFF = "image/tiff";

	/** The Constant MIME_TIF. */
	public final static String MIME_TIF = "image/tif";

	/** The Constant MIME_PDF. */
	public final static String MIME_PDF = "application/pdf";

	/** The Constant MIME_DOC. */
	public final static String MIME_DOC = "application/msword";
	/** The Constant MIME_DOC. */
	public final static String MIME_DOCX = "application/msword";

	/** The Constant MIME_ZIP. */
	public final static String MIME_ZIP = "application/zip";

	/** The Constant MIME_TXT. */
	public final static String MIME_TXT = "text/plain";

	/** The Constant MIME_P7S. */
	public final static String MIME_P7S = "application/x-pkcs7-signature";

	// Canales de recepcion
	public final static Integer RECEPCION_CONSEJERIA = Integer.valueOf("1");

	public final static Integer RECEPCION_ATENCION_CIUDADANO = Integer
			.valueOf("2");

	// Atributos tabla XML
	/** TABLA_GRUPO */
	public final static String TABLA_GRUPO = "tgroup";
	/** TABLA_CUERPO */
	public final static String TABLA_CUERPO = "tbody";
	/** TABLA_FILA */
	public final static String TABLA_FILA = "row";
	/** TABLA_COLUMNAS */
	public final static String TABLA_COLUMNAS = "cols";
	/** TABLA_COLUMNA */
	public final static String TABLA_COLUMNA = "colspec";
	/** TABLA_CELDA */
	public final static String TABLA_CELDA = "entry";
	/** TABLA_ATRIBUTO_COLUMNA_INICIO */
	public final static String TABLA_ATRIBUTO_COLUMNA_INICIO = "namest";
	/** TABLA_ATRIBUTO_COLUMNA_FIN */
	public final static String TABLA_ATRIBUTO_COLUMNA_FIN = "nameend";
	/** TABLA_ATRIBUTO_FILAS_COMBINADAS */
	public final static String TABLA_ATRIBUTO_FILAS_COMBINADAS = "morerows";
	/** TABLA_ATRIBUTO_ALINEACION_VERTICAL */
	public final static String TABLA_ATRIBUTO_ALINEACION_VERTICAL = "valign";
	/** TABLA_ATRIBUTO_ALINEACION_HORIZONTAL */
	public final static String TABLA_ATRIBUTO_ALINEACION_HORIZONTAL = "align";
	/** TABLA_ATRIBUTO_ANCHO_COLUMNA */
	public final static String TABLA_ATRIBUTO_ANCHO_COLUMNA = "colwidth";
	/** TABLA_ALINEACION_IZQ */
	public final static String TABLA_ALINEACION_IZQ = "left";
	/** TABLA_ALINEACION_DER */
	public final static String TABLA_ALINEACION_DER = "right";
	/** TABLA_ALINEACION_CENTRO */
	public final static String TABLA_ALINEACION_CENTRO = "center";
	/** TABLA_ALINEACION_JUSTIF */
	public final static String TABLA_ALINEACION_JUSTIF = "justify";
	/** TABLA_ALINEACION_SUPERIOR */
	public final static String TABLA_ALINEACION_SUPERIOR = "top";

	/** TABLA_ALINEACION_INFERIOR */
	public final static String TABLA_ALINEACION_INFERIOR = "bottom";

	/** TABLA_ALINEACION_MEDIO */
	public final static String TABLA_ALINEACION_MEDIO = "middle";

	/** The Constant RUTA_DETALLE_ANUNCIO. */
	public final static String RUTA_DETALLE_ANUNCIO = "//WEB-INF//classes//reportes//detalleAnuncio.jasper";

	/** The Constant RUTA_DETALLE_ANUNCIO_ORIGINAL. */
	public final static String RUTA_DETALLE_ANUNCIO_ORIGINAL = "//WEB-INF//classes//reportes//detalleAnuncioOriginal.jasper";

	/** The Constant RUTA_DETALLE_ANUNCIO_2. */
	// public final static String RUTA_DETALLE_ANUNCIO_2=
	// "//WEB-INF//classes//reportes//detalleAnuncio2.jasper";

	/** The Constant RUTA_INFORME_BUSQUEDA_ANUNCIOS_CONSEJERIA. */
	public final static String RUTA_INFORME_BUSQUEDA_ANUNCIOS_CONSEJERIA = "//WEB-INF//classes//reportes//busquedaAnuncios.jasper";

	/** The Constant RUTA_INFORME_BUZON_CONSEJERIA. */
	public final static String RUTA_INFORME_BUZON_CONSEJERIA = "//WEB-INF//classes//reportes//busquedaAnunciosBuzonConsejeria.jasper";

	/** The Constant RUTA_INFORME_ENVIO_ANUNCIOS_OAC. */
	public final static String RUTA_INFORME_ENVIO_ANUNCIOS_OAC = "//WEB-INF//classes//reportes//busquedaEnvioAnuncios.jasper";

	/** The Constant RUTA_INFORME_CORRECCIONES_ANUNCIOS. */
	public final static String RUTA_INFORME_CORRECCIONES_ANUNCIOS = "//WEB-INF//classes//reportes//busquedaCorrecciones.jasper";

	/** The Constant RUTA_INFORME_CORRECCIONES_ANUNCIOS_OAC. */
	public final static String RUTA_INFORME_CORRECCIONES_ANUNCIOS_OAC = "//WEB-INF//classes//reportes//busquedaCorreccionesOAC.jasper";

	/** The Constant RUTA_INFORME_BUSQUEDA_ANEXOS_CONSEJERIA. */
	public final static String RUTA_INFORME_BUSQUEDA_ANEXOS_CONSEJERIA = "//WEB-INF//classes//reportes//busquedaAnexos.jasper";

	/** The Constant RUTA_INFORME_BUSQUEDA_TERCEROS_CONSEJERIA. */
	public final static String RUTA_INFORME_BUSQUEDA_TERCEROS_CONSEJERIA = "//WEB-INF//classes//reportes//busquedaTerceros.jasper";

	/** The Constant RUTA_INFORME_BUSQUEDA_ANUNCIOS_PUBLICADOS. */
	public final static String RUTA_INFORME_BUSQUEDA_ANUNCIOS_PUBLICADOS = "//WEB-INF//classes//reportes//busquedaAnunciosPublicados.jasper";

	/** The Constant RUTA_INFORME_BUSQUEDA_ANUNCIOS_OAC. */
	public final static String RUTA_INFORME_BUSQUEDA_ANUNCIOS_OAC = "//WEB-INF//classes//reportes//busquedaAnunciosOAC.jasper";

	/** The Constant RUTA_INFORME_BUSQUEDA_ANEXOS_OAC. */
	public final static String RUTA_INFORME_BUSQUEDA_ANEXOS_OAC = "//WEB-INF//classes//reportes//busquedaAnexos.jasper";

	/** The Constant RUTA_INFORME_BUSQUEDA_TERCEROS_OAC. */
	public final static String RUTA_INFORME_BUSQUEDA_TERCEROS_OAC = "//WEB-INF//classes//reportes//busquedaTerceros.jasper";

	/** The Constant RUTA_INFORME_BUSQUEDA_TARIFAS_OAC. */
	public final static String RUTA_INFORME_BUSQUEDA_TARIFAS_OAC = "//WEB-INF//classes//reportes//busquedaTarifas.jasper";

	/** The Constant RUTA_INFORME_BUSQUEDA_RECEPCION_OAC. */
	public final static String RUTA_INFORME_BUSQUEDA_RECEPCION_OAC = "//WEB-INF//classes//reportes//busquedaRecepcion.jasper";

	/** The Constant RUTA_INFORME_BUSQUEDA_PAGOS_OAC. */
	public final static String RUTA_INFORME_BUSQUEDA_PAGOS_OAC = "//WEB-INF//classes//reportes//busquedaPagosTerceros.jasper";

	/** The Constant RUTA_INFORME_BUSQUEDA_SUJETOS_PASIVOS_OAC. */
	public final static String RUTA_INFORME_BUSQUEDA_SUJETOS_PASIVOS_OAC = "//WEB-INF//classes//reportes//busquedaSujetosPasivos.jasper";

	/** The Constant RUTA_INFORME_BUSQUEDA_PAGOS_SUJETO_PASIVO_OAC. */
	public final static String RUTA_INFORME_BUSQUEDA_PAGOS_SUJETO_PASIVO_OAC = "//WEB-INF//classes//reportes//busquedaPagosSujetoPasivo.jasper";

	/** The Constant RUTA_INFORME_BUSQUEDA_ANUNCIOS_SI_ARCHIVADOS. */
	public final static String RUTA_INFORME_BUSQUEDA_ANUNCIOS_SI_ARCHIVADOS = "//WEB-INF//classes//reportes//busquedaAnunciosSiArchivados.jasper";

	/** The Constant RUTA_INFORME_BUSQUEDA_ANUNCIOS_NO_ARCHIVADOS. */
	public final static String RUTA_INFORME_BUSQUEDA_ANUNCIOS_NO_ARCHIVADOS = "//WEB-INF//classes//reportes//busquedaAnunciosNoArchivados.jasper";

	/** The Constant RUTA_INFORME_BUSQUEDA_TERCEROS_ANUNCIOS_ARCHIVAR_OAC. */
	public final static String RUTA_INFORME_BUSQUEDA_TERCEROS_ANUNCIOS_ARCHIVAR_OAC = "//WEB-INF//classes//reportes//busquedaTercerosAnuArch.jasper";

	/** The Constant RUTA_INFORME_BUSQUEDA_ANUNCIOS_PAGOS_PENDIENTES. */
	public final static String RUTA_INFORME_BUSQUEDA_ANUNCIOS_PAGOS_PENDIENTES = "//WEB-INF//classes//reportes//busquedaAnunciosPendientePagoOAC.jasper";

	/** The Constant RUTA_INFORME_BUSQUEDA_TERCEROS_PAGOS_PENDIENTES. */
	public final static String RUTA_INFORME_BUSQUEDA_TERCEROS_PAGOS_PENDIENTES = "//WEB-INF//classes//reportes//busquedaTercerosAnuPagosPendientes.jasper";

	/** The Constant RUTA_INFORME_BUSQUEDA_ENTRADILLAS. */
	public final static String RUTA_INFORME_BUSQUEDA_ENTRADILLAS = "//WEB-INF//classes//reportes//busquedaEntradillas.jasper";

	/** The Constant RUTA_INFORME_BUSQUEDA_ENTRADILLAS_TIPO_ANUNCIO. */
	public final static String RUTA_INFORME_BUSQUEDA_ENTRADILLAS_TIPO_ANUNCIO = "//WEB-INF//classes//reportes//busquedaEntradillasTipoAnuncio.jasper";

	/** The Constant RUTA_INFORME_BUSQUEDA_USUARIOS. */
	public final static String RUTA_INFORME_BUSQUEDA_USUARIOS = "//WEB-INF//classes//reportes//busquedaUsuarios.jasper";

	/** The Constant RUTA_INFORME_BUSQUEDA_USUARIOS_NO_ASIGNADOS. */
	public final static String RUTA_INFORME_BUSQUEDA_USUARIOS_NO_ASIGNADOS = "//WEB-INF//classes//reportes//busquedaUsuariosNoAsignados.jasper";

	/** The Constant RUTA_INFORME_BUSQUEDA_ADMINISTRACIONES. */
	public final static String RUTA_INFORME_BUSQUEDA_ADMINISTRACIONES = "//WEB-INF//classes//reportes//busquedaAdministraciones.jasper";

	/** The Constant RUTA_INFORME_BUSQUEDA_ENTIDADES. */
	public final static String RUTA_INFORME_BUSQUEDA_ENTIDADES = "//WEB-INF//classes//reportes//busquedaEntidades.jasper";

	/** The Constant RUTA_INFORME_BUSQUEDA_SECCIONES. */
	public final static String RUTA_INFORME_BUSQUEDA_SECCIONES = "//WEB-INF//classes//reportes//busquedaSecciones.jasper";

	/** The Constant RUTA_INFORME_BUSQUEDA_SUBSECCIONES. */
	public final static String RUTA_INFORME_BUSQUEDA_SUBSECCIONES = "//WEB-INF//classes//reportes//busquedaSubsecciones.jasper";

	/** The Constant RUTA_INFORME_BUSQUEDA_TIPOS_ANUNCIO. */
	public final static String RUTA_INFORME_BUSQUEDA_TIPOS_ANUNCIO = "//WEB-INF//classes//reportes//busquedaTiposAnuncio.jasper";

	/** The Constant RUTA_INFORME_BUSQUEDA_TIPOS_ANUNCIO. */
	public final static String RUTA_INFORME_BUSQUEDA_EMISORES = "//WEB-INF//classes//reportes//busquedaEmisores.jasper";

	/** The Constant RUTA_INFORME_BUSQUEDA_ANEXOS_OAC. */
	public final static String RUTA_CARPETA_IMPRESION = "//WEB-INF//classes//reportes//carpetas.jasper";

	/** The Constant RUTA_NUEVO_ANUNCIO_IMPRESION. */
	public final static String RUTA_NUEVO_ANUNCIO_IMPRESION = "//WEB-INF//classes//reportes//nuevoAnuncio.jasper";

	/** The Constant RUTA_NUEVO_ANUNCIO_IMPRESION_PAG1_CON_FIRMA. */
	public final static String RUTA_NUEVO_ANUNCIO_IMPRESION_PAG1_CON_FIRMA = "//WEB-INF//classes//reportes//nuevoAnunciopag1ConFirma.jasper";

	/** The Constant RUTA_NUEVO_ANUNCIO_IMPRESION. */
	public final static String RUTA_NUEVO_ANUNCIO_IMPRESION_PAG1_SIN_FIRMA = "//WEB-INF//classes//reportes//nuevoAnunciopag1SinFirma.jasper";

	/** The Constant RUTA_NUEVO_ANUNCIO_IMPRESION_PAG1_CON_FIRMA_ORIGEN. */
	public final static String RUTA_NUEVO_ANUNCIO_IMPRESION_PAG1_CON_FIRMA_ORIGEN = "//WEB-INF//classes//reportes//nuevoAnunciopag1ConFirmaOrigen.jasper";

//	v.2.24
	/** The Constant RUTA_NUEVO_ANUNCIO_IMPRESION. */
	public final static String RUTA_NUEVO_ANUNCIO_IMPRESION_PAG2 = "//WEB-INF//classes//reportes//nuevoAnunciopag2OrigenConFirma.jasper";
	
	/** The Constant RUTA_NUEVO_ANUNCIO_IMPRESION_PAG2_ORIGEN_SIN_FIRMA. */
	public final static String RUTA_NUEVO_ANUNCIO_IMPRESION_PAG2_ORIGEN_SIN_FIRMA = "//WEB-INF//classes//reportes//nuevoAnunciopag2OrigenSinFirma.jasper";
	/** The Constant RUTA_NUEVO_ANUNCIO_IMPRESION_PAG2_ORIGEN. */
//	public final static String RUTA_NUEVO_ANUNCIO_IMPRESION_PAG2_ORIGEN = "//WEB-INF//classes//reportes//nuevoAnunciopag2OrigenF.jasper";
	public final static String RUTA_NUEVO_ANUNCIO_IMPRESION_PAG2_ORIGEN = "//WEB-INF//classes//reportes//nuevoAnunciopag2OrigenConFirma.jasper";


	/** The Constant RUTA_NUEVO_ANUNCIO_IMPRESION_PAG3_ORIGEN. */
	public final static String RUTA_NUEVO_ANUNCIO_IMPRESION_PAG3_ORIGEN = "//WEB-INF//classes//reportes//nuevoAnunciopag3Origen.jasper";

	/** The Constant RUTA_INFORME_BUSQUEDA_ORGANIZACIONES. */
	public final static String RUTA_INFORME_BUSQUEDA_ORGANIZACIONES = "//WEB-INF//classes//reportes//busquedaOrganizaciones.jasper";

	
	public final static int MAXIMO_BYTES_ABRIR = 10*1024*1024;
	
	/** The Constant RUTA_INFORME_BUSQUEDA_ORGANIZACIONES_ORDEN_PUBLICACION. */
	public final static String RUTA_INFORME_BUSQUEDA_ORGANIZACIONES_ORDEN_PUBLICACION = "//WEB-INF//classes//reportes//busquedaOrganizacionesOrdenPublicacion.jasper";

	/** The Constant RUTA_INFORME_BUSQUEDA_UNIDADES. */
	public final static String RUTA_INFORME_BUSQUEDA_UNIDADES = "//WEB-INF//classes//reportes//busquedaUnidades.jasper";

	/** The Constant RUTA_INFORME_BUSQUEDA_PAGOS_DIFERIDOS. */
	public final static String RUTA_INFORME_BUSQUEDA_PAGOS_DIFERIDOS = "//WEB-INF//classes//reportes//busquedaPagosDiferidos.jasper";

	/** The Constant RUTA_INFORME_BUSQUEDA_PAGOS_DIFERIDOS_TERCEROS. */
	public final static String RUTA_INFORME_BUSQUEDA_PAGOS_DIFERIDOS_TERCEROS = "//WEB-INF//classes//reportes//busquedaPagosDiferidosTerceros.jasper";

	/** The Constant RUTA_INFORME_BUSQUEDA_PAGOS_DIFERIDOS_LOTES. */
	public final static String RUTA_INFORME_BUSQUEDA_PAGOS_DIFERIDOS_LOTES = "//WEB-INF//classes//reportes//busquedaPagosDiferidosLotes.jasper";

	/** The Constant RUTA_INFORME_BUSQUEDA_PAGOS_PREVIOS. */
	public final static String RUTA_INFORME_BUSQUEDA_PAGOS_PREVIOS = "//WEB-INF//classes//reportes//busquedaPagosPrevios.jasper";

	/** The Constant RUTA_INFORME_BUSQUEDA_PAGOS_PREVIOS_TERCEROS. */
	public final static String RUTA_INFORME_BUSQUEDA_PAGOS_PREVIOS_TERCEROS = "//WEB-INF//classes//reportes//busquedaPagosPreviosTerceros.jasper";

	/** The Constant RUTA_INFORME_BUSQUEDA_PAGOS_PREVIOS_MODELOS. */
	public final static String RUTA_INFORME_BUSQUEDA_PAGOS_PREVIOS_MODELOS = "//WEB-INF//classes//reportes//busquedaPagosPreviosModelos.jasper";

	/** The Constant RUTA_INFORME_LISTADO_CORREOS_PAGO_PREVIO_OAC. */
	public final static String RUTA_INFORME_LISTADO_CORREOS_PAGO_PREVIO_OAC = "//WEB-INF//classes//reportes//listadoCorreosPagosPrevios.jasper";

	/** The Constant RUTA_INFORME_BUSQUEDA_LISTADO_CORREOS_PAGOS_PREVIOS_OAC */
	public final static String RUTA_INFORME_BUSQUEDA_LISTADO_CORREOS_PAGOS_PREVIOS_OAC = "//WEB-INF//classes//reportes//busquedaListadoCorreosPagosPrevios.jasper";

	/** The Constant RUTA_ACUSE_RECIBO_SOBRE__OAC */
	public final static String RUTA_ACUSE_RECIBO_SOBRE__OAC = "//WEB-INF//classes//reportes//acuseReciboDigitalPagoPrevio.jasper";

	/** The Constant RUTA_INFORME_CONSULTA_PAGOS_DIFERIDOS_OAC */
	public final static String RUTA_INFORME_CONSULTA_PAGOS_DIFERIDOS_OAC = "//WEB-INF//classes//reportes//consultaPagosDiferidos.jasper";

	/** The Constant RUTA_INFORME_BUSQUEDA_ANUNCIOS_CARPETA */
	public final static String RUTA_INFORME_BUSQUEDA_ANUNCIOS_CARPETA = "//WEB-INF//classes//reportes//busquedaAnunciosParaCarpeta.jasper";

	/** The Constant RUTA_INFORME_BOLETINES_NO_PUBLICADOS (Blanco y negro). */
	public final static String RUTA_INFORME_BOLETINES_NO_PUBLICADOS = "//WEB-INF//classes//reportes//busquedaBoletines.jasper";

	/** The Constant RUTA_INFORME_BUSQUEDA_ANUNCIOS_RECUPERACION */
	public final static String RUTA_INFORME_BUSQUEDA_ANUNCIOS_RECUPERACION = "//WEB-INF//classes//reportes//busquedaAnunciosRecuperacion.jasper";

	/** The Constant RUTA_INFORME_LISTADO_TAG */
	public final static String RUTA_INFORME_LISTADO_TAG = "//WEB-INF//classes//reportes//listadoTAG.jasper";

	/** The Constant RUTA_INFORME_ANUNCIOS_TAG_PENDIENTES_REVISION */
	public final static String RUTA_INFORME_ANUNCIOS_TAG_PENDIENTES_REVISION = "//WEB-INF//classes//reportes//listadoAnunciosRevisionTAG.jasper";

	/** The Constant RUTA_INFORME_BUSQUEDA_BOLETINES_NO_APROBADOS */
	public final static String RUTA_INFORME_BUSQUEDA_BOLETINES_NO_APROBADOS = "//WEB-INF//classes//reportes//busquedaBoletinesNoAprobados.jasper";

	/** The Constant RUTA_INFORME_BUSQUEDA_BOLETINES_EN_EDICION */
	public final static String RUTA_INFORME_BUSQUEDA_BOLETINES_EN_EDICION = "//WEB-INF//classes//reportes//busquedaBoletinesEnEdicion.jasper";

	/** The Constant RUTA_INFORME_BOLETINES_VALIDACION */
	public final static String RUTA_INFORME_BOLETINES_VALIDACION = "//WEB-INF//classes//reportes//busquedaBoletinesValidacion.jasper";

	/** The Constant RUTA_INFORME_BUSQUEDA_ANUNCIOS_REVISADOS */
	public final static String RUTA_INFORME_BUSQUEDA_ANUNCIOS_REVISADOS = "//WEB-INF//classes//reportes//busquedaAnunciosRevisados.jasper";

	/** The Constant RUTA_INFORME_BUSQUEDA_ANUNCIOS_APROBADOS */
	public final static String RUTA_INFORME_BUSQUEDA_ANUNCIOS_APROBADOS = "//WEB-INF//classes//reportes//busquedaAnunciosAprobados.jasper";

	/** The Constant RUTA_INFORME_LISTADO_ASIGNACION_ANUNCIOS */
	public final static String RUTA_INFORME_LISTADO_ASIGNACION_ANUNCIOS = "//WEB-INF//classes//reportes//listadoAsignacionAnuncios.jasper";

	/** The Constant RUTA_INFORME_LISTADO_ANUNCIOS_BOLETIN */
	public final static String RUTA_INFORME_LISTADO_ANUNCIOS_BOLETIN = "//WEB-INF//classes//reportes//listaAnunciosBoletin.jasper";

	/**
	 * The Constant
	 * RUTA_INFORME_BUSQUEDA_ANUNCIOS_JUSTIFICANTE_RECEPCION_CONSEJERIA.
	 */
	public final static String RUTA_INFORME_BUSQUEDA_ANUNCIOS_JUSTIFICANTE_RECEPCION_CONSEJERIA = "//WEB-INF//classes//reportes//busquedaAnunciosJustificanteRecepcion.jasper";

	/** The Constant RUTA_INFORME_BUSQUEDA_ANUNCIOS_JUSTIFICANTE_RECEPCION_OAC. */
	public final static String RUTA_INFORME_BUSQUEDA_ANUNCIOS_JUSTIFICANTE_RECEPCION_OAC = "//WEB-INF//classes//reportes//busquedaAnunciosJustificanteRecepcionOAC.jasper";

	/** The Constant RUTA_INFORME_BUSQUEDA_ANUNCIOS_ASIGNACION_BOLETIN. */
	public final static String RUTA_INFORME_BUSQUEDA_ANUNCIOS_ASIGNACION_BOLETIN = "//WEB-INF//classes//reportes//listadoAsignacionAnuncios.jasper";

	/** The Constant RUTA_INFORME_BUSQUEDA_ANUNCIOS_IMPRESION_BOLETIN. */
	public static final String RUTA_INFORME_BUSQUEDA_ANUNCIOS_IMPRESION_BOLETIN = "//WEB-INF//classes//reportes//busquedaAnunciosImpresionBoletin.jasper";

	/** The Constant RUTA_INFORME_BUSQUEDA_ANUNCIOS_FIN_IMPRESION_BOLETIN. */
	public static final String RUTA_INFORME_BUSQUEDA_ANUNCIOS_FIN_IMPRESION_BOLETIN = "//WEB-INF//classes//reportes//busquedaAnunciosFinImpresionBoletin.jasper";

	/** The Constant RUTA_INFORME_BUSQUEDA_ANUNCIOS_EN_BOLETIN_REVISION. */
	public final static String RUTA_INFORME_BUSQUEDA_ANUNCIOS_EN_BOLETIN_REVISION = "//WEB-INF//classes//reportes//busquedaAnunciosAsignacionTareasBoletin.jasper";

	/** The Constant RUTA_INFORME_PLANIFICACION_TECNICOS. */
	public final static String RUTA_INFORME_PLANIFICACION_TECNICOS = "//WEB-INF//classes//reportes//busquedaPlanificacionTecnico.jasper";

	/** The Constant RUTA_INFORME_CORRECCIONES_ASIGNADAS_TECNICO. */
	public final static String RUTA_INFORME_CORRECCIONES_ASIGNADAS_TECNICO = "//WEB-INF//classes//reportes//correccionesAsignadasTAG.jasper";

	/** The Constant RUTA_INFORME_MAQUETACIONES_ASIGNADAS_TECNICO. */
	public final static String RUTA_INFORME_MAQUETACIONES_ASIGNADAS_TECNICO = "//WEB-INF//classes//reportes//maquetacionesAsignadasTAG.jasper";

	/** The Constant RUTA_INFORME_REVISIONES_ASIGNADAS_TECNICO. */
	public final static String RUTA_INFORME_REVISIONES_ASIGNADAS_TECNICO = "//WEB-INF//classes//reportes//revisionesAsignadasTAG.jasper";

	/** The Constant RUTA_INFORME_BUSQUEDA_ANUNCIOS_IMPRENTA. */
	public final static String RUTA_INFORME_BUSQUEDA_ANUNCIOS_IMPRENTA = "//WEB-INF//classes//reportes//busquedaAnunciosImprenta.jasper";

	/** The Constant RUTA_INFORME_TRAZAS_ANUNCIO. */
	public final static String RUTA_INFORME_TRAZAS_ANUNCIO = "//WEB-INF//classes//reportes//listaTrazasAnuncios.jasper";

	/** The Constant RUTA_INFORME_BUSQUEDA_LOTES_CONSEJERIA. */
	public final static String RUTA_INFORME_BUSQUEDA_LOTES_CONSEJERIA = "//WEB-INF//classes//reportes//busquedaLotesConsejeria.jasper";

	/** The Constant RUTA_INFORME_BUSQUEDA_LOTES_OAC. */
	public final static String RUTA_INFORME_BUSQUEDA_LOTES_OAC = "//WEB-INF//classes//reportes//busquedaLotesOAC.jasper";

	/** The Constant RUTA_INFORME_BUSQUEDA_ANOTACIONES_CONSEJERIA. */
	public final static String RUTA_INFORME_BUSQUEDA_ANOTACIONES_CONSEJERIA = "//WEB-INF//classes//reportes//busquedaAnotacionesConsejeria.jasper";

	/** The Constant RUTA_INFORME_BUSQUEDA_ANOTACIONES_OAC. */
	public final static String RUTA_INFORME_BUSQUEDA_ANOTACIONES_OAC = "//WEB-INF//classes//reportes//busquedaAnotacionesOAC.jasper";

	/** The Constant RUTA_INFORME_CONSULTA_CALCULO_TASAS. */
	public final static String RUTA_INFORME_CONSULTA_CALCULO_TASAS = "//WEB-INF//classes//reportes//consultaCalculoTasas.jasper";

	/** The Constant RUTA_INFORME_BUSQUEDA_ANUNCIOS_BOLETIN_MAQUETACION. */
	public final static String RUTA_INFORME_BUSQUEDA_ANUNCIOS_BOLETIN_MAQUETACION = "//WEB-INF//classes//reportes//busquedaAnunciosBoletinMaquetacion.jasper";

	/** The Constant RUTA_INFORME_REABRIR_ANUNCIOS. */
	public final static String RUTA_INFORME_REABRIR_ANUNCIOS = "//WEB-INF//classes//reportes//busquedaReabrirAnuncios.jasper";

	/** The Constant RUTA_INFORME_ANUNCIOS_PROTEGER. */
	public final static String RUTA_INFORME_ANUNCIOS_PROTEGER = "//WEB-INF//classes//reportes//busquedaAnunciosNoProtegidosLOPD.jasper";

	/** The Constant RUTA_INFORME_BOLETINES_PUBLICADOS. */
	public final static String RUTA_INFORME_BOLETINES_PUBLICADOS = "//WEB-INF//classes//reportes//busquedaBoletinesPublicados.jasper";

	/** The Constant RUTA_INFORME_ANUNCIOS_BORRAR. */
	public final static String RUTA_INFORME_ANUNCIOS_BORRAR = "//WEB-INF//classes//reportes//busquedaAnunciosParaBorrado.jasper";

	/** The Constant RUTA_INFORME_PARAMETROS. */
	public final static String RUTA_INFORME_PARAMETROS = "//WEB-INF//classes//reportes//busquedaParametros.jasper";

	/** The Constant RUTA_INFORME_MATERIAS. */
	public final static String RUTA_INFORME_MATERIAS = "//WEB-INF//classes//reportes//busquedaMaterias.jasper";

	/** The Constant RUTA_INFORME_CONTROL_BOLETINES. */
	public final static String RUTA_INFORME_CONTROL_BOLETINES = "//WEB-INF//classes//reportes//busquedaControlBoletinesTextosAutonomicos.jasper";

	/** The Constant RUTA_INFORME_ASIGNACION_MATERIAS_ANUNCIOS. */
	public final static String RUTA_INFORME_ASIGNACION_MATERIAS_ANUNCIOS = "//WEB-INF//classes//reportes//asignacionMateriasAnuncios.jasper";

	/** The Constant RUTA_INFORME_BUSQUEDA_LOTES. */
	public final static String RUTA_INFORME_BUSQUEDA_LOTES = "//WEB-INF//classes//reportes//busquedaLotes.jasper";

	/** The Constant RUTA_INFORME_BUSQUEDA_ANEXOS_CONTENIDO_BOCES. */
	public final static String RUTA_INFORME_BUSQUEDA_ANEXOS_CONTENIDO_BOCES = "//WEB-INF//classes//reportes//busquedaAnexosContenidoBoces.jasper";

	/** The Constant RUTA_INFORME_BUSQUEDA_REGENERAR_BOLETINES_CORREGIR. */
	public final static String RUTA_INFORME_BUSQUEDA_REGENERAR_BOLETINES_CORREGIR = "//WEB-INF//classes//reportes//busquedaRegenerarBoletinesCorregir.jasper";

	/** The Constant RUTA_XSD_VALIDACION_BOLETIN. */
	public final static String RUTA_XSD_VALIDACION_BOLETIN = "//WEB-INF//classes//plantillas//formatoBoletin.xsd";

	/** The Constant RUTA_LOGOTIPO_CARPETA. */
	public final static String RUTA_LOGOTIPO_CARPETA = "//imagenes//logoBoc.jpg";

	/** The Constant RUTA_LOGOTIPO_SOLO. */
	public final static String RUTA_LOGOTIPO_SOLO = "//imagenes//logo_gob_solo.jpeg";

	/** The Constant RUTA_LOGOTIPO_MAPA. */
	public final static String RUTA_LOGOTIPO_MAPA = "//imagenes//mapa_Cantabria.jpg";

	/** The Constant RUTA_IMAGEN_LOGO. */
	public final static String RUTA_IMAGEN_LOGO = "//imagenes//logo_gob.gif";

	/** The Constant RUTA_IMAGEN_LOGO_SIN_FONDO. */
	public final static String RUTA_IMAGEN_LOGO_SIN_FONDO = "//imagenes//logoBocNuevoAnuncio.gif";

	/** The Constant RUTA_IMAGEN_LOGO_BOC_BN (Blanco y negro). */
	public static final String RUTA_IMAGEN_LOGO_BOC_BN = "//imagenes//logoBocNuevoAnuncio.gif";

	/** The Constant RUTA_IMAGEN_LOGO_BN (Blanco y negro). */
	public static final String RUTA_IMAGEN_LOGO_BN = "//imagenes//logoBocNuevoAnuncio_BN.gif";

	/** The Constant RUTA_IMAGEN_LOGO_CRUZ_BN (Blanco y negro). */
	public static final String RUTA_IMAGEN_LOGO_CRUZ_BN = "//imagenes//logoBocNuevoAnuncio_BN.gif";

	/** The Constant RUTA_IMAGEN_FRANQUEO_PAGADO */
	public final static String RUTA_IMAGEN_FRANQUEO_PAGADO = "//imagenes//FRANQUEO_PAGADO_Cantabria.jpg";

	/** The Constant RUTA_IMAGEN_SELLO_REGISTRO_CON_FIRMA. */
	public static final String RUTA_IMAGEN_SELLO_REGISTRO_CON_FIRMA = "//imagenes//SelloRegistroTelematico_OPECAN.jpg";

	/** The Constant RUTA_IMAGEN_SELLO_REGISTRO_SIN_FIRMA. */
	public static final String RUTA_IMAGEN_SELLO_REGISTRO_SIN_FIRMA = "//imagenes//logoSelloRegistroSinFirma.jpg";

	/** The Constant CRITERIOS_BUSQUEDA. */
	public final static String CRITERIOS_BUSQUEDA = "criteriosBusqueda";

	/** The Constant CRITERIOS_BUSQUEDA_AUX_CORRECCIONES. */
	public final static String CRITERIOS_BUSQUEDA_AUX_CORRECCIONES = "criteriosBusquedaAuxCorreccion";

	/** The Constant CRITERIOS_BUSQUEDA_AUX_ANUNCIO_PUB. */
	public final static String CRITERIOS_BUSQUEDA_AUX_ANUNCIO_PUB = "criteriosBusquedaAuxAnunPub";

	/** The Constant CRITERIOS_BUSQUEDA_ANEXOS. */
	public final static String CRITERIOS_BUSQUEDA_AUX_ANUNCIOS = "criteriosBusquedaAuxAnuncios";

	/** The Constant CRITERIOS_BUSQUEDA_AUX_TARIFAS. */
	public final static String CRITERIOS_BUSQUEDA_AUX_TARIFAS = "criteriosBusquedaAuxTarifas";

	/** The Constant CRITERIOS_BUSQUEDA_AUX_ENTRADILLAS. */
	public final static String CRITERIOS_BUSQUEDA_AUX_ENTRADILLAS = "criteriosBusquedaAuxEntradillas";

	/** The Constant CRITERIOS_BUSQUEDA_ANUNCIO_SECCION. */
	public final static String CRITERIOS_BUSQUEDA_ANUNCIO_SECCION = "criteriosBusquedaAnuncioSeccion";

	/** The Constant CRITERIOS_BUSQUEDA_ANUNCIO_SUBSECCION. */
	public final static String CRITERIOS_BUSQUEDA_ANUNCIO_SUBSECCION = "criteriosBusquedaAnuncioSubseccion";
	
	
	
	/*Literales vista boletin*/
	public final static String LITERAL_BOC = "Boletín Oficial de Cantabria: ";
	public final static String LITERAL_TIPO_BOC_ORD = ", ORD. Núm. ";
	public final static String LITERAL_TIPO_BOC_EXT = ", EXT. Núm. ";
	
	/* Constantes de estados COMPROBAR SI SE USAN Y SINO BORRAR */

	/** The Constant ESTADO_PENDIENTE_ENVIO_OAC. */
	public final static Integer ESTADO_PENDIENTE_ENVIO_OAC = 1;

	/** The Constant ESTADO_DEVUELTO_DESDE_OAC. */
	public final static Integer ESTADO_DEVUELTO_DESDE_OAC = 2;

	/** The Constant ESTADO_ENVIADO_OAC. */
	public final static Integer ESTADO_ENVIADO_OAC = 3;

	/** The Constant ESTADO_APROBADO. */
	public final static Integer ESTADO_APROBADO = 4;

	/************************/

	/** The Constant ELEMENTO_ENTRADILLA_ANUNCIO. */
	public final static Integer ELEMENTO_ENTRADILLA_ANUNCIO = Integer
			.valueOf("1");

	/** The Constant ELEMENTO_NOMBRE_ANEXO. */

	public final static Integer ELEMENTO_NOMBRE_ANEXO = Integer.valueOf("2");

	/** The Constant ELEMENTO_RAZSOC_TERCERO. */
	public final static Integer ELEMENTO_RAZSOC_TERCERO = Integer.valueOf("3");

	/** The Constant ELEMENTO_ENTRADILLA. */
	public final static Integer ELEMENTO_ENTRADILLA = Integer.valueOf("4");

	/** The Constant ELEMENTO_DESCRIP_LOTE. */
	public final static Integer ELEMENTO_DESCRIP_LOTE = Integer.valueOf("5");

	/** The Constant LONGITUD_MAX_DESCRIP_LOTE. */
	public final static Integer LONGITUD_MAX_DESCRIP_LOTE = Integer
			.valueOf("150");

	/** The Constant LONGITUD_MAX_ENRTADILLA. */
	public final static Integer LONGITUD_MAX_ENTRADILLA = Integer
			.valueOf("499");

	/** The Constant LONGITUD_MAX_NOMBRE_ANEXO. */
	public final static Integer LONGITUD_MAX_NOMBRE_ANEXO = Integer
			.valueOf("254");

	/** The Constant LONGITUD_MAX_RAZSOC_TERCERO. */
	public final static Integer LONGITUD_MAX_RAZSOC_TERCERO = Integer
			.valueOf("254");

	/** The Constant LONGITUD_MIN_RAZSOC_TERCERO. */
	public final static Integer LONGITUD_MIN_RAZSOC_TERCERO = Integer
			.valueOf("3");

	/** The Constant LONGITUD_MAX_DESCRIPCION_NORMAS. */
	public final static Integer LONGITUD_MAX_DESCRIPCION_NORMAS = Integer
			.valueOf("255");

	/** The Constant LONGITUD_MIN_DIVISION. */
	public final static Integer LONGITUD_MIN_DIVISION = Integer.valueOf("100");

	/** The Constant LONGITUD_DIVISION_ENTRADILLA. */
	public final static Integer LONGITUD_DIVISION_ENTRADILLA = Integer
			.valueOf("150");

	/** The Constant LONGITUD_MAX_TEXTAREA. */
	public final static Integer LONGITUD_MAX_TEXTAREA = Integer.valueOf("750");

	/** The Constant LONGITUD_MAX_DESCRIPCION047. */
	public final static Integer LONGITUD_MAX_DESCRIPCION047 = Integer
			.valueOf("60");

	/** The Constant INCREMENTO_COD_SECCIONES. */
	public final static Integer INCREMENTO_COD_SECCIONES = Integer
			.valueOf("10");

	/** The Constant NUM_MAXIMO_SECCION. */
	public final static Integer NUM_MAXIMO_IDSECCION = Integer.valueOf("99999");

	/** The Constant NUM_MAXIMO_SECCION. */
	public final static Integer NUM_MAXIMO_IDSUBSECCION = Integer
			.valueOf("99999");

	/** The Constant INCREMENTO_COD_UNIDAD. */
	public final static Integer INCREMENTO_COD_UNIDAD = Integer.valueOf("5");

	/** The Constant SIN_ELEMENTOS_SELECCIONADOS. */
	public final static Integer SIN_ELEMENTOS_SELECCIONADOS = Integer
			.valueOf("-1");

	/** The Constant VALOR_POR_DEFECTO_COMBOS_SIN_SELECCION. */
	public final static Integer VALOR_POR_DEFECTO_COMBOS_SIN_SELECCION = Integer
			.valueOf("-1");

	public final static String PROPERTIES_CORREO = "correo.properties";

	public final static String SIMBOLO_EURO = "e";

	/** VALIDACION DE LETRA DEL DNI **/
	public static String NIF_STRING_ASOCIATION = "TRWAGMYFPDXBNJZSQVHLCKET";

	public static String PARTE_MODIFICABLE_ENTRADILLA = "(XXXX)";

	// ESTADOS DEL ANUNCIO PARA BLOQUEO-DESBLOQUEO
	/** TEXTO_ACCESIBLE */
	public final static int TEXTO_ACCESIBLE = 1;

	/** ERROR_TEXTO_OCUPADO */
	public final static int ERROR_TEXTO_OCUPADO = -4;

	/** ERROR_TEXTO_ELIMINADO */
	public final static int ERROR_TEXTO_ELIMINADO = -1;

	/** ERROR_ESTADO_MODIFICADO */
	public final static int ERROR_ESTADO_MODIFICADO = -2;

	/** ERROR_ASIGNANDO A BOLETIN */
	public final static int ERROR_ASIGNANDO_A_BOLETIN = -3;

	/** ID_GRUPO */
	public final static String ID_GRUPO = "idGrupo";

	/** ORGANIZACION_ESPECIAL */
	public final static Integer ORGANIZACION_ESPECIAL = Integer.valueOf("1");

	/** NO_ORGANIZACION_ESPECIAL */
	public final static Integer NO_ORGANIZACION_ESPECIAL = Integer.valueOf("0");

	/** EMITE_A NOMBRE_ORG_ESPECIAL */
	public final static Integer EMITE_A_NOMBRE_ORG_ESPECIAL = Integer
			.valueOf("1");

	/** NO_EMITE_A_NOMBRE_ORG_ESPECIAL */
	public final static Integer NO_EMITE_A_NOMBRE_ORG_ESPECIAL = Integer
			.valueOf("0");

	/** The Constant ADMINISTRACION_VIGENTE. */
	public final static Integer ADMINISTRACION_VIGENTE = Integer.valueOf("1");

	/** The Constant ADMINISTRACION_NO_VIGENTE. */
	public final static Integer ADMINISTRACION_NO_VIGENTE = Integer
			.valueOf("0");

	/** The Constant ADMINISTRACION_PARTICULARES. */
	public final static Integer ADMINISTRACION_PARTICULARES = Integer
			.valueOf("26");

	/** The Constant REGPROC_PERSONAS_FISICAS. */
	public final static Integer REGPROC_PERSONAS_FISICAS = Integer.valueOf("7");

	/** The Constant REGPROC_PERSONAS_JURIDICAS. */
	public final static Integer REGPROC_PERSONAS_JURIDICAS = Integer
			.valueOf("8");

	/** The Constant ENTIDAD_VIGENTE. */
	public final static Integer ENTIDAD_VIGENTE = Integer.valueOf("1");

	/** The Constant ENTIDAD_NO_VIGENTE. */
	public final static Integer ENTIDAD_NO_VIGENTE = Integer.valueOf("0");

	/** The Constant ORGANIZACION_VIGENTE. */
	public final static Integer ORGANIZACION_VIGENTE = Integer.valueOf("1");

	/** The Constant ENTIDAD_NO_VIGENTE. */
	public final static Integer ORGANIZACION_NO_VIGENTE = Integer.valueOf("0");

	/** The Constant UNIDAD_VIGENTE. */
	public final static Integer UNIDAD_VIGENTE = Integer.valueOf("1");

	/** The Constant UNIDAD_NO_VIGENTE. */
	public final static Integer UNIDAD_NO_VIGENTE = Integer.valueOf("0");

	/** The Constant VIGENTE. */
	public final static Integer VIGENTE = Integer.valueOf("1");

	/** The Constant NO_VIGENTE. */
	public final static Integer NO_VIGENTE = Integer.valueOf("0");

	/** The Constant VALIDO. */
	public final static Integer VALIDO = Integer.valueOf("1");

	/** The Constant NO_VALIDO. */
	public final static Integer NO_VALIDO = Integer.valueOf("0");

	/** The Constant IMPRESO. */
	public final static Integer IMPRESO = Integer.valueOf("1");

	/** The Constant NO_IMPRESO. */
	public final static Integer NO_IMPRESO = Integer.valueOf("0");

	// Constantes para estados de Boletines
	/** The Constant BOL_PENDIENTE_REVISION. */
	public final static Integer BOL_PENDIENTE_REVISION = Integer.valueOf("1");

	/** The Constant BOL_APROBADO_MAQUETACION. */
	public final static Integer BOL_APROBADO_MAQUETACION = Integer.valueOf("2");

	/** The Constant BOL_EN_MAQUETACION. */
	public final static Integer BOL_EN_MAQUETACION = Integer.valueOf("3");

	/** The Constant BOL_PENDIENTE_PUBLICACION. */
	public final static Integer BOL_PENDIENTE_PUBLICACION = Integer
			.valueOf("4");

	/** The Constant BOL_PUBLICADO. */
	public final static Integer BOL_PUBLICADO = Integer.valueOf("5");

	/** The Constant BOL_FIRMADO_PENDIENTE_PUBLICACION. */
	public final static Integer BOL_FIRMADO_PENDIENTE_PUBLICACION = Integer
			.valueOf("6");

	/** The Constant BOL_REALIZANDO_PUBLICACION. */
	public final static Integer BOL_REALIZANDO_PUBLICACION = Integer
			.valueOf("7");

	/** The Constant IVA_. */


	/** The Constant IVA_PORCENTAJE. */


	/** The Constant FECHA_DEVENGO_2010. */
	public static String FECHA_DEVENGO_2010 = "01/01/2010";

	/** The Constant FECHA_COMIENZO_2011. */
	public static String FECHA_COMIENZO_2011 = "01/01/2011";

	/** The Constant RUTA_IMAGEN_LOGO_046. */
	public final static String RUTA_IMAGEN_LOGO_046 = "//imagenes//logoPDF.gif";

	/** The Constant RUTA_MODELO_046. */
	public final static String RUTA_MODELO_046 = "//WEB-INF//classes//reportes//Modelo046.jasper";

	/** The Constant 046_GENERACION_MANUAL. */
	public final static Integer GENERACION_MANUAL_046 = 1;

	/** The Constant 046_GENERACION_MASIVA. */
	public final static Integer GENERACION_MASIVA_046 = 2;

	/** The Constant CASILLA 19 046. */
	public final static String CASILLA_19_046 = "BOLETÍN OFICIAL CANTABRIA";

	/** The Constant CASILLA 24 046. */
	public final static String CASILLA_24_046 = "TASA BOLETÍN OFICIAL DE CANTABRIA.  ANUNCIOS E INSERCIONES";

	/** The Constant EJEMPLAR_CLIENTE. */
	public final static String EJEMPLAR_CLIENTE = "CARTA DE PAGO";
	public final static String EJEMPLAR_CLIENTE_2 = "(EJEMPLAR PARA EL INTERESADO)";

	/** The Constant CASILLA 24 046. */
	public final static String EJEMPLAR_BANCO = "TALON DE CARGO";
	public final static String EJEMPLAR_BANCO_2 = "(EJEMPLAR PARA LA ENTIDAD BANCARIA)";

	/** The Constant CASILLA 24 046. */
	public final static String EJEMPLAR_OAC = "EJEMPLAR PARA OTRAS ADMINISTRACIONES";
	public final static String EJEMPLAR_OAC_2 = "";

	/** The Constant LISTADO_ENTIDADES_BANCARIAS. */
	public final static String LISTADO_ENTIDADES_BANCARIAS = "BANCO POPULAR, BANESTO, BANKINTER, BARCLAYS, BBVA, CAJA CANTABRIA, CAJA MADRID, LA CAIXA, SANTANDER.";

	/** The Constant MOURO_047_CODIGO_PENDIENTE */
	public final static String MOURO_047_CODIGO_PENDIENTE = "PE";

	/** The Constant MOURO_047_CODIGO_ERROR */
	public final static String MOURO_047_CODIGO_ERROR = "ER";

	/** The Constant MOURO_047_CODIGO_FALLIDO */
	public final static String MOURO_047_CODIGO_FALLIDO = "FA";

	/** The Constant MOURO_047_CODIGO_PROCESADO */
	public final static String MOURO_047_CODIGO_PROCESADO = "PR";

	/** The Constant MOURO_047_CODIGO_NO_PROCESADO */
	public final static String MOURO_047_CODIGO_NO_PROCESADO = "NP";

	/** The Constant MOURO_047_CODIGO_CORRECTO */
	public final static String MOURO_047_CODIGO_CORRECTO = "OK";

	/** The Constant MOURO_047_CODIGO_REGISTRO_NO_ENCONTRADO */
	public final static String MOURO_047_CODIGO_REGISTRO_NO_ENCONTRADO = "NE";

	/** The Constant ESTADO_CODIGO_PENDIENTE */
	public final static String ESTADO_CODIGO_PENDIENTE = "Pendiente";

	/** The Constant ESTADO_CODIGO_ERROR */
	public final static String ESTADO_CODIGO_ERROR = "Error";

	/** The Constant ESTADO_CODIGO_FALLIDO */
	public final static String ESTADO_CODIGO_FALLIDO = "Fallido";

	/** The Constant ESTADO_CODIGO_PROCESADO */
	public final static String ESTADO_CODIGO_PROCESADO = "Procesado";

	/** The Constant ESTADO_CODIGO_NO_PROCESADO */
	public final static String ESTADO_CODIGO_NO_PROCESADO = "No Procesado";

	/** The Constant ESTADO_CODIGO_CORRECTO */
	public final static String ESTADO_CODIGO_CORRECTO = "Correcto";

	/** The Constant ESTADO_CODIGO_REGISTRO_NO_ENCONTRADO */
	public final static String ESTADO_CODIGO_REGISTRO_NO_ENCONTRADO = "No Encontrado";

	/** The Constant NUMERO_DE_TASA047 */
	public final static String NUMERO_DE_TASA047 = "047";

	/** The Constant NO_PAGO_AUTOMATICO. */
	public final static Integer NO_PAGO_AUTOMATICO = Integer.valueOf("0");

	/** The Constant PAGO_AUTOMATICO. */
	public final static Integer PAGO_AUTOMATICO = Integer.valueOf("1");

	/** The Constant PAGO_PRESENCIAL. */
	public final static Integer PAGO_PRESENCIAL = Integer.valueOf("2");

	/** The Constant NO_PROTEGIDO_LOPD. */
	public final static boolean NO_PROTEGIDO_LOPD = false;

	/** The Constant PROTEGIDO_LOPD. */
	public final static boolean PROTEGIDO_LOPD = true;

	// TIPOS DE BOLETINES

	/** The Constant BOL_ORDINARIO. */
	public final static Integer BOL_ORDINARIO = Integer.valueOf("0");

	/** The Constant BOL_EXTRAORDINARIO. */
	public final static Integer BOL_EXTRAORDINARIO = Integer.valueOf("1");

	/** The Constant BOL_ORDINARIO. */
	public final static String BOL_ORDINARIO_STRING = "Ordinario";

	/** The Constant BOL_EXTRAORDINARIO. */
	public final static String BOL_EXTRAORDINARIO_STRING = "Extraordinario";

	// GESTION DE TAREAS A BOLETINES

	/** The Constant TIEMPO_LIMITE_ASIGNACION_LECTURA 10 dias en milisegundos */
	public final static long TIEMPO_LIMITE_ASIGNACION_LECTURA = Long
			.valueOf("864000000");

	/**
	 * The Constant TIEMPO_LIMITE_ASIGNACION_MAQUETACION 10 dias en milisegundos
	 */
	public final static long TIEMPO_LIMITE_ASIGNACION_MAQUETACION = Long
			.valueOf("864000000");

	/**
	 * The Constant TIEMPO_LIMITE_ASIGNACION_REVISION_ANUNCIOS 7 dias en
	 * segundos
	 */
	public final static long TIEMPO_LIMITE_ASIGNACION_REVISION_ANUNCIOS = 7
			* 24 * 60 * 60 * 1000;// Long.valueOf("604800000");

	/** The Constant LITERAL_NUEVA_TAREA_ASIGNADA_MAQUETACION */
	public final static String LITERAL_NUEVA_TAREA_ASIGNADA_MAQUETACION = "Asignación de un nuevo boletín para maquetar";

	/** The Constant LITERAL_NUEVA_TAREA_ASIGNADA_LECTURA */
	public final static String LITERAL_NUEVA_TAREA_ASIGNADA_LECTURA = "Asignación de un nuevo boletín para leer";

	/** The Constant LITERAL_NUEVA_TAREA_ASIGNADA_REVISION_ANUNCIO del Boletin */
	public final static String LITERAL_NUEVA_TAREA_ASIGNADA_REVISION_ANUNCIO = "Asignación de un nuevo anuncio para revisión";

	/** The Constant REMITENTE_MAIL_ASIGNACION_BOLETINES_TAG */
	public final static String REMITENTE_MAIL_ASIGNACION_BOLETINES_TAG = "boc@euro-help.es";

	/** The Constant REMITENTE_MAIL_NOTIFICACION_RECUPERACION_ANUNCIO */
	public final static String REMITENTE_MAIL_NOTIFICACION_RECUPERACION_ANUNCIO = "boc@euro-help.es";

	/** The Constant REMITENTE_MAIL_ASIGNACION_REVISIONES_ANUNCIOS_TAG */
	public final static String REMITENTE_MAIL_ASIGNACION_REVISIONES_ANUNCIOS_TAG = "boc@euro-help.es";

	// TIPOS DE TRABAJOS

	/** The Constant TIPO_TRABAJO_BAJA. */
	public static final Integer TIPO_TRABAJO_BAJA = Integer.valueOf("1");

	/** The Constant TIPO_TRABAJO_LECTURA */
	public final static Integer TIPO_TRABAJO_LECTURA = Integer.valueOf("2");

	/** The Constant TIPO_TRABAJO_MAQUETACION */
	public final static Integer TIPO_TRABAJO_MAQUETACION = Integer.valueOf("3");

	/** The Constant TIPO_TRABAJO_REVISION */
	public final static Integer TIPO_TRABAJO_REVISION = Integer.valueOf("4");

	/** The Constant TIPO_TRABAJO_VACACIONES. */
	public static final Integer TIPO_TRABAJO_VACACIONES = Integer.valueOf("5");

	/** The Constant TIPO_TRABAJO_OTROS. */
	public static final Integer TIPO_TRABAJO_OTROS = Integer.valueOf("6");

	/** The Constant REQUIERE_REPRESENTANTE. */
	public final static Integer REQUIERE_REPRESENTANTE = Integer.valueOf("1");

	/** The Constant NO_REQUIERE_REPRESENTANTE. */
	public final static Integer NO_REQUIERE_REPRESENTANTE = Integer
			.valueOf("0");

	// ROLES DE USUARIO EN EL LDAP
	public final static String ROL_USUARIO_CONSEJERIA = "ROLE_CONSEJERIA";
	public final static String ROL_USUARIO_OAC = "ROLE_OAC";
	public final static String ROL_USUARIO_IMPRENTA = "ROLE_IMPRENTA";
	public final static String ROL_USUARIO_TAG = "ROLE_TAG";
	public final static String ROL_USUARIO_ADMINISTRADOR = "ROLE_ADMINISTRADOR";
	public final static String ROL_USUARIO_RESPONSABLEIMPRENTA_TAG = "ROLE_RESPONSABLEIMPRENTA_TAG";
	public final static String ROL_USUARIO_BASICO = "ROLE_BASICO";
	public final static String ROL_USUARIO_SECRETARIO = "ROLE_SECRETARIO";

	// OPERACIONES

	/** The Constant CAMBIO SECCION . */
	public static final Integer INSERCION = Integer.valueOf("1");

	/** The Constant DESASIGNACION - . */
	public static final Integer DESASIGNACION = Integer.valueOf("-1");

	/** The Constant TITULO_MAQUETA_SUMARIO. */
	public final static String TITULO_MAQUETA_SUMARIO = "SUMARIO";

	/** The Constant TITULO_MAQUETA_SUMARIO. */
	public final static String TITULO_MAQUETA_TOTAL = "TOTAL";

	// TIPOS DOCUMENTOS DE IDENTIDAD PARA TERCEROS
	/** The Constant DOCUMENTO_NIF. */
	public final static Integer DOCUMENTO_NIF = Integer.valueOf("1");

	/** The Constant DOCUMENTO_PASAPORTE. */
	public final static Integer DOCUMENTO_PASAPORTE = Integer.valueOf("2");

	/** The Constant DOCUMENTO_NIE. */
	public final static Integer DOCUMENTO_NIE = Integer.valueOf("3");

	/** The Constant DOCUMENTO_CIF. */
	public final static Integer DOCUMENTO_CIF = Integer.valueOf("4");

	// TIPOS DE DOMICILIOS PARA TERCEROS

	/** The Constant TIPODOMICILIO_TODOS. */
	public final static String TIPODOMICILIO_TODOS = "T";

	/** The Constant TIPODOMICILIO_FISCAL. */
	public final static String TIPODOMICILIO_FISCAL = "F";

	/** The Constant ANEXO_ASPOSE. */
	public final static Integer ANEXO_ASPOSE = Integer.valueOf("1");

	/** The Constant ANEXO_NO_ASPOSE. */
	public final static Integer ANEXO_NO_ASPOSE = Integer.valueOf("0");

	// Constantes para anuncios OAC y Consejeria
	/** The Constant REQUIERE_DESCRIPCION. */
	public final static Integer REQUIERE_DESCRIPCION = Integer.valueOf("1");

	/** The Constant NO_REQUIERE_DESCRIPCION. */
	public final static Integer NO_REQUIERE_DESCRIPCION = Integer.valueOf("0");

	/** The Constant DESIERTO. */
	public final static Integer DESIERTO = Integer.valueOf("0");

	/** The Constant NO_DESIERTO. */
	public final static Integer NO_DESIERTO = Integer.valueOf("1");

	/** The Constant DEVOLUCION. */
	public final static Integer DEVOLUCION = Integer.valueOf("0");

	/** The Constant RECUPERACION. */
	public final static Integer RECUPERACION = Integer.valueOf("1");

	/** The Constant SIN_MATERIA. */
	public final static Integer SIN_MATERIA = Integer.valueOf("0");

	/** The Constant ANUNCIO_CON_PARTES. */
	public final static Integer ANUNCIO_CON_PARTES = Integer.valueOf("9");

	// ruta a los informes XSL
	/** The Constant RUTA_XSL_PLANTILLA. */
	// public final static String RUTA_XSL_PLANTILLA =
	// "../resources/plantillas/";
	public final static String RUTA_XSL_PLANTILLA = "//WEB-INF//classes//plantillas//";
	//	public final static String RUTA_XSL_PLANTILLA = "/WEB-INF/classes/plantillas/";

	/** The Constant NUMERO_CARACTERES_POR_PAGINA_WORD. */
	public static final Integer NUMERO_CARACTERES_POR_PAGINA_WORD = Integer
			.valueOf("4000");
	/** The Constant RUTA_LICENCIA_ASPOSE. */
	public final static String RUTA_LICENCIA_ASPOSE = "//WEB-INF//classes//Aspose.Words.lic";
	/** The Constant BOLETIN_DEVUELTO. */
	public final static Integer BOLETIN_DEVUELTO = 1;

	/** The Constant RAZON_SOCIAL_OAC. */
	public static final String RAZON_SOCIAL_OAC = "Oficina de Atención a la Cidadanía";// "Oficina de Atención del Consumidor";

	// Causas de archivo de un anuncio
	/** The Constant CAUSA_ARCHIVO_DIFERIDO_PUBLICADO. */
	public final static Integer CAUSA_ARCHIVO_DIFERIDO_PUBLICADO = Integer
			.valueOf("1");

	/** The Constant CAUSA_ARCHIVO_PUBLICACION_EN_BOLETIN. */
	public final static Integer CAUSA_ARCHIVO_PUBLICACION_EN_BOLETIN = Integer
			.valueOf("2");

	/** The Constant CAUSA_ARCHIVO_ARCHIVADO_SIN_PUBLICAR. */
	public final static Integer CAUSA_ARCHIVO_ARCHIVADO_SIN_PUBLICAR = Integer
			.valueOf("3");

	/** The Constant CAUSA_ARCHIVO_DESISTIDO. */
	public final static Integer CAUSA_ARCHIVO_DESISTIDO = Integer.valueOf("4");

	/** The Constant CAUSA_ARCHIVO_DESESTIMADO. */
	public final static Integer CAUSA_ARCHIVO_DESESTIMADO = Integer
			.valueOf("5");

	/** The Constant CAUSA_ARCHIVO_OTRAS_CAUSAS. */
	public final static Integer CAUSA_ARCHIVO_OTRAS_CAUSAS = Integer
			.valueOf("6");

	// OPERACIONES SOBRE LOS ANUNCIOS PARA TRAZAS DE ANUNCIOS
	/** The Constant OPERACION_INSERTAR_ANUNCIO. */
	public final static Integer OPERACION_INSERTAR_ANUNCIO = Integer
			.valueOf("1");

	/** The Constant OPERACION_MODIFICAR_ANUNCIO. */
	public final static Integer OPERACION_MODIFICAR_ANUNCIO = Integer
			.valueOf("2");

	/** The Constant OPERACION_INSERTAR_ANEXO. */
	public final static Integer OPERACION_INSERTAR_ANEXO = Integer.valueOf("3");

	/** The Constant OPERACION_INSERTAR_ANEXO. */
	public final static Integer OPERACION_MODIFICAR_ANEXO = Integer
			.valueOf("4");

	/** The Constant OPERACION_INSERTAR_ANEXO. */
	public final static Integer OPERACION_ELIMINAR_ANEXO = Integer.valueOf("5");

	/** The Constant OPERACION_INSERTAR_TERCERO. */
	public final static Integer OPERACION_INSERTAR_TERCERO = Integer
			.valueOf("6");

	/** The Constant OPERACION_MODIFICAR_TERCERO. */
	public final static Integer OPERACION_MODIFICAR_TERCERO = Integer
			.valueOf("7");

	/** The Constant OPERACION_ELIMINAR_TERCERO. */
	public final static Integer OPERACION_ELIMINAR_TERCERO = Integer
			.valueOf("8");

	/** The Constant OPERACION_BORRAR_ANUNCIO. */
	public final static Integer OPERACION_ELIMINAR_ANUNCIO = Integer
			.valueOf("9");

	/** The Constant OPERACION_ENVIAR_ANUNCIO. */
	public final static Integer OPERACION_ENVIAR_ANUNCIO = Integer
			.valueOf("10");

	/** The Constant OPERACION_RECUPERAR_ANUNCIO. */
	public final static Integer OPERACION_RECUPERAR_ANUNCIO = Integer
			.valueOf("11");

	/** The Constant OPERACION_VALIDAR_ANUNCIO. */
	public final static Integer OPERACION_VALIDAR_ANUNCIO = Integer
			.valueOf("12");

	/** The Constant OPERACION_RECUPERAR_SBAG_ANUNCIO. */
	public final static Integer OPERACION_RECUPERAR_SBAG_ANUNCIO = Integer
			.valueOf("13");

	/** The Constant OPERACION_DEVOLVER_ANUNCIO. */
	public final static Integer OPERACION_DEVOLVER_ANUNCIO = Integer
			.valueOf("14");

	/** The Constant OPERACION_PAGAR_ANUNCIO. */
	public final static Integer OPERACION_PAGAR_ANUNCIO = Integer.valueOf("15");

	/** The Constant OPERACION_DESHACER_PAGO_ANUNCIO. */
	public final static Integer OPERACION_DESHACER_PAGO_ANUNCIO = Integer
			.valueOf("16");

	/** The Constant OPERACION_ARCHIVAR_ANUNCIO. */
	public final static Integer OPERACION_ARCHIVAR_ANUNCIO = Integer
			.valueOf("17");

	/** The Constant OPERACION_ASIGNAR_ANUNCIO_A_BOLETIN. */
	public final static Integer OPERACION_ASIGNAR_ANUNCIO_A_BOLETIN = Integer
			.valueOf("18");

	/** The Constant OPERACION_DESASIGNAR_ANUNCIO_A_BOLETIN. */
	public final static Integer OPERACION_DESASIGNAR_ANUNCIO_A_BOLETIN = Integer
			.valueOf("19");

	/** The Constant OPERACION_CAMBIAR_SECCION. */
	public final static Integer OPERACION_CAMBIAR_SECCION = Integer
			.valueOf("20");

	/** The Constant OPERACION_ASIGNAR_REVISOR_ANUNCIO. */
	public final static Integer OPERACION_ASIGNAR_REVISOR_ANUNCIO = Integer
			.valueOf("21");

	/** The Constant OPERACION_FINALIZAR_REVISION_ANUNCIO. */
	public final static Integer OPERACION_FINALIZAR_REVISION_ANUNCIO = Integer
			.valueOf("22");

	/** The Constant OPERACION_PUBLICAR_ANUNCIO. */
	public final static Integer OPERACION_PUBLICAR_ANUNCIO = Integer
			.valueOf("23");

	/** The Constant OPERACION_ELIMINAR_LOTE. */
	public final static Integer OPERACION_ELIMINAR_LOTE = Integer.valueOf("24");

	/** The Constant OPERACION_INSERTAR_LOTE. */
	public final static Integer OPERACION_INSERTAR_LOTE = Integer.valueOf("25");

	/** The Constant OPERACION_MODIFICAR_LOTE. */
	public final static Integer OPERACION_MODIFICAR_LOTE = Integer
			.valueOf("26");

	/** The Constant OPERACION_MARCAR_LOTE_COMO_DESIERTO. */
	public final static Integer OPERACION_MARCAR_LOTE_COMO_DESIERTO = Integer
			.valueOf("27");

	/** The Constant OPERACION_MARCAR_LOTE_COMO_NO_DESIERTO. */
	public final static Integer OPERACION_MARCAR_LOTE_COMO_NO_DESIERTO = Integer
			.valueOf("28");

	/** The Constant OPERACION_INSERTAR_TERCERO_LOTE. */
	public final static Integer OPERACION_INSERTAR_TERCERO_LOTE = Integer
			.valueOf("29");

	/** The Constant OPERACION_MODIFICAR_TERCERO_LOTE. */
	public final static Integer OPERACION_MODIFICAR_TERCERO_LOTE = Integer
			.valueOf("30");

	/** The Constant OPERACION_ELIMINAR_TERCERO_LOTE. */
	public final static Integer OPERACION_ELIMINAR_TERCERO_LOTE = Integer
			.valueOf("31");

	/** The Constant OPERACION_REABRIR_ANUNCIO. */
	public final static Integer OPERACION_REABRIR_ANUNCIO = Integer
			.valueOf("32");

	/** The Constant OPERACION_PROTEGER_LOPD. */
	public final static Integer OPERACION_PROTEGER_LOPD = Integer.valueOf("33");

	/** The Constant OPERACION_DESPROTEGER_LOPD. */
	public final static Integer OPERACION_DESPROTEGER_LOPD = Integer
			.valueOf("34");

	/** The Constant OPERACION_CAMBIAR_NUM_EXPEDIENTE. */
	public final static Integer OPERACION_CAMBIAR_NUM_EXPEDIENTE = Integer
			.valueOf("35");

	/** The Constant OPERACION_DESPUBLICAR_ANUNCIO. */
	public final static Integer OPERACION_DESPUBLICAR_ANUNCIO = Integer
			.valueOf("36");

	/** The Constant OPERACION_MODIFICAR_ANEXO_ASPOSE. */
	public final static Integer OPERACION_MODIFICAR_ANEXO_ASPOSE = Integer
			.valueOf("37");

	/** The Constant OPERACION_GENERAR_TASA. */
	public final static Integer OPERACION_GENERAR_TASA = Integer.valueOf("38");

	/** The Constant OPERACION_RECUPERAR_TASA. */
	public final static Integer OPERACION_RECUPERAR_TASA = Integer
			.valueOf("39");

	/** The Constant OPERACION_INSERTAR_FECHA_NOTIFICACION. */
	public final static Integer OPERACION_INSERTAR_FECHA_NOTIFICACION = Integer
			.valueOf("40");

	/** The Constant OPERACION_GENERAR_046. */
	public final static Integer OPERACION_GENERAR_046 = Integer.valueOf("41");

	/** The Constant OPERACION_CONVERTIR_GRATUITO_EN_DIFERIDO. */
	public final static Integer OPERACION_CONVERTIR_GRATUITO_EN_DIFERIDO = Integer
			.valueOf("42");

	/** The Constant OPERACION_ASIGNAR_MAQUETACION. */
	public final static Integer OPERACION_ASIGNAR_MAQUETACION = Integer
			.valueOf("43");

	/** The Constant OPERACION_VALIDACION_BOLETIN. */
	public final static Integer OPERACION_VALIDACION_BOLETIN = Integer
			.valueOf("44");

	/** The Constant ANCHO_CARACTER_EXCEL. */
	public final static Integer ANCHO_CARACTER_EXCEL = Integer.valueOf("300");

	/** The Constant PUBLICADO_ARCHIVADO. */
	public final static String PUBLICADO_ARCHIVADO = "Publicado y Archivado";

	/** The Constant TEXTO_ARCHIVO_AUTOMATICO. */
	public final static String TEXTO_ARCHIVO_AUTOMATICO = "Completada Notificación Adjudicatarios";

	/** The Constant MAXIMO_ANCHO_EXCEL. */
	public final static Integer MAXIMO_ANCHO_EXCEL = Integer.valueOf("32767");
	// Constantes para la generacion de los XML's de los boletines
	public static final String INDICE_ACCESO = "Indice por anuncios";
	public static final String INDICE_DPTOS = "Indice por departamentos";
	public static final String VER_CALENDARIOS = "Ver todos los calendarios";
	public static final String BOC_SIGUIENTE = "BOC siguiente";
	public static final String BOC_ANTERIOR = "BOC anterior";
	public static final String SUBIR = "Subir";
	public static final String ANCLA_DPTO = "dpto";
	public static final String ANCLA_SECCION = "sec";
	public static final String ANCLA = "#";

	public static final String RUTA_PAGINA_ERROR = "/WEB-INF/page/common/error.jsp";
	public static final String ACCION_VERTODOS = "boletines.do?boton=VerTodos";
	public static final String ACCION_INDICE_ACCESOS = "boletines.do?boton=accesos&id=";
	public static final String ACCION_INDICE_DPTOS = "boletines.do?boton=departamentos&id=";

	public static final String ACCION_BOC_SIGUIENTE = "boletines.do?boton=siguiente&id=";
	public static final String ACCION_BOC_ANTERIOR = "boletines.do?boton=anterior&id=";
	/** The Constant NOMBRE FICHERO XSL ACCESOS */
	public final static String XSL_ACCESOS = "indiceAccesos.xsl";

	/** The Constant NOMBRE FICHERO XSL ACCESOS */
	public final static String XSL_ACCESOS_VERIFICACION = "indiceAccesosVerificacion.xsl";

	/** The Constant NOMBRE FICHERO XSL DEPARTAMENTOS */
	public final static String XSL_DEPARTAMENTOS = "indiceDepartamentos.xsl";

	/** The Constant NOMBRE FICHERO XSL DEPARTAMENTOS */
	public final static String XSL_DEPARTAMENTOS_VERIFICACION = "indiceDepartamentosVerificacion.xsl";

	public final static String DEPARTAMENTOS = "departamentos";
	public final static String ACCESOS = "accesos";
	/** The Constant RUTA_HEADER. */
	public final static String RUTA_HEADER = "rutaHeader";

	public static final String LITERAL_PDF_SUMARIO_BOL = "(BOC-S-";
	public static final String LITERAL_PDF_BOL = "(BOC-";
	public static final String LITERAL_PDF_ANUNCIO = "PDF (BOC-";

	public static final String LITERAL_PERSONAS_FISICAS = "Personas Físicas";
	public static final String LITERAL_PERSONAS_JURIDICAS = "Personas Jurídicas";
	public static final String LITERAL_PARTICULARES = "Particulares";

	// VALORES DE LA TABLA PARAMETROS
	public static final Integer P_BUZON_ALTA_SOLICITUD = 0;
	public static final Integer P_HOST_CORREO = 1;
	public static final Integer P_PUERTO_CORREO = 2;
	public static final Integer P_USUARIO_CORREO = 3;
	public static final Integer P_PASSWORD_CORREO = 4;
	public static final Integer P_ENCODING_CORREO = 5;

	public static final Integer P_DIAS_ANT_PUBLI_MAQUETA = 6;
	public static final Integer P_DIAS_ANT_PUBLI_REVISOR = 7;
	public static final Integer P_CT_TIMPO_INICIO = 8;
	public static final Integer P_CT_TIEMPO_BLOQUEO = 9;
	public static final Integer P_TAMANIO_MAXIMO_WS = 31;
	// El parametro constante para el IVA ya no se utiliza
	// public static final Integer P_CE_IVA = 10;

	public static final Integer P_FIRMA_APLICATION_ID = 11;
	public static final Integer P_FIRMA_OPERATION_ID = 12;
	public static final Integer P_FIRMA_OPERATION_ID_SERVIDOR = 13;
	public static final Integer P_FIRMA_SELLO = 14;

	public static final Integer P_FECHA_INICIO_VALIDACION = 15;
	public static final Integer P_FECHA_FIN_VALIDACION = 16;

	public static final Integer P_URL_WS = 17;
	// public static final Integer P_ID_APLICACION_WS = 18;
	public static final Integer P_HOST = 19;

	public static final Integer P_ACCESO_BUZON_SUGERENCIASRECLAMACIONES = 20;
	public static final Integer P_CORREOSUGERENCIAS = 21;
	public static final Integer P_URL_BOLETINES_AUTONOMICOS = 22;
	public static final Integer P_URL_BOLETINES_PROVINCIALES = 23;
	public static final Integer P_URL_BOE = 24;
	public static final Integer P_URL_EUROPA = 25;

	
	public static final Integer P_FIRMA_AUTENTICA_ID = 32;

	public static final Integer P_URL_BOCES_HYPERLINK = 34;

	// Ids de referencia a los tiempos de correcciones
	public static final Integer P_CT_TIMPO_INICIO_CORRECCIONES = 35;
	public static final Integer P_CT_TIMPO_INTERVALO_CORRECCIONES = 36;

	public static final Integer ANYO_FORMATO_HTML = Integer.valueOf("2009");

	// public static Double getIVA() {
	// return IVA;
	// }
	// public static void setIVA(Double iva) {
	// IVA = iva;
	// }
	// public static Double getIVA_PORCENTAJE() {
	// return IVA_PORCENTAJE;
	// }
	// public static void setIVA_PORCENTAJE(Double iva_porcentaje) {
	// IVA_PORCENTAJE = iva_porcentaje;
	// }

	/** The Constant SELLADO. */
	public final static boolean SELLADO = true;

	/** The Constant NO_SELLADO. */
	public final static boolean NO_SELLADO = false;

	public static String Id_APLICACION_WS = "";
	public static String URL_WS = "";

	public static final Integer INSERCION_ALFRESCO_CORRECTA = 0;
	public static final Integer ERROR_INSERCION_ALFRESCO = -1;
	public static final Integer ERROR_LECTURA_ALFRESCO = -1;

	// ESTADOS DE TRAMINTAción DE 047
	/** The Constant ESTADO_TRAMITACION_PDTE_INSERTAR_PALABRAS. */
	public static final String ESTADO_TRAMITACION_PDTE_INSERTAR_PALABRAS = "Pdte. de insertar líneas/palabras";
	/** The Constant ESTADO_TRAMITACION_PDTE_ADJUDICATARIO. */
	public static final String ESTADO_TRAMITACION_PDTE_ADJUDICATARIO = "Pdte. de Adjudicatario";
	/** The Constant ESTADO_TRAMITACION_PDTE_RECUPERAR_TASAS. */
	public static final String ESTADO_TRAMITACION_PDTE_RECUPERAR_TASAS = "Pdte. de recuperar tasa";
	/** The Constant ESTADO_TRAMITACION_PDTE_GENERAR_TASAS. */
	public static final String ESTADO_TRAMITACION_PDTE_GENERAR_TASAS = "Pdte. de generar tasas";
	/** The Constant ESTADO_TRAMITACION_PDTE_FECHA_NOT. */
	public static final String ESTADO_TRAMITACION_PDTE_FECHA_NOT = "Pdte. de fecha notificación";

	/** The Constant LITERAL_GESTOR_CONTENIDO_BOCES */
	public final static String LITERAL_GESTOR_CONTENIDO_BOCES = "Gestor Contenido BOCES";

	/** The Constant LITERAL_REGENERAR_BOLETINES_CORREGIDOS */
	public final static String LITERAL_REGENERAR_BOLETINES_CORREGIDOS = "Regenerar Boletines Corregidos";

	/** The Constant CONTENIDO_BOCES_HTML. */
	public final static int CONTENIDO_BOCES_HTML = 0;

	/** The Constant CONTENIDO_BOCES_PDF. */
	public final static int CONTENIDO_BOCES_PDF = 1;

	/** The Constant LITERAL_LISTA_APARTADO_BOCES */
	public final static String LITERAL_LISTA_APARTADO_BOCES = "Listado de anexos Página BOCES";

	/** CONTENIDO BOCES **/
	public static final Integer DOCUMENTOS_Y_PROCEDIMIENTOS = 1;
	public static final Integer AUTENTICACION_Y_VERIFICACION = 2;
	public static final Integer DECRETO = 3;
	public static final Integer ORDEN = 4;
	public static final Integer AVISOS = 5;

	public static final Double SANGRIA_IZQUIERDA_MEDIDA_UNITARIA = new Double(
			"6.0");

}
