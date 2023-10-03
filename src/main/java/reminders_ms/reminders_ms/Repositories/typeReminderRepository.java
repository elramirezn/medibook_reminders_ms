package reminders_ms.reminders_ms.Repositories;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import reminders_ms.reminders_ms.Models.typeReminder;

public interface typeReminderRepository extends MongoRepository <typeReminder,String> {

}