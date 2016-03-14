package es.cargador.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;

public class ArchivoResultados {

	
	
	public static void CrearArchivoErrores()
	{
		File fichero = new File ("C:\\logs\\regcontra\\listaDeErrores.txt");
	    try {
	        // A partir del objeto File creamos el fichero físicamente
	        if (fichero.createNewFile())
	        System.out.println("El fichero se ha creado correctamente");
	        else
	        System.out.println("No ha podido ser creado el fichero");
	        } catch (IOException ioe) {
	        ioe.printStackTrace();
	      }
	}
	
	   public static void LeerArchivo() {
		      File archivo = null;
		      FileReader fr = null;
		      BufferedReader br = null;

		      try {
		         // Apertura del fichero y creacion de BufferedReader para poder
		         // hacer una lectura comoda (disponer del metodo readLine()).
		         archivo = new File ("C:\\archivo.txt");
		         fr = new FileReader (archivo);
		         br = new BufferedReader(fr);

		         // Lectura del fichero
		         String linea;
		         while((linea=br.readLine())!=null)
		            System.out.println(linea);
		      }
		      catch(Exception e){
		         e.printStackTrace();
		      }finally{
		         // En el finally cerramos el fichero, para asegurarnos
		         // que se cierra tanto si todo va bien como si salta 
		         // una excepcion.
		         try{                    
		            if( null != fr ){   
		               fr.close();     
		            }                  
		         }catch (Exception e2){ 
		            e2.printStackTrace();
		         }
		      }
		   }
	
	   
	    public static void EscribirArchivo( Map<String, String> listaErrores)
	    {
	        FileWriter fichero = null;
	        PrintWriter pw = null;
	        try
	        {
	            fichero = new FileWriter("C:\\logs\\regcontra\\listaDeErrores.txt");
	            pw = new PrintWriter(fichero);

	            Iterator it = listaErrores.keySet().iterator();
	            while(it.hasNext()){
	              String key = (String) it.next();
	              System.out.println(key + " -> " + listaErrores.get(key));
	              pw.println(key + " -> " + listaErrores.get(key));
	            }
	            
	          

	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	           try {
	           // Nuevamente aprovechamos el finally para 
	           // asegurarnos que se cierra el fichero.
	           if (null != fichero)
	              fichero.close();
	           } catch (Exception e2) {
	              e2.printStackTrace();
	           }
	        }
	    }
	
}
