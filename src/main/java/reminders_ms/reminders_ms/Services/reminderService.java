
package reminders_ms.reminders_ms.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import reminders_ms.reminders_ms.Models.reminder;
import reminders_ms.reminders_ms.Repositories.reminderRepository;

import java.util.*;

@Service
public class reminderService{
    private final reminderRepository reminderRepository;
    
    @Autowired
    public reminderService(reminderRepository reminderRepository){
        this.reminderRepository = reminderRepository;
    }
    public reminder saveReminders(reminder reminder){
        return reminderRepository.save(reminder);
    }
    public List<reminder> getAllReminders(){
        return reminderRepository.findAll();
    }

    public reminder getReminderById(String id){
        return reminderRepository.findById(id).orElse(null);
    }
}