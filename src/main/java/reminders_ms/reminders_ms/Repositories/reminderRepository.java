package reminders_ms.reminders_ms.Repositories;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import reminders_ms.reminders_ms.Models.reminder;

public interface reminderRepository extends MongoRepository <reminder,String> {

}
