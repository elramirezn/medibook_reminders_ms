package reminders_ms.reminders_ms.Models;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;

@Document(collection = "TypesReminders")
public class typeReminder {
    @Id
    private String id;
    private String typeReminder;
    private String description;

    public typeReminder(String id, String typeReminder, String description){
        this.id = id;
        this.typeReminder = typeReminder;
        this.description = description;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTypeReminder() {
        return typeReminder;
    }

    public void setTypeReminder(String typeReminder) {
        this.typeReminder = typeReminder;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}

    
