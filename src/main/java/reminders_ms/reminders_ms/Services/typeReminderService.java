package reminders_ms.reminders_ms.Services;
import reminders_ms.reminders_ms.Models.typeReminder;
import reminders_ms.reminders_ms.Repositories.reminderRepository;
import reminders_ms.reminders_ms.Repositories.typeReminderRepository;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class typeReminderService {
    private final typeReminderRepository typeReminderRepository;

    @Autowired
    public typeReminderService(typeReminderRepository typeReminderRepository){
        this.typeReminderRepository = typeReminderRepository;
    }

    public typeReminder saveTypeReminder(typeReminder typeReminder){
        return typeReminderRepository.save(typeReminder);
    }

    public List<typeReminder> getAllTypeReminders(){
        return typeReminderRepository.findAll();
    }
    public typeReminder getTypeReminderById(String id) {
        return typeReminderRepository.findById(id).orElse(null);
    }

}