package reminders_ms.reminders_ms.Repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import reminders_ms.reminders_ms.Models.reminderFrequency;

public interface reminderFrequencyRepository extends MongoRepository <reminderFrequency,String>{
    
}
