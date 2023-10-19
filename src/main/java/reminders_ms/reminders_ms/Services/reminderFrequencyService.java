
package reminders_ms.reminders_ms.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import reminders_ms.reminders_ms.Models.reminder;
import reminders_ms.reminders_ms.Models.reminderFrequency;
import reminders_ms.reminders_ms.Repositories.reminderFrequencyRepository;

import java.util.List;

@Service
public class reminderFrequencyService {
    private final reminderFrequencyRepository reminderFrequencyRepository;

    @Autowired
    public reminderFrequencyService(reminderFrequencyRepository reminderFrequencyRepository){
        this.reminderFrequencyRepository = reminderFrequencyRepository;
    }
    public reminderFrequency saveReminderFrequency(reminderFrequency reminderFrequency){
        return reminderFrequencyRepository.save(reminderFrequency);
    }

    public List<reminderFrequency> getAllFrequencies(){
        return reminderFrequencyRepository.findAll();
    }

    public reminderFrequency getReminderFrequencyById(String id) {
        return reminderFrequencyRepository.findById(id).orElse(null);
    }
    
}
