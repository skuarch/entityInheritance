package group.entityInheritance.controller;

import group.entityInheritance.NotificationRepository;
import group.entityInheritance.entity.Notification;
import group.entityInheritance.entity.SMSNotification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notify")
public class NotificationController {

    @Autowired
    private NotificationRepository notificationRepository;

    @PostMapping
    public Notification post() {

        SMSNotification notify = new SMSNotification();
        notify.setFirstName("skuarch");
        notify.setLastName("el chingon");

        return notificationRepository.save(notify);

    }

    @GetMapping("/{id}")
    public Notification get(@PathVariable("id") Long id) {
        return notificationRepository.findOne(id);
    }

}
