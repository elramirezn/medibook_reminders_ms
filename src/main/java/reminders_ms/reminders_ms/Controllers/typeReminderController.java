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

import reminders_ms.reminders_ms.Models.typeReminder;
import reminders_ms.reminders_ms.Services.typeReminderService;

import java.util.List;

@RestController
@RequestMapping("/typeReminder")
public class typeReminderController {
    private final typeReminderService typeReminderService;

    @Autowired
    public typeReminderController(typeReminderService typeReminderService){
        this.typeReminderService = typeReminderService;
    }

    @PostMapping
    public ResponseEntity<typeReminder> createTypeReminder(@RequestBody typeReminder typeReminder){
        typeReminder createdTypeReminder = typeReminderService.saveTypeReminder(typeReminder);
        return new ResponseEntity<typeReminder>(createdTypeReminder, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List <typeReminder>> getAllTypeReminders(){
        List<typeReminder> typerReminder = typeReminderService.getAllTypeReminders();
        return new ResponseEntity<>(typerReminder, HttpStatus.OK);
    }
}
