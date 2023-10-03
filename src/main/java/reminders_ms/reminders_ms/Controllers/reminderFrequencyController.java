package reminders_ms.reminders_ms.Controllers;
import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reminders_ms.reminders_ms.Models.reminderFrequency;
import reminders_ms.reminders_ms.Services.reminderFrequencyService;

import java.util.List;

@RestController 
@RequestMapping("/reminderFrequency")

public class reminderFrequencyController{
    private final reminderFrequencyService reminderFrequencyService;
    
    @Autowired
    public reminderFrequencyController(reminderFrequencyService reminderFrequencyService){
        this.reminderFrequencyService = reminderFrequencyService;
    }

    @PostMapping
    public ResponseEntity<reminderFrequency> createReminderFrequency(@RequestBody reminderFrequency reminderFrequency){
        reminderFrequency createdReminderFrequency = reminderFrequencyService.saveReminderFrequency(reminderFrequency);
        return new ResponseEntity<reminderFrequency>(createdReminderFrequency, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List <reminderFrequency>> getAllReminderFrequency() {
        List<reminderFrequency> remindersFrequencies = reminderFrequencyService.getAllFrequencies();
        return new ResponseEntity<>(remindersFrequencies, HttpStatus.OK);
    }

}