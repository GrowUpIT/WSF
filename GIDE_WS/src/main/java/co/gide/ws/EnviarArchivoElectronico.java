package co.gide.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

import co.gide.esquemas.ArchivoElectronicoTipo;

@WebService(
		name="GIDEServiceOperation",
		serviceName = "GIDEService", 
		targetNamespace="http://www.growupit.com.co/GIDEService", 
		portName="GIDEServicePort")
public class EnviarArchivoElectronico  {

@WebMethod(operationName="EnviarArchivoElectronico")	
public String EnviarArchivoElectronico(ArchivoElectronicoTipo objArchivoElectronico){
	return null;
	
}


}



