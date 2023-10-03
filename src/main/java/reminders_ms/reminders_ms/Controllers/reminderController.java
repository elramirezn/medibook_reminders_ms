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

import reminders_ms.reminders_ms.Models.reminder;
import reminders_ms.reminders_ms.Services.reminderService;

import java.util.List;

@RestController 
@RequestMapping("/reminder")

public class reminderController{
    private final reminderService reminderService;

    @Autowired
    public reminderController(reminderService reminderService){
        this.reminderService = reminderService;
    }

    @PostMapping
    public ResponseEntity<reminder> createReminder(@RequestBody reminder reminder){
        reminder createdReminder = reminderService.saveReminders(reminder);
        return new ResponseEntity<reminder>(createdReminder, HttpStatus.CREATED);
    }
    @GetMapping
    public ResponseEntity<List <reminder>> getAllReminders() {
        List<reminder> reminders = reminderService.getAllReminders();
        return new ResponseEntity<>(reminders, HttpStatus.OK);
    }

}