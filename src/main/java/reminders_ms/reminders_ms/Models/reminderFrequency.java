package reminders_ms.reminders_ms.Models;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;

@Document(collection = "reminderFrequency")

public class reminderFrequency {
    @Id
    private String id;
    private String intervalo_tiempo;
    private String uTiempo;
    
    
    public reminderFrequency(String id, String intervalo_tiempo, String uTiempo) {
        this.id = id;
        this.intervalo_tiempo = intervalo_tiempo;
        this.uTiempo = uTiempo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIntervalo_tiempo() {
        return intervalo_tiempo;
    }

    public void setIntervalo_tiempo(String intervalo_tiempo) {
        this.intervalo_tiempo = intervalo_tiempo;
    }

    public String getuTiempo() {
        return uTiempo;
    }

    public void setuTiempo(String uTiempo) {
        this.uTiempo = uTiempo;
    }

}
