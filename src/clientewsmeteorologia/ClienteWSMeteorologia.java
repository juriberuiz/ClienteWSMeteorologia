/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clientewsmeteorologia;

import co.edu.udistrital.informatica.dto.DatosMeteorologicosDTO;

/**
 *
 * @author OscarBonilla
 */
public class ClienteWSMeteorologia {

    public DatosMeteorologicosDTO cargarValorSensorXIdSensor(int idSensor) {
        co.edu.udistrital.informatica.service.MeteorologiaWSService service = new co.edu.udistrital.informatica.service.MeteorologiaWSService();
        co.edu.udistrital.informatica.service.MeteorologiaWS port = service.getMeteorologiaWS();
        return port.cargarValorSensorXIdSensor(idSensor);
    }

    public java.util.List<co.edu.udistrital.informatica.dto.DatosMeteorologicosDTO> cargarValorHistoricoXIdSensor(int idSensor) {
        co.edu.udistrital.informatica.service.MeteorologiaWSService service = new co.edu.udistrital.informatica.service.MeteorologiaWSService();
        co.edu.udistrital.informatica.service.MeteorologiaWS port = service.getMeteorologiaWS();
        return port.cargarValorHistoricoXIdSensor(idSensor);
    }
    
    
    
    
}
